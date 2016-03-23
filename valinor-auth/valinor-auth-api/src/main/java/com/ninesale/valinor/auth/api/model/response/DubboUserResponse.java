/**
 * 
 */
package com.ninesale.valinor.auth.api.model.response;

import com.ninesale.valinor.auth.api.model.User;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboUserResponse extends DubboBasicResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1453669073944399343L;
	private User data;

	public User getData() {
		return data;
	}

	public void setData(User data) {
		this.data = data;
	}
	

}
