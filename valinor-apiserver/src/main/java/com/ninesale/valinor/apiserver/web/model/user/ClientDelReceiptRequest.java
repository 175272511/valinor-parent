/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * @author liuhui
 * 
 */
public class ClientDelReceiptRequest extends ClientBasicRequest{
	
	private Long userId;
	
	@NotNull(message = "发票id不能为空")
	private Long receiptId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(Long receiptId) {
		this.receiptId = receiptId;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
