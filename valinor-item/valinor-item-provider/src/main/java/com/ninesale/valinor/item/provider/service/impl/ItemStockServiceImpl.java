package com.ninesale.valinor.item.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.item.provider.dao.ItemStockMapper;
import com.ninesale.valinor.item.provider.model.DtoItemStock;
import com.ninesale.valinor.item.provider.service.ItemStockService;
import com.pubpi.common.exception.DaoException;

@Service
public class ItemStockServiceImpl implements ItemStockService {
	
	private static final Logger logger = Logger.getLogger(ItemStockServiceImpl.class);
	
	@Resource
	private ItemStockMapper itemStockMapper;
	
	@Override
	public Map<String, Object> insert(DtoItemStock record) {
		logger.info("DtoItemStock=="+record.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = itemStockMapper.insert(record);
		} catch (Exception e) {
			logger.error("保存库存信息异常");
			e.printStackTrace();
			throw new DaoException(1,"保存库存信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoItemStock record) {
		logger.info("DtoItemStock=="+record.toString()); 
		int iCount=0;
		try {
			iCount = itemStockMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			logger.error("更新库存信息异常");
			e.printStackTrace();
			throw new DaoException(1,"更新库存信息异常");
		}
		return iCount;
	}

	@Override
	public List<DtoItemStock> queryItemStockList(DtoItemStock record) {
		logger.info("DtoItemStock=="+record.toString());
		List<DtoItemStock> list = null;
		try {
			list = itemStockMapper.queryItemStockList(record);  
		} catch (Exception e) {
			logger.error("查询库存信息列表异常");
			e.printStackTrace();
			throw new DaoException(1,"查询库存信息列表异常");
		}
		return list;
	}

}
