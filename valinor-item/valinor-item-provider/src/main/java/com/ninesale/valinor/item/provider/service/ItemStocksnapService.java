package com.ninesale.valinor.item.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.item.provider.model.DtoItemStocksnap;

/**
 * 库存快照DAO接口 
 * 创建人：fuxingjian 
 * 创建时间：2015年11月09日 上午10:00:00
 */
public interface ItemStocksnapService {

	/**
	 * 创建ItemStocksnap信息
	 * 
	 * @param DtoItemStocksnap
	 *            StocksnapVO
	 * @return Map<String,Object> 更新数量、保存主键ID
	 */
	public Map<String, Object> insert(DtoItemStocksnap record);

	/**
	 * 查询ItemStocksnap信息
	 * 
	 * @param DtoItemStocksnap
	 *            StocksnapVO
	 * @return List<DtoItemStocksnap> StocksnapList
	 */
	public List<DtoItemStocksnap> queryItemStocksnapList(DtoItemStocksnap record);

}
