package com.ninesale.valinor.userinfo.api.service;

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
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 用户 业务 接口
 * 
 * @author liuhui
 **/
public interface DubboUserService {

	/**
	 * 添加用户地址
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	DubboAddUserAddressResponse addUserAddress(DubboAddUserAddressRequest request) throws Exception;

	/**
	 * 获取用户地址
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	DubboGetAddressResponse getUserAddress(DubboGetAddressRequest request) throws Exception;

	/**
	 * 修改用户地址
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	DubboAddUserAddressResponse updateUserAddress(DubboAddUserAddressRequest request) throws Exception;

	/**
	 * 获取用户积分
	 * 
	 * @param request
	 * @return
	 */
	DubboUserPointsResponse getUserPoints(DubboUserPointsRequest request) throws Exception;

	/**
	 * 获取用户发票
	 * 
	 * @param request
	 * @return
	 */
	DubboReceiptResponse getUserReceipt(DubboReceiptRequest request) throws Exception;

	/**
	 * 添加用户发票
	 * 
	 * @param request
	 * @return
	 */
	DubboAddUserReceiptResponse addUserReceipt(DubboAddUserReceiptRequest request) throws Exception;

	/**
	 * 删除用户发票
	 * 
	 * @param request
	 * @return
	 */
	DubboDelUserReceiptResponse delUserReceipt(DubboDelUserReceiptRequest request) throws Exception;

	/**
	 * 获取用户收藏
	 * 
	 * @param request
	 * @return
	 */
	DubboGetUserOrderInfoResponse getUserOrderInfo(DubboGetUserOrderInfoRequest request) throws Exception;

	/**
	 * 获取用户收藏信息
	 * 
	 * @param request
	 * @return
	 */
	DubboGetUserCollectResponse getUserCollect(DubboGetUserCollectRequest request) throws Exception;

	/**
	 * 获取用户钱包
	 * 
	 * @param request
	 * @return
	 */
	DubboUserWalletResponse getUserWallet(DubboUserWalletRequest request) throws Exception;

	/**
	 * 获取用户skuid
	 * 
	 * @param request
	 * @return
	 */
	DubboGetUserCollectResponse getSkuIdByUserId(DubboGetUserCollectRequest request) throws Exception;

	/**
	 * 查询关注人与粉丝数量
	 * 
	 * @param request
	 * @return
	 */
	DubboGetUserCountResponse getPersonCount(DubboGetUserCountRequest request) throws Exception;

	/**
	 * 添加关注人
	 * 
	 * @param request
	 * @return
	 */
	DubboBasicResponse concern(DubboConcernRequest request) throws Exception;

	/**
	 * 取消关注人
	 * 
	 * @param request
	 * @return
	 */
	DubboBasicResponse cancelConcern(DubboConcernRequest request) throws Exception;

	/**
	 * 关注笔记
	 * 
	 * @param request
	 * @return
	 */
	DubboBasicResponse concernNote(DubboConcernNoteRequest request) throws Exception;

	/**
	 * 取消关注笔记
	 * 
	 * @param request
	 * @return
	 */
	DubboBasicResponse cancelConcernNote(DubboConcernNoteRequest request) throws Exception;

	/**
	 * 关注标签
	 * 
	 * @param request
	 * @return
	 */
	DubboBasicResponse concernTag(DubboConcernTagRequest request) throws Exception;

	/**
	 * 取消关注标签
	 * 
	 * @param request
	 * @return
	 */
	DubboBasicResponse cancelConcernTag(DubboConcernTagRequest request) throws Exception;

	/**
	 * 获取关注人列表
	 * 
	 * @param request
	 * @return
	 */
	DubboConcernPersonListResponse getConcernPersonList(DubboConcernPersonListRequest request) throws Exception;

	/**
	 * 获取关注笔记列表
	 * 
	 * @param request
	 * @return
	 */
	DubboConcernNoteListResponse getConcernNoteList(DubboConcernNoteListRequest request) throws Exception;

	/**
	 * 获取关注标签列表
	 * 
	 * @param request
	 * @return
	 */
	DubboConcernTagListResponse getConcernTagList(DubboConcernTagListRequest request) throws Exception;

	/**
	 * 添加用户统计信息
	 * 
	 * @param cRequest
	 */
	DubboBasicResponse addPersonCount(DubboGetUserCountRequest cRequest);

}
