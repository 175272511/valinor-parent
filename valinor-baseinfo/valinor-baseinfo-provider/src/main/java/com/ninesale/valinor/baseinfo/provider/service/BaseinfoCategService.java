package com.ninesale.valinor.baseinfo.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoCateg;
import com.ninesale.valinor.baseinfo.provider.model.DtoParentCateg;

/**
 * @des 基础信息-类目信息 服务接口类
 * @author Zhoup
 * @date 2015年11月3日10:26:04
 */
public interface BaseinfoCategService{
	
	
	/**
	 * 增加类目信息
	 * @param DtoBaseinfoCateg
	 * @return Map<String,Object>
	 */
	public Map<String,Object> insert(DtoBaseinfoCateg record);
 
	/**
	 * 修改类目信息
	 * @param DtoBaseinfoCateg
	 * @return int
	 */
	public int updateByPrimaryKeySelective(DtoBaseinfoCateg record);
	
	/**
	 * 查询类目信息
	 * @param DtoBaseinfoCateg
	 * @return List<DtoBaseinfoCateg>
	 */
	List<DtoBaseinfoCateg> queryCategList(DtoBaseinfoCateg dtoBaseinfoBrand);
	
	/**
	 * 查询所有类目列表（父类目包含子类目）信息
	 * @param DtoBaseinfoCateg
	 * @return List<DtoParentCateg>
	 */
	List<DtoParentCateg> queryAllCategList(DtoBaseinfoCateg dtoBaseinfoBrand);
	
}
