package com.ninesale.valinor.baseinfo.api.service;

import com.ninesale.valinor.baseinfo.api.model.request.country.DubboAddBaseinfoCountryRequest;
import com.ninesale.valinor.baseinfo.api.model.request.country.DubboQueryCountryByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.request.country.DubboUpdateBaseinfoCountryRequest;
import com.ninesale.valinor.baseinfo.api.model.response.country.DubboAddBaseinfoCountryResponse;
import com.ninesale.valinor.baseinfo.api.model.response.country.DubboQueryCountryByPageResponse;
import com.ninesale.valinor.baseinfo.api.model.response.country.DubboUpdateBaseinfoCountryResponse;

/**
 * @des 基础信息-国家 接口类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public interface DubboBaseinfoCountryService {
	/**
	 * 创建国家
	 * 
	 * @param request
	 *            国家类型请求对象
	 * @return BaseinfoCountryResponse
	 */
	public DubboAddBaseinfoCountryResponse insert(DubboAddBaseinfoCountryRequest dubboAddBaseinfoCountryRequest);

	/**
	 * 更新国家
	 * 
	 * @param DubboUpdateBaseinfoCountryRequest
	 *            国家ID
	 * @return DubboUpdateBaseinfoCountryResponse
	 */
	public DubboUpdateBaseinfoCountryResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoCountryRequest dubboUpdateBaseinfoCountryRequest);

	
	/**
	 * 查询国家
	 * 
	 * @param DubboQueryBaseinfoCountryRequest
	 *            dubboQueryBaseinfoCountryRequest
	 * @return DubboQueryBaseinfoCountryResponse
	 */
	public DubboQueryCountryByPageResponse queryCountryByPage(
			DubboQueryCountryByPageRequest dubboQueryCountryByPageRequest);


}
