package com.ninesale.valinor.item.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.item.provider.dao.ItemSkuMapper;
import com.ninesale.valinor.item.provider.model.DtoItemSku;
import com.ninesale.valinor.item.provider.model.DtoItemSkuStock;
import com.ninesale.valinor.item.provider.service.ItemSkuService;
import com.pubpi.common.exception.DaoException;

@Service
public class ItemSkuServiceImpl implements ItemSkuService {
	
	private static final Logger logger = Logger.getLogger(ItemSkuServiceImpl.class);
	
	@Resource
	private ItemSkuMapper itemSkuMapper;
	
	@Override
	public Map<String, Object> insert(DtoItemSku record) {
		logger.info("DtoItemSku=="+record.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = itemSkuMapper.insert(record);
		} catch (Exception e) {
			logger.error("保存SKU信息异常");
			e.printStackTrace();
			throw new DaoException(1,"保存SKU信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoItemSku record) {
		logger.info("DtoItemSku=="+record.toString()); 
		int iCount=0;
		try {
			iCount = itemSkuMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			logger.error("更新SKU信息异常");
			e.printStackTrace();
			throw new DaoException(1,"更新SKU信息异常");
		}
		return iCount;
	}

	@Override
	public List<DtoItemSku> queryItemSkuList(DtoItemSku record) {
		logger.info("DtoItemSku=="+record.toString());
		List<DtoItemSku> list = null;
		try {
			list = itemSkuMapper.queryItemSkuList(record);  
		} catch (Exception e) {
			logger.error("查询SKU信息列表异常");
			e.printStackTrace();
			throw new DaoException(1,"查询SKU信息列表异常");
		}
		return list;
	}

	@Override
	public List<DtoItemSkuStock> queryItemSkuStockList(DtoItemSku record) {
		logger.info("DtoItemSku=="+record.toString());
		List<DtoItemSkuStock> list = null;
		try {
			list = itemSkuMapper.queryItemSkuStockList(record);  
		} catch (Exception e) {
			logger.error("查询SKU和库存信息列表异常");
			e.printStackTrace();
			throw new DaoException(1,"查询SKU和库存信息列表异常");
		}
		return list;
	}

}
