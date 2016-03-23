package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

public class ClientVerifyRequest extends ClientBasicRequest{
	
	/**
	 * 电话
	 */
	@NotNull(message = "电话号码不能为空")
	@Pattern(regexp = RexpConstant.PHONE)
	private String phone;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	

}
