/**
 * 
 */
package com.ninesale.valinor.auth.api.model.request;

import java.util.List;

import com.ninesale.valinor.auth.api.model.DtoContacts;
import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboConstactsRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1012446911540675193L;
	
	private Long userId;
	
	private List<DtoContacts> contacts;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<DtoContacts> getContacts() {
		return contacts;
	}

	public void setContacts(List<DtoContacts> contacts) {
		this.contacts = contacts;
	}
	

}
