package com.ninesale.valinor.baseinfo.api.service;

import com.ninesale.valinor.baseinfo.api.model.request.merchant.DubboAddBaseinfoMerchantRequest;
import com.ninesale.valinor.baseinfo.api.model.request.merchant.DubboDelBaseinfoMerchantRequest;
import com.ninesale.valinor.baseinfo.api.model.request.merchant.DubboDownBaseinfoMerchantRequest;
import com.ninesale.valinor.baseinfo.api.model.request.merchant.DubboQueryBaseinfoMerchantRequest;
import com.ninesale.valinor.baseinfo.api.model.request.merchant.DubboUpdateBaseinfoMerchantRequest;
import com.ninesale.valinor.baseinfo.api.model.response.merchant.DubboAddBaseinfoMerchantResponse;
import com.ninesale.valinor.baseinfo.api.model.response.merchant.DubboDelBaseinfoMerchantResponse;
import com.ninesale.valinor.baseinfo.api.model.response.merchant.DubboDownBaseinfoMerchantResponse;
import com.ninesale.valinor.baseinfo.api.model.response.merchant.DubboQueryBaseinfoMerchantResponse;
import com.ninesale.valinor.baseinfo.api.model.response.merchant.DubboUpdateBaseinfoMerchantResponse;

/**
 * @des 基础信息-商家信息 接口类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public interface DubboBaseinfoMerchantService {
	/**
	 * 添加商家信息
	 * 
	 * @param DubboAddBaseinfoMerchantRequest
	 *            dubboAddBaseinfoMerchantRequest
	 * @return DubboAddBaseinfoMerchantResponse
	 */
	public DubboAddBaseinfoMerchantResponse insert(DubboAddBaseinfoMerchantRequest dubboAddBaseinfoMerchantRequest);

	/**
	 * 删除商家信息
	 * 
	 * @param DubboDelBaseinfoMerchantRequest
	 *            dubboDelBaseinfoMerchantRequest
	 * @return DubboDelBaseinfoMerchantResponse
	 */
	public DubboDelBaseinfoMerchantResponse deleteByPrimaryKey(
			DubboDelBaseinfoMerchantRequest dubboDelBaseinfoMerchantRequest);

	/**
	 * 修改商家信息
	 * 
	 * @param DubboUpdateBaseinfoMerchantRequest
	 *            dubboUpdateBaseinfoMerchantRequest
	 * @return DubboUpdateBaseinfoMerchantResponse
	 */
	public DubboUpdateBaseinfoMerchantResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoMerchantRequest dubboUpdateBaseinfoMerchantRequest);

	/**
	 * 根据主键查询商家信息
	 * 
	 * @param DubboQueryBaseinfoMerchantRequest
	 *            dubboQueryBaseinfoMerchantRequest
	 * @return DubboQueryBaseinfoMerchantResponse
	 */
	public DubboQueryBaseinfoMerchantResponse selectByPrimaryKey(
			DubboQueryBaseinfoMerchantRequest dubboQueryBaseinfoMerchantRequest);
	
	/**
	 * 禁用商家信息
	 * 
	 * @param DubboDownBaseinfoMerchantRequest
	 *            dubboDownBaseinfoMerchantRequest
	 * @return DubboDownBaseinfoMerchantResponse
	 */
	public DubboDownBaseinfoMerchantResponse downByPrimaryKey(
			DubboDownBaseinfoMerchantRequest dubboDownBaseinfoMerchantRequest);

}
