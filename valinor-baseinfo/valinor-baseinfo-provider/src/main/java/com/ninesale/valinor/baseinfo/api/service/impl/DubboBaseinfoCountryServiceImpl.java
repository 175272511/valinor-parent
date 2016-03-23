package com.ninesale.valinor.baseinfo.api.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.baseinfo.api.constant.DubboBaseinfoConstants;
import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoCountry;
import com.ninesale.valinor.baseinfo.api.model.request.country.DubboAddBaseinfoCountryRequest;
import com.ninesale.valinor.baseinfo.api.model.request.country.DubboQueryCountryByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.request.country.DubboUpdateBaseinfoCountryRequest;
import com.ninesale.valinor.baseinfo.api.model.response.country.DubboAddBaseinfoCountryResponse;
import com.ninesale.valinor.baseinfo.api.model.response.country.DubboQueryCountryByPageResponse;
import com.ninesale.valinor.baseinfo.api.model.response.country.DubboUpdateBaseinfoCountryResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoCountryService;
import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoCountry;
import com.ninesale.valinor.baseinfo.provider.service.BaseinfoCountryService;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboBaseinfoCountryServiceImpl implements DubboBaseinfoCountryService {
	
	private static final Logger logger = Logger.getLogger(DubboBaseinfoCountryServiceImpl.class);

	@Resource
	private BaseinfoCountryService baseinfoCountryService;
	
	@Override
	public DubboAddBaseinfoCountryResponse insert(DubboAddBaseinfoCountryRequest request) {
		
		DubboAddBaseinfoCountryResponse response = new DubboAddBaseinfoCountryResponse();
		DtoBaseinfoCountry dto = BeanMapper.map(request, DtoBaseinfoCountry.class);
		dto.setCreateTime(new Date()); 
		dto.setUpdateTime(new Date()); 
		logger.info(dto.toString());
		Map<String,Object> map = null;
		try {
			map = baseinfoCountryService.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存国家信息异常");
		}
		if(map!=null && map.size()>0){
			response.setCode(DubboBaseinfoConstants.SUCCESS_CODE);
			response.setIcount(map.get("iCount")!=null?(int)map.get("iCount"):0);  
			response.setId(map.get("id")!=null?(Long)map.get("id"):null);
		}else{
			response.setCode(DubboBaseinfoConstants.FAILURE_CODE);
			response.setDesc("没有数据可保存");  
		}
		logger.info(response.toString());
		logger.info("***end***DubboBaseinfoCountryServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboUpdateBaseinfoCountryResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoCountryRequest request) {
		DubboUpdateBaseinfoCountryResponse response = new DubboUpdateBaseinfoCountryResponse();
		int iCount = 0;
		try {
			DtoBaseinfoCountry dto = BeanMapper.map(request, DtoBaseinfoCountry.class);
			dto.setUpdateTime(new Date()); 
			iCount = baseinfoCountryService.updateByPrimaryKeySelective(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新国家信息异常");
		}
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		response.setIcount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboBaseinfoCountryServiceImpl.updateByPrimaryKeySelective***end***");
		return response;
		
	}

	@Override
	public DubboQueryCountryByPageResponse queryCountryByPage(
			DubboQueryCountryByPageRequest request) {
		DubboQueryCountryByPageResponse response = new DubboQueryCountryByPageResponse();
		
		DtoBaseinfoCountry country = BeanMapper.map(request, DtoBaseinfoCountry.class);
		List<DtoBaseinfoCountry> countryList;
		int totalNum=0;
		try {
			countryList = baseinfoCountryService.queryCountryByPage(country, request.getBeginId(), request.getPageSize());
			totalNum = baseinfoCountryService.queryTotalNumOfCountry(country);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询国家列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(countryList)){ 
			List<DubboBaseinfoCountry> brandList2 = BeanMapper.map(countryList, DubboBaseinfoCountry.class);
			response.setCountryList(brandList2);
		}
		
		response.setPageSize(request.getPageSize()); 
		response.setCurrentPage(request.getCurrentPage());
		response.setTotalNum(totalNum);
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		
		return response;
	}

}
