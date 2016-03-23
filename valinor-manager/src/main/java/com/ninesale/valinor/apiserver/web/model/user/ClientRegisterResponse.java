package com.ninesale.valinor.apiserver.web.model.user;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

public class ClientRegisterResponse extends ClientBasicResponse{
	
	private UserRegisterInfo data;
	

	public UserRegisterInfo getData() {
		return data;
	}


	public void setData(UserRegisterInfo data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	
}
