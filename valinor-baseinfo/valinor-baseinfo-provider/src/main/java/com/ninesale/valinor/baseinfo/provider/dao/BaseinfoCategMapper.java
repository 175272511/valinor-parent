package com.ninesale.valinor.baseinfo.provider.dao;

import java.util.List;

import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoCateg;
import com.ninesale.valinor.baseinfo.provider.model.DtoParentCateg;

/**
 * @des 基础信息-种类信息 Dao接口
 * @author Zhoup
 * @date 2015年11月2日16:46:15
 */
public interface BaseinfoCategMapper {

	/**
	 * 保存类目
	 * @param record
	 * @return
	 */
	int insert(DtoBaseinfoCateg record);

	/***
	 * 更新类目
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(DtoBaseinfoCateg record);

	/***
	 * 查询类目列表
	 * @param record
	 * @return
	 */
	List<DtoBaseinfoCateg> queryCategList(DtoBaseinfoCateg record);
	/***
	 * 查询所有类目列表
	 * @param record
	 * @return
	 */
	List<DtoParentCateg> queryAllCategList(DtoBaseinfoCateg record); 
}