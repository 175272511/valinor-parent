package com.ninesale.valinor.userinfo.api.model.response;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.userinfo.api.model.DtoUserAddress;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

public class DubboGetAddressResponse extends DubboBasicResponse{
    /**
	 * 
	 */
	private static final long serialVersionUID = 359495081047929387L;

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