package com.ninesale.valinor.item.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.item.provider.dao.ItemAttrvalueMapper;
import com.ninesale.valinor.item.provider.model.DtoItemAttrvalue;
import com.ninesale.valinor.item.provider.service.ItemAttrvalueService;
import com.pubpi.common.exception.DaoException;

@Service
public class ItemAttrvalueServiceImpl implements ItemAttrvalueService {
	
	private static final Logger logger = Logger.getLogger(ItemAttrvalueServiceImpl.class);
	
	@Resource
	private ItemAttrvalueMapper itemAttrvalueMapper;
	
	@Override
	public void batchInsert(List<DtoItemAttrvalue> list) {
		logger.info("imgStore=="+list.toString()); 
		try {
			itemAttrvalueMapper.batchInsert(list);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("批量保存商品属性值信息异常");
			throw new DaoException(1,"批量保存商品属性值信息异常");
		}
		logger.info("imgStore=="+list.toString()); 
	}

	@Override
	public Map<String, Object> insert(DtoItemAttrvalue dtoItemAttrvalue) {
		logger.info("dtoItemAttrvalue=="+dtoItemAttrvalue.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = itemAttrvalueMapper.insert(dtoItemAttrvalue);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("保存商品属性值信息异常");
			throw new DaoException(1,"保存商品属性值信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", dtoItemAttrvalue.getId());
		return map;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoItemAttrvalue dtoItemAttrvalue) {
		logger.info("dtoItemAttrvalue=="+dtoItemAttrvalue.toString()); 
		int iCount=0;
		try {
			iCount = itemAttrvalueMapper.updateByPrimaryKeySelective(dtoItemAttrvalue);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("更新商品属性值信息异常");
			throw new DaoException(1,"更新商品属性值信息异常");
		}
		return iCount;
	}

	@Override
	public List<DtoItemAttrvalue> queryItemAttrvalueList(DtoItemAttrvalue dtoItemAttrvalue) {
		logger.info("dtoItemAttrvalue=="+dtoItemAttrvalue.toString());
		List<DtoItemAttrvalue> list = null;
		try {
			list = itemAttrvalueMapper.queryItemAttrvalueList(dtoItemAttrvalue);  
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("查询商品属性值信息列表异常");
			throw new DaoException(1,"查询商品属性值信息列表异常");
		}
		return list;
	}

	@Override
	public List<DtoItemAttrvalue> queryItemAttrvalueListByIds(List<Long> ids) {
		logger.info("ids=="+ids.toString());
		List<DtoItemAttrvalue> list = null;
		try {
			list = itemAttrvalueMapper.queryItemAttrvalueListByIds(ids);  
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("查询商品属性值信息列表异常");
			throw new DaoException(1,"查询商品属性值信息列表异常");
		}
		return list;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		logger.info("id=="+id); 
		int iCount = 0;
		try {
			iCount = itemAttrvalueMapper.deleteByPrimaryKey(id);   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除商品属性值信息异常");
		}
		
		return iCount;
	}
}
