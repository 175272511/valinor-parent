/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.response;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.userinfo.api.model.DtoUserOrderInfo;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageResponse;

/**
 * @author liuhui
 * 
 */
public class DubboGetUserOrderInfoResponse extends DubboBasicPageResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4396023330415450172L;
	
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
