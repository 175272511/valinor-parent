package com.ninesale.valinor.item.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.item.provider.dao.ItemStocksnapMapper;
import com.ninesale.valinor.item.provider.model.DtoItemStocksnap;
import com.ninesale.valinor.item.provider.service.ItemStocksnapService;
import com.pubpi.common.exception.DaoException;

@Service
public class ItemStocksnapServiceImpl implements ItemStocksnapService {
	
	private static final Logger logger = Logger.getLogger(ItemStocksnapServiceImpl.class);
	
	@Resource
	private ItemStocksnapMapper itemStocksnapMapper;
	
	@Override
	public Map<String, Object> insert(DtoItemStocksnap record) {
		logger.info("DtoItemStocksnap=="+record.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = itemStocksnapMapper.insert(record);
		} catch (Exception e) {
			logger.error("保存库存快照信息异常");
			e.printStackTrace();
			throw new DaoException(1,"保存库存快照信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public List<DtoItemStocksnap> queryItemStocksnapList(DtoItemStocksnap record) {
		logger.info("DtoItemStocksnap=="+record.toString());
		List<DtoItemStocksnap> list = null;
		try {
			list = itemStocksnapMapper.queryItemStocksnapList(record);  
		} catch (Exception e) {
			logger.error("查询库存快照信息列表异常");
			e.printStackTrace();
			throw new DaoException(1,"查询库存快照信息列表异常");
		}
		return list;
	}

}
