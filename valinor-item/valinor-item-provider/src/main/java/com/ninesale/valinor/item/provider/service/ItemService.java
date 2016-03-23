package com.ninesale.valinor.item.provider.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.item.provider.model.DtoItem;

/**
 * @des 基础信息-商品信息 服务接口类
 * @author Zhoup
 * @date 2015年11月3日10:26:04
 */
public interface ItemService{
	
	/**
	 * 增加商品信息
	 * @param DubboItem
	 * @return Map<String,Object>
	 */
	public Map<String,Object> insert(DtoItem record);

	/**
	 * 修改商品信息
	 * @param DubboItem
	 * @return int
	 */
	public int updateByPrimaryKeySelective(DtoItem record);
	
	/**
	 * 分页查询商品列表信息
	 * @param DubboItem
	 * @return List<DubboItem>
	 */
	public List<DtoItem> queryItemByPage(@Param("item") DtoItem dtoBaseinfoBrand, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * 分页查询商品列表信息总数
	 * @param DubboItem
	 * @return int
	 */
	public int queryTotalNumOfItem(DtoItem brand);
	
}
