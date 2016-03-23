package com.ninesale.valinor.item.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.item.provider.dao.ItemMapper;
import com.ninesale.valinor.item.provider.model.DtoItem;
import com.ninesale.valinor.item.provider.service.ItemService;
import com.pubpi.common.exception.DaoException;

@Service
public class ItemServiceImpl implements ItemService {
	
	private static final Logger logger = Logger.getLogger(ItemServiceImpl.class);

	@Resource
	private ItemMapper itemMapper;

	@Override
	public Map<String, Object> insert(DtoItem record) {
		logger.info("DubboItem=="+record!=null?record.toString():null); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount = 0;
		try {
			iCount = itemMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存商品信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoItem record) {
		logger.info("DubboItem==" + record!=null?record.toString():null);
		int iCount = 0;
		try {
			iCount = itemMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "更新商品信息异常");
		}

		return iCount;
	}

	@Override
	public List<DtoItem> queryItemByPage(DtoItem item, Integer beginId, Integer pageSize) {
		logger.info("beginId=="+beginId+"pageSize=="+pageSize+item!=null?item.toString():""); 
		List<DtoItem> countryList = null;
		try {
			countryList = itemMapper.queryItemByPage(item, beginId, pageSize); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询商品列表信息异常");
		}
		return countryList;
	}

	@Override
	public int queryTotalNumOfItem(DtoItem record) {
		logger.info("DubboItem:"+record!=null?record.toString():""); 
		int iCount = 0;
		try {
			iCount = itemMapper.queryTotalNumOfItem(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询商品总数异常");
		}
		return iCount;
	}
	
}
