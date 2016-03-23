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
public class DubboWeixinInfoResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3763508863977741864L;

	@JSONField(name="access_token")
	private String accessToken;

	@JSONField(name="expires_in")
	private Integer expiresIn;
	
	@JSONField(name="refresh_token")
	private String refreshToken;
	
	private String openid;
	
	private String scope;
	
	private String unionid;

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

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	
	
}
