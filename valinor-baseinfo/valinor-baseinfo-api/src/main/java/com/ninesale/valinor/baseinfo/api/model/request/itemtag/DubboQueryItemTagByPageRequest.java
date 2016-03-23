package com.ninesale.valinor.baseinfo.api.model.request.itemtag;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * 
 * @date 2015年11月21日 下午2:06:53
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboQueryItemTagByPageRequest extends DubboBasicPageRequest {
	private static final long serialVersionUID = 1L;
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
