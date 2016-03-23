package com.ninesale.valinor.item.api.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.item.api.model.sku.dto.DubboItemSkuStock;
import com.ninesale.valinor.item.api.model.spu.dto.DubboItemSpuSkuStock;
import com.ninesale.valinor.item.api.model.spu.request.DubboAddItemSpuRequest;
import com.ninesale.valinor.item.api.model.spu.request.DubboDelItemSpuRequest;
import com.ninesale.valinor.item.api.model.spu.request.DubboQuerySpuSkuStockListRequest;
import com.ninesale.valinor.item.api.model.spu.request.DubboUpdateItemSpuRequest;
import com.ninesale.valinor.item.api.model.spu.response.DubboAddItemSpuResponse;
import com.ninesale.valinor.item.api.model.spu.response.DubboDelItemSpuResponse;
import com.ninesale.valinor.item.api.model.spu.response.DubboQuerySpuSkuStockListResponse;
import com.ninesale.valinor.item.api.model.spu.response.DubboUpdateItemSpuResponse;
import com.ninesale.valinor.item.api.model.stock.dto.DubboItemStock;
import com.ninesale.valinor.item.api.service.DubboItemSpuService;
import com.ninesale.valinor.item.provider.model.DtoItemSkuStock;
import com.ninesale.valinor.item.provider.model.DtoItemSpu;
import com.ninesale.valinor.item.provider.model.DtoItemSpuSkuStock;
import com.ninesale.valinor.item.provider.service.ItemSpuService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboItemSpuServiceImpl implements DubboItemSpuService {
	
	private static final Logger logger = Logger.getLogger(DubboItemAttributeServiceImpl.class);

	@Resource
	private ItemSpuService itemSpuService;
	
	@Override
	public DubboAddItemSpuResponse insert(DubboAddItemSpuRequest request) {
		logger.info("***start***DubboItemSpuServiceImpl.insert***start***"); 
		logger.info(request.toString()); 
		DubboAddItemSpuResponse response = new DubboAddItemSpuResponse();
		DtoItemSpu dtoItemSpu = BeanMapper.map(request, DtoItemSpu.class);
		logger.info(dtoItemSpu.toString());
		Map<String,Object> map = null;
		try {
			map = itemSpuService.insert(dtoItemSpu);
		} catch (Exception e) {
			logger.error("保存SPU信息异常"); 
			e.printStackTrace();
			throw new ServiceException(1,"保存SPU信息异常");
		}
		if(map!=null && map.size()>0){
			response.setCode(0);
			response.setiCount(map.get("iCount")!=null?(int)map.get("iCount"):0);  
			response.setId(map.get("id")!=null?(Long)map.get("id"):null);
		}else{
			response.setCode(4);
			response.setDesc("没有数据可保存");  
		}
		logger.info(response.toString());
		logger.info("***end***DubboItemSpuServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboUpdateItemSpuResponse updateByPrimaryKeySelective(DubboUpdateItemSpuRequest request) {
		logger.info("***start***DubboItemSpuServiceImpl.updateByPrimaryKeySelective***start***"); 
		logger.info(request.toString()); 
		DubboUpdateItemSpuResponse response = new DubboUpdateItemSpuResponse();
		DtoItemSpu dtoItemSpu = BeanMapper.map(request, DtoItemSpu.class);
		logger.info(dtoItemSpu.toString());
		int iCount=0;
		try {
			iCount = itemSpuService.updateByPrimaryKeySelective(dtoItemSpu);
		} catch (Exception e) {
			logger.error("更新SPU信息异常"); 
			e.printStackTrace();
			throw new ServiceException(1,"更新SPU信息异常");
		}
		response.setCode(0);
		response.setiCount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboItemSpuServiceImpl.updateByPrimaryKeySelective***end***");
		return response;
	}

	@Override
	public DubboQuerySpuSkuStockListResponse queryItemSpuSkuStockList(DubboQuerySpuSkuStockListRequest request) {
		logger.info("***start***DubboItemSpuServiceImpl.queryItemAttributeList***start***"); 
		logger.info("DubboQueryItemAttrListRequest:"+request.toString()); 
		DubboQuerySpuSkuStockListResponse response = new DubboQuerySpuSkuStockListResponse();
		DtoItemSpu dtoItemSpu = BeanMapper.map(request, DtoItemSpu.class);
		List<DtoItemSpuSkuStock> list = null;
		try {
			list = itemSpuService.queryItemSpuSkuStockList(dtoItemSpu);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询SPU信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboItemSpuSkuStock> resultlist = BeanMapper.map(list, DubboItemSpuSkuStock.class);
			//循环spu对象
			for(DubboItemSpuSkuStock dubboSpuTarObj:resultlist){
				
				for(DtoItemSpuSkuStock dtoSpuResObj : list){
					
					if(dubboSpuTarObj.getId().longValue() == dtoSpuResObj.getId().longValue()){
						if(CollectionUtils.isNotEmpty(dtoSpuResObj.getItemSkuList())){ 
							//循环sku对象
							List<DubboItemSkuStock> dubboSkuTarObjList = BeanMapper.map(dtoSpuResObj.getItemSkuList(), DubboItemSkuStock.class);
							
							DubboItemStock dubboStockTarObj = null;
							for(DubboItemSkuStock dubboSkuTarObj :dubboSkuTarObjList){
								dubboStockTarObj = null;
								for(DtoItemSkuStock dtoSkuResObj :dtoSpuResObj.getItemSkuList()){
									if(dubboSkuTarObj.getId().longValue() == dtoSkuResObj.getId().longValue()){
										if(dtoSkuResObj.getItemStock() != null){
											dubboStockTarObj = BeanMapper.map(dtoSkuResObj.getItemStock(), DubboItemStock.class);
											dubboSkuTarObj.setItemStock(dubboStockTarObj); 
										}
										break;
									}
								}
							}
							
							dubboSpuTarObj.setSkuList(dubboSkuTarObjList); 
						}
					}
					
				}
				
			}
			
			response.setList(resultlist);
		}
		
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemSpuServiceImpl.queryItemAttributeList***end***");
		return response;
	}

	@Override
	public DubboDelItemSpuResponse deleteByPrimaryKey(DubboDelItemSpuRequest request) {
		logger.info("***start***DubboItemSpuServiceImpl.deleteByPrimaryKey***start***"); 
		logger.info("DubboDelItemAttributeRequest:"+request.toString()); 
		DubboDelItemSpuResponse response = new DubboDelItemSpuResponse();
		int iCount = 0;
		try {
			iCount = itemSpuService.deleteByPrimaryKey(request.getId());   
		} catch (Exception e) {
			logger.error("删除SPU信息异常"); 
			e.printStackTrace();
			throw new DaoException(1,"删除SPU信息异常");
		}
		
		response.setiCount(iCount);
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemSpuServiceImpl.deleteByPrimaryKey***end***");
		return response;
	}

}
