/**
 * 
 */
package com.ninesale.valinor.auth.api.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author liuhui
 * 
 */
public class DtoContacts implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7816684128806217687L;
	
	private String username;
	
	private String phone;
	
	private String lookup;
	
	private String status;
	
	private Long userId;
	

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLookup() {
		return lookup;
	}

	public void setLookup(String lookup) {
		this.lookup = lookup;
	}

	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
