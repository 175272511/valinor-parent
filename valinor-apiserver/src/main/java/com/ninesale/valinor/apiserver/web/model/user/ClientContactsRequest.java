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
public class ClientContactsRequest extends ClientBasicRequest{
	
	private List<Contacts> contacts;

	public List<Contacts> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}

	
}
