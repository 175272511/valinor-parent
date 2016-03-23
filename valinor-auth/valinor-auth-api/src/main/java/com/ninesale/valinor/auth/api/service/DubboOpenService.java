package com.ninesale.valinor.auth.api.service;

import com.ninesale.valinor.auth.api.model.request.DubboOpenIdRequest;
import com.ninesale.valinor.auth.api.model.request.DubboSinaCodeRequest;
import com.ninesale.valinor.auth.api.model.request.DubboWeixinCodeRequest;
import com.ninesale.valinor.auth.api.model.response.DubboSinaInfoResponse;
import com.ninesale.valinor.auth.api.model.response.DubboUserResponse;
import com.ninesale.valinor.auth.api.model.response.DubboWeixinInfoResponse;

/**
 * @author liuhui
 * 
 */
public interface DubboOpenService {
	
	/**
	 * 通过微信获取access_token信息
	 * @param weixinReq
	 * @return
	 */
	DubboWeixinInfoResponse getWeixinInfo(DubboWeixinCodeRequest weixinReq);
	/**
	 * 通过新浪获取access_token信息
	 * @param xinlangReq
	 * @return
	 */
	DubboSinaInfoResponse getSinaInfo(DubboSinaCodeRequest sinaReq);
	/**
	 * 根据OpenID查询用户
	 * 
	 * @param openId
	 * @return
	 */
	DubboUserResponse getUserByOpenId(DubboOpenIdRequest req);

}
