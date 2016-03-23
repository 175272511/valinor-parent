package com.ninesale.valinor.auth.provider.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ninesale.valinor.auth.api.model.DtoConcernPerson;
import com.ninesale.valinor.auth.api.model.DtoContacts;
import com.ninesale.valinor.auth.api.model.DtoOpenInfo;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.auth.api.model.WeixinUser;
import com.ninesale.valinor.auth.api.model.request.DubboAddOpenIdRequest;
import com.ninesale.valinor.auth.api.model.request.DubboConcernPersonInfoResponse;
import com.ninesale.valinor.auth.api.model.request.DubboConstactsRequest;
import com.ninesale.valinor.auth.api.model.request.DubboDelUserRequest;
import com.ninesale.valinor.auth.api.model.request.DubboGetContactsRequest;
import com.ninesale.valinor.auth.api.model.request.DubboLoginRequest;
import com.ninesale.valinor.auth.api.model.request.DubboOpenIdRequest;
import com.ninesale.valinor.auth.api.model.request.DubboRegisterRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserIdRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserListRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserNameRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserPageRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserRequest;
import com.ninesale.valinor.auth.api.model.request.DubboVerifyRequest;
import com.ninesale.valinor.auth.api.model.response.DubboGetContactsResponse;
import com.ninesale.valinor.auth.api.model.response.DubboOpenIdResponse;
import com.ninesale.valinor.auth.api.model.response.DubboOpenInfoResponse;
import com.ninesale.valinor.auth.api.model.response.DubboRegisterResponse;
import com.ninesale.valinor.auth.api.model.response.DubboUserCountResponse;
import com.ninesale.valinor.auth.api.model.response.DubboUserListResponse;
import com.ninesale.valinor.auth.api.model.response.DubboUserResponse;
import com.ninesale.valinor.auth.api.model.response.DubboVerifyResponse;
import com.ninesale.valinor.auth.api.service.DubboAuthService;
import com.ninesale.valinor.auth.provider.dao.AuthMapper;
import com.ninesale.valinor.auth.provider.dao.PermissionMapper;
import com.ninesale.valinor.auth.provider.dao.RoleMapper;
import com.ninesale.valinor.auth.provider.model.DtoUser;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.Collections3;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;
import com.pubpi.valinor.dubbo.base.model.DubboReturnCode;

/**
 * 
 * @author skyhawk
 *
 */
@Service("dubboAuthService")
public class DubboAuthServiceImpl implements DubboAuthService {
	
	private static final Logger logger = LoggerFactory.getLogger(DubboAuthServiceImpl.class);
	@Resource
	private AuthMapper authMapper;

	@Resource
	private RoleMapper roleMapper;

	@Resource
	private PermissionMapper permissionMapper;

	@Override
	public DubboUserResponse login(DubboLoginRequest req) {
		User user = BeanMapper.map(req, User.class);
		DubboUserResponse response = new DubboUserResponse();
		User userResp = null;
		try {
			userResp = authMapper.authentication(user);
		} catch (Exception e) {
			logger.error("login error", e.getMessage());
			response.setCode(DubboReturnCode.ALERT_ERR);
			response.setTid(req.getTid());
			return response;
		}
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(req.getTid());
		response.setData(userResp);
		return response;
	}

	@Override
	public DubboUserResponse getUserByUsername(DubboUserNameRequest req) {
		User user = new User();
		user.setUsername(req.getUsername());
		List<User> temp = authMapper.getUserByModel(user);

		User userResp = null != temp && temp.size() > 0 ? temp.get(0) : null;
		
		DubboUserResponse response = new DubboUserResponse();
		response.setTid(req.getTid());
		response.setCode(DubboReturnCode.SUCCESS);
		response.setData(userResp);
		return response;
	}

