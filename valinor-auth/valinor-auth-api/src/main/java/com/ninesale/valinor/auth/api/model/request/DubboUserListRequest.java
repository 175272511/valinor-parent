/**
 * 
 */
package com.ninesale.valinor.auth.api.model.request;

import java.util.List;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboUserListRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2119219468511106490L;
	private List<Long> userIdList;
	public List<Long> getUserIdList() {
		return userIdList;
	}
	public void setUserIdList(List<Long> userIdList) {
		this.userIdList = userIdList;
	}

	
}
