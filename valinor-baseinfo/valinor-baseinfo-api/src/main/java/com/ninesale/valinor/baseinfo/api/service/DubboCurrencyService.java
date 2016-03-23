package com.ninesale.valinor.baseinfo.api.service;

import com.ninesale.valinor.baseinfo.api.model.request.currency.DubboAddCurrencyRequest;
import com.ninesale.valinor.baseinfo.api.model.request.currency.DubboQueryCurrencyByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.currency.DubboAddCurrencyResponse;
import com.ninesale.valinor.baseinfo.api.model.response.currency.DubboQueryCurrencyByPageResponse;

/**
 * @des 基础信息-币种 接口类
 * @author fxj
 * @date 2015年12月07日14:33:38
 */
public interface DubboCurrencyService {
	/**
	 * 创建币种
	 * 
	 * @param DubboAddCurrencyRequest
	 * @return DubboAddCurrencyResponse
	 */
	public DubboAddCurrencyResponse insert(DubboAddCurrencyRequest dubboAddCurrencyRequest);

	/**
	 * 查询币种
	 * 
	 * @param DubboQueryCurrencyByPageResponse
	 * @return DubboQueryCurrencyByPageRequest
	 */
	public DubboQueryCurrencyByPageResponse queryCurrencyByPage(
			DubboQueryCurrencyByPageRequest dubboQueryCurrencyByPageRequest);
	
}
