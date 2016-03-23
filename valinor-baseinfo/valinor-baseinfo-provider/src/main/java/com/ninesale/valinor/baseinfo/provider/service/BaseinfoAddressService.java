package com.ninesale.valinor.baseinfo.provider.service;

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
 * @des 基础信息-地址信息 服务接口类
 * @author Zhoup
 * @date 2015年11月3日10:26:04
 */
public interface BaseinfoAddressService {

	/**
	 * 增加地址信息
	 * 
	 * @param DubboAddBaseinfoAddressRequest
	 *            dubboAddBaseinfoAddressRequest
	 * @return DubboAddBaseinfoAddressResponse
	 */
	public DubboAddBaseinfoAddressResponse insert(DubboAddBaseinfoAddressRequest dubboAddBaseinfoAddressRequest);

	/**
	 * 查询地址信息
	 * 
	 * @param DubboAddBaseinfoAddressRequest
	 *            dubboAddBaseinfoAddressRequest
	 * @return DubboQueryBaseinfoAddressResponse
	 */
	public DubboQueryBaseinfoAddressResponse selectByPrimaryKey(
			DubboQueryBaseinfoAddressRequest dubboQueryBaseinfoAddressRequest);

	/**
	 * 删除地址信息
	 * 
	 * @param DubboAddBaseinfoAddressRequest
	 *            dubboAddBaseinfoAddressRequest
	 * @return DubboDelBaseinfoAddressResponse
	 */
	public DubboDelBaseinfoAddressResponse deleteByPrimaryKey(
			DubboDelBaseinfoAddressRequest dubboDelBaseinfoAddressRequest);

	/**
	 * 修改地址信息
	 * 
	 * @param DubboUpdateBaseinfoAddressRequest
	 *            dubboUpdateBaseinfoAddressRequest
	 * @return DubboUpdateBaseinfoAddressResponse
	 */
	public DubboUpdateBaseinfoAddressResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoAddressRequest dubboUpdateBaseinfoAddressRequest);

	/**
	 * 禁用地址信息
	 * 
	 * @param DubboDownBaseinfoAddressRequest
	 *            dubboDownBaseinfoAddressRequest
	 * @return DubboDownBaseinfoAddressResponse
	 */
	public DubboDownBaseinfoAddressResponse downByPrimaryKey(
			DubboDownBaseinfoAddressRequest dubboDownBaseinfoAddressRequest);

}
