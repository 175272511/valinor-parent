package com.ninesale.valinor.baseinfo.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoCountry;

public interface BaseinfoCountryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoBaseinfoCountry record);

    int insertSelective(DtoBaseinfoCountry record);

    DtoBaseinfoCountry selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoBaseinfoCountry record);

    int updateByPrimaryKey(DtoBaseinfoCountry record);
 
	List<DtoBaseinfoCountry> queryCountryByPage(@Param("country")DtoBaseinfoCountry country, @Param("beginId")Integer beginId, @Param("pageSize")Integer pageSize);

	int queryTotalNumOfCountry(DtoBaseinfoCountry dtoBaseinfoCountry); 
}