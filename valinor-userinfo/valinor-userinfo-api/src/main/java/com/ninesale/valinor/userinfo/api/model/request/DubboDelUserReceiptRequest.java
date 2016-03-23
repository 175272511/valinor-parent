/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.request;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.dozer.Mapping;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboDelUserReceiptRequest extends DubboBasicResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7177123738660784627L;

	@Mapping("receiptId")
	private Long id;
	
	private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
