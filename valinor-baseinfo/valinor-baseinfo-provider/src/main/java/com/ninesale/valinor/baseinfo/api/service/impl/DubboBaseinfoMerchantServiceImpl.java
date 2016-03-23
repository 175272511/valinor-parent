package com.ninesale.valinor.baseinfo.api.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

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
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoMerchantService;
import com.ninesale.valinor.baseinfo.provider.service.BaseinfoMerchantService;

/**
 * @des 基础信息-商家信息 实现类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public class DubboBaseinfoMerchantServiceImpl implements DubboBaseinfoMerchantService {

	private static final Logger logger = Logger.getLogger(DubboBaseinfoMerchantServiceImpl.class);

	@Resource
	private BaseinfoMerchantService baseinfoMerchantService;

	/**
	 * 增加商家信息 
	 * 
	 * @param DubboAddBaseinfoMerchantRequest
	 *            dubboAddBaseinfoMerchantRequest
	 * @return DubboAddBaseinfoMerchantResponse
	 */
	@Override
	public DubboAddBaseinfoMerchantResponse insert(DubboAddBaseinfoMerchantRequest dubboAddBaseinfoMerchantRequest) {
		logger.info("***start***DubboBaseinfoMerchantServiceImpl.insert***start***");
		logger.info(dubboAddBaseinfoMerchantRequest.toString());
		DubboAddBaseinfoMerchantResponse dubboAddBaseinfoMerchantResponse = baseinfoMerchantService
				.insert(dubboAddBaseinfoMerchantRequest);
		logger.info(dubboAddBaseinfoMerchantResponse.toString());
		logger.info("***end***DubboBaseinfoMerchantServiceImpl.insert***end***");
		return dubboAddBaseinfoMerchantResponse;
	}

	/**
	 * 删除商家信息
	 * 
	 * @param Long
	 *            id
	 * @return DubboDelBaseinfoMerchantResponse
	 */
	@Override
	public DubboDelBaseinfoMerchantResponse deleteByPrimaryKey(
			DubboDelBaseinfoMerchantRequest dubboDelBaseinfoMerchantRequest) {
		logger.info("***start***DubboBaseinfoMerchantServiceImpl.deleteByPrimaryKey***start***");
		logger.info(dubboDelBaseinfoMerchantRequest.toString());
		DubboDelBaseinfoMerchantResponse dubboDelBaseinfoMerchantResponse = baseinfoMerchantService
				.deleteByPrimaryKey(dubboDelBaseinfoMerchantRequest);
		logger.info(dubboDelBaseinfoMerchantResponse.toString());
		logger.info("***end***DubboBaseinfoMerchantServiceImpl.deleteByPrimaryKey***end***");
		return dubboDelBaseinfoMerchantResponse;
	}

	/**
	 * 修改商家信息
	 * 
	 * @param DubboUpdateBaseinfoMerchantRequest
	 *            dubboUpdateBaseinfoMerchantRequest
	 * @return DubboUpdateBaseinfoMerchantResponse
	 */
	@Override
	public DubboUpdateBaseinfoMerchantResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoMerchantRequest dubboUpdateBaseinfoMerchantRequest) {
		logger.info("***start***DubboBaseinfoMerchantServiceImpl.updateByPrimaryKeySelective***start***");
		logger.info("dubboUpdateBaseinfoMerchantRequest==" + dubboUpdateBaseinfoMerchantRequest);
		DubboUpdateBaseinfoMerchantResponse dubboUpdateBaseinfoMerchantResponse = baseinfoMerchantService
				.updateByPrimaryKeySelective(dubboUpdateBaseinfoMerchantRequest);
		logger.info(dubboUpdateBaseinfoMerchantResponse.toString());
		logger.info("***end***DubboBaseinfoMerchantServiceImpl.updateByPrimaryKeySelective***end***");
		return dubboUpdateBaseinfoMerchantResponse;
	}

	/**
	 * 根据Id查询商家信息
	 * 
	 * @param Long
	 *            id
	 * @return DubboQueryBaseinfoMerchantResponse
	 */
	@Override
	public DubboQueryBaseinfoMerchantResponse selectByPrimaryKey(
			DubboQueryBaseinfoMerchantRequest dubboQueryBaseinfoMerchantRequest) {
		logger.info("***start***DubboBaseinfoMerchantServiceImpl.selectByPrimaryKey***start***");
		logger.info(dubboQueryBaseinfoMerchantRequest.toString());
		DubboQueryBaseinfoMerchantResponse dubboQueryBaseinfoMerchantResponse = baseinfoMerchantService
				.selectByPrimaryKey(dubboQueryBaseinfoMerchantRequest);
		logger.info(dubboQueryBaseinfoMerchantResponse.toString());
		logger.info("***end***DubboBaseinfoMerchantServiceImpl.selectByPrimaryKey***end***");
		return dubboQueryBaseinfoMerchantResponse;
	}

	/**
	 * 根据Id禁用商家信息
	 * 
	 * @param DubboDownBaseinfoMerchantRequest
	 *            dubboDownBaseinfoMerchantRequest
	 * @return DubboDownBaseinfoMerchantResponse
	 */
	@Override
	public DubboDownBaseinfoMerchantResponse downByPrimaryKey(
			DubboDownBaseinfoMerchantRequest dubboDownBaseinfoMerchantRequest) {
		logger.info("***start***DubboBaseinfoMerchantServiceImpl.selectByPrimaryKey***start***");
		logger.info(dubboDownBaseinfoMerchantRequest.toString());
		DubboDownBaseinfoMerchantResponse dubboDownBaseinfoMerchantResponse = baseinfoMerchantService
				.downByPrimaryKey(dubboDownBaseinfoMerchantRequest);
		logger.info(dubboDownBaseinfoMerchantResponse.toString());
		logger.info("***end***DubboBaseinfoMerchantServiceImpl.selectByPrimaryKey***end***");
		return dubboDownBaseinfoMerchantResponse;
	}
}
