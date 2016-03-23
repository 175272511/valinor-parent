package com.ninesale.valinor.item.api.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.item.api.constant.DubboItemConstants;
import com.ninesale.valinor.item.api.model.item.dto.DubboItem;
import com.ninesale.valinor.item.api.model.item.request.DubboAddItemRequest;
import com.ninesale.valinor.item.api.model.item.request.DubboDownUpRecomHotItemRequest;
import com.ninesale.valinor.item.api.model.item.request.DubboQueryItemByPageRequest;
import com.ninesale.valinor.item.api.model.item.request.DubboUpdateItemRequest;
import com.ninesale.valinor.item.api.model.item.response.DubboAddItemResponse;
import com.ninesale.valinor.item.api.model.item.response.DubboDownUpRecomHotItemResponse;
import com.ninesale.valinor.item.api.model.item.response.DubboQueryItemByPageResponse;
import com.ninesale.valinor.item.api.model.item.response.DubboUpdateItemResponse;
import com.ninesale.valinor.item.api.service.DubboItemService;
import com.ninesale.valinor.item.provider.model.DtoItem;
import com.ninesale.valinor.item.provider.service.ItemService;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboItemServiceImpl implements DubboItemService {
	
	private static final Logger logger = Logger.getLogger(DubboItemServiceImpl.class);

	@Resource
	private ItemService itemService;

	@Override
	public DubboAddItemResponse insert(DubboAddItemRequest request) {
		DubboAddItemResponse response = new DubboAddItemResponse();
		DtoItem dto = BeanMapper.map(request, DtoItem.class);
		dto.setCreateTime(new Date()); 
		dto.setUpdateTime(new Date()); 
		dto.setLastUpTime(new Date());
		dto.setStatus(DubboItemConstants.PUTAWAY_FLAG); 
		dto.setRecommendItem(DubboItemConstants.UN_RECOMMEND_FLAG); 
		dto.setHotItem(DubboItemConstants.UN_HOT_FLAG); 
		logger.info(dto.toString());
		Map<String,Object> map = null;
		try {
			map = itemService.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存商品信息异常");
		}
		if(map!=null && map.size()>0){
			response.setCode(DubboItemConstants.SUCCESS_CODE);
			response.setIcount(map.get("iCount")!=null?(int)map.get("iCount"):0);  
			response.setId(map.get("id")!=null?(Long)map.get("id"):null);
		}else{
			response.setCode(DubboItemConstants.FAILURE_CODE);
			response.setDesc("没有数据可保存");  
		}
		logger.info(response.toString());
		logger.info("***end***DubboItemServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboUpdateItemResponse updateByPrimaryKeySelective(DubboUpdateItemRequest request) {
		DubboUpdateItemResponse response = new DubboUpdateItemResponse();
		int iCount = 0;
		try {
			DtoItem dto = BeanMapper.map(request, DtoItem.class);
			dto.setUpdateTime(new Date()); 
			iCount = itemService.updateByPrimaryKeySelective(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新商品信息异常");
		}
		response.setCode(DubboItemConstants.SUCCESS_CODE); 
		response.setIcount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboItemServiceImpl.updateByPrimaryKeySelective***end***");
		return response;
	}

	@Override
	public DubboQueryItemByPageResponse queryItemByPage(DubboQueryItemByPageRequest request) {
		DubboQueryItemByPageResponse response = new DubboQueryItemByPageResponse();
		
		DtoItem item = BeanMapper.map(request, DtoItem.class);
		List<DtoItem> itemList;
		int totalNum=0;
		try {
			itemList = itemService.queryItemByPage(item, request.getBeginId(), request.getPageSize());
			totalNum = itemService.queryTotalNumOfItem(item);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询商品列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(itemList)){ 
			List<DubboItem> itemList2 = BeanMapper.map(itemList, DubboItem.class);
			response.setItemList(itemList2);
		}
		
		response.setPageSize(request.getPageSize()); 
		response.setCurrentPage(request.getCurrentPage());
		response.setTotalNum(totalNum);
		response.setCode(DubboItemConstants.SUCCESS_CODE); 
		
		return response;
	}

	@Override
	public DubboDownUpRecomHotItemResponse downUpRecomHotItem(
			DubboDownUpRecomHotItemRequest request) {
		DubboDownUpRecomHotItemResponse response = new DubboDownUpRecomHotItemResponse();
		int iCount = 0;
		try {
			DtoItem dto = BeanMapper.map(request, DtoItem.class);
			if(dto.getStatus()!=null && DubboItemConstants.PUTAWAY_FLAG.intValue() == dto.getStatus().intValue()){
				dto.setLastUpTime(new Date()); 
			}else if(dto.getStatus()!=null && DubboItemConstants.UN_PUTAWAY_FLAG.intValue() == dto.getStatus().intValue()){
				dto.setLastDownTime(new Date());
			}
			dto.setUpdateTime(new Date()); 
			iCount = itemService.updateByPrimaryKeySelective(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新商品信息异常");
		}
		response.setCode(DubboItemConstants.SUCCESS_CODE); 
		response.setIcount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboItemServiceImpl.downUpRecomHotItem***end***");
		return response;
	}

}
