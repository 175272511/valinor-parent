/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.response;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboAddUserReceiptResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4839808355888548136L;
	
	public DubboAddUserReceiptResponse(){}
	
	public DubboAddUserReceiptResponse(int resultCode, String errorMsg, String tid){
		super(resultCode, errorMsg);
	}	
	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

}
