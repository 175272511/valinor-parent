package com.ninesale.valinor.item.api.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.ninesale.valinor.item.api.model.attr.dto.DubboItemAttrvalue;
import com.ninesale.valinor.item.api.model.attr.request.DubboAddItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboBatchAddItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboDelItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrvalueList2Request;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrvalueListRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboUpdateItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.response.DubboAddItemAttrvalueResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboBatchAddItemAttrvalueResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboDelItemAttrvalueResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrvalueList2Response;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrvalueListResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboUpdateItemAttrvalueResponse;
import com.ninesale.valinor.item.api.service.DubboItemAttrvalueService;
import com.ninesale.valinor.item.provider.model.DtoItemAttrvalue;
import com.ninesale.valinor.item.provider.service.ItemAttrvalueService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboItemAttrvalueServiceImpl implements DubboItemAttrvalueService {

	private static final Logger logger = Logger.getLogger(DubboItemAttrvalueServiceImpl.class);

	@Resource
	private ItemAttrvalueService itemAttrvalueService;

	@Override
	public DubboBatchAddItemAttrvalueResponse batchInsert(DubboBatchAddItemAttrvalueRequest batchAddRequest) {
		logger.info("DubboBatchAddItemAttrvalueRequest=="+batchAddRequest.toString());
		List<DtoItemAttrvalue> list = BeanMapper.map(batchAddRequest.getList(), DtoItemAttrvalue.class);
		logger.info("list=="+list.toString());
		DubboBatchAddItemAttrvalueResponse batchAddResponse = new DubboBatchAddItemAttrvalueResponse();
		try {
			itemAttrvalueService.batchInsert(list);
		} catch (Exception e) {	
			e.printStackTrace();
			throw new ServiceException(1,"保存商品属性值信息异常");
		}
		batchAddResponse.setCode(0); 
		return batchAddResponse;
	}

	@Override
	public DubboAddItemAttrvalueResponse insert(DubboAddItemAttrvalueRequest request) {
		logger.info("***start***DubboItemAttrvalueServiceImpl.insert***start***"); 
		logger.info(request.toString()); 
		DubboAddItemAttrvalueResponse response = new DubboAddItemAttrvalueResponse();
		DtoItemAttrvalue dtoItemAttrvalue = BeanMapper.map(request, DtoItemAttrvalue.class);
		logger.info(dtoItemAttrvalue.toString());
		Map<String,Object> map = null;
		try {
			map = itemAttrvalueService.insert(dtoItemAttrvalue);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存商品属性值信息异常");
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
		logger.info("***end***DubboItemAttrvalueServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboUpdateItemAttrvalueResponse updateByPrimaryKeySelective(DubboUpdateItemAttrvalueRequest request) {
		logger.info("***start***DubboItemAttrvalueServiceImpl.updateByPrimaryKeySelective***start***"); 
		logger.info(request.toString()); 
		DubboUpdateItemAttrvalueResponse response = new DubboUpdateItemAttrvalueResponse();
		DtoItemAttrvalue dtoItemAttrvalue = BeanMapper.map(request, DtoItemAttrvalue.class);
		logger.info(dtoItemAttrvalue.toString());
		int iCount=0;
		try {
			iCount = itemAttrvalueService.updateByPrimaryKeySelective(dtoItemAttrvalue);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新商品属性值信息异常");
		}
		response.setCode(0);
		response.setiCount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboItemAttrvalueServiceImpl.updateByPrimaryKeySelective***end***");
		return response;
	}

	@Override
	public DubboQueryItemAttrvalueListResponse queryItemAttrvaluevalueList(DubboQueryItemAttrvalueListRequest request) {
		logger.info("***start***DubboItemAttrvalueServiceImpl.queryItemAttrvalueList***start***"); 
		logger.info("DubboQueryItemAttrListRequest:"+request.toString()); 
		DubboQueryItemAttrvalueListResponse response = new DubboQueryItemAttrvalueListResponse();
		DtoItemAttrvalue dtoItemAttrvalue = BeanMapper.map(request, DtoItemAttrvalue.class);
		List<DtoItemAttrvalue> list = null;
		try {
			list = itemAttrvalueService.queryItemAttrvalueList(dtoItemAttrvalue);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询商品属性值信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboItemAttrvalue> resultlist = BeanMapper.map(list, DubboItemAttrvalue.class);
			response.setList(resultlist);
		}
		
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemAttrvalueServiceImpl.queryItemAttrvalueList***end***");
		return response;
	}

	@Override
	public DubboQueryItemAttrvalueList2Response queryItemAttrvaluevalueListByIds(DubboQueryItemAttrvalueList2Request request) {
		logger.info("***start***DubboItemAttrvalueServiceImpl.queryItemAttrListByIds***start***"); 
		logger.info("DubboQueryItemAttrListRequest:"+request.toString()); 
		DubboQueryItemAttrvalueList2Response response = new DubboQueryItemAttrvalueList2Response();
		List<DtoItemAttrvalue> list = null;
		try {
			list = itemAttrvalueService.queryItemAttrvalueListByIds(request.getIds());  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询商品属性值信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboItemAttrvalue> resultlist = BeanMapper.map(list, DubboItemAttrvalue.class);
			response.setList(resultlist);
		}
		
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemAttrvalueServiceImpl.queryItemAttrListByIds***end***");
		return response;
	}

	@Override
	public DubboDelItemAttrvalueResponse deleteByPrimaryKey(DubboDelItemAttrvalueRequest request) {
		logger.info("***start***DubboItemAttrvalueServiceImpl.deleteByPrimaryKey***start***"); 
		logger.info("DubboDelItemAttrvalueRequest:"+request.toString()); 
		DubboDelItemAttrvalueResponse response = new DubboDelItemAttrvalueResponse();
		int iCount = 0;
		try {
			iCount = itemAttrvalueService.deleteByPrimaryKey(request.getId());   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除商品属性值信息异常");
		}
		
		response.setiCount(iCount);
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemAttrvalueServiceImpl.deleteByPrimaryKey***end***");
		return response;
	}

}
