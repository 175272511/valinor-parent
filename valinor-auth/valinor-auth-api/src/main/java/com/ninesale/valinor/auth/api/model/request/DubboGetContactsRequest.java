/**
 * 
 */
package com.ninesale.valinor.auth.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboGetContactsRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3239207708495388882L;

	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
