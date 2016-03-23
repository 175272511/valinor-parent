package com.ninesale.valinor.item.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.item.provider.model.DtoItemSku;
import com.ninesale.valinor.item.provider.model.DtoItemSkuStock;

/**
 * SkuDAO接口 
 * 创建人：fuxingjian 
 * 创建时间：2015年11月09日 上午10:00:00
 */
public interface ItemSkuService {

	/**
	 * 创建Sku信息
	 * 
	 * @param DtoItemSku
	 *            SkuVO
	 * @return Map<String,Object> 更新数量、保存主键ID
	 */
	public Map<String, Object> insert(DtoItemSku record);

	/**
	 * 更新Sku信息
	 * 
	 * @param DtoItemSku
	 *            SkuVO
	 * @return int 更新数量
	 */
	public int updateByPrimaryKeySelective(DtoItemSku record);

	/**
	 * 查询Sku信息
	 * 
	 * @param DtoItemSku
	 *            SkuVO
	 * @return List<DtoItemSku> SkuList
	 */
	public List<DtoItemSku> queryItemSkuList(DtoItemSku record);
	
	/**
	 * 查询Sku&库存列表信息
	 * 
	 * @param DtoItemSku
	 *            SkuVO
	 * @return List<DtoItemSkuStock> SkuStockList
	 */
	public List<DtoItemSkuStock> queryItemSkuStockList(DtoItemSku record);

}
