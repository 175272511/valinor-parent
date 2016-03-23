package com.ninesale.valinor.item.api.model.item.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * 
 * @date 2015年11月21日 下午2:06:53
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboQueryItemByPageRequest extends DubboBasicPageRequest {
	private static final long serialVersionUID = 1L;
	/**
	 * 商品标题
	 */
	private String title;
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
    
}
