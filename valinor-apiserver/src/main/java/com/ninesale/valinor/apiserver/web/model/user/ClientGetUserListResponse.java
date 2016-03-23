package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 
 * @author hawk
 *
 */
public class ClientGetUserListResponse extends ClientBasicResponse {
	private List<UserInfo> data;


	public List<UserInfo> getData() {
		return data;
	}


	public void setData(List<UserInfo> data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
