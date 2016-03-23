/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.userinfo.api.model.DtoUserCount;

/**
 * @author liuhui
 * 
 */
public class ClientGetUserCountResponse extends ClientBasicResponse {

	private DtoUserCount data;

	public DtoUserCount getData() {
		return data;
	}

	public void setData(DtoUserCount data) {
		this.data = data;
	}

	
}
