package com.ninesale.valinor.baseinfo.api.model.request.brand;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * 
 * @date 2015年11月21日 下午2:06:53
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboQueryBrandByPageRequest extends DubboBasicPageRequest {
	private static final long serialVersionUID = 1L;
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
