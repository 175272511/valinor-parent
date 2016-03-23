/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.response;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.userinfo.api.model.DtoUserPoints;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * @2015年11月3日
 * 
 */
public class DubboUserPointsResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2866756856821195042L;
	
	private DtoUserPoints data;

	
	public DtoUserPoints getData() {
		return data;
	}


	public void setData(DtoUserPoints data) {
		this.data = data;
	}


	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
