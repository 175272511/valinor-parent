package com.ninesale.valinor.baseinfo.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.baseinfo.provider.dao.BrandTagMapper;
import com.ninesale.valinor.baseinfo.provider.model.DtoBrandTag;
import com.ninesale.valinor.baseinfo.provider.service.BrandTagService;
import com.pubpi.common.exception.DaoException;

/**
 * @des 基础信息-品牌标签 实现类
 * @author fxj
 * @date 2015年12月07日14:33:38
 */
@Service
public class BrandTagServiceImpl implements BrandTagService {
	
	private static final Logger logger = Logger.getLogger(BrandTagServiceImpl.class);

	@Resource
	private BrandTagMapper brandTagMapper;
	
	@Override
	public Map<String, Object> insert(DtoBrandTag record) {
		logger.info("DubboBrandTag=="+record!=null?record.toString():null); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount = 0;
		try {
			iCount = brandTagMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存品牌标签信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public List<DtoBrandTag> queryBrandTagByPage(DtoBrandTag record, Integer beginId, Integer pageSize) {
		logger.info("beginId=="+beginId+"pageSize=="+pageSize); 
		logger.info("DubboBrandTag=="+record!=null?record.toString():null);
		List<DtoBrandTag> brandTagList = null;
		try {
			brandTagList = brandTagMapper.queryBrandTagByPage(record, beginId, pageSize); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询品牌标签列表异常");
		}
		return brandTagList;
	}

	@Override
	public int queryTotalNumOfBrandTag(DtoBrandTag record) {
		logger.info("DubboBrandTag=="+record!=null?record.toString():null);
		int iCount = 0;
		try {
			iCount = brandTagMapper.queryTotalNumOfBrandTag(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询品牌标签总数异常");
		}
		return iCount;
	}

	@Override
	public List<DtoBrandTag> queryBrandTagList(DtoBrandTag record) {
		logger.info("DubboBrandTag=="+record!=null?record.toString():null); 
		List<DtoBrandTag> brandTagList = null;
		try {
			brandTagList = brandTagMapper.queryBrandTagList(record); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询品牌标签列表信息异常");
		}
		return brandTagList;
	}

}
