package com.ninesale.valinor.apiserver.web.model.user;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

public class UserResponse extends ClientBasicResponse {

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
