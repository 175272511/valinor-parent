package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginRequest extends ClientBasicRequest {
	
	/**
	 * 电话
	 */
	@NotBlank(message = "电话不能为空")
	@Pattern(regexp = RexpConstant.PHONE, message = "电话格式错误")
	private String phone;
	

	/**
	 * 用户鉴权密码，经过hmacsha256加密
	 */
	@NotBlank(message = "密码不能为空")
	@Pattern(regexp = RexpConstant.ENCRYPT_PASSWORD, message = "密码格式错误")
	private String password;

	private String loginType;
	

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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
