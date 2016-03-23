/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboUserWalletRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1416595014347185928L;
	
	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
