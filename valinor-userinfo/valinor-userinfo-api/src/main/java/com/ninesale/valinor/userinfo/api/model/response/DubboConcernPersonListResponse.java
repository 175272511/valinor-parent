/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.response;

import java.util.List;

import com.ninesale.valinor.userinfo.api.model.DtoConcernPerson;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageResponse;

/**
 * @author liuhui
 * 
 */
public class DubboConcernPersonListResponse extends DubboBasicPageResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7992936391732994738L;
	
	private List<DtoConcernPerson> data;

	public List<DtoConcernPerson> getData() {
		return data;
	}

	public void setData(List<DtoConcernPerson> data) {
		this.data = data;
	}
	

}
