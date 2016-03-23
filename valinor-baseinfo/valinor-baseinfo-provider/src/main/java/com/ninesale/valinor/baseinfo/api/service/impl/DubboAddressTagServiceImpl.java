package com.ninesale.valinor.baseinfo.api.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.baseinfo.api.constant.DubboBaseinfoConstants;
import com.ninesale.valinor.baseinfo.api.model.dto.DubboAddress2Tag;
import com.ninesale.valinor.baseinfo.api.model.request.addrtag.DubboAddAddrTagRequest;
import com.ninesale.valinor.baseinfo.api.model.request.addrtag.DubboQueryAddrTagByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.addrtag.DubboAddAddrTagResponse;
import com.ninesale.valinor.baseinfo.api.model.response.addrtag.DubboQueryAddrTagByPageResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboAddressTagService;
import com.ninesale.valinor.baseinfo.provider.model.DtoAddress2Tag;
import com.ninesale.valinor.baseinfo.provider.model.DtoAddressTag;
import com.ninesale.valinor.baseinfo.provider.service.AddressTagService;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboAddressTagServiceImpl implements DubboAddressTagService {
	
	private static final Logger logger = Logger.getLogger(DubboAddressTagServiceImpl.class);

	@Resource
	private AddressTagService addressTagService;
	
	@Override
	public DubboAddAddrTagResponse insert(DubboAddAddrTagRequest req) {
		DubboAddAddrTagResponse response = new DubboAddAddrTagResponse();
		DtoAddressTag dto = BeanMapper.map(req, DtoAddressTag.class);
		Map<String,Object> map = null;
		try {
			List<DtoAddressTag> addrTagList = addressTagService.queryAddrTagList(dto);
			if(CollectionUtils.isNotEmpty(addrTagList)){ 
				response.setCode(DubboBaseinfoConstants.FAILURE_CODE);
				response.setDesc("地点已经存在"); 
				return response;
			}
			dto.setCreateTime(new Date()); 
			dto.setUpdateTime(new Date()); 
			logger.info(dto.toString());
			map = addressTagService.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存购物地点标签信息异常");
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
		logger.info("***end***DubboBaseinfoCategServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboQueryAddrTagByPageResponse queryAddrTagByPage(
			DubboQueryAddrTagByPageRequest request) {
		
		DubboQueryAddrTagByPageResponse response = new DubboQueryAddrTagByPageResponse();
		
		DtoAddressTag addrTag = BeanMapper.map(request, DtoAddressTag.class);
		List<DtoAddress2Tag> addrTagList;
		int totalNum=0;
		try {
			addrTagList = addressTagService.queryAddrTagByPage(addrTag, request.getBeginId(), request.getPageSize());
			totalNum = addressTagService.queryTotalNumOfAddrTag(addrTag);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询购物地点标签列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(addrTagList)){ 
			List<DubboAddress2Tag> dubbAddrTagList = BeanMapper.map(addrTagList, DubboAddress2Tag.class);
			response.setAddrTagList(dubbAddrTagList);
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
