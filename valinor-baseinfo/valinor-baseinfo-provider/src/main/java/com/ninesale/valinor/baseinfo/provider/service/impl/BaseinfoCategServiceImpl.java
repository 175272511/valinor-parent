package com.ninesale.valinor.baseinfo.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.baseinfo.provider.dao.BaseinfoCategMapper;
import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoCateg;
import com.ninesale.valinor.baseinfo.provider.model.DtoParentCateg;
import com.ninesale.valinor.baseinfo.provider.service.BaseinfoCategService;
import com.pubpi.common.exception.DaoException;

/**
 * @des 基础信息-类目信息 实现类
 * @author fxj
 * @date 2015年11月2日14:33:38
 */
@Service
public class BaseinfoCategServiceImpl implements BaseinfoCategService {

	private static final Logger logger = Logger.getLogger(BaseinfoCategServiceImpl.class);

	@Resource
	private BaseinfoCategMapper baseinfoCategMapper;

	@Override
	public Map<String, Object> insert(DtoBaseinfoCateg record) {
		logger.info("DtoBaseinfoCateg=="+record!=null?record.toString():null); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount = 0;
		try {
			iCount = baseinfoCategMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存类目信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoBaseinfoCateg record) {
		logger.info("DtoBaseinfoCateg==" + record!=null?record.toString():null);
		int iCount = 0;
		try {
			iCount = baseinfoCategMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "更新类目信息异常");
		}

		return iCount;
	}

	@Override
	public List<DtoBaseinfoCateg> queryCategList(DtoBaseinfoCateg record) {
		logger.info("DtoBaseinfoCateg=="+record!=null?record.toString():null); 
		List<DtoBaseinfoCateg> brandList = null;
		try {
			brandList = baseinfoCategMapper.queryCategList(record); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询类目列表信息异常");
		}
		return brandList;
	}

	@Override
	public List<DtoParentCateg> queryAllCategList(DtoBaseinfoCateg record) {
		logger.info("DtoBaseinfoCateg=="+record!=null?record.toString():null); 
		List<DtoParentCateg> brandList = null;
		try {
			brandList = baseinfoCategMapper.queryAllCategList(record); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询类目列表信息异常");
		}
		return brandList;
	}

}
