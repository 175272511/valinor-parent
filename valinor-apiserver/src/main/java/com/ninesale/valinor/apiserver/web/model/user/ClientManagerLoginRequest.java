package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientManagerLoginRequest extends ClientBasicRequest {
	/**
	 * 用户名
	 */
	@NotBlank(message = "用户名不能为空")
	@Pattern(regexp = RexpConstant.USERNAME, message = "用户名格式错误")
	private String username;
	

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


	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
