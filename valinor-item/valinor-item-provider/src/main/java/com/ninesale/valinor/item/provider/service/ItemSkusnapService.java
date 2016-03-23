package com.ninesale.valinor.item.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.item.provider.model.DtoItemSkusnap;

/**
 * SKU快照DAO接口 
 * 创建人：fuxingjian 
 * 创建时间：2015年11月09日 上午10:00:00
 */
public interface ItemSkusnapService {

	/**
	 * 创建ItemSkusnap信息
	 * 
	 * @param DtoItemSkusnap
	 *            SkusnapVO
	 * @return Map<String,Object> 更新数量、保存主键ID
	 */
	public Map<String, Object> insert(DtoItemSkusnap record);

	/**
	 * 查询ItemSkusnap信息
	 * 
	 * @param DtoItemSkusnap
	 *            SkusnapVO
	 * @return List<DtoItemSkusnap> SkusnapList
	 */
	public List<DtoItemSkusnap> queryItemSkusnapList(DtoItemSkusnap record);

}
