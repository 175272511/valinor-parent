package com.ninesale.valinor.apiserver.web.model.baseinfo.response;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/****
 * 添加品牌标签信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddBrandTagResponse extends ClientBasicResponse {
	
	private Long brandTagId;

	public Long getBrandTagId() {
		return brandTagId;
	}

	public void setBrandTagId(Long brandTagId) {
		this.brandTagId = brandTagId;
	}
	
}