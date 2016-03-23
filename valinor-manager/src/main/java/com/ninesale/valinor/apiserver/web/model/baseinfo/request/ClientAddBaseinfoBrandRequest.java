package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 添加品牌信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddBaseinfoBrandRequest extends ClientBasicRequest{
	/**
	 * 品牌商中文名
	 */
	private String brandNameCn;
	/**
	 * 品牌商英文名
	 */
	private String brandNameEn;

	public String getBrandNameCn() {
		return brandNameCn;
	}

	public void setBrandNameCn(String brandNameCn) {
		this.brandNameCn = brandNameCn;
	}

	public String getBrandNameEn() {
		return brandNameEn;
	}

	public void setBrandNameEn(String brandNameEn) {
		this.brandNameEn = brandNameEn;
	}

	
}