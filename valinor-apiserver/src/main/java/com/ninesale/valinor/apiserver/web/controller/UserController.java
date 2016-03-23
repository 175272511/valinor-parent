package com.ninesale.valinor.apiserver.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import com.pubpi.common.exception.ServiceException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.common.constant.SysContant.BindType;
import com.ninesale.valinor.apiserver.common.constant.SysContant.LoginType;
import com.ninesale.valinor.apiserver.common.constant.SysContant.RoleType;
import com.ninesale.valinor.apiserver.common.constant.SysContant.UserType;
import com.ninesale.valinor.apiserver.web.common.ClientBasicPageRequest;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.reportmenu.MenuInfo;
import com.ninesale.valinor.apiserver.web.model.user.AddUserRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientConcernNoteListResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientConcernNoteRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientConcernPersonListResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientConcernRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientConcernTagListResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientConcernTagRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientContactsRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientDelReceiptRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientFindPwdRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientGetAddressResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientGetAdressRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientGetContactsResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientGetUserCollectRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientGetUserCollectResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientGetUserCountResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientGetUserListRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientGetUserListResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientGetUserOrderInfoRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientGetUserOrderInfoResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientOpenInfoResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientPointsResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientRandomResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientReceiptRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientReceiptResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientRegisterRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientRegisterResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientUserAdressRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientUserCouponRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientVerifyRequest;
import com.ninesale.valinor.apiserver.web.model.user.ClientWalletResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientWeiXinBindRequest;
import com.ninesale.valinor.apiserver.web.model.user.DelUserRequest;
import com.ninesale.valinor.apiserver.web.model.user.GetMenuListResponse;
import com.ninesale.valinor.apiserver.web.model.user.GetUserInfoResponse;
import com.ninesale.valinor.apiserver.web.model.user.GetUserListRequest;
import com.ninesale.valinor.apiserver.web.model.user.GetUserListResponse;
import com.ninesale.valinor.apiserver.web.model.user.LoginRequest;
import com.ninesale.valinor.apiserver.web.model.user.LoginResponse;
import com.ninesale.valinor.apiserver.web.model.user.UpdateUserRequest;
import com.ninesale.valinor.apiserver.web.model.user.UserInfo;
import com.ninesale.valinor.apiserver.web.model.user.UserRegisterInfo;
import com.ninesale.valinor.apiserver.web.model.user.WeiXinLoginRequest;
import com.ninesale.valinor.apiserver.web.security.IdGen;
import com.ninesale.valinor.auth.api.model.Permission;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.auth.api.model.request.DubboAddOpenIdRequest;
import com.ninesale.valinor.auth.api.model.request.DubboConcernPersonInfoResponse;
import com.ninesale.valinor.auth.api.model.request.DubboConstactsRequest;
import com.ninesale.valinor.auth.api.model.request.DubboDelUserRequest;
import com.ninesale.valinor.auth.api.model.request.DubboGetContactsRequest;
import com.ninesale.valinor.auth.api.model.request.DubboOpenIdRequest;
import com.ninesale.valinor.auth.api.model.request.DubboRegisterRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserIdRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserListRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserNameRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserPageRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserRequest;
import com.ninesale.valinor.auth.api.model.request.DubboVerifyRequest;
import com.ninesale.valinor.auth.api.model.request.DubboWeixinCodeRequest;
import com.ninesale.valinor.auth.api.model.response.DubboGetContactsResponse;
import com.ninesale.valinor.auth.api.model.response.DubboOpenIdResponse;
import com.ninesale.valinor.auth.api.model.response.DubboOpenInfoResponse;
import com.ninesale.valinor.auth.api.model.response.DubboRegisterResponse;
import com.ninesale.valinor.auth.api.model.response.DubboUserCountResponse;
import com.ninesale.valinor.auth.api.model.response.DubboUserListResponse;
import com.ninesale.valinor.auth.api.model.response.DubboUserResponse;
import com.ninesale.valinor.auth.api.model.response.DubboVerifyResponse;
import com.ninesale.valinor.auth.api.model.response.DubboWeixinInfoResponse;
import com.ninesale.valinor.auth.api.service.DubboAuthService;
import com.ninesale.valinor.auth.api.service.DubboOpenService;
import com.ninesale.valinor.auth.api.service.DubboPermissionService;
import com.ninesale.valinor.image.api.constant.DubboImageConstants;
import com.ninesale.valinor.image.api.model.dto.DubboImg;
import com.ninesale.valinor.image.api.model.request.DubboInsertUpdateImgRequest;
import com.ninesale.valinor.image.api.service.DubboImgService;
import com.ninesale.valinor.note.api.model.request.note.DubboQueryNoteByNoteIdRequest;
import com.ninesale.valinor.note.api.model.response.note.DubboQueryNoteByNoteIdResponse;
import com.ninesale.valinor.note.api.service.DubboNoteService;
import com.ninesale.valinor.userinfo.api.model.request.DubboAddUserAddressRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboAddUserReceiptRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernPersonListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernTagListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernTagRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboDelUserReceiptRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboGetAddressRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboGetUserCollectRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboGetUserCountRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboGetUserOrderInfoRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboReceiptRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboUserPointsRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboUserWalletRequest;
import com.ninesale.valinor.userinfo.api.model.response.DubboAddUserAddressResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboAddUserReceiptResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboConcernNoteListResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboConcernPersonListResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboConcernTagListResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboDelUserReceiptResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboGetAddressResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboGetUserCollectResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboGetUserCountResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboGetUserOrderInfoResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboReceiptResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboUserPointsResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboUserWalletResponse;
import com.ninesale.valinor.userinfo.api.service.DubboUserService;
import com.pubpi.common.annotation.CheckPermission;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.Collections3;
import com.pubpi.common.utils.StringUtils;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 
 * @author hawk
 *
 */

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

	@Resource
	private DubboOpenService dubboOpenService;

	@Resource
	private DubboUserService dubboUserService;

	@Resource
	private DubboAuthService dubboAuthService;

	@Resource
	private DubboPermissionService dubboPermissionService;

	@Resource
	private DubboImgService dubboImgService;
	
	@Resource
	private DubboNoteService dubboNoteService;
	

	@RequestMapping(value = "userlogin", method = RequestMethod.POST)
	public ClientBasicResponse login(@RequestBody LoginRequest req) {

		Subject subject = SecurityUtils.getSubject();
		User user = null;
		if (!subject.isAuthenticated()) {
			String username = req.getPhone();
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
			request.setUsername(req.getPhone());
			DubboUserResponse response = dubboAuthService.getUserByUsername(request);
			user = response.getData();
			addUserToSession(user);
		}

		if (null == user) {
			user = (User) subject.getSession().getAttribute("userInfo");
		}
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
				addOpenIdRequest.setOpenType(BindType.BIND_WEIXIN);
				dubboAuthService.addOpenId(addOpenIdRequest);
				subject.getSession().removeAttribute("openId");
			}
			else if (oldOpenId.equals(openId)) {
				resp.setCode(ReturnCode.USER_HAVE_BINDING);
				resp.setDesc("该账户已经绑定其他账号，<br/>是否重新绑定到新的微信号");
			}
		}

		UserInfo data = BeanMapper.map(user, UserInfo.class);

		if (LoginType.APP_LOGIN.equals(req.getLoginType())) {
			data.setToken(subject.getSession().getId().toString());
		}
		resp.setTid(req.getTid());
		resp.setData(data);
		return resp;
	}

	@RequestMapping(value = "bindweixin", method = RequestMethod.POST)
	public ClientBasicResponse bindweixin(@RequestBody ClientWeiXinBindRequest req) {
		User user = getCurrentUser();

		DubboWeixinCodeRequest weixinReq = new DubboWeixinCodeRequest();
		weixinReq.setWeixinCode(req.getWeixinCode());
		weixinReq.setTid(req.getTid());
		DubboWeixinInfoResponse weixinResp = dubboOpenService.getWeixinInfo(weixinReq);
		if (StringUtils.isNull(weixinResp.getOpenid())) {
			return new ClientBasicResponse(ReturnCode.AUTH_FAILED, "openId为空");
		}

		DubboUserIdRequest dubboUserIdRequest = new DubboUserIdRequest();
		dubboUserIdRequest.setTid(req.getTid());
		dubboUserIdRequest.setUserId(user.getId());
		DubboOpenIdResponse openIdResponse = dubboAuthService.getOpenIdByUserId(dubboUserIdRequest);
		String oldOpenId = openIdResponse.getOpenId();
		if (null == oldOpenId) {
			DubboAddOpenIdRequest addOpenIdRequest = new DubboAddOpenIdRequest();
			addOpenIdRequest.setTid(req.getTid());
			addOpenIdRequest.setOpenId(weixinResp.getOpenid());
			addOpenIdRequest.setId(user.getId());
			addOpenIdRequest.setOpenType(BindType.BIND_WEIXIN);
			dubboAuthService.addOpenId(addOpenIdRequest);
		}
		else if (oldOpenId.equals(weixinResp.getOpenid())) {
			Subject subject = SecurityUtils.getSubject();
			subject.getSession().setAttribute("openId", weixinResp.getOpenid());
			return new ClientBasicResponse(ReturnCode.USER_HAVE_BINDING, "该账号已绑定微信号");
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	@RequestMapping(value = "cancelbindweixin", method = RequestMethod.POST)
	public ClientBasicResponse cancelBindWeixin(@RequestBody ClientBasicRequest req) {
		User user = getCurrentUser();

		DubboAddOpenIdRequest addOpenIdRequest = new DubboAddOpenIdRequest();
		addOpenIdRequest.setTid(req.getTid());
		addOpenIdRequest.setId(user.getId());
		addOpenIdRequest.setOpenType(BindType.BIND_WEIXIN);
		dubboAuthService.delOpenId(addOpenIdRequest);

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	@RequestMapping(value = "getopeninfo", method = RequestMethod.POST)
	public ClientOpenInfoResponse getOpenInfo(@RequestBody ClientBasicRequest req) {
		User user = getCurrentUser();

		DubboUserIdRequest request = BeanMapper.map(req, DubboUserIdRequest.class);
		request.setUserId(user.getId());
		DubboOpenInfoResponse response = dubboAuthService.getOpenInfo(request);

		return BeanMapper.map(response, ClientOpenInfoResponse.class);
	}

	@RequestMapping(value = "confirm", method = RequestMethod.POST)
	public ClientBasicResponse confirm(@RequestBody ClientBasicRequest req) {
		/**
		 * 将微信号与账户绑定
		 */
		User user = getCurrentUser();
		Subject subject = SecurityUtils.getSubject();
		String openId = (String) subject.getSession().getAttribute("openId");

		if (!StringUtils.isNull(openId)) {
			DubboAddOpenIdRequest addOpenIdRequest = new DubboAddOpenIdRequest();
			addOpenIdRequest.setTid(req.getTid());
			addOpenIdRequest.setOpenId(openId);
			addOpenIdRequest.setId(user.getId());
			addOpenIdRequest.setOpenType(BindType.BIND_WEIXIN);
			dubboAuthService.addOpenId(addOpenIdRequest);
			subject.getSession().removeAttribute("openId");
		}
		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	private void addUserToSession(User user) {
		Subject subject = SecurityUtils.getSubject();
		subject.getSession().setAttribute("userInfo", user);
	}

	@RequestMapping(value = "weixin_login", method = RequestMethod.POST)
	public ClientBasicResponse weixinLogin(@RequestBody WeiXinLoginRequest req) {

		LoginResponse resp = new LoginResponse();
		Subject subject = SecurityUtils.getSubject();
		User user = null;
		/**
		 * 如果用户已经登录
		 */
		if (subject.isAuthenticated()) {
			user = (User) subject.getSession().getAttribute("userInfo");
			if (null == user) {
				subject.logout();
			}
			else {
				UserInfo data = BeanMapper.map(user, UserInfo.class);
				resp.setData(data);
				return resp;
			}
		}
		String weixinCode = req.getWeixinCode();
		if (StringUtils.isNull(weixinCode)) {
			return new ClientBasicResponse(ReturnCode.AUTH_FAILED, "登陆失败");
		}

		DubboWeixinCodeRequest weixinReq = new DubboWeixinCodeRequest();
		weixinReq.setWeixinCode(weixinCode);
		weixinReq.setTid(req.getTid());
		DubboWeixinInfoResponse weixinResp = dubboOpenService.getWeixinInfo(weixinReq);
		if (StringUtils.isNull(weixinResp.getOpenid())) {
			return new ClientBasicResponse(ReturnCode.AUTH_FAILED, "openId为空，登陆失败");
		}

		DubboOpenIdRequest openIdReq = new DubboOpenIdRequest();
		openIdReq.setTid(req.getTid());
		openIdReq.setOpenId(weixinResp.getOpenid());
		DubboUserResponse userResp = dubboOpenService.getUserByOpenId(openIdReq);
		user = userResp.getData();
		if (null == user) {
			resp.setCode(ReturnCode.OPENID_NO_USER);
			resp.setDesc("该微信号未绑定账号");
			subject.getSession().setAttribute("openId", weixinResp.getOpenid());
			return resp;
		}

		// String randomStr = UUID.randomUUID().toString() +
		// UUID.randomUUID().toString();
		// String password = HashUtils.hmacsha256(user.getPassword(),
		// randomStr);
		try {
			// String password = PasswordHash.createHash(user.getPassword());
			UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
			subject.login(token);
		}
		catch (Exception e) {
			return new ClientBasicResponse(ReturnCode.AUTH_FAILED, "使用微信登陆失败");
		}

		/**
		 * 将用户信息加入到session中
		 */
		addUserToSession(user);

		UserInfo data = BeanMapper.map(user, UserInfo.class);
		resp.setData(data);
		resp.setTid(req.getTid());
		return resp;
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	@CheckPermission("user:add")
	public ClientBasicResponse addUser(@RequestBody AddUserRequest req) {

		User currentUser = getCurrentUser();

		if (!RoleControl.canControl(currentUser.getRoleId(), req.getRoleId())) {
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "无权添加此种角色用户");
		}

		DubboUserNameRequest request = BeanMapper.map(req, DubboUserNameRequest.class);
		DubboUserResponse response = dubboAuthService.getUserByUsername(request);
		User user = response.getData();
		if (null != user) {
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "用户已经存在");
		}

		DubboUserRequest userReq = BeanMapper.map(req, DubboUserRequest.class);
		userReq.setPassword(req.getPassword());
		try {
			dubboAuthService.addUser(userReq);

		}
		catch (Exception e) {
			logger.error("addUser service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "添加用户失败");
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	@RequestMapping(value = "del", method = RequestMethod.POST)
	@CheckPermission("user:del")
	public ClientBasicResponse delUser(@RequestBody DelUserRequest req) {

		User currentUser = getCurrentUser();
		if (currentUser.getId().equals(req.getUserId())) {
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "用户不能删除用户自身");
		}

		DubboUserIdRequest userReq = BeanMapper.map(req, DubboUserIdRequest.class);

		DubboUserResponse response = dubboAuthService.getUserById(userReq);
		User user = response.getData();
		if (null != user) {
			if (!RoleControl.canControl(currentUser.getRoleId(), user.getRoleId())) {
				return new ClientBasicResponse(ReturnCode.ALERT_ERR, "无权删除此种角色用户");
			}

			DubboDelUserRequest request = BeanMapper.map(req, DubboDelUserRequest.class);
			dubboAuthService.delUser(request);
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	@RequestMapping(value = "updatebymanager", method = RequestMethod.POST)
	@CheckPermission("user:update")
	public ClientBasicResponse updatebymanager(@RequestBody UpdateUserRequest req) {

		User currentUser = getCurrentUser();

		if (null != req.getRoleId()) {
			/**
			 * 检查用户控制权限
			 */
			if (!RoleControl.canControl(currentUser.getRoleId(), req.getRoleId())) {
				return new ClientBasicResponse(ReturnCode.ALERT_ERR, "无权添加此种角色用户");
			}
		}

		try {
			DubboUserRequest user = new DubboUserRequest();
			user.setId(req.getUserId());
			user.setUsername(req.getUsername());
			user.setRoleId(req.getRoleId());
			user.setPassword(req.getPassword());
			dubboAuthService.updateUser(user);
		}
		catch (Exception e) {
			logger.error("updateUser service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "更新用户失败");
		}
		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	@RequestMapping(value = "updateuserinfo", method = RequestMethod.POST)
	public ClientBasicResponse updateuserinfo(@RequestBody UpdateUserRequest req) {

		User currentUser = getCurrentUser();

		try {
			DubboUserRequest user = BeanMapper.map(req, DubboUserRequest.class);
			user.setId(currentUser.getId());
			user.setUserImg(req.getDownloadUrl());
			DubboBasicResponse resp = dubboAuthService.updateUser(user);

			// 保存图片信息
			if (resp.getCode() == ReturnCode.SUCCESS) {
				DubboInsertUpdateImgRequest imgReq = new DubboInsertUpdateImgRequest();
				imgReq.setTid(req.getTid());
				List<DubboImg> imgList = new ArrayList<DubboImg>();
				DubboImg imgStoreTagLocation = new DubboImg();
				imgStoreTagLocation.setDownloadUrl(req.getDownloadUrl());
				imgStoreTagLocation.setFileId(req.getFileId());
				imgStoreTagLocation.setImageText(req.getImageText());
				imgStoreTagLocation.setManageUrl(req.getManageUrl());
				imgStoreTagLocation.setTypeId(DubboImageConstants.USER_IMG);
				imgList.add(imgStoreTagLocation);
				imgReq.setImgList(imgList);
				dubboImgService.insertUpdateImgAndTag(imgReq);
			}

		}
		catch (Exception e) {
			logger.error("updateuserinfo service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "更新用户失败");
		}
		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	@RequestMapping(value = "getuserinfo", method = RequestMethod.POST)
	@CheckPermission("user:getinfo")
	public ClientBasicResponse getInfo(@RequestBody ClientBasicRequest req) {
		User user = getCurrentUser();
		UserInfo data = BeanMapper.map(user, UserInfo.class);
		GetUserInfoResponse resp = new GetUserInfoResponse();
		resp.setData(data);
		resp.setTid(req.getTid());
		return resp;
	}

	@RequestMapping(value = "getuserinfolist", method = RequestMethod.POST)
	@CheckPermission("user:getinfo")
	public ClientBasicResponse getInfoList(@RequestBody ClientGetUserListRequest req) {

		DubboUserListRequest request = BeanMapper.map(req, DubboUserListRequest.class);
		DubboUserListResponse response = dubboAuthService.getUserListById(request);

		return BeanMapper.map(response, ClientGetUserListResponse.class);
	}

	@RequestMapping(value = "logout", method = RequestMethod.POST)
	public ClientBasicResponse logout(@RequestBody ClientBasicRequest req) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout();
		}
		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	@RequestMapping(value = "getlist", method = RequestMethod.POST)
	@CheckPermission("user:getlist")
	public ClientBasicResponse getUserList(@RequestBody GetUserListRequest req) {

		DubboUserPageRequest request = BeanMapper.map(req, DubboUserPageRequest.class);

		DubboUserListResponse response = dubboAuthService.getUserList(request);
		List<User> userList = response.getData();
		DubboUserRequest userRequest = BeanMapper.map(req, DubboUserRequest.class);
		DubboUserCountResponse countResponse = dubboAuthService.getUserCount(userRequest);
		Long userCount = countResponse.getData();

		GetUserListResponse resp = new GetUserListResponse();

		List<UserInfo> data = BeanMapper.map(userList, UserInfo.class);

		resp.setTotalNum(userCount);
		resp.setPageSize(req.getPageSize());
		resp.setCurrentPage(req.getCurrentPage());
		resp.setData(data);
		resp.setTid(req.getTid());
		return resp;
	}

	@RequestMapping(value = "getmenulist", method = RequestMethod.POST)
	@CheckPermission("user:getmenulist")
	public ClientBasicResponse getMenuList(@RequestBody ClientBasicRequest req) {
		User user = getCurrentUser();
		Integer roleId = user.getRoleId();
		List<Permission> permissionList = null;
		try {

			permissionList = dubboPermissionService.getPermissionsByRoleId(roleId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		List<MenuInfo> data = BeanMapper.map(permissionList, MenuInfo.class);

		GetMenuListResponse resp = new GetMenuListResponse();
		resp.setData(data);
		resp.setCode(ReturnCode.SUCCESS);
		resp.setTid(req.getTid());
		return resp;
	}

	// @RequestMapping(value = "uploadcontactinfo", method = RequestMethod.POST)
	// public ClientBasicResponse getConfig(@RequestBody
	// UploadContactInfoRequest req) {
	//
	// JSONObject object = new JSONObject();
	//
	// object.put("username", req.getUsername());
	// object.put("phone", req.getPhone());
	// object.put("companyName", req.getCompanyName());
	//
	// dubboAuthService.addContactInfo(object.toJSONString());
	//
	// return DubboReturnCode.Response.SUCCESS;
	// }

	@RequestMapping(value = "getrandom", method = RequestMethod.POST)
	public ClientBasicResponse getRandom(@RequestBody ClientBasicRequest req) {
		String random = IdGen.uuid();
		Subject subject = SecurityUtils.getSubject();
		subject.getSession().setAttribute("login_random", random);
		ClientRandomResponse response = new ClientRandomResponse();
		response.setTid(req.getTid());
		response.setCode(ReturnCode.SUCCESS);
		response.setData(random);
		return response;
	}

	@RequestMapping(value = "sendverifycode", method = RequestMethod.POST)
	public ClientBasicResponse sendverifycode(@RequestBody ClientVerifyRequest req) {

		String num = "0123456789";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(num.charAt(new Random().nextInt(num.length())));
		}

		DubboVerifyRequest request = BeanMapper.map(req, DubboVerifyRequest.class);
		request.setTemplateId(1);
		request.setVerifyCode(sb.toString());

		DubboVerifyResponse response = null;
		try {
			// TODO 测试用接口
			response = dubboAuthService.sendVerifyCode(request);
		}
		catch (Exception e) {
			logger.error("sendverifycode service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "验证码发送失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		Subject subject = SecurityUtils.getSubject();

		// TODO 测试用验证码
		subject.getSession().setAttribute("verifyCode", "123456");
		// subject.getSession().setAttribute("verifyCode",
		// request.getVerifyCode());
		subject.getSession().setAttribute("verifyTime", new Date().getTime());

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ClientBasicResponse register(@RequestBody ClientRegisterRequest req) {

		Subject subject = SecurityUtils.getSubject();
		String verifyCode = (String) subject.getSession().getAttribute("verifyCode");
		if (!req.getVerifyCode().equals(verifyCode)) {
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "验证码错误");
		}

		Long verifyTime = (Long) subject.getSession().getAttribute("verifyTime");
		if (new Date().getTime() - verifyTime > 180000) {
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "验证码超时");
		}

		subject.getSession().removeAttribute("verifyCode");
		subject.getSession().removeAttribute("verifyTime");

		DubboUserNameRequest request = BeanMapper.map(req, DubboUserNameRequest.class);
		DubboUserResponse response = dubboAuthService.getUserByUsername(request);
		User user = response.getData();
		if (user != null) {
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "用户已经存在");
		}
		
		request.setUsername(req.getPhone());
		response = dubboAuthService.getUserByUsername(request);
		user = response.getData();
		if (user != null) {
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "用户已经存在");
		}

		DubboRegisterRequest registerRequest = BeanMapper.map(req, DubboRegisterRequest.class);
		registerRequest.setRoleId(RoleType.NORMAL_USER);
		registerRequest.setUserType(UserType.NORMAL_USER);
		registerRequest.setPassword(req.getPassword());
		DubboRegisterResponse dubboResponse = null;

		try {
			dubboResponse = dubboAuthService.register(registerRequest);
		}
		catch (Exception e) {
			logger.debug("register service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "注册失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		// 添加用户关注与统计表信息
		DubboGetUserCountRequest cRequest = BeanMapper.map(req, DubboGetUserCountRequest.class);
		cRequest.setUserId(dubboResponse.getUserId());
		dubboUserService.addPersonCount(cRequest);

		UserRegisterInfo userInfo = BeanMapper.map(dubboResponse, UserRegisterInfo.class);
		ClientRegisterResponse registerResponse = new ClientRegisterResponse();
		registerResponse.setData(userInfo);
		registerResponse.setCode(ReturnCode.SUCCESS);
		registerResponse.setTid(req.getTid());
		return registerResponse;
	}

	@RequestMapping(value = "findpwd", method = RequestMethod.POST)
	public ClientBasicResponse findpwd(@RequestBody ClientFindPwdRequest req) {

		Subject subject = SecurityUtils.getSubject();
		String verifyCode = (String) subject.getSession().getAttribute("verifyCode");
		if (!req.getVerifyCode().equals(verifyCode)) {
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "验证码错误");
		}

		DubboUserNameRequest request = BeanMapper.map(req, DubboUserNameRequest.class);
		request.setUsername(req.getPhone());
		DubboUserResponse response = dubboAuthService.getUserByUsername(request);
		User user = response.getData();
		if (user == null) {
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "用户不存在");
		}

		DubboUserRequest u = new DubboUserRequest();
		DubboBasicResponse dubboResponse = null;
		try {
			u.setId(user.getId());
			u.setPassword(req.getPassword());
			dubboResponse = dubboAuthService.updateUser(u);
		}
		catch (ServiceException e) {
			logger.error("findpwd error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "密码修改失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	@RequestMapping(value = "adduseraddress", method = RequestMethod.POST)
	public ClientBasicResponse addUserAddress(@RequestBody ClientUserAdressRequest req) {

		User currentUser = getCurrentUser();
		req.setUserId(currentUser.getId());

		DubboAddUserAddressRequest request = BeanMapper.map(req, DubboAddUserAddressRequest.class);
		DubboAddUserAddressResponse response = null;
		try {
			response = dubboUserService.addUserAddress(request);
		}
		catch (Exception e) {
			logger.error("addAddress service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "添加地址失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		return new ClientBasicResponse(response.getCode(), "success");
	}

	@RequestMapping(value = "getuseraddress", method = RequestMethod.POST)
	public ClientBasicResponse getUserAddress(@RequestBody ClientGetAdressRequest req) {

		User currentUser = getCurrentUser();
		req.setUserId(currentUser.getId());
		ClientGetAddressResponse addressResponse = new ClientGetAddressResponse();
		DubboGetAddressRequest request = BeanMapper.map(req, DubboGetAddressRequest.class);
		DubboGetAddressResponse response = null;
		try {
			response = dubboUserService.getUserAddress(request);
		}
		catch (Exception e) {
			logger.error("getAddress service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取用户地址失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		addressResponse.setCode(ReturnCode.SUCCESS);
		addressResponse.setDesc("success");
		addressResponse.setData(response.getData());
		addressResponse.setTid(req.getTid());
		return addressResponse;
	}

	@RequestMapping(value = "updateuseraddress", method = RequestMethod.POST)
	public ClientBasicResponse updateUserAddress(@RequestBody ClientUserAdressRequest req) {

		User currentUser = getCurrentUser();
		req.setUserId(currentUser.getId());

		DubboAddUserAddressRequest request = BeanMapper.map(req, DubboAddUserAddressRequest.class);
		DubboAddUserAddressResponse response = null;
		try {
			response = dubboUserService.updateUserAddress(request);
		}
		catch (Exception e) {
			logger.error("addAddress service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "添加地址失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		return new ClientBasicResponse(response.getCode(), "success");
	}

	// TODO 调促销接口
	@RequestMapping(value = "addusercoupon", method = RequestMethod.POST)
	public ClientBasicResponse addUserCoupon(@RequestBody ClientUserCouponRequest req) {

		User currentUser = getCurrentUser();
		req.setUserId(currentUser.getId());

		return null;
	}

	@RequestMapping(value = "getuserpoints", method = RequestMethod.POST)
	public ClientBasicResponse getUserPoints(@RequestBody ClientBasicRequest req) {

		User currentUser = getCurrentUser();
		DubboUserPointsRequest request = new DubboUserPointsRequest();
		request.setUserId(currentUser.getId());

		DubboUserPointsResponse response = null;
		ClientPointsResponse clientPointsResponse = new ClientPointsResponse();

		try {
			response = dubboUserService.getUserPoints(request);
		}
		catch (Exception e) {
			logger.error("getUserPoints service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取用户积分失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		clientPointsResponse.setCode(ReturnCode.SUCCESS);
		clientPointsResponse.setDesc("success");
		clientPointsResponse.setData(response.getData());
		clientPointsResponse.setTid(req.getTid());
		return clientPointsResponse;
	}

	@RequestMapping(value = "getuserreceipt", method = RequestMethod.POST)
	public ClientBasicResponse getUserReceipt(@RequestBody ClientBasicRequest req) {

		User currentUser = getCurrentUser();

		DubboReceiptRequest request = new DubboReceiptRequest();
		request.setUserId(currentUser.getId());

		DubboReceiptResponse response = null;

		try {
			response = dubboUserService.getUserReceipt(request);
		}
		catch (Exception e) {
			logger.error("getUserReceipt service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取用户发票失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		ClientReceiptResponse receiptResponse = new ClientReceiptResponse();
		receiptResponse.setCode(ReturnCode.SUCCESS);
		receiptResponse.setDesc("success");
		receiptResponse.setData(response.getData());
		receiptResponse.setTid(req.getTid());
		return receiptResponse;
	}

	@RequestMapping(value = "adduserreceipt", method = RequestMethod.POST)
	public ClientBasicResponse addUserReceipt(@RequestBody ClientReceiptRequest req) {

		User currentUser = getCurrentUser();
		req.setUserId(currentUser.getId());

		DubboAddUserReceiptRequest request = BeanMapper.map(req, DubboAddUserReceiptRequest.class);
		DubboAddUserReceiptResponse response = null;
		try {
			response = dubboUserService.addUserReceipt(request);
		}
		catch (Exception e) {
			logger.error("addAddress service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "添加发票失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		return new ClientBasicResponse(response.getCode(), "success");
	}

	@RequestMapping(value = "deluserreceipt", method = RequestMethod.POST)
	public ClientBasicResponse delUserReceipt(@RequestBody ClientDelReceiptRequest req) {

		User currentUser = getCurrentUser();
		req.setUserId(currentUser.getId());

		DubboDelUserReceiptRequest request = BeanMapper.map(req, DubboDelUserReceiptRequest.class);
		DubboDelUserReceiptResponse response = null;
		try {
			response = dubboUserService.delUserReceipt(request);
		}
		catch (Exception e) {
			logger.error("addAddress service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "删除发票失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		return new ClientBasicResponse(response.getCode(), "success");
	}

	@RequestMapping(value = "getuserorderinfo", method = RequestMethod.POST)
	public ClientBasicResponse getUserOrderInfo(@RequestBody ClientGetUserOrderInfoRequest req) {
		User currentUser = getCurrentUser();
		req.setUserId(currentUser.getId());
		req.initPage();

		DubboGetUserOrderInfoResponse response = null;
		DubboGetUserOrderInfoRequest request = BeanMapper.map(req, DubboGetUserOrderInfoRequest.class);

		try {
			// TODO 测试,需调订单接口
			response = dubboUserService.getUserOrderInfo(request);
		}
		catch (Exception e) {
			logger.error("getUserOrderInfo service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取用户订单信息失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		ClientGetUserOrderInfoResponse orderInfoResponse = BeanMapper.map(response, ClientGetUserOrderInfoResponse.class);
		orderInfoResponse.setCode(ReturnCode.SUCCESS);
		orderInfoResponse.setDesc("success");
		orderInfoResponse.setTid(req.getTid());
		return orderInfoResponse;
	}

	@RequestMapping(value = "getusercollect", method = RequestMethod.POST)
	public ClientBasicResponse getUserCollect(@RequestBody ClientGetUserCollectRequest req) {
		User currentUser = getCurrentUser();
		req.setUserId(currentUser.getId());
		req.initPage();

		DubboGetUserCollectResponse response = null;
		DubboGetUserCollectRequest request = BeanMapper.map(req, DubboGetUserCollectRequest.class);
		ClientGetUserCollectResponse collectResponse = null;

		try {
			// 查询用户收藏skuid
			// response = dubboUserService.getSkuIdByUserId(request);
			// TODO 测试,需调订单接口
			response = dubboUserService.getUserCollect(request);
		}
		catch (Exception e) {
			logger.error("getUserCollect service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取用户收藏信息失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		collectResponse = BeanMapper.map(response, ClientGetUserCollectResponse.class);
		collectResponse.setCode(ReturnCode.SUCCESS);
		collectResponse.setDesc("success");
		collectResponse.setTid(req.getTid());
		return collectResponse;
	}

	@RequestMapping(value = "getuserwallet", method = RequestMethod.POST)
	public ClientBasicResponse getUserWallet(@RequestBody ClientBasicRequest req) {

		User currentUser = getCurrentUser();
		DubboUserWalletRequest request = new DubboUserWalletRequest();
		request.setUserId(currentUser.getId());

		DubboUserWalletResponse response = null;
		ClientWalletResponse clientWalletResponse = new ClientWalletResponse();

		try {
			response = dubboUserService.getUserWallet(request);
		}
		catch (Exception e) {
			logger.error("getUserWallet service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取钱包失败");
		}

		if (ReturnCode.SUCCESS != response.getCode()) {
			return new ClientBasicResponse(response.getCode(), response.getDesc());
		}

		clientWalletResponse.setCode(ReturnCode.SUCCESS);
		clientWalletResponse.setDesc("success");
		clientWalletResponse.setData(response.getData());
		clientWalletResponse.setTid(req.getTid());
		return clientWalletResponse;
	}

	/**
	 * 上传联系人
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "uploadcontacts", method = RequestMethod.POST)
	public ClientBasicResponse uploadContacts(@RequestBody ClientContactsRequest req) {
		User user = getCurrentUser();
		DubboConstactsRequest request = BeanMapper.map(req, DubboConstactsRequest.class);
		request.setUserId(user.getId());
		DubboBasicResponse dubboResponse = null;
		try {
			dubboResponse = dubboAuthService.uploadContacts(request);
		}
		catch (Exception e) {
			logger.error("uploadContacts service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "上传联系人信息失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return new ClientBasicResponse(dubboResponse.getCode(), "success");
	}

	/**
	 * 获取联系人列表
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getcontacts", method = RequestMethod.POST)
	public ClientBasicResponse getContacts(@RequestBody ClientBasicRequest req) {
		User user = getCurrentUser();

		DubboGetContactsResponse dubboResponse = null;
		DubboGetContactsRequest request = new DubboGetContactsRequest();
		request.setTid(req.getTid());
		request.setUserId(user.getId());
		try {
			dubboResponse = dubboAuthService.getContacts(request);
		}
		catch (Exception e) {
			logger.error("getContacts service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取联系人信息失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return BeanMapper.map(dubboResponse, ClientGetContactsResponse.class);
	}

	/**
	 * 获取关注数和粉丝数
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getpersoncount", method = RequestMethod.POST)
	public ClientBasicResponse getPersoncount(@RequestBody ClientBasicRequest req) {
		User user = getCurrentUser();

		DubboGetUserCountResponse dubboResponse = null;
		DubboGetUserCountRequest request = new DubboGetUserCountRequest();
		request.setTid(req.getTid());
		request.setUserId(user.getId());
		try {
			dubboResponse = dubboUserService.getPersonCount(request);
		}
		catch (Exception e) {
			logger.error("getPersoncount service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取用户关注数与粉丝数失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		ClientGetUserCountResponse response = new ClientGetUserCountResponse();
		response.setTid(req.getTid());
		response.setCode(ReturnCode.SUCCESS);
		response.setData(dubboResponse.getData());
		return response;
	}

	/**
	 * 添加关注
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "concern", method = RequestMethod.POST)
	public ClientBasicResponse concern(@RequestBody ClientConcernRequest req) {
		User user = getCurrentUser();

		DubboBasicResponse dubboResponse = null;
		DubboUserResponse dubboUserResponse = null;
		DubboConcernRequest request = new DubboConcernRequest();
		request.setTid(req.getTid());
		request.setUserId(user.getId());
		request.setUsername(user.getUsername());
		request.setConcernId(req.getUserId());
		
		try {
			dubboUserResponse = dubboAuthService.getUserById(new DubboUserIdRequest(req.getUserId()));
			request.setConcernName(dubboUserResponse.getData().getUsername());
			dubboResponse = dubboUserService.concern(request);
		}
		catch (Exception e) {
			logger.error("concern service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "添加关注失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	/**
	 * 取消关注
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "cancelconcern", method = RequestMethod.POST)
	public ClientBasicResponse cancelConcern(@RequestBody ClientConcernRequest req) {
		User user = getCurrentUser();

		DubboBasicResponse dubboResponse = null;
		DubboConcernRequest request = new DubboConcernRequest();
		request.setTid(req.getTid());
		request.setUserId(user.getId());
		request.setConcernId(req.getUserId());
		try {
			dubboResponse = dubboUserService.cancelConcern(request);
		}
		catch (Exception e) {
			logger.error("cancelConcern service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "取消关注失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	/**
	 * 关注笔记
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "concernnote", method = RequestMethod.POST)
	public ClientBasicResponse concernNote(@RequestBody ClientConcernNoteRequest req) {
		User user = getCurrentUser();

		DubboBasicResponse dubboResponse = null;
		DubboQueryNoteByNoteIdResponse noteByNoteIdResponse = null;
		DubboConcernNoteRequest request = new DubboConcernNoteRequest();
		request.setTid(req.getTid());
		request.setUserId(user.getId());
		request.setNoteId(req.getNoteId());
		DubboQueryNoteByNoteIdRequest noteByNoteIdRequest = BeanMapper.map(req, DubboQueryNoteByNoteIdRequest.class);

		try {
			noteByNoteIdResponse = dubboNoteService.queryNoteById(noteByNoteIdRequest);
			request.setNoteTitle(noteByNoteIdResponse.getNoteInfo().getNoteTitle());
			dubboResponse = dubboUserService.concernNote(request);
		}
		catch (Exception e) {
			logger.error("concernNote service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "关注笔记失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	/**
	 * 取消关注笔记
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "cancelconcernnote", method = RequestMethod.POST)
	public ClientBasicResponse cancelConcernNote(@RequestBody ClientConcernNoteRequest req) {
		User user = getCurrentUser();

		DubboBasicResponse dubboResponse = null;
		DubboConcernNoteRequest request = new DubboConcernNoteRequest();
		request.setTid(req.getTid());
		request.setUserId(user.getId());
		request.setNoteId(req.getNoteId());
		try {
			dubboResponse = dubboUserService.cancelConcernNote(request);
		}
		catch (Exception e) {
			logger.error("cancelConcernNote service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "关注笔记失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	/**
	 * 关注标签
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "concerntag", method = RequestMethod.POST)
	public ClientBasicResponse concernTag(@RequestBody ClientConcernTagRequest req) {
		User user = getCurrentUser();

		DubboBasicResponse dubboResponse = null;
		DubboConcernTagRequest request = new DubboConcernTagRequest();
		request.setTid(req.getTid());
		request.setUserId(user.getId());
		request.setTagId(req.getTagId());
		request.setTagName(req.getTagName());

		try {
			dubboResponse = dubboUserService.concernTag(request);
		}
		catch (Exception e) {
			logger.error("concerntag service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "关注标签失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	/**
	 * 取消关注标签
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "cancelconcerntag", method = RequestMethod.POST)
	public ClientBasicResponse cancelConcernTag(@RequestBody ClientConcernTagRequest req) {
		User user = getCurrentUser();

		DubboBasicResponse dubboResponse = null;
		DubboConcernTagRequest request = new DubboConcernTagRequest();
		request.setTid(req.getTid());
		request.setUserId(user.getId());
		request.setTagId(req.getTagId());
		try {
			dubboResponse = dubboUserService.cancelConcernTag(request);
		}
		catch (Exception e) {
			logger.error("cancelConcernTag service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "取消关注标签失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	/**
	 * 获取关注人列表
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getconcernpersonlist", method = RequestMethod.POST)
	public ClientBasicResponse getConcernPersonList(@RequestBody ClientBasicPageRequest req) {
		User user = getCurrentUser();

		req.initPage();
		DubboConcernPersonListResponse dubboResponse = null;
		DubboConcernPersonInfoResponse dubboInfoResponse = null;
		DubboConcernPersonListRequest request = BeanMapper.map(req, DubboConcernPersonListRequest.class);
		request.setUserId(user.getId());

		try {
			dubboResponse = dubboUserService.getConcernPersonList(request);
			dubboInfoResponse = BeanMapper.map(dubboResponse, DubboConcernPersonInfoResponse.class);
			dubboInfoResponse = dubboAuthService.fillPersonInfo(dubboInfoResponse);
		}
		catch (Exception e) {
			logger.error("getConcernPersonList service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取关注人列表失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		ClientConcernPersonListResponse personListResponse = BeanMapper.map(dubboInfoResponse, ClientConcernPersonListResponse.class);
		personListResponse.setCode(ReturnCode.SUCCESS);
		return personListResponse;
	}

	/**
	 * 获取关注笔记列表
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getconcernnotelist", method = RequestMethod.POST)
	public ClientBasicResponse getConcernNoteList(@RequestBody ClientBasicPageRequest req) {
		User user = getCurrentUser();

		req.initPage();
		DubboConcernNoteListResponse dubboResponse = null;
		DubboConcernNoteListRequest request = BeanMapper.map(req, DubboConcernNoteListRequest.class);
		request.setUserId(user.getId());

		try {
			dubboResponse = dubboUserService.getConcernNoteList(request);
		}
		catch (Exception e) {
			logger.error("getConcernNoteList service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取关注笔记列表失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		ClientConcernNoteListResponse noteListResponse = BeanMapper.map(dubboResponse, ClientConcernNoteListResponse.class);
		noteListResponse.setCode(ReturnCode.SUCCESS);
		return noteListResponse;
	}

	/**
	 * 获取关注标签列表
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getconcerntaglist", method = RequestMethod.POST)
	public ClientBasicResponse getConcernTagList(@RequestBody ClientBasicRequest req) {
		User user = getCurrentUser();

		DubboConcernTagListResponse dubboResponse = null;
		DubboConcernTagListRequest request = new DubboConcernTagListRequest();
		request.setTid(req.getTid());
		request.setUserId(user.getId());
		try {
			dubboResponse = dubboUserService.getConcernTagList(request);
		}
		catch (Exception e) {
			logger.error("getConcernTagList service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "获取关注标签列表失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		ClientConcernTagListResponse tagListResponse = BeanMapper.map(dubboResponse, ClientConcernTagListResponse.class);
		tagListResponse.setCode(ReturnCode.SUCCESS);
		return tagListResponse;
	}

	/**
	 * 角色控制类
	 * 
	 * @author hawk
	 *
	 */
	public static final class RoleControl {
		private static Map<Integer, List<Integer>> USER_CONTROL_MAP = new HashMap<Integer, List<Integer>>();

		static {
			List<Integer> list = new ArrayList<>();
			list.add(RoleType.SUPER_ADMIN);
			list.add(RoleType.SYSTEM_ADMIN);
			list.add(RoleType.YUNJU_USER);
			list.add(RoleType.NORMAL_ADMIN);
			list.add(RoleType.NORMAL_USER);
			USER_CONTROL_MAP.put(RoleType.SUPER_ADMIN, list);

			list = new ArrayList<>();
			list.add(RoleType.SYSTEM_ADMIN);
			list.add(RoleType.YUNJU_USER);
			list.add(RoleType.NORMAL_ADMIN);
			list.add(RoleType.NORMAL_USER);
			USER_CONTROL_MAP.put(RoleType.SYSTEM_ADMIN, list);

			list = new ArrayList<>();
			list.add(RoleType.NORMAL_ADMIN);
			list.add(RoleType.NORMAL_USER);
			USER_CONTROL_MAP.put(RoleType.NORMAL_ADMIN, list);
		}

		public static boolean canControl(int roleType1, int roleType2) {
			List<Integer> tmp = USER_CONTROL_MAP.get(roleType1);
			if (Collections3.isEmpty(tmp)) {
				return false;
			}
			else if (tmp.contains(roleType2)) {
				return true;
			}
			return false;
		}
	}
}
