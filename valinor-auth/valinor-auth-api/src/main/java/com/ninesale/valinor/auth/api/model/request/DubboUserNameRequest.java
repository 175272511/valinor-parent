/**
 * 
 */
package com.ninesale.valinor.auth.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboUserNameRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8464861831305041113L;

	/**
	 * 用户名称
	 */
	private String username;


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

}
