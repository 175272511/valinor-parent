/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.auth.api.model.DtoOpenInfo;

/**
 * @author liuhui
 * 
 */
public class ClientOpenInfoResponse extends ClientBasicResponse{
	
	private List<DtoOpenInfo> data;

	public List<DtoOpenInfo> getData() {
		return data;
	}

	public void setData(List<DtoOpenInfo> data) {
		this.data = data;
	}
	
	

}
