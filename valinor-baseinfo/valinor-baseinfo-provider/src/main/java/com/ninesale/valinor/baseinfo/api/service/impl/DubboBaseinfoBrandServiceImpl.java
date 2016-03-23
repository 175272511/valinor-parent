package com.ninesale.valinor.baseinfo.api.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.baseinfo.api.constant.DubboBaseinfoConstants;
import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoBrand;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboAddBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboDownBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboQueryBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboQueryBrandByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboQueryBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboUpdateBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboAddBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboDownBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboQueryBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboQueryBrandByPageResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboQueryBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboUpdateBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoBrandService;
import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoBrand;
import com.ninesale.valinor.baseinfo.provider.service.BaseinfoBrandService;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

/**
 * @des 基础信息-品牌信息 实现类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public class DubboBaseinfoBrandServiceImpl implements DubboBaseinfoBrandService {

	private static final Logger logger = Logger.getLogger(DubboBaseinfoBrandServiceImpl.class);

	@Resource
	private BaseinfoBrandService baseinfoBrandService;

	/**
	 * 增加品牌信息
	 * 
	 * @param DubboAddAddrTagRequest
	 *            dubboAddBaseinfoBrandRequest
	 * @return DubboAddAddrTagResponse
	 */
	@Override
	public DubboAddBaseinfoBrandResponse insert(DubboAddBaseinfoBrandRequest dubboAddBaseinfoBrandRequest) {
		
		DubboAddBaseinfoBrandResponse response = new DubboAddBaseinfoBrandResponse();
		DtoBaseinfoBrand dtoBaseinfoBrand = BeanMapper.map(dubboAddBaseinfoBrandRequest, DtoBaseinfoBrand.class);
		dtoBaseinfoBrand.setBrandNameFull(dtoBaseinfoBrand.getBrandNameCn()+"("+dtoBaseinfoBrand.getBrandNameEn()+")"); 
		dtoBaseinfoBrand.setCreateTime(new Date()); 
		dtoBaseinfoBrand.setUpdateTime(new Date()); 
		dtoBaseinfoBrand.setValidFlag(DubboBaseinfoConstants.VALID_FLAG);
		logger.info(dtoBaseinfoBrand.toString());
		Map<String,Object> map = null;
		try {
			map = baseinfoBrandService.insert(dtoBaseinfoBrand);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存品牌信息异常");
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
		logger.info("***end***DubboBaseinfoBrandServiceImpl.insert***end***");
		return response;
	}

	/**
	 * 修改品牌信息
	 * 
	 * @param DubboUpdateBaseinfoBrandRequest
	 *            dubboUpdateBaseinfoBrandRequest
	 * @return DubboUpdateBaseinfoBrandResponse
	 */
	@Override
	public DubboUpdateBaseinfoBrandResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoBrandRequest dubboUpdateBaseinfoBrandRequest) {
		DubboUpdateBaseinfoBrandResponse response = new DubboUpdateBaseinfoBrandResponse();
		int iCount = 0;
		try {
			DtoBaseinfoBrand dtoBaseinfoBrand = BeanMapper.map(dubboUpdateBaseinfoBrandRequest, DtoBaseinfoBrand.class);
			dtoBaseinfoBrand.setUpdateTime(new Date()); 
			if(StringUtils.isNotBlank(dtoBaseinfoBrand.getBrandNameCn()) && StringUtils.isNotBlank(dtoBaseinfoBrand.getBrandNameEn())){ 
				dtoBaseinfoBrand.setBrandNameFull(dtoBaseinfoBrand.getBrandNameCn()+"("+dtoBaseinfoBrand.getBrandNameEn()+")"); 
			}
			iCount = baseinfoBrandService.updateByPrimaryKeySelective(dtoBaseinfoBrand);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新品牌信息异常");
		}
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		response.setIcount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboBaseinfoBrandServiceImpl.updateByPrimaryKeySelective***end***");
		return response;
		
	}

	/**
	 * 查询品牌信息
	 * 
	 * @param DubboQueryBaseinfoBrandRequest
	 *            dubboQueryBaseinfoBrandRequest
	 * @return DubboQueryBaseinfoBrandResponse
	 */
	@Override
	public DubboQueryBaseinfoBrandResponse selectByPrimaryKey(
			DubboQueryBaseinfoBrandRequest dubboQueryBaseinfoBrandRequest) {
		logger.info("dubboQueryImgStoreRequest:"+dubboQueryBaseinfoBrandRequest.toString()); 
		DubboQueryBaseinfoBrandResponse response = new DubboQueryBaseinfoBrandResponse();
		DtoBaseinfoBrand dtoBaseinfoBrand = null;
		try {
			dtoBaseinfoBrand = baseinfoBrandService.selectByPrimaryKey(dubboQueryBaseinfoBrandRequest.getId()); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询图片信息异常");
		}
		
		if(dtoBaseinfoBrand!=null){
			DubboBaseinfoBrand dubboImgStore = BeanMapper.map(dtoBaseinfoBrand, DubboBaseinfoBrand.class);
			response.setDubboBaseinfoBrand(dubboImgStore);
		}
		
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		logger.info(response.toString());
		logger.info("***end***insertImgStore.selectByPrimaryKey***end***");
		return response;
	}
	/**
	 * 根据Id禁用品牌信息
	 * 
	 * @param DubboDownBaseinfoBrandRequest
	 *            dubboDownBaseinfoBrandRequest
	 * @return DubboDownBaseinfoBrandResponse
	 */
	@Override
	public DubboDownBaseinfoBrandResponse downuUpBrand(
			DubboDownBaseinfoBrandRequest dubboDownBaseinfoBrandRequest) {
		DubboDownBaseinfoBrandResponse response = new DubboDownBaseinfoBrandResponse();
		DtoBaseinfoBrand dubboImgStore = BeanMapper.map(dubboDownBaseinfoBrandRequest, DtoBaseinfoBrand.class);
		int iCount = 0;
		try {
			iCount = baseinfoBrandService.downByPrimaryKey(dubboImgStore);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新品牌信息异常");
		}
		response.setIcount(iCount); 
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		return response;
	}

	@Override
	public DubboQueryBrandByPageResponse queryBrandByPage(
			DubboQueryBrandByPageRequest request) {
		
		DubboQueryBrandByPageResponse response = new DubboQueryBrandByPageResponse();
		
		DtoBaseinfoBrand brand = BeanMapper.map(request, DtoBaseinfoBrand.class);
		List<DtoBaseinfoBrand> brandList;
		int totalNum=0;
		try {
			brandList = baseinfoBrandService.queryBrandByPage(brand, request.getBeginId(), request.getPageSize());
			totalNum = baseinfoBrandService.queryTotalNumOfBrand(brand);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询品牌列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(brandList)){ 
			List<DubboBaseinfoBrand> brandList2 = BeanMapper.map(brandList, DubboBaseinfoBrand.class);
			response.setBrandList(brandList2);
		}
		
		response.setPageSize(request.getPageSize()); 
		response.setCurrentPage(request.getCurrentPage());
		response.setTotalNum(totalNum);
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		
		return response;
	}

	@Override
	public DubboQueryBrandResponse queryBrandList(DubboQueryBrandRequest request) {
		DubboQueryBrandResponse response = new DubboQueryBrandResponse();
		
		DtoBaseinfoBrand brand = BeanMapper.map(request, DtoBaseinfoBrand.class);
		List<DtoBaseinfoBrand> brandList;
		try {
			brandList = baseinfoBrandService.queryBrandList(brand); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询品牌列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(brandList)){ 
			List<DubboBaseinfoBrand> brandList2 = BeanMapper.map(brandList, DubboBaseinfoBrand.class);
			response.setBrandList(brandList2);
		}
		
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		return response;
	}
	
	
}
