package com.ninesale.valinor.item.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.item.provider.model.DtoItemAttribute;

/**
 * 商品属性DAO接口
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public interface ItemAttributeService {
	/**
	 * 批量创建商品属性信息
	 * @param List<DtoItemAttribute> 商品属性List
	 * @return void
	 */
	public void batchInsert(List<DtoItemAttribute> list);
	
	/**
	 * 创建单条记录商品属性信息
	 * @param DtoItemAttribute 商品属性VO
	 * @return Map<String,Object> 更新数量、保存主键ID
	 */
	public Map<String,Object> insert(DtoItemAttribute dtoItemAttribute);
	
	/**
	 * 更新商品属性信息
	 * @param DtoItemAttribute 商品属性VO
	 * @return int 更新数量
	 */
	public int updateByPrimaryKeySelective(DtoItemAttribute record);
	
	/**
	 * 查询商品属性信息
	 * @param DtoItemAttribute 商品属性VO
	 * @return List<DtoItemAttribute> 商品属性List
	 */
	public List<DtoItemAttribute> queryItemAttributeList(DtoItemAttribute record);
	
	/**
	 * 查询商品属性信息
	 * @param DtoItemAttribute 商品属性VO
	 * @return List<DtoItemAttribute> 商品属性List
	 */
	public List<DtoItemAttribute> queryItemAttrListByIds(List<Long> ids);
	
	/**
	 * 删除商品属性信息
	 * @param Long 商品属性ID
	 * @return 删除记录数
	 */
	public int deleteByPrimaryKey(Long id);
	
}
