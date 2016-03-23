package com.ninesale.valinor.baseinfo.provider.dao;

import java.util.List;

import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoMerchant;

/**
 * @des 基础信息-商家信息 Dao接口
 * @author Zhoup
 * @date 2015年11月2日16:46:15
 */
public interface BaseinfoMerchantMapper {
	/**
	 * @des 根据主键id删除商家信息记录
	 * @return int
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * @des 根据商家信息插入记录
	 * @return int
	 */
	int insert(DtoBaseinfoMerchant record);

	/**
	 * @des 根据选中的商家信息插入记录
	 * @return int
	 */
	int insertSelective(DtoBaseinfoMerchant record);

	/**
	 * @des 根据主键id查询商家信息
	 * @return DtoBaseinfoMerchant
	 */
	DtoBaseinfoMerchant selectByPrimaryKey(Long id);

	/**
	 * @des 根据选中的商家信息修改记录
	 * @return int
	 */
	int updateByPrimaryKeySelective(DtoBaseinfoMerchant record);

	/**
	 * @des 根据主键id修改商家信息记录
	 * @return int
	 */
	int updateByPrimaryKey(DtoBaseinfoMerchant record);

	/**
	 * @des 根据主键集合批量删除商家信息
	 * @return int
	 */
	int deleteBaseinfoMerchantByIds(List<Long> ids);
}