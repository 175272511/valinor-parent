package com.ninesale.valinor.baseinfo.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.baseinfo.provider.dao.CurrencyMapper;
import com.ninesale.valinor.baseinfo.provider.model.DtoCurrency;
import com.ninesale.valinor.baseinfo.provider.service.CurrencyService;
import com.pubpi.common.exception.DaoException;

/**
 * @des 基础信息-币种 实现类
 * @author fxj
 * @date 2015年12月07日14:33:38
 */
@Service
public class CurrencyServiceImpl implements CurrencyService {
	
	private static final Logger logger = Logger.getLogger(CurrencyServiceImpl.class);

	@Resource
	private CurrencyMapper currencyMapper;
	
	@Override
	public Map<String, Object> insert(DtoCurrency record) {
		logger.info("DubboCurrency=="+record.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount = 0;
		try {
			iCount = currencyMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存币种信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public List<DtoCurrency> queryCurrencyByPage(DtoCurrency record, Integer beginId, Integer pageSize) {
		logger.info("beginId=="+beginId+"pageSize=="+pageSize); 
		logger.info("DubboCurrency=="+record!=null?record.toString():null);
		List<DtoCurrency> currencyList = null;
		try {
			currencyList = currencyMapper.queryCurrencyByPage(record, beginId, pageSize); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询币种列表异常");
		}
		return currencyList;
	}

	@Override
	public int queryTotalNumOfCurrency(DtoCurrency record) {
		logger.info("DubboCurrency=="+record!=null?record.toString():null);
		int iCount = 0;
		try {
			iCount = currencyMapper.queryTotalNumOfCurrency(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询币种总数异常");
		}
		return iCount;
	}

	@Override
	public List<DtoCurrency> queryCurrencyList(DtoCurrency record) {
		logger.info("DubboCurrency=="+record!=null?record.toString():null); 
		List<DtoCurrency> currencyList = null;
		try {
			currencyList = currencyMapper.queryCurrencyList(record); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询币种列表信息异常");
		}
		return currencyList;
	}

}
