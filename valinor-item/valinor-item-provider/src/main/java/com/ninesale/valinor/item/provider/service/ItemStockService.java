package com.ninesale.valinor.item.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.item.provider.model.DtoItemStock;

/**
 * 库存DAO接口 
 * 创建人：fuxingjian 
 * 创建时间：2015年11月09日 上午10:00:00
 */
public interface ItemStockService {

	/**
	 * 创建ItemStock信息
	 * 
	 * @param DtoItemStock
	 *            StockVO
	 * @return Map<String,Object> 更新数量、保存主键ID
	 */
	public Map<String, Object> insert(DtoItemStock record);

	/**
	 * 更新ItemStock信息
	 * 
	 * @param DtoItemStock
	 *            StockVO
	 * @return int 更新数量
	 */
	public int updateByPrimaryKeySelective(DtoItemStock record);

	/**
	 * 查询Stock信息
	 * 
	 * @param DtoItemStock
	 *            StockVO
	 * @return List<DtoItemStock> StockList
	 */
	public List<DtoItemStock> queryItemStockList(DtoItemStock record);

}
