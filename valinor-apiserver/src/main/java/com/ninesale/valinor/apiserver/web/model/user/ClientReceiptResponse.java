/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.userinfo.api.model.DtoUserReceipt;

/**
 * @author liuhui
 * 
 */
public class ClientReceiptResponse extends ClientBasicResponse{
	
	private List<DtoUserReceipt> data;

	
	
	public List<DtoUserReceipt> getData() {
		return data;
	}



	public void setData(List<DtoUserReceipt> data) {
		this.data = data;
	}



	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

}