	@Override
	@Transactional
	public DubboBasicResponse addUser(DubboUserRequest user) {
		DtoUser dUser = BeanMapper.map(user, DtoUser.class);
		authMapper.insertUser(dUser);
		roleMapper.addUserToRoleInfo(dUser.getId(), dUser.getRoleId());
		
		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	public DubboBasicResponse updateUser(DubboUserRequest req) {
		User user = BeanMapper.map(req, User.class);
		authMapper.updateByPrimaryKeySelective(user);
		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	@Transactional
	public DubboBasicResponse delUser(DubboDelUserRequest req) {
		authMapper.deleteByPrimaryKey(req.getUserId());
		authMapper.deleteUserRole(req.getUserId());
		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	public DubboUserListResponse getUserList(DubboUserPageRequest req) {
		int beginId = (req.getCurrentPage() - 1) * req.getPageSize();
		User user = BeanMapper.map(req, User.class);
		List<User> list = authMapper.getUserListByParentIdWithPage(user, beginId, req.getPageSize());
		DubboUserListResponse userListResp = new DubboUserListResponse();
		userListResp.setCode(DubboReturnCode.SUCCESS);
		userListResp.setCurrentPage(req.getCurrentPage());
		userListResp.setPageSize(req.getPageSize());
		userListResp.setTid(req.getTid());
		userListResp.setData(list);
		return userListResp;
	}

	@Override
	public DubboUserCountResponse getUserCount(DubboUserRequest req) {
		User user = BeanMapper.map(req, User.class);
		Long count = authMapper.getUserCountByParentId(user);
		DubboUserCountResponse countResponse = new DubboUserCountResponse();
		countResponse.setCode(DubboReturnCode.SUCCESS);
		countResponse.setTid(req.getTid());
		countResponse.setData(count);
		
		return countResponse;
	}

	@Override
	public DubboUserResponse getUserById(DubboUserIdRequest req) {
		User user = new User();
		user.setId(req.getUserId());
		List<User> temp = authMapper.getUserByModel(user);

		User userResp = null != temp && temp.size() > 0 ? temp.get(0) : null;
		
		DubboUserResponse response = new DubboUserResponse();
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(req.getTid());
		response.setData(userResp);
		return response;
	}

	@Override
	public DubboUserResponse getUserByOpenId(DubboOpenIdRequest req) {
		WeixinUser weixinUser = new WeixinUser();
		weixinUser.setOpenId(req.getOpenId());

		List<WeixinUser> weixinUserList = authMapper.getWeixinUser(weixinUser);

		Long userId = null;
		DubboUserResponse response = new DubboUserResponse();
		if (!Collections3.isEmpty(weixinUserList)) {
			userId = weixinUserList.get(0).getUserId();
		}

		if (null == userId || 0 == userId) {
			response.setCode(DubboReturnCode.ALERT_ERR);
			response.setTid(req.getTid());
			response.setDesc("没有查询到该微信用户");
			return response;
		}

		User user = new User();
		user.setId(userId);
		List<User> temp = authMapper.getUserByModel(user);
		User userResp = null != temp && temp.size() > 0 ? temp.get(0) : null;
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(req.getTid());
		response.setData(userResp);
		
		return response;
	}

	@Override
	@Transactional
	public DubboBasicResponse addOpenId(DubboAddOpenIdRequest req) {
		/**
		 * 删除旧有版本关系
		 */
		WeixinUser weixinUser = new WeixinUser();
		weixinUser.setUserId(req.getId());
		authMapper.delWeixinUser(weixinUser);

		/**
		 * 添加新的版本关系
		 */
		weixinUser = new WeixinUser();
		weixinUser.setUserId(req.getId());
		weixinUser.setOpenId(req.getOpenId());
		weixinUser.setOpenType(req.getOpenType());
		authMapper.addOpenId(weixinUser);

		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}
	
	@Override
	public DubboBasicResponse delOpenId(DubboAddOpenIdRequest req) {
		/**
		 * 删除旧有版本关系
		 */
		WeixinUser weixinUser = new WeixinUser();
		weixinUser.setUserId(req.getId());
		weixinUser.setOpenType(req.getOpenType());
		authMapper.delWeixinUser(weixinUser);

		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	public DubboOpenIdResponse getOpenIdByUserId(DubboUserIdRequest req) {
		WeixinUser weixinUser = new WeixinUser();
		weixinUser.setUserId(req.getUserId());

		List<WeixinUser> weixinUserList = authMapper.getWeixinUser(weixinUser);

		DubboOpenIdResponse response = new DubboOpenIdResponse();
		if (!Collections3.isEmpty(weixinUserList)) {
			String openId = weixinUserList.get(0).getOpenId();
			response.setCode(DubboReturnCode.SUCCESS);
			response.setOpenId(openId);
			response.setTid(req.getTid());
			return response;
		}else{
			response.setCode(DubboReturnCode.ALERT_ERR);
			response.setTid(req.getTid());
			return response;
		}
	}

//	@Override
//	public List<User> getUserByMerchantId(Long merchantId) {
//		User user = new User();
//		return authMapper.getUserByModel(user);
//	}
//
//	@Override
//	public void addContactInfo(String jsonString) {
//		authMapper.addContactInfo(jsonString);
//	}

	@Override
	@Transactional
	public DubboRegisterResponse register(DubboRegisterRequest registerRequest) {
		DtoUser user = BeanMapper.map(registerRequest, DtoUser.class);
		authMapper.insertUser(user);
		roleMapper.addUserToRoleInfo(user.getId(), user.getRoleId());
		
		
		DubboRegisterResponse registerResponse = new DubboRegisterResponse(user.getId());
		registerResponse.setCode(0);
		
		return registerResponse;
	}

	@Override
	public DubboVerifyResponse sendVerifyCode(DubboVerifyRequest request) {
//		HashMap<String, Object> result = null;
//
//		//初始化SDK
//		CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
//		
//		//******************************注释*********************************************
//		//*初始化服务器地址和端口                                                       *
//		//*沙盒环境（用于应用开发调试）：restAPI.init("sandboxapp.cloopen.com", "8883");*
//		//*生产环境（用户应用上线使用）：restAPI.init("app.cloopen.com", "8883");       *
//		//*******************************************************************************
//		restAPI.init("sandboxapp.cloopen.com", "8883");
//		
//		//******************************注释*********************************************
//		//*初始化主帐号和主帐号令牌,对应官网开发者主账号下的ACCOUNT SID和AUTH TOKEN     *
//		//*ACOUNT SID和AUTH TOKEN在登陆官网后，在“应用-管理控制台”中查看开发者主账号获取*
//		//*参数顺序：第一个参数是ACOUNT SID，第二个参数是AUTH TOKEN。                   *
//		//*******************************************************************************
//		restAPI.setAccount("8a48b5515099b1880150a30f79da1a3e", "fdb72b8ce0e7420db9a00b1220006f5d");
//		
//		
//		//******************************注释*********************************************
//		//*初始化应用ID                                                                 *
//		//*测试开发可使用“测试Demo”的APP ID，正式上线需要使用自己创建的应用的App ID     *
//		//*应用ID的获取：登陆官网，在“应用-应用列表”，点击应用名称，看应用详情获取APP ID*
//		//*******************************************************************************
//		restAPI.setAppId("8a48b5515099b1880150a30faab51a40");
//		
//		
//		//******************************注释****************************************************************
//		//*调用发送模板短信的接口发送短信                                                                  *
//		//*参数顺序说明：                                                                                  *
//		//*第一个参数:是要发送的手机号码，可以用逗号分隔，一次最多支持100个手机号                          *
//		//*第二个参数:是模板ID，在平台上创建的短信模板的ID值；测试的时候可以使用系统的默认模板，id为1。    *
//		//*系统默认模板的内容为“【云通讯】您使用的是云通讯短信模板，您的验证码是{1}，请于{2}分钟内正确输入”*
//		//*第三个参数是要替换的内容数组。																														       *
//		//**************************************************************************************************
//		
//		//**************************************举例说明***********************************************************************
//		//*假设您用测试Demo的APP ID，则需使用默认模板ID 1，发送手机号是13800000000，传入参数为6532和5，则调用方式为           *
//		//*result = restAPI.sendTemplateSMS("13800000000","1" ,new String[]{"6532","5"});																		  *
//		//*则13800000000手机号收到的短信内容是：【云通讯】您使用的是云通讯短信模板，您的验证码是6532，请于5分钟内正确输入     *
//		//*********************************************************************************************************************
//		result = restAPI.sendTemplateSMS("15814013469","1" ,new String[]{request.getVerifyCode(),"2"});
//		
//		System.out.println("SDKTestGetSubAccounts result=" + result);
//		if("000000".equals(result.get("statusCode"))){
//			//正常返回输出data包体信息（map）
//			HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
//			Set<String> keySet = data.keySet();
//			for(String key:keySet){
//				Object object = data.get(key);
//				System.out.println(key +" = "+object);
//			}
//		}else{
//			//异常返回输出错误码和错误信息
//			System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));
//		}
		
		DubboVerifyResponse response = BeanMapper.map(request, DubboVerifyResponse.class);
		response.setCode(0);
		return response;
	}

	@Override
	public DubboUserResponse getManagerByUsername(DubboUserNameRequest req) {
		User user = new User();
		user.setUsername(req.getUsername());
		List<User> temp = authMapper.getUserByModel(user);

		User userResp = null != temp && temp.size() > 0 ? temp.get(0) : null;
		
		DubboUserResponse response = new DubboUserResponse();
		response.setTid(req.getTid());
		response.setCode(DubboReturnCode.SUCCESS);
		response.setData(userResp);
		return response;
	}


	@Override
	@Transactional
	public DubboBasicResponse uploadContacts(DubboConstactsRequest request) throws Exception {

		try {
			authMapper.replaceContacts(request);
		} catch (Exception e) {
			logger.error("uploadContacts dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "success");
	}

	@Override
	public DubboGetContactsResponse getContacts(DubboGetContactsRequest request) throws Exception {
		List<DtoContacts> data = null;
		try {
			data = authMapper.getContacts(request.getUserId());
		} catch (Exception e) {
			logger.error("getContacts dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		
		DubboGetContactsResponse response = new DubboGetContactsResponse();
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(request.getTid());
		response.setDesc("success");
		response.setData(data);
		return response;
	}

	@Override
	public DubboOpenInfoResponse getOpenInfo(DubboUserIdRequest request) {
		List<DtoOpenInfo> data = null;

		try {
			data = authMapper.getOpenInfo(request.getUserId());
		} catch (Exception e) {
			logger.error("getOpenInfo dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		
		DubboOpenInfoResponse response = BeanMapper.map(request, DubboOpenInfoResponse.class);
		response.setCode(DubboReturnCode.SUCCESS);
		response.setData(data);
		return response;
	}

	@Override
	public DubboUserListResponse getUserListById(DubboUserListRequest request) {
		List<User> data = null;
		
		try {
			data = authMapper.getUserListById(request.getUserIdList());
		} catch (Exception e) {
			logger.error("getUserListById dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		
		DubboUserListResponse response = BeanMapper.map(request, DubboUserListResponse.class);
		response.setCode(DubboReturnCode.SUCCESS);
		response.setData(data);
		return response;
	}

	@Override
	public DubboConcernPersonInfoResponse fillPersonInfo(DubboConcernPersonInfoResponse dubboInfoResponse) throws Exception {
		List<DtoConcernPerson> personList = dubboInfoResponse.getData();
		
		if(Collections3.isEmpty(personList)){
			return null;
		}
		
		DubboUserListRequest request = BeanMapper.map(dubboInfoResponse, DubboUserListRequest.class);
		List<Long> userIdList = new ArrayList<>();
		for (DtoConcernPerson  dtoConcernPerson : personList) {
			userIdList.add(dtoConcernPerson.getConcernId());
		}
		
		DubboUserListResponse userListResp = null;
		try {
			request.setUserIdList(userIdList);
			userListResp = getUserListById(request);
		} catch (Exception e) {
			logger.error("fillPersonInfo dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		
		List<User> userList = userListResp.getData();
		
		Map<Long, User> userMap = transferUserListToMap(userList);
		for (DtoConcernPerson  dtoConcernPerson : personList) {
			User user = userMap.get(dtoConcernPerson.getConcernId());
			if(user == null)
				continue;
			dtoConcernPerson.setConcernName(user.getUsername());
			dtoConcernPerson.setUserImg(user.getUserImg());
		}
		
		return dubboInfoResponse;
	}
	
	
	private Map<Long, User> transferUserListToMap(List<User> userList){
		Map<Long, User> map = new HashMap<Long, User>();
		for (User user : userList) {
			map.put(user.getId(), user);
		}
		return map;
	}

	

}
