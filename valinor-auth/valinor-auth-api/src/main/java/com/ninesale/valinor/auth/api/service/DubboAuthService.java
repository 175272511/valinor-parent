package com.ninesale.valinor.auth.api.service;

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
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 用户 业务 接口
 * 
 * @author StarZou
 * @since 2014年7月5日 上午11:53:33
 **/
public interface DubboAuthService {
	
	/**
	 * 用户验证
	 * 
	 * @param user
	 * @return
	 */
	DubboUserResponse login(DubboLoginRequest req);

	/**
	 * 根据用户名查询用户
	 * 
	 * @param username
	 * @return
	 */
	DubboUserResponse getUserByUsername(DubboUserNameRequest req);

	/**
	 * 根据用户名查询管理员
	 * 
	 * @param username
	 * @return
	 */
	DubboUserResponse getManagerByUsername(DubboUserNameRequest req);
	/**
	 * 添加用户
	 * 
	 * @param req
	 * @param userInfo
	 * @return
	 */
	DubboBasicResponse addUser(DubboUserRequest req);

	/**
	 * 更新用户信息
	 * 
	 * @param req
	 * @param currentUser
	 * @return
	 */
	DubboBasicResponse updateUser(DubboUserRequest req);

	/**
	 * 删除用户信息
	 * 
	 * @param req
	 * @param currentUser
	 * @return
	 */
	DubboBasicResponse delUser(DubboDelUserRequest req);

	/**
	 * 查询用户列表
	 * 
	 * @param id
	 * @return
	 */
	DubboUserListResponse getUserList(DubboUserPageRequest req);

	/**
	 * 获取用户管理的用户数量
	 * 
	 * @param id
	 * @return
	 */
	DubboUserCountResponse getUserCount(DubboUserRequest req);

	/**
	 * 根据用户ID获取用户
	 * 
	 * @param userId
	 * @return
	 */
	DubboUserResponse getUserById(DubboUserIdRequest req);

	/**
	 * 根据OpenID查询用户
	 * 
	 * @param openId
	 * @return
	 */
	DubboUserResponse getUserByOpenId(DubboOpenIdRequest req);

	/**
	 * 将openID与用户绑定
	 * 
	 * @param openId
	 * @param id
	 */
	DubboBasicResponse addOpenId(DubboAddOpenIdRequest req);

	/**
	 * 根据userId获取openid
	 * 
	 * @param id
	 * @return
	 */
	DubboOpenIdResponse getOpenIdByUserId(DubboUserIdRequest req);


//	DubboBasicResponse addContactInfo(String jsonString);

	/**
	 * 用户注册
	 * @param registerRequest
	 * @return 
	 */
	DubboRegisterResponse register(DubboRegisterRequest registerRequest);

	/**
	 * 发送验证码
	 * @param request
	 * @return
	 */
	DubboVerifyResponse sendVerifyCode(DubboVerifyRequest request);

	/**
	 * 上传联系人信息
	 * @param request
	 * @return
	 * @throws Exception
	 */
	DubboBasicResponse uploadContacts(DubboConstactsRequest request) throws Exception;

	/**
	 * 获取匹配联系人信息
	 * @param request
	 * @return
	 */
	DubboGetContactsResponse getContacts(DubboGetContactsRequest request) throws Exception;

	/**
	 * 解除微信绑定
	 * @param addOpenIdRequest
	 */
	DubboBasicResponse delOpenId(DubboAddOpenIdRequest addOpenIdRequest);

	/**
	 * 获取第三方绑定信息
	 * @param request
	 * @return
	 */
	DubboOpenInfoResponse getOpenInfo(DubboUserIdRequest request);

	/**
	 * 根据用户id获取用户信息
	 * @param request
	 * @return
	 */
	DubboUserListResponse getUserListById(DubboUserListRequest request);

	/**
	 * 填充用户信息
	 * @param dubboInfoResponse
	 * @return 
	 */
	DubboConcernPersonInfoResponse fillPersonInfo(DubboConcernPersonInfoResponse dubboInfoResponse) throws Exception;


}
