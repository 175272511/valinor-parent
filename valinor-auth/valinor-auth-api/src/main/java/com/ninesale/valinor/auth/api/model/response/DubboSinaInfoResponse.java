/**
 * 
 */
package com.ninesale.valinor.auth.api.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboSinaInfoResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3763508863977741864L;

	@JSONField(name="access_token")
	private String accessToken;

	//access_token生命周期,单位秒
	@JSONField(name="expires_in")
	private Integer expiresIn;
	
	
	//用户唯一标识
	private String uid;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
}
