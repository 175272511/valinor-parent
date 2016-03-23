package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 禁用/启用品牌信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientDownUpBaseinfoBrandRequest extends ClientBasicRequest{
	/**
	 * validFlag：0：启用，1：禁用
	 */
	private Integer validFlag;
	/**
	 * 品牌商ID
	 */
	private Long brandId;
	public Integer getValidFlag() {
		return validFlag;
	}
	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	
	
	
	
}