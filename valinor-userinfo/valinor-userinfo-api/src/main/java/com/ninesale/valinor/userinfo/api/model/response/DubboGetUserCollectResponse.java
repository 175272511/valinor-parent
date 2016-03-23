/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.response;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.userinfo.api.model.DtoUserCollect;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageResponse;

/**
 * @author liuhui
 * 
 */
public class DubboGetUserCollectResponse extends DubboBasicPageResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8293058455485050152L;

	private List<DtoUserCollect> data;

	public List<DtoUserCollect> getData() {
		return data;
	}

	public void setData(List<DtoUserCollect> data) {
		this.data = data;
	}
	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	
	
	
}
