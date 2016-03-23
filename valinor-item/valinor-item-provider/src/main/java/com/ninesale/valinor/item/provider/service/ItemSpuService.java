package com.ninesale.valinor.item.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.item.provider.model.DtoItemSpu;
import com.ninesale.valinor.item.provider.model.DtoItemSpuSkuStock;

/**
 * SPUDAO接口 
 * 创建人：fuxingjian 
 * 创建时间：2015年11月04日 上午10:00:00
 */
public interface ItemSpuService {

	/**
	 * 创建SPU信息
	 * 
	 * @param DtoItemSpu
	 *            SPUVO
	 * @return Map<String,Object> 更新数量、保存主键ID
	 */
	public Map<String, Object> insert(DtoItemSpu record);

	/**
	 * 更新SPU信息
	 * 
	 * @param DtoItemSpu
	 *            SPUVO
	 * @return int 更新数量
	 */
	public int updateByPrimaryKeySelective(DtoItemSpu record);

	/**
	 * 查询SPU信息
	 * 
	 * @param DtoItemSpu
	 *            SPUVO
	 * @return List<DtoItemAttribute> SPUList
	 */
	public List<DtoItemSpu> queryItemSpuList(DtoItemSpu record);
	
	/**
	 * 查询SPU Sku Stock信息
	 * 
	 * @param DtoItemSpu
	 *            SPUVO
	 * @return List<DtoItemAttribute> SPUList
	 */
	public List<DtoItemSpuSkuStock> queryItemSpuSkuStockList(DtoItemSpu record);

	/**
	 * 删除SPU信息
	 * 
	 * @param Long
	 *            SPUID
	 * @return 删除记录数
	 */
	public int deleteByPrimaryKey(Long id);

}
