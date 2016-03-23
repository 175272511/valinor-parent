package com.ninesale.valinor.baseinfo.api.model.request.brandtag;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * 
 * @date 2015年11月21日 下午2:06:53
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboQueryBrandTagByPageRequest extends DubboBasicPageRequest {
	private static final long serialVersionUID = 1L;
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
