package com.ninesale.valinor.apiserver.web.model.baseinfo.response;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/****
 * 添加币种信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddCurrencyResponse extends ClientBasicResponse {
	
	private Long currencyId;

	public Long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	
}
