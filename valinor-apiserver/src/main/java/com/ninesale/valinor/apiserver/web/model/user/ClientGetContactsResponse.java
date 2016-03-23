/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.auth.api.model.DtoContacts;

/**
 * @author liuhui
 * 
 */
public class ClientGetContactsResponse extends ClientBasicResponse{


	private List<DtoContacts> data;

	public List<DtoContacts> getData() {
		return data;
	}

	public void setData(List<DtoContacts> data) {
		this.data = data;
	}

	
	
}
