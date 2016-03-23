/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.response;

import com.ninesale.valinor.userinfo.api.model.DtoUserCount;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboGetUserCountResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3237025973444851968L;

	private DtoUserCount data;

	public DtoUserCount getData() {
		return data;
	}

	public void setData(DtoUserCount data) {
		this.data = data;
	}
	
	
}
