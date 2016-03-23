package com.ninesale.valinor.baseinfo.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.baseinfo.provider.dao.ItemTagMapper;
import com.ninesale.valinor.baseinfo.provider.model.DtoItem2Tag;
import com.ninesale.valinor.baseinfo.provider.model.DtoItemTag;
import com.ninesale.valinor.baseinfo.provider.service.ItemTagService;
import com.pubpi.common.exception.DaoException;

/**
 * @des 基础信息-商品标签 实现类
 * @author fxj
 * @date 2015年12月07日14:33:38
 */
@Service
public class ItemTagServiceImpl implements ItemTagService {
	
	private static final Logger logger = Logger.getLogger(ItemTagServiceImpl.class);

	@Resource
	private ItemTagMapper itemTagMapper;
	
	@Override
	public Map<String, Object> insert(DtoItemTag record) {
		logger.info("DubboItemTag=="+record.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount = 0;
		try {
			iCount = itemTagMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存商品标签信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public List<DtoItem2Tag> queryItemTagByPage(DtoItemTag record, Integer beginId, Integer pageSize) {
		logger.info("beginId=="+beginId+"pageSize=="+pageSize); 
		logger.info("DubboItemTag=="+record!=null?record.toString():null);
		List<DtoItem2Tag> itemTagList = null;
		try {
			itemTagList = itemTagMapper.queryItemTagByPage(record, beginId, pageSize); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询商品标签列表异常");
		}
		return itemTagList;
	}

	@Override
	public int queryTotalNumOfItemTag(DtoItemTag record) {
		logger.info("DubboItemTag=="+record!=null?record.toString():null);
		int iCount = 0;
		try {
			iCount = itemTagMapper.queryTotalNumOfItemTag(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询商品标签总数异常");
		}
		return iCount;
	}

	@Override
	public List<DtoItemTag> queryItemTagList(DtoItemTag record) {
		logger.info("DubboItemTag=="+record!=null?record.toString():null); 
		List<DtoItemTag> itemTagList = null;
		try {
			itemTagList = itemTagMapper.queryItemTagList(record); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询商品标签列表信息异常");
		}
		return itemTagList;
	}

}
