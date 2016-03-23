package com.ninesale.valinor.baseinfo.provider.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoCountry;

/**
 * @des 基础信息-国家信息 服务接口类
 * @author Zhoup
 * @date 2015年11月3日10:26:04
 */
public interface BaseinfoCountryService{
	
	/**
	 * 增加国家信息
	 * @param DtoBaseinfoCountry
	 * @return Map<String,Object>
	 */
	public Map<String,Object> insert(DtoBaseinfoCountry record);

	/**
	 * 修改国家信息
	 * @param DtoBaseinfoCountry
	 * @return int
	 */
	public int updateByPrimaryKeySelective(DtoBaseinfoCountry record);
	
	/**
	 * 分页查询国家列表信息
	 * @param DtoBaseinfoCountry
	 * @return List<DtoBaseinfoCountry>
	 */
	public List<DtoBaseinfoCountry> queryCountryByPage(@Param("country") DtoBaseinfoCountry dtoBaseinfoBrand, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param DtoBaseinfoCountry
	 * @return int
	 */
	public int queryTotalNumOfCountry(DtoBaseinfoCountry brand);
}
