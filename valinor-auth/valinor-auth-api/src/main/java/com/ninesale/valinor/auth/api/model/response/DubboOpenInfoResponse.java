/**
 * 
 */
package com.ninesale.valinor.auth.api.model.response;

import java.util.List;

import com.ninesale.valinor.auth.api.model.DtoOpenInfo;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboOpenInfoResponse extends DubboBasicResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8914604153528603292L;

	private List<DtoOpenInfo> data;

	public List<DtoOpenInfo> getData() {
		return data;
	}

	public void setData(List<DtoOpenInfo> data) {
		this.data = data;
	}
	

}
