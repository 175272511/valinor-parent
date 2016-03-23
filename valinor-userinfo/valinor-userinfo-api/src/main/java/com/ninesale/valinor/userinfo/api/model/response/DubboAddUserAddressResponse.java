package com.ninesale.valinor.userinfo.api.model.response;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

public class DubboAddUserAddressResponse extends DubboBasicResponse{
    /**
	 * 
	 */
	private static final long serialVersionUID = 359495081047929387L;

	public DubboAddUserAddressResponse(){}
	
	public DubboAddUserAddressResponse(int resultCode, String errorMsg, String tid){
		super(resultCode, errorMsg);
	}	
	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}