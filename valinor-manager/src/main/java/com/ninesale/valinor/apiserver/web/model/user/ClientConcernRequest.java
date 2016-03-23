/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import org.hibernate.validator.constraints.NotBlank;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * @author liuhui
 * 
 */
public class ClientConcernRequest extends ClientBasicRequest{
	
	@NotBlank(message = "用户id不能为空")
	private Long userId;

	@NotBlank(message = "用户名不能为空")
	private String username;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

	
}
