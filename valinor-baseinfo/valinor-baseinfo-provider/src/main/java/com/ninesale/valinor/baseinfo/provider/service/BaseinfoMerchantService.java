package com.ninesale.valinor.baseinfo.provider.service;

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
 * @des 基础信息-商家信息 服务接口类
 * @author Zhoup
 * @date 2015年11月3日10:26:04
 */
public interface BaseinfoMerchantService{
	
	/**
	 * 增加商家信息
	 * @param DubboAddBaseinfoMerchantRequest dubboAddBaseinfoMerchantRequest
	 * @return DubboAddBaseinfoMerchantResponse
	 */
	public DubboAddBaseinfoMerchantResponse insert(DubboAddBaseinfoMerchantRequest dubboAddBaseinfoMerchantRequest);

	/**
	 * 查询商家信息
	 * @param DubboAddBaseinfoMerchantRequest dubboAddBaseinfoMerchantRequest
	 * @return DubboQueryBaseinfoMerchantResponse
	 */
	public DubboQueryBaseinfoMerchantResponse selectByPrimaryKey(DubboQueryBaseinfoMerchantRequest dubboQueryBaseinfoMerchantRequest);

	/**
	 * 删除商家信息
	 * @param DubboAddBaseinfoMerchantRequest dubboAddBaseinfoMerchantRequest
	 * @return DubboDelBaseinfoMerchantResponse
	 */
	public DubboDelBaseinfoMerchantResponse deleteByPrimaryKey(DubboDelBaseinfoMerchantRequest dubboDelBaseinfoMerchantRequest);

	/**
	 * 修改商家信息
	 * @param DubboUpdateBaseinfoMerchantRequest dubboUpdateBaseinfoMerchantRequest
	 * @return DubboUpdateBaseinfoMerchantResponse
	 */
	public DubboUpdateBaseinfoMerchantResponse updateByPrimaryKeySelective(DubboUpdateBaseinfoMerchantRequest dubboUpdateBaseinfoMerchantRequest);
	/**
	 * 禁用商家信息
	 * @param DubboDownBaseinfoMerchantRequest dubboDownBaseinfoMerchantRequest
	 * @return DubboDownBaseinfoMerchantResponse
	 */
	public DubboDownBaseinfoMerchantResponse downByPrimaryKey(DubboDownBaseinfoMerchantRequest dubboDownBaseinfoMerchantRequest);

}
