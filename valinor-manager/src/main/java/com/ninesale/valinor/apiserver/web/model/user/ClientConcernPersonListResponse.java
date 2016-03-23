/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.userinfo.api.model.DtoConcernPerson;

/**
 * @author liuhui
 * 
 */
public class ClientConcernPersonListResponse extends ClientBasicResponse{

	private List<DtoConcernPerson> data;

	public List<DtoConcernPerson> getData() {
		return data;
	}

	public void setData(List<DtoConcernPerson> data) {
		this.data = data;
	}
	
	
}
