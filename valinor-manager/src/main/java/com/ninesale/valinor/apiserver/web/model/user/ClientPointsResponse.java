/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.userinfo.api.model.DtoUserPoints;

/**
 * @author liuhui
 * 
 */
public class ClientPointsResponse extends ClientBasicResponse{
	

	private Long id;
	
	private Long userId;
	
	private DtoUserPoints data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
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
