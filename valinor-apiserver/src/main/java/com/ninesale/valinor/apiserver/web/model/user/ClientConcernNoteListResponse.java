/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.userinfo.api.model.DtoConcernNote;

/**
 * @author liuhui
 * 
 */
public class ClientConcernNoteListResponse extends ClientBasicResponse{

	private List<DtoConcernNote> data;

	public List<DtoConcernNote> getData() {
		return data;
	}

	public void setData(List<DtoConcernNote> data) {
		this.data = data;
	}

	
}
