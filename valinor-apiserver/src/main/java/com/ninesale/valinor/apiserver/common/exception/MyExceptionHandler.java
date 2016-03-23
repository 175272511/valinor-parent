package com.ninesale.valinor.apiserver.common.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.ninesale.valinor.apiserver.common.constant.SysContant;
import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.pubpi.common.exception.BaseException;

/**
 * 统一异常处理类
 * 
 * @author hawk
 *
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
	private static Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		logger.error("request error", ex);
		response.setStatus(HttpStatus.SC_OK);
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		response.setCharacterEncoding(SysContant.DEFAULT_CHARSET);
		try {
			ClientBasicResponse resp = new ClientBasicResponse();
			resp.setCode(ReturnCode.CONSOLE_ERR);
			resp.setDesc("inner error");
			if (ex instanceof BaseException) {
				resp.setCode(ReturnCode.ALERT_ERR);
				resp.setDesc(ex.getMessage());
			}
			else if (ex instanceof UnauthorizedException) {
				resp.setCode(ReturnCode.ALERT_ERR);
				resp.setDesc("权限错误");
			}

			response.getWriter().write(JSON.toJSONString(resp));
		}
		catch (IOException e) {
			logger.debug("IO exception", e);
		}
		return new ModelAndView();
	}
}
