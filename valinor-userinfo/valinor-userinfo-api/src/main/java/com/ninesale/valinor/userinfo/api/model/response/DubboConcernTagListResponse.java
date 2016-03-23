/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.response;

import java.util.List;

import com.ninesale.valinor.userinfo.api.model.DtoConcernTag;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboConcernTagListResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7992936391732994738L;
	
	private List<DtoConcernTag> data;

	public List<DtoConcernTag> getData() {
		return data;
	}

	public void setData(List<DtoConcernTag> data) {
		this.data = data;
	}


	

}
