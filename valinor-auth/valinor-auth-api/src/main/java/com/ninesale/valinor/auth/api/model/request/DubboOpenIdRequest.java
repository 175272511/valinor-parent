/**
 * 
 */
package com.ninesale.valinor.auth.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboOpenIdRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8828538808693705337L;

	private String openId;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
	
}
