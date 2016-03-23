package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeiXinLoginRequest extends ClientBasicRequest {
	// @NotBlank(message = "code不能为空")
	@Size(max = 64, min = 4, message = "code格式错误")
	private String weixinCode;

	/**
	 * @return the weixinCode
	 */
	public String getWeixinCode() {
		return weixinCode;
	}

	/**
	 * @param weixinCode
	 *            the weixinCode to set
	 */
	public void setWeixinCode(String weixinCode) {
		this.weixinCode = weixinCode;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
