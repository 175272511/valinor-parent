package com.ninesale.valinor.baseinfo.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoBrand;

/**
 * @des 基础信息-品牌信息 Dao接口
 * @author Zhoup
 * @date 2015年11月2日16:46:15
 */
public interface BaseinfoBrandMapper {
	/**
	 * @des 根据主键id删除品牌信息记录
	 * @return int
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * @des 根据品牌信息插入记录
	 * @return int
	 */
	int insert(DtoBaseinfoBrand record);

	/**
	 * @des 根据选中品牌信息插入记录
	 * @return int
	 */
	int insertSelective(DtoBaseinfoBrand record);

	/**
	 * @des 根据主键id查询品牌信息
	 * @return DtoBaseinfoCateg
	 */
	DtoBaseinfoBrand selectByPrimaryKey(Long id);

	/**
	 * @des 根据选中的品牌信息修改记录
	 * @return int
	 */
	int updateByPrimaryKeySelective(DtoBaseinfoBrand record);

	/**
	 * @des 根据主键id修改品牌信息
	 * @return int
	 */
	int updateByPrimaryKey(DtoBaseinfoBrand record);

	/**
	 * @des 根据主键集合批量删除品牌信息
	 * @return int
	 */
	int deleteBaseinfoBrandByIds(List<Long> ids);
	
	/**
	 * @param dtoNote
	 * @param beginId
	 * @param pageSize
	 */
	List<DtoBaseinfoBrand> queryBrandByPage(@Param("brand") DtoBaseinfoBrand dtoNote, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param dtoNote
	 * @return
	 */
	int queryTotalNumOfBrand(DtoBaseinfoBrand brand);

	List<DtoBaseinfoBrand> queryBrandList(DtoBaseinfoBrand brand); 
}