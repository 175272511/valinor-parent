/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicPageRequest;

/**
 * @author liuhui
 * 
 */
public class ClientGetUserOrderInfoRequest extends ClientBasicPageRequest{
	
	private Long userId;


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
