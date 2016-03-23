/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * @author liuhui
 * 
 */
public class DubboConcernPersonListRequest extends DubboBasicPageRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2116609605422503909L;
	
	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

}
