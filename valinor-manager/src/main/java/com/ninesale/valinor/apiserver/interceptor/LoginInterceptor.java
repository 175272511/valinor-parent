package com.ninesale.valinor.apiserver.interceptor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.ninesale.valinor.apiserver.common.constant.ValinorConfig;
import com.ninesale.valinor.apiserver.common.constant.SysContant;
import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.pubpi.common.TidManager;

public class LoginInterceptor implements HandlerInterceptor {
	private static final Set<String> URL_SET = new HashSet<String>();

	static {
		URL_SET.add("userlogin.do");
		URL_SET.add("managerlogin.do");
		URL_SET.add("sendverifycode.do");
		URL_SET.add("getrandom.do");
		URL_SET.add("register.do");
		URL_SET.add("findpwd.do");
		URL_SET.add("logout.do");
		URL_SET.add("weixin_login.do");
		URL_SET.add("uploadcontactinfo.do");
		URL_SET.add("getconfig.do");
		URL_SET.add("querypublicnote.do");
		URL_SET.add("querynotebyid.do");
		URL_SET.add("getcommentlist.do");
		URL_SET.add("createsign.do");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		TidManager.setTid(UUID.randomUUID().toString().replace("-", ""));

		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/") + 1);


		response.setHeader("Access-Control-Allow-Origin", ValinorConfig.CROSS_DOMAIN_URL);
		response.setHeader("Access-Control-Allow-Credentials", "true");//控制是否开启与Ajax的Cookie提交方式
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT");

		if (URL_SET.contains(uri)) {
			return true;
		}
		else {
			Subject user = SecurityUtils.getSubject();
			if (user.isAuthenticated()) {
				return true;
			}

			ClientBasicResponse resp = new ClientBasicResponse();
			resp.setCode(ReturnCode.AUTH_FAILED);
			resp.setDesc("用户未登录");

			response.setStatus(HttpStatus.SC_OK);
			response.setContentType(MediaType.APPLICATION_JSON_VALUE);
			response.setCharacterEncoding(SysContant.DEFAULT_CHARSET);
			response.getWriter().write(JSON.toJSONString(resp));
			return false;
		}

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
	}
}
