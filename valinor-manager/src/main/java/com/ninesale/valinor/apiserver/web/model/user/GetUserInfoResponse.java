package com.ninesale.valinor.apiserver.web.model.user;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

public class GetUserInfoResponse extends ClientBasicResponse {
	private UserInfo data;

	public UserInfo getData() {
		return data;
	}

	public void setData(UserInfo data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
