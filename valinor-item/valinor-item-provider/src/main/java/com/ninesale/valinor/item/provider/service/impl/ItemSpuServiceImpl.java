package com.ninesale.valinor.item.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.item.provider.dao.ItemSpuMapper;
import com.ninesale.valinor.item.provider.model.DtoItemSpu;
import com.ninesale.valinor.item.provider.model.DtoItemSpuSkuStock;
import com.ninesale.valinor.item.provider.service.ItemSpuService;
import com.pubpi.common.exception.DaoException;

@Service
public class ItemSpuServiceImpl implements ItemSpuService {
	
	private static final Logger logger = Logger.getLogger(ItemSpuServiceImpl.class);
	
	@Resource
	private ItemSpuMapper itemSpuMapper;
	
	@Override
	public Map<String, Object> insert(DtoItemSpu dtoItemSpu) {
		logger.info("dtoItemSpu=="+dtoItemSpu.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = itemSpuMapper.insert(dtoItemSpu);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("保存SPU信息异常");
			throw new DaoException(1,"保存SPU信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", dtoItemSpu.getId());
		return map;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoItemSpu dtoItemSpu) {
		logger.info("dtoItemSpu=="+dtoItemSpu.toString()); 
		int iCount=0;
		try {
			iCount = itemSpuMapper.updateByPrimaryKeySelective(dtoItemSpu);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("更新SPU信息异常");
			throw new DaoException(1,"更新SPU信息异常");
		}
		return iCount;
	}

	@Override
	public List<DtoItemSpu> queryItemSpuList(DtoItemSpu dtoItemSpu) {
		logger.info("dtoItemSpu=="+dtoItemSpu.toString());
		List<DtoItemSpu> list = null;
		try {
			list = itemSpuMapper.queryItemSpuList(dtoItemSpu);  
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("查询SPU信息列表异常");
			throw new DaoException(1,"查询SPU信息列表异常");
		}
		return list;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		logger.info("id=="+id); 
		int iCount = 0;
		try {
			iCount = itemSpuMapper.deleteByPrimaryKey(id);   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除SPU信息异常");
		}
		
		return iCount;
	}

	@Override
	public List<DtoItemSpuSkuStock> queryItemSpuSkuStockList(DtoItemSpu dtoItemSpu) {
		logger.info("dtoItemSpu=="+dtoItemSpu.toString());
		List<DtoItemSpuSkuStock> list = null;
		try {
			list = itemSpuMapper.queryItemSpuSkuStockList(dtoItemSpu);  
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("查询SPU信息列表异常");
			throw new DaoException(1,"查询SPU信息列表异常");
		}
		return list;
	}
}
