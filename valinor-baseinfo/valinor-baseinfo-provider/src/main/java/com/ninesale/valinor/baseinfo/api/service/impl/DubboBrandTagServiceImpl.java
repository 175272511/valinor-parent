package com.ninesale.valinor.baseinfo.api.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.baseinfo.api.constant.DubboBaseinfoConstants;
import com.ninesale.valinor.baseinfo.api.model.dto.DubboBrandTag;
import com.ninesale.valinor.baseinfo.api.model.request.brandtag.DubboAddBrandTagRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brandtag.DubboQueryBrandTagByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.brandtag.DubboAddBrandTagResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brandtag.DubboQueryBrandTagByPageResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBrandTagService;
import com.ninesale.valinor.baseinfo.provider.model.DtoBrandTag;
import com.ninesale.valinor.baseinfo.provider.service.BrandTagService;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboBrandTagServiceImpl implements DubboBrandTagService {
	
	private static final Logger logger = Logger.getLogger(DubboBrandTagServiceImpl.class);

	@Resource
	private BrandTagService brandTagService;
	
	@Override
	public DubboAddBrandTagResponse insert(DubboAddBrandTagRequest req) {
		DubboAddBrandTagResponse response = new DubboAddBrandTagResponse();
		DtoBrandTag dto = BeanMapper.map(req, DtoBrandTag.class);
		Map<String,Object> map = null;
		try {
			List<DtoBrandTag> listBrandTag = brandTagService.queryBrandTagList(dto);
			if(CollectionUtils.isNotEmpty(listBrandTag)){ 
				response.setCode(DubboBaseinfoConstants.FAILURE_CODE);
				response.setDesc("品牌名称已经存在"); 
				return response;
			}
			dto.setCreateTime(new Date()); 
			dto.setUpdateTime(new Date()); 
			logger.info(dto.toString());
			map = brandTagService.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存品牌标签信息异常");
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
		logger.info("***end***DubboBrandTagServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboQueryBrandTagByPageResponse queryBrandTagByPage(
			DubboQueryBrandTagByPageRequest request) {
		
		DubboQueryBrandTagByPageResponse response = new DubboQueryBrandTagByPageResponse();
		
		DtoBrandTag brandTag = BeanMapper.map(request, DtoBrandTag.class);
		List<DtoBrandTag> brandTagList;
		int totalNum=0;
		try {
			brandTagList = brandTagService.queryBrandTagByPage(brandTag, request.getBeginId(), request.getPageSize());
			totalNum = brandTagService.queryTotalNumOfBrandTag(brandTag);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询品牌标签列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(brandTagList)){ 
			List<DubboBrandTag> dubbBrandTagList = BeanMapper.map(brandTagList, DubboBrandTag.class);
			response.setBrandTagList(dubbBrandTagList);
		}
		
		response.setPageSize(request.getPageSize()); 
		response.setCurrentPage(request.getCurrentPage());
		response.setTotalNum(totalNum);
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		logger.info(response.toString());
		logger.info("***end***DubboBrandTagServiceImpl.queryBrandTagByPage***end***");
		return response;
	}

}
