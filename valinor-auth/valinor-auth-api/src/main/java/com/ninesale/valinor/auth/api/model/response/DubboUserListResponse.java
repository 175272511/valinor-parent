/**
 * 
 */
package com.ninesale.valinor.auth.api.model.response;

import java.util.List;

import com.ninesale.valinor.auth.api.model.User;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageResponse;

/**
 * @author liuhui
 * 
 */
public class DubboUserListResponse extends DubboBasicPageResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4103057110353455905L;

	private List<User> data;

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}
	
	
}
