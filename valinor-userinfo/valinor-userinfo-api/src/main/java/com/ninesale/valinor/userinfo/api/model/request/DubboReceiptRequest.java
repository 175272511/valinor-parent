/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.request;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboReceiptRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4603316393242965149L;

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
