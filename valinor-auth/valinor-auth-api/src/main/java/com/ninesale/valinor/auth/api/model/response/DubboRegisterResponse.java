package com.ninesale.valinor.auth.api.model.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

public class DubboRegisterResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1213736771228635944L;
	
	public DubboRegisterResponse(){};
	
	public DubboRegisterResponse(Long userId){
		this.userId = userId;
	}
	
	/**
	 * 用户Id
	 */
	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	

}
