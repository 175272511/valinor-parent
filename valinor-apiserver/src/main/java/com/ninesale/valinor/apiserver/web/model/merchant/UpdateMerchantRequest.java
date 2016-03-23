package com.ninesale.valinor.apiserver.web.model.merchant;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateMerchantRequest extends ClientBasicRequest {
	/**
	 * 商户id
	 */
	@Min(value = 1, message = "商户ID错误")
	private Long merchantId;
	/**
	 * 商户名
	 */
	@NotBlank(message = "商户名称不能为空")
	@Pattern(regexp = RexpConstant.USERNAME, message = "商户名称名称格式错误")
	private String merchantName;

	/**
	 * 电子邮箱
	 */
	@Pattern(regexp = RexpConstant.EMAIL, message = "Email格式错误")
	private String email;
	/**
	 * 负责人
	 */
	@NotBlank(message = "负责人不能为空")
	@Pattern(regexp = RexpConstant.USERNAME, message = "负责人格式错误")
	private String responsible;

	/**
	 * 电话号码
	 */
	@NotBlank(message = "电话号码不能为空")
	@Pattern(regexp = RexpConstant.PHONE, message = "电话号码格式错误")
	private String phone;
	/**
	 * 地址
	 */
	@NotBlank(message = "商户地址不能为空")
	@Pattern(regexp = RexpConstant.ADDRESS, message = "商户地址格式错误")
	private String address;

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public String getPhone() {
		return phone;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
