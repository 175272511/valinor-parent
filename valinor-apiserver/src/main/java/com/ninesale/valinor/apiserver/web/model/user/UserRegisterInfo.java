package com.ninesale.valinor.apiserver.web.model.user;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class UserRegisterInfo {
	
	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
