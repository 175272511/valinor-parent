/**
 * 
 */
package com.ninesale.valinor.auth.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboWeixinCodeRequest  extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3665406383217080176L;

	private String weixinCode;

	public String getWeixinCode() {
		return weixinCode;
	}

	public void setWeixinCode(String weixinCode) {
		this.weixinCode = weixinCode;
	}
	
}
