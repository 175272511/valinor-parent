/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * @author liuhui
 * 
 */
public class ClientGetUserListRequest extends ClientBasicRequest{

	private List<String> userIdList;

	public List<String> getUserIdList() {
		return userIdList;
	}

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	
	
}
