package com.ninesale.valinor.apiserver.web.model.baseinfo.response;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/****
 * 添加商品标签信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddItemTagResponse extends ClientBasicResponse {
	
	private Long itemTagId;

	public Long getItemTagId() {
		return itemTagId;
	}

	public void setItemTagId(Long itemTagId) {
		this.itemTagId = itemTagId;
	}

}
