/**
 * 
 */
package com.ninesale.valinor.auth.api.model.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboUserCountResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2679431603776882351L;

	private Long data;

	public Long getData() {
		return data;
	}

	public void setData(Long data) {
		this.data = data;
	}
	
}
