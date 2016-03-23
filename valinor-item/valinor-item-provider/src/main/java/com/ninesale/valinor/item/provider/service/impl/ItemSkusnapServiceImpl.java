package com.ninesale.valinor.item.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.item.provider.dao.ItemSkusnapMapper;
import com.ninesale.valinor.item.provider.model.DtoItemSkusnap;
import com.ninesale.valinor.item.provider.service.ItemSkusnapService;
import com.pubpi.common.exception.DaoException;

@Service
public class ItemSkusnapServiceImpl implements ItemSkusnapService {
	
	private static final Logger logger = Logger.getLogger(ItemSkusnapServiceImpl.class);
	
	@Resource
	private ItemSkusnapMapper itemSkusnapMapper;
	@Override
	public Map<String, Object> insert(DtoItemSkusnap record) {
		logger.info("DtoItemSkusnap=="+record.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = itemSkusnapMapper.insert(record);
		} catch (Exception e) {
			logger.error("保存SKU快照信息异常");
			e.printStackTrace();
			throw new DaoException(1,"保存SKU快照信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public List<DtoItemSkusnap> queryItemSkusnapList(DtoItemSkusnap record) {
		logger.info("DtoItemSkusnap=="+record.toString());
		List<DtoItemSkusnap> list = null;
		try {
			list = itemSkusnapMapper.queryItemSkusnapList(record);  
		} catch (Exception e) {
			logger.error("查询SKU快照信息列表异常");
			e.printStackTrace();
			throw new DaoException(1,"查询SKU快照信息列表异常");
		}
		return list;
	}

}
