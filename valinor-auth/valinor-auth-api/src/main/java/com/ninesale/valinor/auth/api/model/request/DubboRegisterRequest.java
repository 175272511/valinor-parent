package com.ninesale.valinor.auth.api.model.request;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

public class DubboRegisterRequest extends DubboBasicRequest{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1971810272488026362L;

	/**
	 * 电话
	 */
	private Long phone;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 手机验证码
	 */
	private String verifyCode;
	
	/**
	 * 用户角色ID
	 */
	protected Integer roleId;

	/**
	 * 用户类型
	 */
	private Integer userType;
	/**
	 * 用户名
	 * @return
	 */
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	

}
