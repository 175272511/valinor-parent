/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicPageResponse;
import com.ninesale.valinor.userinfo.api.model.DtoUserCollect;

/**
 * @author liuhui
 * 
 */
public class ClientGetUserCollectResponse extends ClientBasicPageResponse{
	
	private List<DtoUserCollect> data;

	public List<DtoUserCollect> getData() {
		return data;
	}

	public void setData(List<DtoUserCollect> data) {
		this.data = data;
	}
	
	

}
