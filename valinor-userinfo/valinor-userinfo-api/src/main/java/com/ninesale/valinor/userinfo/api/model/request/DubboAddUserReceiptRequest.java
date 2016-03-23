/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.request;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
public class DubboAddUserReceiptRequest extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3039215900650034311L;

    private Long id;

    private Long userId;

    private String receiptType;

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

