/**
 * 
 */
package com.ninesale.valinor.auth.api.model.response;

import java.util.List;

import com.ninesale.valinor.auth.api.model.DtoContacts;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboGetContactsResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6638344274235285338L;

	private List<DtoContacts> data;

	public List<DtoContacts> getData() {
		return data;
	}

	public void setData(List<DtoContacts> data) {
		this.data = data;
	}

	
	
}
