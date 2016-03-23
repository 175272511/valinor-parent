/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.response;

import java.util.List;

import com.ninesale.valinor.userinfo.api.model.DtoConcernNote;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageResponse;

/**
 * @author liuhui
 * 
 */
public class DubboConcernNoteListResponse extends DubboBasicPageResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7992936391732994738L;
	
	private List<DtoConcernNote> data;

	public List<DtoConcernNote> getData() {
		return data;
	}

	public void setData(List<DtoConcernNote> data) {
		this.data = data;
	}

	

}
