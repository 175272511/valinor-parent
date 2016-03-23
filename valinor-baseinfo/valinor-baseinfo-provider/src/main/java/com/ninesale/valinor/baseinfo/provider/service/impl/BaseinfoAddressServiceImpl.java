package com.ninesale.valinor.baseinfo.provider.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoAddress;
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
import com.ninesale.valinor.baseinfo.provider.dao.BaseinfoAddressMapper;
import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoAddress;
import com.ninesale.valinor.baseinfo.provider.service.BaseinfoAddressService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;

/**
 * @des 基础信息-地址信息 实现类
 * @author fxj
 * @date 2015年11月2日14:33:38
 */
@Service
public class BaseinfoAddressServiceImpl implements BaseinfoAddressService {

	private static final Logger logger = Logger.getLogger(BaseinfoAddressServiceImpl.class);

	@Resource
	private BaseinfoAddressMapper baseinfoAddressMapper;

	/**
	 * 增加地址信息
	 * 
	 * @param DubboAddBaseinfoAddressRequest
	 *            dubboAddBaseinfoAddressRequest
	 * @return DubboAddBaseinfoAddressResponse
	 */
	public DubboAddBaseinfoAddressResponse insert(DubboAddBaseinfoAddressRequest dubboAddBaseinfoAddressRequest) {
		logger.info("***start***BaseinfoAddressServiceImpl.insert***start***");
		logger.info(dubboAddBaseinfoAddressRequest.toString());
		DubboAddBaseinfoAddressResponse dubboAddBaseinfoAddressResponse = new DubboAddBaseinfoAddressResponse();
		DtoBaseinfoAddress dtoBaseinfoAddress = BeanMapper.map(dubboAddBaseinfoAddressRequest, DtoBaseinfoAddress.class);
		logger.info(dtoBaseinfoAddress.toString());
		int icount = 0;
		try {
			icount = baseinfoAddressMapper.insert(dtoBaseinfoAddress);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存地址信息异常");
		}

		dubboAddBaseinfoAddressResponse.setCode(0);
		dubboAddBaseinfoAddressResponse.setIcount(icount);
		logger.info(dubboAddBaseinfoAddressResponse.toString());
		logger.info("***end***BaseinfoAddressServiceImpl.insert***end***");
		return dubboAddBaseinfoAddressResponse;
	}

	/**
	 * 删除地址信息
	 * 
	 * @param DubboAddBaseinfoAddressRequest
	 *            dubboAddBaseinfoAddressRequest
	 * @return DubboDelBaseinfoAddressResponse
	 */
	public DubboDelBaseinfoAddressResponse deleteByPrimaryKey(DubboDelBaseinfoAddressRequest dubboDelBaseinfoAddressRequest) {
		logger.info("***start***BaseinfoAddressServiceImpl.deleteByPrimaryKey***start***");
		logger.info(dubboDelBaseinfoAddressRequest.toString());
		DubboDelBaseinfoAddressResponse dubboDelBaseinfoAddressResponse = new DubboDelBaseinfoAddressResponse();
		if (dubboDelBaseinfoAddressRequest.getId() == null) {
			dubboDelBaseinfoAddressResponse.setCode(4);
			dubboDelBaseinfoAddressResponse.setDesc("参数不正常,地址ID为空");
			logger.error("参数不正常,地址ID为空");
			return dubboDelBaseinfoAddressResponse;
		}
		int iCount = 0;
		try {
			iCount = baseinfoAddressMapper.deleteByPrimaryKey(dubboDelBaseinfoAddressRequest.getId());
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "删除地址信息异常");
		}

