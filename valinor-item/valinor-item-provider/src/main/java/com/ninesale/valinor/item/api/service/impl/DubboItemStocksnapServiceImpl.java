package com.ninesale.valinor.item.api.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.ninesale.valinor.item.api.model.stock.dto.DubboItemStocksnap;
import com.ninesale.valinor.item.api.model.stock.request.DubboQueryItemStocksnapListRequest;
import com.ninesale.valinor.item.api.model.stock.response.DubboQueryItemStocksnapListResponse;
import com.ninesale.valinor.item.api.service.DubboItemStocksnapService;
import com.ninesale.valinor.item.provider.model.DtoItemStocksnap;
import com.ninesale.valinor.item.provider.service.ItemStocksnapService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;

public class DubboItemStocksnapServiceImpl implements DubboItemStocksnapService {
	
	private static final Logger logger = Logger.getLogger(DubboItemStocksnapServiceImpl.class);
	
	@Resource
	private ItemStocksnapService itemStocksnapService;
	
	@Override
	public DubboQueryItemStocksnapListResponse queryItemStocksnapList(DubboQueryItemStocksnapListRequest request) {
		logger.info("***start***DubboQueryItemStocksnapListResponse.queryItemStocksnapList***start***"); 
		logger.info("DubboQueryItemSkusnapListRequest:"+request.toString()); 
		DubboQueryItemStocksnapListResponse response = new DubboQueryItemStocksnapListResponse();
		DtoItemStocksnap dtoItemStocksnap = BeanMapper.map(request, DtoItemStocksnap.class);
		List<DtoItemStocksnap> list = null;
		try {
			list = itemStocksnapService.queryItemStocksnapList(dtoItemStocksnap);  
		} catch (Exception e) {
			logger.error("查询库存快照信息列表异常");
			e.printStackTrace();
			throw new DaoException(1,"查询库存快照信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboItemStocksnap> resultlist = BeanMapper.map(list, DubboItemStocksnap.class);
			response.setList(resultlist);
		}
		
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboQueryItemStocksnapListResponse.queryItemStocksnapList***end***");
		return response;
	}

}
