package com.ninesale.valinor.baseinfo.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoCurrency;

public interface CurrencyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoCurrency record);

    int insertSelective(DtoCurrency record);

    DtoCurrency selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoCurrency record);

    int updateByPrimaryKey(DtoCurrency record); 

	List<DtoCurrency> queryCurrencyByPage(@Param("currency")DtoCurrency currency, @Param("beginId")Integer beginId, @Param("pageSize")Integer pageSize);

	int queryTotalNumOfCurrency(DtoCurrency record);

	List<DtoCurrency> queryCurrencyList(DtoCurrency record);  
}