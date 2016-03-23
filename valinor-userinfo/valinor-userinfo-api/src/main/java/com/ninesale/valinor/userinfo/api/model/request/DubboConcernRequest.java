/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboConcernRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2727466882460000078L;
	
	private Long userId;
	
	private String username;
	
	private Long concernId;
	
	private String concernName;

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

	public Long getConcernId() {
		return concernId;
	}

	public void setConcernId(Long concernId) {
		this.concernId = concernId;
	}

	public String getConcernName() {
		return concernName;
	}

	public void setConcernName(String concernName) {
		this.concernName = concernName;
	}

}
