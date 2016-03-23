package com.ninesale.valinor.baseinfo.provider.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

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
import com.ninesale.valinor.baseinfo.provider.service.BaseinfoMerchantService;

/**
 * @des 基础信息-商家信息 实现类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
@Service("BaseinfoMerchantService")
public class BaseinfoMerchantServiceImpl implements BaseinfoMerchantService {

	private static final Logger logger = Logger.getLogger(BaseinfoMerchantServiceImpl.class);


	/**
	 * 增加商家信息
	 * 
	 * @param DubboAddBaseinfoMerchantRequest
	 *            dubboAddBaseinfoMerchantRequest
	 * @return DubboAddBaseinfoMerchantResponse
	 */
	public DubboAddBaseinfoMerchantResponse insert(DubboAddBaseinfoMerchantRequest dubboAddBaseinfoMerchantRequest) {
		return null;
	}

	/**
	 * 删除商家信息
	 * 
	 * @param DubboAddBaseinfoMerchantRequest
	 *            dubboAddBaseinfoMerchantRequest
	 * @return DubboDelBaseinfoMerchantResponse
	 */
	public DubboDelBaseinfoMerchantResponse deleteByPrimaryKey(
			DubboDelBaseinfoMerchantRequest dubboDelBaseinfoMerchantRequest) {
		return null;
	}

	/**
	 * 修改商家信息
	 * 
	 * @param DubboUpdateBaseinfoMerchantRequest
	 *            dubboUpdateBaseinfoMerchantRequest
	 * @return DubboUpdateBaseinfoMerchantResponse
	 */
	public DubboUpdateBaseinfoMerchantResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoMerchantRequest dubboUpdateBaseinfoMerchantRequest) {
		return null;
	}

	/**
	 * 查询商家信息
	 * 
	 * @param DubboAddBaseinfoMerchantRequest
	 *            dubboAddBaseinfoMerchantRequest
	 * @return DubboQueryBaseinfoMerchantResponse
	 */
	public DubboQueryBaseinfoMerchantResponse selectByPrimaryKey(
			DubboQueryBaseinfoMerchantRequest dubboQueryBaseinfoMerchantRequest) {
		logger.info(dubboQueryBaseinfoMerchantRequest.toString());
		return null;
	}
	
	/**
	 * 禁用商家信息
	 * @param DubboDownBaseinfoMerchantRequest dubboDownBaseinfoMerchantRequest
	 * @return DubboDownBaseinfoMerchantResponse
	 */
	public DubboDownBaseinfoMerchantResponse downByPrimaryKey(DubboDownBaseinfoMerchantRequest dubboDownBaseinfoMerchantRequest){
		logger.info(dubboDownBaseinfoMerchantRequest.toString());
		return null;
	}
}

