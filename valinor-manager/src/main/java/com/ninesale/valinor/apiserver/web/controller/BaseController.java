package com.ninesale.valinor.apiserver.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ninesale.valinor.apiserver.common.constant.ExceptionCode;
import com.ninesale.valinor.auth.api.model.User;
import com.pubpi.common.exception.ControllerException;

/**
 * 
 * @author hawk
 *
 */
public abstract class BaseController {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 获取当前用户
	 * 
	 * @return
	 */
	protected User getCurrentUser() {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		if (null == session) {
			throw new ControllerException(ExceptionCode.UNLOGIN, "session is null");
		}
		User currentUser = (User) session.getAttribute("userInfo");
		if (null == currentUser) {
			throw new ControllerException(ExceptionCode.UNLOGIN, "can not get current user from session");
		}
		return currentUser;
	}
}
