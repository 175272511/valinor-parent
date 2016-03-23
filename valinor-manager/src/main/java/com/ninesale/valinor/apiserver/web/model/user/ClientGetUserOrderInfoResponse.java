/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicPageResponse;
import com.ninesale.valinor.userinfo.api.model.DtoUserOrderInfo;

/**
 * @author liuhui
 * 
 */
public class ClientGetUserOrderInfoResponse extends ClientBasicPageResponse{
	
	private List<DtoUserOrderInfo> data;


	public List<DtoUserOrderInfo> getData() {
		return data;
	}


	public void setData(List<DtoUserOrderInfo> data) {
		this.data = data;
	}


	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
