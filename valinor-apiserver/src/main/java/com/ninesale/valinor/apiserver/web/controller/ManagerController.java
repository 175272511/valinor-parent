package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.user.ClientManagerLoginRequest;
import com.ninesale.valinor.apiserver.web.model.user.LoginResponse;
import com.ninesale.valinor.apiserver.web.model.user.UpdateUserRequest;
import com.ninesale.valinor.apiserver.web.model.user.UserInfo;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.auth.api.model.request.DubboAddOpenIdRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserIdRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserNameRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserRequest;
import com.ninesale.valinor.auth.api.model.response.DubboOpenIdResponse;
import com.ninesale.valinor.auth.api.model.response.DubboUserResponse;
import com.ninesale.valinor.auth.api.service.DubboAuthService;
import com.ninesale.valinor.auth.api.service.DubboPermissionService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

/**
 * 
 * @author liuhui
 *
 */
@RestController
@RequestMapping("/manager")
public class ManagerController extends BaseController{
	@Resource
	private DubboAuthService dubboAuthService;

	@Resource
	private DubboPermissionService dubboPermissionService;
	
	@RequestMapping(value = "managerlogin", method = RequestMethod.POST)
	public ClientBasicResponse login(@RequestBody ClientManagerLoginRequest req){

		Subject subject = SecurityUtils.getSubject();
		User user = null;
		if (!subject.isAuthenticated()) {
			String username = req.getUsername();
			String password = req.getPassword();

			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			try {
				subject.login(token);
			}
			catch (AuthenticationException e) {
				return new ClientBasicResponse(ReturnCode.AUTH_FAILED, e.getMessage());
			}
			/**
			 * 将用户信息存储在session中
			 */
			DubboUserNameRequest request = BeanMapper.map(req, DubboUserNameRequest.class);
			
			DubboUserResponse response = dubboAuthService.getManagerByUsername(request);
			addUserToSession(response.getData());
		}

		user = (User) subject.getSession().getAttribute("userInfo");
		if (null == user) {
			return new ClientBasicResponse(ReturnCode.AUTH_FAILED, "user is not exist");
		}

		/**
		 * 将微信号与账户绑定
		 */
		String openId = (String) subject.getSession().getAttribute("openId");

		LoginResponse resp = new LoginResponse();

		if (!StringUtils.isNull(openId)) {
			DubboUserIdRequest dubboUserIdRequest = new DubboUserIdRequest();
			dubboUserIdRequest.setTid(req.getTid());
			dubboUserIdRequest.setUserId(user.getId());
			DubboOpenIdResponse openIdResponse = dubboAuthService.getOpenIdByUserId(dubboUserIdRequest);
			String oldOpenId = openIdResponse.getOpenId();
			if (null == oldOpenId) {
				DubboAddOpenIdRequest addOpenIdRequest = new DubboAddOpenIdRequest();
				addOpenIdRequest.setTid(req.getTid());
				addOpenIdRequest.setOpenId(openId);
				addOpenIdRequest.setId(user.getId());
				dubboAuthService.addOpenId(addOpenIdRequest);
				subject.getSession().removeAttribute("openId");
			}
			else if (!oldOpenId.equals(openId)) {
				resp.setCode(ReturnCode.USER_HAVE_BINDING);
				resp.setDesc("该账户已经绑定其他账号，<br/>是否重新绑定到新的微信号");
			}
		}

		UserInfo data = BeanMapper.map(user, UserInfo.class);
		resp.setData(data);
		return resp;
	}

	
	@RequestMapping(value = "updatemanagerpwd", method = RequestMethod.POST)
	public ClientBasicResponse updatemanagerpwd(@RequestBody UpdateUserRequest req) {

		User currentUser = getCurrentUser();


		try {
			DubboUserRequest user = new DubboUserRequest();
			user.setId(currentUser.getId());
			user.setUsername(req.getUsername());
			user.setPassword(req.getPassword());
			dubboAuthService.updateUser(user);
		} catch (Exception e) {
			logger.error("updateUser service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "更新用户失败");
		}
		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}
	
	
	
	private void addUserToSession(User user) {
		Subject subject = SecurityUtils.getSubject();
		subject.getSession().setAttribute("userInfo", user);
	}
}
