package com.ninesale.valinor.baseinfo.provider.dao;

import java.util.List;

import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoAddress;

/**
 * @des 基础信息-通用地址 Dao接口
 * @author Zhoup
 * @date 2015年11月2日16:46:15
 */
public interface BaseinfoAddressMapper {
	/**
	 * @des 根据主键id删除通用地址信息记录
	 * @return int
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * @des 根据通用地址信息插入记录
	 * @return int
	 */
	int insert(DtoBaseinfoAddress record);

	/**
	 * @des 根据选中通用地址信息插入记录
	 * @return int
	 */
	int insertSelective(DtoBaseinfoAddress record);

	/**
	 * @des 根据主键id查询通用地址信息
	 * @return DtoBaseinfoCateg
	 */
	DtoBaseinfoAddress selectByPrimaryKey(Long id);

	/**
	 * @des 根据选中的通用地址信息修改记录
	 * @return int
	 */
	int updateByPrimaryKeySelective(DtoBaseinfoAddress record);

	/**
	 * @des 根据主键id修改通用地址信息
	 * @return int
	 */
	int updateByPrimaryKey(DtoBaseinfoAddress record);

	/**
	 * @des 根据主键集合批量删除通用地址信息
	 * @return int
	 */
	int deleteBaseinfoAddressByIds(List<Long> ids);
}