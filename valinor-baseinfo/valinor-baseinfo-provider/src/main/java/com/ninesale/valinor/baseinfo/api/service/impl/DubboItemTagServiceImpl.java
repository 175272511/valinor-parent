package com.ninesale.valinor.baseinfo.api.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.baseinfo.api.constant.DubboBaseinfoConstants;
import com.ninesale.valinor.baseinfo.api.model.dto.DubboItem2Tag;
import com.ninesale.valinor.baseinfo.api.model.request.itemtag.DubboAddItemTagRequest;
import com.ninesale.valinor.baseinfo.api.model.request.itemtag.DubboQueryItemTagByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.itemtag.DubboAddItemTagResponse;
import com.ninesale.valinor.baseinfo.api.model.response.itemtag.DubboQueryItemTagByPageResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboItemTagService;
import com.ninesale.valinor.baseinfo.provider.model.DtoItem2Tag;
import com.ninesale.valinor.baseinfo.provider.model.DtoItemTag;
import com.ninesale.valinor.baseinfo.provider.service.ItemTagService;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboItemTagServiceImpl implements DubboItemTagService {
	
	private static final Logger logger = Logger.getLogger(DubboItemTagServiceImpl.class);

	@Resource
	private ItemTagService itemTagService;
	
	@Override
	public DubboAddItemTagResponse insert(DubboAddItemTagRequest req) {
		DubboAddItemTagResponse response = new DubboAddItemTagResponse();
		DtoItemTag dto = BeanMapper.map(req, DtoItemTag.class);
		Map<String,Object> map = null;
		try {
			List<DtoItemTag> itemTagList = itemTagService.queryItemTagList(dto);
			if(CollectionUtils.isNotEmpty(itemTagList)){ 
				response.setCode(DubboBaseinfoConstants.FAILURE_CODE);
				response.setDesc("商品名称已经存在"); 
				return response;
			}
			dto.setCreateTime(new Date()); 
			dto.setUpdateTime(new Date()); 
			logger.info(dto.toString());
			map = itemTagService.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存商品标签信息异常");
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
		logger.info("***end***DubboItemTagServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboQueryItemTagByPageResponse queryItemTagByPage(
			DubboQueryItemTagByPageRequest request) {
		
		DubboQueryItemTagByPageResponse response = new DubboQueryItemTagByPageResponse();
		
		DtoItemTag itemTag = BeanMapper.map(request, DtoItemTag.class);
		List<DtoItem2Tag> itemTagList;
		int totalNum=0;
		try {
			itemTagList = itemTagService.queryItemTagByPage(itemTag, request.getBeginId(), request.getPageSize());
			totalNum = itemTagService.queryTotalNumOfItemTag(itemTag);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询品牌标签列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(itemTagList)){ 
			List<DubboItem2Tag> dubbItemTagList = BeanMapper.map(itemTagList, DubboItem2Tag.class);
			response.setItemTagList(dubbItemTagList);
		}
		
		response.setPageSize(request.getPageSize()); 
		response.setCurrentPage(request.getCurrentPage());
		response.setTotalNum(totalNum);
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		logger.info(response.toString());
		logger.info("***end***DubboItemTagServiceImpl.queryItemTagByPage***end***");
		return response;
	}

}
