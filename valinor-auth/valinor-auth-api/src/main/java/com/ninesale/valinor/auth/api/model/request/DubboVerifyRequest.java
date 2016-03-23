package com.ninesale.valinor.auth.api.model.request;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

public class DubboVerifyRequest extends DubboBasicRequest{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3645884146073707698L;
	
	/**
	 * 手机号码
	 */
	private String phone;
	/**
	 * 手机验证码
	 */
	private String verifyCode;
	
	/**
	 * 模版id
	 */
	private Integer templateId;
	

	public Integer getTemplateId() {
		return templateId;
	}


	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}


	public String getVerifyCode() {
		return verifyCode;
	}


	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
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
