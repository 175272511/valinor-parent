/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * @author liuhui
 * 
 */
public class ClientReceiptRequest extends ClientBasicRequest{
	

	private Long id;

    private Long userId;

    @NotBlank(message = "发票类型不能为空")
    private String receiptType;

    @NotBlank(message = "发票抬头不能为空")
    private String receiptTitle;

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

	public String getReceiptType() {
		return receiptType;
	}

	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}

	public String getReceiptTitle() {
		return receiptTitle;
	}

	public void setReceiptTitle(String receiptTitle) {
		this.receiptTitle = receiptTitle;
	}
    
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}


}
