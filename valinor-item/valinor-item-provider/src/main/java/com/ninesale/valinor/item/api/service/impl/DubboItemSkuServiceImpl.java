package com.ninesale.valinor.item.api.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.item.api.model.sku.dto.DubboItemSkuStock;
import com.ninesale.valinor.item.api.model.sku.request.DubboAddItemSkuRequest;
import com.ninesale.valinor.item.api.model.sku.request.DubboQuerySkuStockListRequest;
import com.ninesale.valinor.item.api.model.sku.request.DubboUpdateItemSkuRequest;
import com.ninesale.valinor.item.api.model.sku.response.DubboAddItemSkuResponse;
import com.ninesale.valinor.item.api.model.sku.response.DubboQuerySkuStockListResponse;
import com.ninesale.valinor.item.api.model.sku.response.DubboUpdateItemSkuResponse;
import com.ninesale.valinor.item.api.model.stock.dto.DubboItemStock;
import com.ninesale.valinor.item.api.service.DubboItemSkuService;
import com.ninesale.valinor.item.provider.model.DtoItemSku;
import com.ninesale.valinor.item.provider.model.DtoItemSkuStock;
import com.ninesale.valinor.item.provider.model.DtoItemSkusnap;
import com.ninesale.valinor.item.provider.model.DtoItemStock;
import com.ninesale.valinor.item.provider.model.DtoItemStocksnap;
import com.ninesale.valinor.item.provider.service.ItemSkuService;
import com.ninesale.valinor.item.provider.service.ItemSkusnapService;
import com.ninesale.valinor.item.provider.service.ItemStockService;
import com.ninesale.valinor.item.provider.service.ItemStocksnapService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboItemSkuServiceImpl implements DubboItemSkuService {
	
	private static final Logger logger = Logger.getLogger(DubboItemSkuServiceImpl.class);
	
	@Resource
	private ItemSkuService itemSkuService;
	
	@Resource
	private ItemSkusnapService itemSkusnapService;
	
	@Resource
	private ItemStockService itemStockService;
	
	@Resource
	private ItemStocksnapService itemStocksnapService;

	
	@Override
	public DubboAddItemSkuResponse insert(DubboAddItemSkuRequest request) {
		logger.info("***start***DubboItemSkuServiceImpl.insert***start***"); 
		logger.info(request.toString()); 
		DubboAddItemSkuResponse response = new DubboAddItemSkuResponse();
		DtoItemSku dtoItemSku = BeanMapper.map(request, DtoItemSku.class);
		DtoItemSkusnap dtoItemSkusnap = BeanMapper.map(request, DtoItemSkusnap.class);
		DtoItemStocksnap dtoItemStocksnap = BeanMapper.map(request, DtoItemStocksnap.class);
		DtoItemStock dtoItemStock = BeanMapper.map(request, DtoItemStock.class);
		logger.info(dtoItemSku.toString());
		logger.info(dtoItemSkusnap.toString());
		logger.info(dtoItemStocksnap.toString());
		logger.info(dtoItemStock.toString());
		try {
			int iCount = 0;
			//保存SKU
			Map<String,Object> skuMap = itemSkuService.insert(dtoItemSku);
			response.setSkuId(skuMap.get("id")!=null?(Long)skuMap.get("id"):null); 
			iCount += skuMap.get("iCount")!=null?(int)skuMap.get("iCount"):0;
			
			//保存SKU快照
			dtoItemSkusnap.setSkuId(response.getSkuId()); 
			Map<String,Object> skusnapMap = itemSkusnapService.insert(dtoItemSkusnap); 
			response.setSkusnapId(skusnapMap.get("id")!=null?(Long)skusnapMap.get("id"):null);
			iCount += skusnapMap.get("iCount")!=null?(int)skusnapMap.get("iCount"):0;
			
			//更新SKU快照版本号
			DtoItemSku dtoUpdateItemSku = new DtoItemSku();
			dtoUpdateItemSku.setId(response.getSkuId()); 
			dtoUpdateItemSku.setSkuSnapId(response.getSkusnapId()); 
			int updateCount = itemSkuService.updateByPrimaryKeySelective(dtoUpdateItemSku);
			iCount += updateCount;
			
			//保存库存快照
			dtoItemStocksnap.setSkuId(response.getSkuId()); 
			Map<String,Object> stocksnapMap = itemStocksnapService.insert(dtoItemStocksnap); 
			response.setStocksnapId(stocksnapMap.get("id")!=null?(Long)skusnapMap.get("id"):null);
			iCount += stocksnapMap.get("iCount")!=null?(int)stocksnapMap.get("iCount"):0;
			
			//保存库存
			dtoItemStock.setSkuId(response.getSkuId()); 
			dtoItemStock.setStockSnapId(response.getSkusnapId()); 
			Map<String,Object> stockMap = itemStockService.insert(dtoItemStock); 
			response.setStockId(stockMap.get("id")!=null?(Long)skusnapMap.get("id"):null);
			iCount += stockMap.get("iCount")!=null?(int)stockMap.get("iCount"):0;
			
			response.setiCount(iCount); 
			
		} catch (Exception e) {
			logger.error("保存SKU、SKU操作日志、库存、库存操作日志信息异常"); 
			e.printStackTrace();
			throw new ServiceException(1,"保存SKU、SKU操作日志、库存、库存操作日志信息异常");
		}
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemSkuServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboUpdateItemSkuResponse updateByPrimaryKeySelective(DubboUpdateItemSkuRequest request) {
		logger.info("***start***DubboItemSkuServiceImpl.updateByPrimaryKeySelective***start***"); 
		logger.info(request.toString()); 
		DubboUpdateItemSkuResponse response = new DubboUpdateItemSkuResponse();
		DtoItemSku dtoItemSku = BeanMapper.map(request, DtoItemSku.class);
		DtoItemSkusnap dtoItemSkusnap = BeanMapper.map(request, DtoItemSkusnap.class);
		logger.info(dtoItemSku.toString());
		logger.info(dtoItemSkusnap.toString());
		try {
			int iCount = 0;
			
			//保存SKU快照
			dtoItemSkusnap.setCreateTime(new Date()); 
			Map<String,Object> skusnapMap = itemSkusnapService.insert(dtoItemSkusnap); 
			response.setSkusnapId(skusnapMap.get("id")!=null?(Long)skusnapMap.get("id"):null);
			iCount += skusnapMap.get("iCount")!=null?(int)skusnapMap.get("iCount"):0;
			
			//更新SKU快照版本号
			dtoItemSku.setSkuSnapId(response.getSkusnapId()); 
			dtoItemSku.setId(request.getSkuId()); 
			
			int updateCount = itemSkuService.updateByPrimaryKeySelective(dtoItemSku);
			iCount += updateCount;
			
			response.setiCount(iCount); 
			
		} catch (Exception e) {
			logger.error("更新SKU、保存SKU操作日志信息异常"); 
			e.printStackTrace();
			throw new ServiceException(1,"更新SKU、保存SKU操作日志信息异常");
		}
		response.setCode(0);
		logger.info(response.toString());
		logger.info("***end***DubboItemSkuServiceImpl.updateByPrimaryKeySelective***end***");
		return response;
	}

	@Override
	public DubboQuerySkuStockListResponse queryItemSkuStockList(DubboQuerySkuStockListRequest request) {
		logger.info("***start***DubboItemSkuServiceImpl.queryItemSkuStockList***start***"); 
		logger.info("DubboQuerySkuStockListRequest:"+request.toString()); 
		DubboQuerySkuStockListResponse response = new DubboQuerySkuStockListResponse();
		List<DtoItemSkuStock> list = null;
		try {
			DtoItemSku dtoItemSku = BeanMapper.map(request, DtoItemSku.class);
			list = itemSkuService.queryItemSkuStockList(dtoItemSku);  
		} catch (Exception e) {
			logger.error("查询SKU和库存信息列表异常"); 
			e.printStackTrace();
			throw new DaoException(1,"查询SKU和库存信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboItemSkuStock> resultlist = BeanMapper.map(list, DubboItemSkuStock.class);
			
			if(CollectionUtils.isNotEmpty(resultlist)){ 
				DubboItemStock dubboItemStock = null;
				for(DubboItemSkuStock dubboItemSkuStock : resultlist){
					for(DtoItemSkuStock dtoItemSkuStock : list){
						if(dtoItemSkuStock.getItemStock()!=null && dubboItemSkuStock.getId().longValue() == dtoItemSkuStock.getId().longValue()){
							dubboItemStock = BeanMapper.map(dtoItemSkuStock.getItemStock(), DubboItemStock.class);
							dubboItemSkuStock.setItemStock(dubboItemStock); 
							break;
						}
					}
				}
			}
			response.setList(resultlist);
		}
		
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemSkuServiceImpl.queryItemSkuStockList***end***");
		return response;
	}

}
