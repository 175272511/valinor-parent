/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.request;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * @author liuhui
 * 
 */
public class DubboGetUserOrderInfoRequest extends DubboBasicPageRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4524804817345921869L;
	
	
	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}


}
