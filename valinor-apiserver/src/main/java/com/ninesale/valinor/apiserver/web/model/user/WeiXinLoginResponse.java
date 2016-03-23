package com.ninesale.valinor.apiserver.web.model.user;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

public class WeiXinLoginResponse extends ClientBasicResponse {
	private String openIdKey;

	/**
	 * @return the openIdKey
	 */
	public String getOpenIdKey() {
		return openIdKey;
	}

	/**
	 * @param openIdKey
	 *            the openIdKey to set
	 */
	public void setOpenIdKey(String openIdKey) {
		this.openIdKey = openIdKey;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
