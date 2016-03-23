/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.response;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.userinfo.api.model.DtoUserReceipt;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboReceiptResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8717438009119590237L;

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
