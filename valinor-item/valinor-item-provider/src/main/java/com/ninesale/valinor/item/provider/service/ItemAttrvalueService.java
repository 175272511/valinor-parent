package com.ninesale.valinor.item.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.item.provider.model.DtoItemAttrvalue;

/**
 * 商品属性值DAO接口
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public interface ItemAttrvalueService {
	/**
	 * 批量创建商品属性值信息
	 * @param List<DtoItemAttribute> 商品属性List
	 * @return void
	 */
	public void batchInsert(List<DtoItemAttrvalue> list);
	
	/**
	 * 创建单条记录商品属性值信息
	 * @param DtoItemAttribute 商品属性值VO
	 * @return Map<String,Object> 更新数量、保存主键ID
	 */
	public Map<String,Object> insert(DtoItemAttrvalue record);
	
	/**
	 * 更新商品属性值信息
	 * @param DtoItemAttribute 商品属性值VO
	 * @return int 更新数量
	 */
	public int updateByPrimaryKeySelective(DtoItemAttrvalue record);
	
	/**
	 * 查询商品属性值信息
	 * @param DtoItemAttribute 商品属性值VO
	 * @return List<DtoItemAttribute> 商品属性值List
	 */
	public List<DtoItemAttrvalue> queryItemAttrvalueList(DtoItemAttrvalue record);
	
	/**
	 * 查询商品属性值信息
	 * @param DtoItemAttribute 商品属性值VO
	 * @return List<DtoItemAttribute> 商品属性值List
	 */
	public List<DtoItemAttrvalue> queryItemAttrvalueListByIds(List<Long> ids);
	
	/**
	 * 删除商品属性值信息
	 * @param Long 商品属性值ID
	 * @return 删除记录数
	 */
	public int deleteByPrimaryKey(Long id);
	
}
