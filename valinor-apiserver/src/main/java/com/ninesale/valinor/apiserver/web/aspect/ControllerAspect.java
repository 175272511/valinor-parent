package com.ninesale.valinor.apiserver.web.aspect;

import java.util.Set;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ninesale.valinor.apiserver.common.constant.ExceptionCode;
import com.ninesale.valinor.apiserver.common.constant.SysContant;
import com.ninesale.valinor.apiserver.web.BeanValidators;
import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.security.Servlets;
import com.ninesale.valinor.auth.api.model.User;
import com.pubpi.common.annotation.CheckPermission;
import com.pubpi.common.exception.ControllerException;
import com.pubpi.common.utils.Collections3;

@Aspect
@Component
public class ControllerAspect {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	private Validator validator;

	public ControllerAspect() {
		logger.debug("ControllerAspect init");
	}

	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void methodCachePointcut() {
	}

	/**
	 * 进行日志记录
	 * 
	 * @param point
	 * @param requestMapping
	 * @return
	 * @throws Throwable
	 */
	@Around("methodCachePointcut() && @annotation(requestMapping)")
	public Object around(ProceedingJoinPoint point, RequestMapping requestMapping) throws Throwable {
		long startTime = System.currentTimeMillis();
		String uri = Servlets.getRequest().getRequestURI();
		Object[] method_param = null;

		method_param = point.getArgs(); // 获取方法参数
		String prefix = "URI: " + uri;
		String requestInfo = prefix;
		if (null != method_param && method_param.length > 0) {
			Set<ConstraintViolation<Object>> bindResult = validator.validate(method_param[0]);
			if (!Collections3.isEmpty(bindResult)) {
				return new ClientBasicResponse(ReturnCode.ALERT_ERR, BeanValidators.extractMessage(bindResult).get(0));
			}
			requestInfo += " Request: " + method_param[0].toString();

		}
		logger.debug(requestInfo);
		Object object;
		object = point.proceed();

		String responseInfo = prefix + " Response: " + object.toString();

		logger.debug(responseInfo);
		logger.debug("RESP TIME: " + (System.currentTimeMillis() - startTime));
		return object;
	}

	/**
	 * 自定义权限验证，因为使用requirepermission注解进行权限验证导致切面失败，故而采用此种方法
	 * 
	 * @param pjp
	 * @param checkPermission
	 * @return
	 * @throws Throwable
	 */
	@Around("@annotation(checkPermission)")
	public Object doInterceptor(ProceedingJoinPoint pjp, CheckPermission checkPermission) throws Throwable {
		boolean isPermissioin = false;
		Subject subject = SecurityUtils.getSubject();

		Session session = subject.getSession();
		if (null == session) {
			throw new ControllerException(ExceptionCode.UNLOGIN, "session is null");
		}
		User currentUser = (User) session.getAttribute("userInfo");
		if (null == currentUser) {
			throw new ControllerException(ExceptionCode.UNLOGIN, "can not get current user from session");
		}

		if (currentUser.getRoleId() == SysContant.RoleType.SUPER_ADMIN) {
			isPermissioin = true;
		}
		// 没有获得注解 及不需要权限-- 则直接运行
		else if (null != checkPermission) {
			String[] permissions = checkPermission.value();
			for (String per : permissions) {
				// 当前登录人 具有权限
				if (subject.isPermitted(per)) {
					isPermissioin = true;
					break;
				}
			}
		}
		else {
			isPermissioin = true;
		}

		if (isPermissioin) {
			// 有执行方法或权限不拦截
			return pjp.proceed();
		}
		else {
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "权限错误");
		}
	}
}
