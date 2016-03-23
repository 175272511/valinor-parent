package com.ninesale.valinor.item.api.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.ninesale.valinor.item.api.model.attr.dto.DubboItemAttribute;
import com.ninesale.valinor.item.api.model.attr.request.DubboAddItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboBatchAddItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboDelItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrList2Request;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrListRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboUpdateItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.response.DubboAddItemAttributeResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboBatchAddItemAttributeResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboDelItemAttributeResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrList2Response;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrListResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboUpdateItemAttributeResponse;
import com.ninesale.valinor.item.api.service.DubboItemAttributeService;
import com.ninesale.valinor.item.provider.model.DtoItemAttribute;
import com.ninesale.valinor.item.provider.service.ItemAttributeService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboItemAttributeServiceImpl implements DubboItemAttributeService {

	private static final Logger logger = Logger.getLogger(DubboItemAttributeServiceImpl.class);

	@Resource
	private ItemAttributeService itemAttributeService;

	@Override
	public DubboBatchAddItemAttributeResponse batchInsert(DubboBatchAddItemAttributeRequest batchAddRequest) {
		logger.info("DubboBatchAddItemAttributeRequest=="+batchAddRequest.toString());
		List<DtoItemAttribute> list = BeanMapper.map(batchAddRequest.getList(), DtoItemAttribute.class);
		DubboBatchAddItemAttributeResponse batchAddResponse = new DubboBatchAddItemAttributeResponse();
		try {
			itemAttributeService.batchInsert(list);
		} catch (Exception e) {	
			e.printStackTrace();
			throw new ServiceException(1,"保存商品属性信息异常");
		}
		batchAddResponse.setCode(0); 
		return batchAddResponse;
	}

	@Override
	public DubboAddItemAttributeResponse insert(DubboAddItemAttributeRequest request) {
		logger.info("***start***DubboItemAttributeServiceImpl.insert***start***"); 
		logger.info(request.toString()); 
		DubboAddItemAttributeResponse response = new DubboAddItemAttributeResponse();
		DtoItemAttribute dtoItemAttribute = BeanMapper.map(request, DtoItemAttribute.class);
		logger.info(dtoItemAttribute.toString());
		Map<String,Object> map = null;
		try {
			map = itemAttributeService.insert(dtoItemAttribute);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存商品属性信息异常");
		}
		if(map!=null && map.size()>0){
			response.setCode(0);
			response.setCount(map.get("iCount")!=null?(int)map.get("iCount"):0);  
			response.setId(map.get("id")!=null?(Long)map.get("id"):null);
		}else{
			response.setCode(4);
			response.setDesc("没有数据可保存");  
		}
		logger.info(response.toString());
		logger.info("***end***DubboItemAttributeServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboUpdateItemAttributeResponse updateByPrimaryKeySelective(DubboUpdateItemAttributeRequest request) {
		logger.info("***start***DubboItemAttributeServiceImpl.updateByPrimaryKeySelective***start***"); 
		logger.info(request.toString()); 
		DubboUpdateItemAttributeResponse response = new DubboUpdateItemAttributeResponse();
		DtoItemAttribute dtoItemAttribute = BeanMapper.map(request, DtoItemAttribute.class);
		logger.info(dtoItemAttribute.toString());
		int iCount=0;
		try {
			iCount = itemAttributeService.updateByPrimaryKeySelective(dtoItemAttribute);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新商品属性信息异常");
		}
		response.setCode(0);
		response.setiCount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboItemAttributeServiceImpl.updateByPrimaryKeySelective***end***");
		return response;
	}

	@Override
	public DubboQueryItemAttrListResponse queryItemAttributeList(DubboQueryItemAttrListRequest request) {
		logger.info("***start***DubboItemAttributeServiceImpl.queryItemAttributeList***start***"); 
		logger.info("DubboQueryItemAttrListRequest:"+request.toString()); 
		DubboQueryItemAttrListResponse response = new DubboQueryItemAttrListResponse();
		DtoItemAttribute dtoItemAttribute = BeanMapper.map(request, DtoItemAttribute.class);
		List<DtoItemAttribute> list = null;
		try {
			list = itemAttributeService.queryItemAttributeList(dtoItemAttribute);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询商品属性信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboItemAttribute> resultlist = BeanMapper.map(list, DubboItemAttribute.class);
			response.setList(resultlist);
		}
		
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemAttributeServiceImpl.queryItemAttributeList***end***");
		return response;
	}

	@Override
	public DubboQueryItemAttrList2Response queryItemAttrListByIds(DubboQueryItemAttrList2Request request) {
		logger.info("***start***DubboItemAttributeServiceImpl.queryItemAttrListByIds***start***"); 
		logger.info("DubboQueryItemAttrListRequest:"+request.toString()); 
		DubboQueryItemAttrList2Response response = new DubboQueryItemAttrList2Response();
		List<DtoItemAttribute> list = null;
		try {
			list = itemAttributeService.queryItemAttrListByIds(request.getIds());  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询商品属性信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboItemAttribute> resultlist = BeanMapper.map(list, DubboItemAttribute.class);
			response.setList(resultlist);
		}
		
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemAttributeServiceImpl.queryItemAttrListByIds***end***");
		return response;
	}

	@Override
	public DubboDelItemAttributeResponse deleteByPrimaryKey(DubboDelItemAttributeRequest request) {
		logger.info("***start***DubboItemAttributeServiceImpl.deleteByPrimaryKey***start***"); 
		logger.info("DubboDelItemAttributeRequest:"+request.toString()); 
		DubboDelItemAttributeResponse response = new DubboDelItemAttributeResponse();
		int iCount = 0;
		try {
			iCount = itemAttributeService.deleteByPrimaryKey(request.getId());   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除商品属性信息异常");
		}
		
		response.setCount(iCount);
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemAttributeServiceImpl.deleteByPrimaryKey***end***");
		return response;
	}

}
