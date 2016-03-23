package com.ninesale.valinor.shopcart.api.model;

import com.pubpi.common.model.BasicModel;

public class DubboShopcartList extends BasicModel {
	private Long cartId;
	
	private Long skuId;
	
	private Long skuNum;

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
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

}
