package com.ninesale.valinor.order.api.aspect;

import java.util.Set;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.pubpi.common.utils.Collections3;

@Aspect
@Component
public class DubboAspect {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	private Validator validator;

	public DubboAspect() {
		logger.debug("ControllerAspect init");
	}

	@Pointcut("execution(* com.ninesale.valinor.order.api.service.*.*(..))")
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
	@Around("methodCachePointcut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object[] method_param = null;

		method_param = point.getArgs(); // 获取方法参数
		if (null != method_param && method_param.length > 0) {
			Set<ConstraintViolation<Object>> bindResult = validator.validate(method_param[0]);
			if (!Collections3.isEmpty(bindResult)) {
				return null;
			}

		}

		Object object;
		object = point.proceed();

		return object;
	}
}
