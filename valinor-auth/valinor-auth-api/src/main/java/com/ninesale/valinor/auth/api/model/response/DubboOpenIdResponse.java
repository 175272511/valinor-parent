/**
 * 
 */
package com.ninesale.valinor.auth.api.model.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboOpenIdResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8838691441176417068L;

	private String openId;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
}
