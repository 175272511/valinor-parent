package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 添加商品标签Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddItemTagRequest extends ClientBasicRequest{
	/**
	 * 商品标签名称
	 */
	private String itemTagName;
	
	/**
	 * 品牌标签ID
	 */
	private Long brandTagId;

	public String getItemTagName() {
		return itemTagName;
	}

	public void setItemTagName(String itemTagName) {
		this.itemTagName = itemTagName;
	}

	public Long getBrandTagId() {
		return brandTagId;
	}

	public void setBrandTagId(Long brandTagId) {
		this.brandTagId = brandTagId;
	}
	
}