package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddUserRequest extends ClientBasicRequest {
	/**
	 * 用户名
	 */
	@NotBlank(message = "用户名不能为空")
	@Pattern(regexp = RexpConstant.USERNAME, message = "用户名格式错误")
	protected String username;

	/**
	 * 用户鉴权密码
	 */
	@NotBlank(message = "密码不能为空")
	@Pattern(regexp = RexpConstant.ENCRYPT_PASSWORD, message = "密码格式不合法")
	protected String password;

	/**
	 * 用户角色ID
	 */
	@NotNull(message = "角色ID不能为空")
	protected Integer roleId;

	/**
	 * 商户id
	 */
	@Min(value = 1, message = "商户ID错误")
	protected Long merchantId;
	
	private Integer userType;
	

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public String getPassword() {
		return password;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public String getUsername() {
		return username;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoleId(Integer role) {
		this.roleId = role;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
