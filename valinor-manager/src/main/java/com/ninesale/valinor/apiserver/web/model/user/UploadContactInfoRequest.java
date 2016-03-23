package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UploadContactInfoRequest extends ClientBasicRequest {
	@NotBlank(message = "用户名不能为空")
	@Pattern(regexp = RexpConstant.USERNAME)
	private String username;

	@NotBlank(message = "电话号码不能为空")
	@Pattern(regexp = RexpConstant.PHONE)
	private String phone;

	@NotBlank(message = "公司名称不能为空")
	@Pattern(regexp = RexpConstant.USERNAME)
	private String companyName;

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param companyName
	 *            the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
