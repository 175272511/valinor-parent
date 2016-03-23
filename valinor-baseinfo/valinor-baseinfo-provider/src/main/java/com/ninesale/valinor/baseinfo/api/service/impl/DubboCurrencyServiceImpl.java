package com.ninesale.valinor.baseinfo.api.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.baseinfo.api.constant.DubboBaseinfoConstants;
import com.ninesale.valinor.baseinfo.api.model.dto.DubboCurrency;
import com.ninesale.valinor.baseinfo.api.model.request.currency.DubboAddCurrencyRequest;
import com.ninesale.valinor.baseinfo.api.model.request.currency.DubboQueryCurrencyByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.currency.DubboAddCurrencyResponse;
import com.ninesale.valinor.baseinfo.api.model.response.currency.DubboQueryCurrencyByPageResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboCurrencyService;
import com.ninesale.valinor.baseinfo.provider.model.DtoCurrency;
import com.ninesale.valinor.baseinfo.provider.service.CurrencyService;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboCurrencyServiceImpl implements DubboCurrencyService {
	
	private static final Logger logger = Logger.getLogger(DubboCurrencyServiceImpl.class);

	@Resource
	private CurrencyService currencyService;
	
	@Override
	public DubboAddCurrencyResponse insert(DubboAddCurrencyRequest req) {
		DubboAddCurrencyResponse response = new DubboAddCurrencyResponse();
		DtoCurrency dto = BeanMapper.map(req, DtoCurrency.class);
		dto.setCreateTime(new Date()); 
		dto.setUpdateTime(new Date()); 
		logger.info(dto.toString());
		Map<String,Object> map = null;
		try {
			map = currencyService.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存币种信息异常");
		}
		if(map!=null && map.size()>0){
			response.setCode(DubboBaseinfoConstants.SUCCESS_CODE);
			response.setIcount(map.get("iCount")!=null?(int)map.get("iCount"):0);  
			response.setId(map.get("id")!=null?(Long)map.get("id"):null);
		}else{
			response.setCode(DubboBaseinfoConstants.FAILURE_CODE);
			response.setDesc("没有数据可保存");  
		}
		logger.info(response.toString());
		logger.info("***end***DubboCurrencyServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboQueryCurrencyByPageResponse queryCurrencyByPage(
			DubboQueryCurrencyByPageRequest request) {
		
		DubboQueryCurrencyByPageResponse response = new DubboQueryCurrencyByPageResponse();
		
		DtoCurrency currency = BeanMapper.map(request, DtoCurrency.class);
		List<DtoCurrency> currencyList;
		int totalNum=0;
		try {
			currencyList = currencyService.queryCurrencyByPage(currency, request.getBeginId(), request.getPageSize());
			totalNum = currencyService.queryTotalNumOfCurrency(currency);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询品牌标签列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(currencyList)){ 
			List<DubboCurrency> dubbCurrencyList = BeanMapper.map(currencyList, DubboCurrency.class);
			response.setCurrencyList(dubbCurrencyList);
		}
		
		response.setPageSize(request.getPageSize()); 
		response.setCurrentPage(request.getCurrentPage());
		response.setTotalNum(totalNum);
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		logger.info(response.toString());
		logger.info("***end***DubboCurrencyServiceImpl.queryCurrencyByPage***end***");
		return response;
	}

}