		dubboDelBaseinfoAddressResponse.setIcount(iCount);
		dubboDelBaseinfoAddressResponse.setCode(0);
		logger.info(dubboDelBaseinfoAddressResponse.toString());
		logger.info("***end***BaseinfoAddressServiceImpl.deleteByPrimaryKey***end***");
		return dubboDelBaseinfoAddressResponse;
	}

	/**
	 * 修改地址信息
	 * 
	 * @param DubboUpdateBaseinfoAddressRequest
	 *            dubboUpdateBaseinfoAddressRequest
	 * @return DubboUpdateBaseinfoAddressResponse
	 */
	public DubboUpdateBaseinfoAddressResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoAddressRequest dubboUpdateBaseinfoAddressRequest) {
		logger.info("***start***BaseinfoAddressServiceImpl.updateByPrimaryKeySelective***start***");
		logger.info("dubboUpdateBaseinfoAddressRequest==" + dubboUpdateBaseinfoAddressRequest);
		DubboUpdateBaseinfoAddressResponse dubboUpdateBaseinfoAddressResponse = new DubboUpdateBaseinfoAddressResponse();
		int iCount = 0;
		try {
			DtoBaseinfoAddress dtoBaseinfoAddress = BeanMapper.map(dubboUpdateBaseinfoAddressRequest, DtoBaseinfoAddress.class);
			iCount = baseinfoAddressMapper.updateByPrimaryKeySelective(dtoBaseinfoAddress);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "更新地址信息异常");
		}

		dubboUpdateBaseinfoAddressResponse.setIcount(iCount);
		dubboUpdateBaseinfoAddressResponse.setCode(0);
		logger.info(dubboUpdateBaseinfoAddressResponse.toString());
		logger.info("***end***BaseinfoAddressServiceImpl.updateByPrimaryKeySelective***end***");
		return dubboUpdateBaseinfoAddressResponse;
	}

	/**
	 * 查询地址信息
	 * 
	 * @param DubboAddBaseinfoAddressRequest
	 *            dubboAddBaseinfoAddressRequest
	 * @return DubboQueryBaseinfoAddressResponse
	 */
	public DubboQueryBaseinfoAddressResponse selectByPrimaryKey(
			DubboQueryBaseinfoAddressRequest dubboQueryBaseinfoAddressRequest) {
		logger.info("***start***BaseinfoAddressServiceImpl.selectByPrimaryKey***start***");
		logger.info(dubboQueryBaseinfoAddressRequest.toString());
		DubboQueryBaseinfoAddressResponse dubboQueryBaseinfoAddressResponse = new DubboQueryBaseinfoAddressResponse();
		if (dubboQueryBaseinfoAddressRequest.getId() == null) {
			dubboQueryBaseinfoAddressResponse.setCode(4);
			dubboQueryBaseinfoAddressResponse.setDesc("参数不正常,地址信息ID为空");
			logger.error("参数不正常,地址信息ID为空");
			return dubboQueryBaseinfoAddressResponse;
		}
		DtoBaseinfoAddress dtoIBaseinfoAddress = null;
		try {
			dtoIBaseinfoAddress = baseinfoAddressMapper.selectByPrimaryKey(dubboQueryBaseinfoAddressRequest.getId());
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询地址信息异常");
		}
		if (dtoIBaseinfoAddress != null) {
			DubboBaseinfoAddress dubboBaseinfoAddress = BeanMapper.map(dtoIBaseinfoAddress, DubboBaseinfoAddress.class);
			dubboQueryBaseinfoAddressResponse.setDubboBaseinfoAddress(dubboBaseinfoAddress);
		}

		dubboQueryBaseinfoAddressResponse.setCode(0);
		logger.info(dubboQueryBaseinfoAddressResponse.toString());
		logger.info("***end***BaseinfoAddressServiceImpl.selectByPrimaryKey***end***");
		return dubboQueryBaseinfoAddressResponse;
	}
	/**
	 * 禁用地址信息
	 * 
	 * @param DubboDownBaseinfoAddressRequest
	 *            dubboDownBaseinfoAddressRequest
	 * @return DubboDownBaseinfoAddressResponse
	 */
	public DubboDownBaseinfoAddressResponse downByPrimaryKey(
			DubboDownBaseinfoAddressRequest dubboDownBaseinfoAddressRequest){
		logger.info("***start***BaseinfoAddressServiceImpl.downByPrimaryKey***start***");
		logger.info(dubboDownBaseinfoAddressRequest.toString());
		DubboDownBaseinfoAddressResponse dubboDownBaseinfoAddressResponse = new DubboDownBaseinfoAddressResponse();
		if (dubboDownBaseinfoAddressRequest.getId() == null) {
			dubboDownBaseinfoAddressResponse.setCode(4);
			dubboDownBaseinfoAddressResponse.setDesc("参数不正常,地址ID为空");
			logger.error("参数不正常,地址ID为空");
			return dubboDownBaseinfoAddressResponse;
		}
		int iCount = 0;
		try {
			DtoBaseinfoAddress dtoBaseinfoAddress = baseinfoAddressMapper.selectByPrimaryKey(dubboDownBaseinfoAddressRequest.getId());
			if(dtoBaseinfoAddress == null || dtoBaseinfoAddress.getId() == 0){
				dubboDownBaseinfoAddressResponse.setCode(4);
				dubboDownBaseinfoAddressResponse.setDesc("查询到无此地址信息！");
				logger.error("查询到无此地址信息！");
				return dubboDownBaseinfoAddressResponse;
			}
			dtoBaseinfoAddress.setValidFlag(1);
			iCount = baseinfoAddressMapper.updateByPrimaryKey(dtoBaseinfoAddress);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "禁用地址信息异常");
		}
		dubboDownBaseinfoAddressResponse.setIcount(iCount);
		dubboDownBaseinfoAddressResponse.setCode(0);
		logger.info(dubboDownBaseinfoAddressResponse.toString());
		logger.info("***end***BaseinfoAddressServiceImpl.downByPrimaryKey***end***");
		return dubboDownBaseinfoAddressResponse;
	}
}
