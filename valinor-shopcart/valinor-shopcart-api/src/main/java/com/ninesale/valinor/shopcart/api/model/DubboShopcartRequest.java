package com.ninesale.valinor.shopcart.api.model;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;


public class DubboShopcartRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 1155060046937083483L;
	
	private Long cartId;
	
	private Long userId;
	
	private Long skuId;
	
	private Long skuNum;
	
	private Integer validFlag;

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuNum() {
		return skuNum;
	}

	public void setSkuNum(Long skuNum) {
		this.skuNum = skuNum;
	}

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}
	

	
}
