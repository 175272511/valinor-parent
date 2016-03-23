/**
 * 
 */
package com.ninesale.valinor.auth.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboSinaCodeRequest  extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3665406383217080176L;

	private String sinaCode;

	public String getSinaCode() {
		return sinaCode;
	}

	public void setSinaCode(String sinaCode) {
		this.sinaCode = sinaCode;
	}

	
}
