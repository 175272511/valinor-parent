package com.ninesale.valinor.item.api.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.ninesale.valinor.item.api.model.stock.dto.DubboItemStock;
import com.ninesale.valinor.item.api.model.stock.request.DubboQueryItemStockListRequest;
import com.ninesale.valinor.item.api.model.stock.response.DubboQueryItemStockListResponse;
import com.ninesale.valinor.item.api.service.DubboItemStockService;
import com.ninesale.valinor.item.provider.model.DtoItemStock;
import com.ninesale.valinor.item.provider.service.ItemStockService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;

public class DubboItemStockServiceImpl implements DubboItemStockService {
	
	private static final Logger logger = Logger.getLogger(DubboItemStockServiceImpl.class);
	
	@Resource
	private ItemStockService itemStockService;
	
	@Override
	public DubboQueryItemStockListResponse queryItemStockList(DubboQueryItemStockListRequest request) {
		logger.info("***start***DubboItemStockServiceImpl.queryItemStockList***start***"); 
		logger.info("DubboQueryItemSkusnapListRequest:"+request.toString()); 
		DubboQueryItemStockListResponse response = new DubboQueryItemStockListResponse();
		DtoItemStock dtoItemSkusnap = BeanMapper.map(request, DtoItemStock.class);
		List<DtoItemStock> list = null;
		try {
			list = itemStockService.queryItemStockList(dtoItemSkusnap);  
		} catch (Exception e) {
			logger.error("查询库存信息列表异常");
			e.printStackTrace();
			throw new DaoException(1,"查询库存信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboItemStock> resultlist = BeanMapper.map(list, DubboItemStock.class);
			response.setList(resultlist);
		}
		
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemStockServiceImpl.queryItemStockList***end***");
		return response;
	}

}
