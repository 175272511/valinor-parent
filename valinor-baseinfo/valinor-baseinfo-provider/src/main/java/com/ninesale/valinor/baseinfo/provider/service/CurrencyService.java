package com.ninesale.valinor.baseinfo.provider.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoCurrency;

/**
 * @des 基础信息-币种信息 服务接口类
 * @author Zhoup
 * @date 2015年11月3日10:26:04
 */
public interface CurrencyService{
	
	/**
	 * 增加币种信息
	 * @param DubboCurrency
	 * @return Map<String,Object>
	 */
	public Map<String,Object> insert(DtoCurrency dtoCurrency);

	/**
	 * @param brandTag
	 * @param beginId
	 * @param pageSize
	 */
	List<DtoCurrency> queryCurrencyByPage(@Param("currency") DtoCurrency currency, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param DubboCurrency
	 * @return
	 */
	int queryTotalNumOfCurrency(DtoCurrency dtoCurrency);
	
	/**
	 * @param DubboCurrency
	 * @return
	 */
	List<DtoCurrency> queryCurrencyList(DtoCurrency dtoCurrency);
	
}
