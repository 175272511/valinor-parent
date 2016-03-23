package com.ninesale.valinor.apiserver.web.model.baseinfo.response;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/****
 * 添加购物地点标签Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddAddressTagResponse extends ClientBasicResponse {
	
	private Long addrTagId;

	public Long getAddrTagId() {
		return addrTagId;
	}

	public void setAddrTagId(Long addrTagId) {
		this.addrTagId = addrTagId;
	}

}
