package com.ninesale.valinor.item.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.item.provider.dao.ItemAttributeMapper;
import com.ninesale.valinor.item.provider.model.DtoItemAttribute;
import com.ninesale.valinor.item.provider.service.ItemAttributeService;
import com.pubpi.common.exception.DaoException;

@Service
public class ItemAttributeServiceImpl implements ItemAttributeService {
	
	private static final Logger logger = Logger.getLogger(ItemAttributeServiceImpl.class);
	
	@Resource
	private ItemAttributeMapper itemAttributeMapper;
	
	@Override
	public void batchInsert(List<DtoItemAttribute> list) {
		logger.info("imgStore=="+list.toString()); 
		try {
			itemAttributeMapper.batchInsert(list);
		} catch (Exception e) { 
			e.printStackTrace();
			logger.error("批量保存商品属性信息异常");
			throw new DaoException(1,"批量保存商品属性信息异常");
		}
		logger.info("imgStore=="+list.toString()); 
	}

	@Override
	public Map<String, Object> insert(DtoItemAttribute dtoItemAttribute) {
		logger.info("dtoItemAttribute=="+dtoItemAttribute.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = itemAttributeMapper.insert(dtoItemAttribute);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("保存商品属性信息异常");
			throw new DaoException(1,"保存商品属性信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", dtoItemAttribute.getId());
		return map;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoItemAttribute dtoItemAttribute) {
		logger.info("dtoItemAttribute=="+dtoItemAttribute.toString()); 
		int iCount=0;
		try {
			iCount = itemAttributeMapper.updateByPrimaryKeySelective(dtoItemAttribute);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("更新商品属性信息异常");
			throw new DaoException(1,"更新商品属性信息异常");
		}
		return iCount;
	}

	@Override
	public List<DtoItemAttribute> queryItemAttributeList(DtoItemAttribute dtoItemAttribute) {
		logger.info("dtoItemAttribute=="+dtoItemAttribute.toString());
		List<DtoItemAttribute> list = null;
		try {
			list = itemAttributeMapper.queryItemAttributeList(dtoItemAttribute);  
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("查询商品属性信息列表异常");
			throw new DaoException(1,"查询商品属性信息列表异常");
		}
		return list;
	}

	@Override
	public List<DtoItemAttribute> queryItemAttrListByIds(List<Long> ids) {
		logger.info("ids=="+ids.toString());
		List<DtoItemAttribute> list = null;
		try {
			list = itemAttributeMapper.queryItemAttrListByIds(ids);  
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("查询商品属性信息列表异常");
			throw new DaoException(1,"查询商品属性信息列表异常");
		}
		return list;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		logger.info("id=="+id); 
		int iCount = 0;
		try {
			iCount = itemAttributeMapper.deleteByPrimaryKey(id);   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除商品属性信息异常");
		}
		
		return iCount;
	}
}
