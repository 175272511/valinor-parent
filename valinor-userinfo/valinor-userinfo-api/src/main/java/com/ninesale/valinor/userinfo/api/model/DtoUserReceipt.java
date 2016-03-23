/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author liuhui
 * 
 */
public class DtoUserReceipt implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1241447195011462029L;
	

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
