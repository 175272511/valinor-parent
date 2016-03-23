package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.userinfo.api.model.DtoUserAddress;

public class ClientGetAddressResponse extends ClientBasicResponse{

	private List<DtoUserAddress> data;

	public List<DtoUserAddress> getData() {
		return data;
	}

	public void setData(List<DtoUserAddress> data) {
		this.data = data;
	}
	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
