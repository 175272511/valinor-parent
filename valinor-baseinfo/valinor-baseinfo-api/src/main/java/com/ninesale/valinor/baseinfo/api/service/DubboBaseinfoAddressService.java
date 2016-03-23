package com.ninesale.valinor.baseinfo.api.service;

import com.ninesale.valinor.baseinfo.api.model.request.address.DubboAddBaseinfoAddressRequest;
import com.ninesale.valinor.baseinfo.api.model.request.address.DubboDelBaseinfoAddressRequest;
import com.ninesale.valinor.baseinfo.api.model.request.address.DubboDownBaseinfoAddressRequest;
import com.ninesale.valinor.baseinfo.api.model.request.address.DubboQueryBaseinfoAddressRequest;
import com.ninesale.valinor.baseinfo.api.model.request.address.DubboUpdateBaseinfoAddressRequest;
import com.ninesale.valinor.baseinfo.api.model.response.address.DubboAddBaseinfoAddressResponse;
import com.ninesale.valinor.baseinfo.api.model.response.address.DubboDelBaseinfoAddressResponse;
import com.ninesale.valinor.baseinfo.api.model.response.address.DubboDownBaseinfoAddressResponse;
import com.ninesale.valinor.baseinfo.api.model.response.address.DubboQueryBaseinfoAddressResponse;
import com.ninesale.valinor.baseinfo.api.model.response.address.DubboUpdateBaseinfoAddressResponse;

/**
 * @des 基础信息-通用地址 接口类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public interface DubboBaseinfoAddressService {
	/**
	 * 创建地址
	 * 
	 * @param DubboAddBaseinfoAddressRequest
	 *            dubboAddBaseinfoAddressRequest
	 * @return DubboAddBaseinfoAddressResponse
	 */
	public DubboAddBaseinfoAddressResponse insert(DubboAddBaseinfoAddressRequest dubboAddBaseinfoAddressRequest);

	/**
	 * 删除地址
	 * 
	 * @param DubboDelBaseinfoAddressRequest
	 *            dubboDelBaseinfoAddressRequest
	 * @return DubboDelBaseinfoAddressResponse
	 */
	public DubboDelBaseinfoAddressResponse deleteByPrimaryKey(
			DubboDelBaseinfoAddressRequest dubboDelBaseinfoAddressRequest);

	/**
	 * 修改地址
	 * 
	 * @param DubboUpdateBaseinfoAddressRequest
	 *            dubboUpdateBaseinfoAddressRequest
	 * @return DubboUpdateBaseinfoAddressResponse
	 */
	public DubboUpdateBaseinfoAddressResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoAddressRequest dubboUpdateBaseinfoAddressRequest);

	/**
	 * 查询地址
	 * 
	 * @param DubboQueryBaseinfoAddressRequest
	 *            dubboQueryBaseinfoAddressRequest
	 * @return DubboQueryBaseinfoAddressResponse
	 */
	public DubboQueryBaseinfoAddressResponse selectByPrimaryKey(
			DubboQueryBaseinfoAddressRequest dubboQueryBaseinfoAddressRequest);

	/**
	 * 禁用地址信息
	 * 
	 * @param DubboDownBaseinfoBrandRequest
	 *            dubboDownBaseinfoAddressRequest
	 * @return DubboDownBaseinfoAddressResponse
	 */
	public DubboDownBaseinfoAddressResponse downByPrimaryKey(
			DubboDownBaseinfoAddressRequest dubboDownBaseinfoAddressRequest);
}
