package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

public class ClientRegisterRequest extends ClientBasicRequest{
	
	/**
	 * 电话
	 */
	@NotNull(message = "电话号码不能为空")
	@Pattern(regexp = RexpConstant.PHONE)
	private String phone;
	
	/**
	 * 密码
	 */
	@NotBlank(message = "密码不能为空")
	@Pattern(regexp = RexpConstant.ENCRYPT_PASSWORD, message = "密码格式错误")
	private String password;
	
	/**
	 * 手机验证码
	 */
	@NotBlank(message = "验证码不能为空")
	private String verifyCode;
	
	/**
	 * 用户角色ID
	 */
	protected Integer roleId;
	
	/**
	 * 用户类型
	 */
	private Integer userType;
	

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	

}
