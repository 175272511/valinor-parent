package com.ninesale.valinor.baseinfo.api.model.request.country;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * 
 * @date 2015年11月21日 下午2:06:53
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboQueryCountryByPageRequest extends DubboBasicPageRequest {
	private static final long serialVersionUID = 1L;
	/**
	 * 中文名称
	 */
	private String countryNameCn;
	public String getCountryNameCn() {
		return countryNameCn;
	}
	public void setCountryNameCn(String countryNameCn) {
		this.countryNameCn = countryNameCn;
	}
	
}
