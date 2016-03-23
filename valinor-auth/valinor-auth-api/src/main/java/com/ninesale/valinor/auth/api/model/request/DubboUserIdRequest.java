/**
 * 
 */
package com.ninesale.valinor.auth.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboUserIdRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -983955665514282768L;
	
	public DubboUserIdRequest(){}
	
	public DubboUserIdRequest(Long userId) {
		super();
		this.userId = userId;
	}

	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
