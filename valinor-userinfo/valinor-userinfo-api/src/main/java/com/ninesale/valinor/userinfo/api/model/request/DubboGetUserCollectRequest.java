/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * @author liuhui
 * 
 */
public class DubboGetUserCollectRequest extends DubboBasicPageRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4524804817345921869L;
	
	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
