package com.ninesale.valinor.baseinfo.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.baseinfo.provider.dao.BaseinfoCountryMapper;
import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoCountry;
import com.ninesale.valinor.baseinfo.provider.service.BaseinfoCountryService;
import com.pubpi.common.exception.DaoException;

@Service
public class BaseinfoCountryServiceImpl implements BaseinfoCountryService {
	
	private static final Logger logger = Logger.getLogger(BaseinfoBrandServiceImpl.class);

	@Resource
	private BaseinfoCountryMapper baseinfoCountryMapper;
	
	@Override
	public Map<String, Object> insert(DtoBaseinfoCountry record) {
		logger.info("DtoBaseinfoCountry=="+record.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount = 0;
		try {
			iCount = baseinfoCountryMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存国家信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoBaseinfoCountry record) {
		logger.info("DtoBaseinfoCountry==" + record.toString());
		int iCount = 0;
		try {
			iCount = baseinfoCountryMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "更新国家信息异常");
		}

		return iCount;
	}

	@Override
	public List<DtoBaseinfoCountry> queryCountryByPage(DtoBaseinfoCountry country, Integer beginId,
			Integer pageSize) {
		logger.info("beginId=="+beginId+"pageSize=="+pageSize+country.toString()); 
		List<DtoBaseinfoCountry> countryList = null;
		try {
			countryList = baseinfoCountryMapper.queryCountryByPage(country, beginId, pageSize); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询国家列表信息异常");
		}
		return countryList;
	}

	@Override
	public int queryTotalNumOfCountry(DtoBaseinfoCountry dtoBaseinfoCountry) {
		logger.info(dtoBaseinfoCountry.toString());
		int iCount = 0;
		try {
			iCount = baseinfoCountryMapper.queryTotalNumOfCountry(dtoBaseinfoCountry);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询国家总数异常");
		}
		return iCount;
	}

}
