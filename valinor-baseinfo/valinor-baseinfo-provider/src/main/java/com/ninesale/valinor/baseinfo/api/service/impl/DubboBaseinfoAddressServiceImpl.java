package com.ninesale.valinor.baseinfo.api.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

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
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoAddressService;
import com.ninesale.valinor.baseinfo.provider.service.BaseinfoAddressService;

/**
 * @des 基础信息-地址信息 实现类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public class DubboBaseinfoAddressServiceImpl implements DubboBaseinfoAddressService {

	private static final Logger logger = Logger.getLogger(DubboBaseinfoAddressServiceImpl.class);

	@Resource
	private BaseinfoAddressService baseinfoAddressService;

	/**
	 * 增加地址信息
	 * 
	 * @param DubboAddBaseinfoAddressRequest
	 *            dubboAddBaseinfoAddressRequest
	 * @return DubboAddBaseinfoAddressResponse
	 */
	@Override
	public DubboAddBaseinfoAddressResponse insert(DubboAddBaseinfoAddressRequest dubboAddBaseinfoAddressRequest) {
		logger.info("***start***DubboBaseinfoAddressServiceImpl.insert***start***");
		logger.info(dubboAddBaseinfoAddressRequest.toString());
		DubboAddBaseinfoAddressResponse dubboAddBaseinfoAddressResponse = baseinfoAddressService
				.insert(dubboAddBaseinfoAddressRequest);
		logger.info(dubboAddBaseinfoAddressResponse.toString());
		logger.info("***end***DubboBaseinfoAddressServiceImpl.insert***end***");
		return dubboAddBaseinfoAddressResponse;
	}

	/**
	 * 删除地址信息
	 * 
	 * @param Long
	 *            id
	 * @return DubboDelBaseinfoAddressResponse
	 */
	@Override
	public DubboDelBaseinfoAddressResponse deleteByPrimaryKey(
			DubboDelBaseinfoAddressRequest dubboDelBaseinfoAddressRequest) {
		logger.info("***start***DubboBaseinfoAddressServiceImpl.deleteByPrimaryKey***start***");
		logger.info(dubboDelBaseinfoAddressRequest.toString());
		DubboDelBaseinfoAddressResponse dubboDelBaseinfoAddressResponse = baseinfoAddressService
				.deleteByPrimaryKey(dubboDelBaseinfoAddressRequest);
		logger.info(dubboDelBaseinfoAddressResponse.toString());
		logger.info("***end***DubboBaseinfoAddressServiceImpl.deleteByPrimaryKey***end***");
		return dubboDelBaseinfoAddressResponse;
	}

	/**
	 * 修改地址信息
	 * 
	 * @param DubboUpdateBaseinfoAddressRequest
	 *            dubboUpdateBaseinfoAddressRequest
	 * @return DubboUpdateBaseinfoAddressResponse
	 */
	@Override
	public DubboUpdateBaseinfoAddressResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoAddressRequest dubboUpdateBaseinfoAddressRequest) {
		logger.info("***start***DubboBaseinfoAddressServiceImpl.updateByPrimaryKeySelective***start***");
		logger.info("dubboUpdateBaseinfoAddressRequest==" + dubboUpdateBaseinfoAddressRequest);
		DubboUpdateBaseinfoAddressResponse dubboUpdateBaseinfoAddressResponse = baseinfoAddressService
				.updateByPrimaryKeySelective(dubboUpdateBaseinfoAddressRequest);
		logger.info(dubboUpdateBaseinfoAddressResponse.toString());
		logger.info("***end***DubboBaseinfoAddressServiceImpl.updateByPrimaryKeySelective***end***");
		return dubboUpdateBaseinfoAddressResponse;
	}

	/**
	 * 根据Id查询地址信息
	 * 
	 * @param DubboQueryBaseinfoAddressRequest
	 *            dubboQueryBaseinfoAddressRequest
	 * @return DubboQueryBaseinfoAddressResponse
	 */
	@Override
	public DubboQueryBaseinfoAddressResponse selectByPrimaryKey(
			DubboQueryBaseinfoAddressRequest dubboQueryBaseinfoAddressRequest) {
		logger.info("***start***DubboBaseinfoAddressServiceImpl.selectByPrimaryKey***start***");
		logger.info(dubboQueryBaseinfoAddressRequest.toString());
		DubboQueryBaseinfoAddressResponse dubboQueryBaseinfoAddressResponse = baseinfoAddressService
				.selectByPrimaryKey(dubboQueryBaseinfoAddressRequest);
		logger.info(dubboQueryBaseinfoAddressResponse.toString());
		logger.info("***end***DubboBaseinfoAddressServiceImpl.selectByPrimaryKey***end***");
		return dubboQueryBaseinfoAddressResponse;
	}

	/**
	 * 根据Id禁用地址信息
	 * 
	 * @param DubboDownBaseinfoAddressRequest
	 *            dubboDownBaseinfoAddressRequest
	 * @return DubboDownBaseinfoAddressResponse
	 */
	@Override
	public DubboDownBaseinfoAddressResponse downByPrimaryKey(
			DubboDownBaseinfoAddressRequest dubboDownBaseinfoAddressRequest) {
		logger.info("***start***DubboBaseinfoAddressServiceImpl.selectByPrimaryKey***start***");
		logger.info(dubboDownBaseinfoAddressRequest.toString());
		DubboDownBaseinfoAddressResponse dubboDownBaseinfoAddressResponse = baseinfoAddressService
				.downByPrimaryKey(dubboDownBaseinfoAddressRequest);
		logger.info(dubboDownBaseinfoAddressResponse.toString());
		logger.info("***end***DubboBaseinfoAddressServiceImpl.selectByPrimaryKey***end***");
		return dubboDownBaseinfoAddressResponse;
	}
}
