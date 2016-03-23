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
public class DtoUserOrderInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8064978648271701825L;

	private Long orderId;
	
	private String orderNo;
	
	private String payWay;
	
	private String payFee;
	
	private Long skuId;
	
	private Integer skuNum;
	
	private String title;
	
	private String attrValueList;
	
	private String status;
	
	private String imgUrl;
	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getPayFee() {
		return payFee;
	}

	public void setPayFee(String payFee) {
		this.payFee = payFee;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Integer getSkuNum() {
		return skuNum;
	}

	public void setSkuNum(Integer skuNum) {
		this.skuNum = skuNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAttrValueList() {
		return attrValueList;
	}

	public void setAttrValueList(String attrValueList) {
		this.attrValueList = attrValueList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}


}
