/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.userinfo.api.model.DtoConcernTag;

/**
 * @author liuhui
 * 
 */
public class ClientConcernTagListResponse extends ClientBasicResponse{

	private List<DtoConcernTag> data;

	public List<DtoConcernTag> getData() {
		return data;
	}

	public void setData(List<DtoConcernTag> data) {
		this.data = data;
	}


	
}
