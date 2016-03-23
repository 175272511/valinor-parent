/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

/**
 * @author liuhui
 * 
 */
public class Contacts implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7816684128806217687L;
	
	@NotBlank(message = "用户名不能为空")
	private String username;
	
	@NotBlank(message = "手机号码不能为空")
	@Pattern(regexp = RexpConstant.PHONE, message = "手机格式错误")
	private String phone;
	
	@NotBlank(message = "唯一标识不能为空")
	private String lookup;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLookup() {
		return lookup;
	}

	public void setLookup(String lookup) {
		this.lookup = lookup;
	}

	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
