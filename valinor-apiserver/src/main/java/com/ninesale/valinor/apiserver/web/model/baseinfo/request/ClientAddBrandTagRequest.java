package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 添加品牌标签Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddBrandTagRequest extends ClientBasicRequest{
	/**
	 * 品牌标签
	 */
	private String brandTagName;

	public String getBrandTagName() {
		return brandTagName;
	}

	public void setBrandTagName(String brandTagName) {
		this.brandTagName = brandTagName;
	}
	
}