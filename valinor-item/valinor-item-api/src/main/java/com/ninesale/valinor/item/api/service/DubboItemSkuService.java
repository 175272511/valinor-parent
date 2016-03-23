package com.ninesale.valinor.item.api.service;

import com.ninesale.valinor.item.api.model.sku.request.DubboAddItemSkuRequest;
import com.ninesale.valinor.item.api.model.sku.request.DubboQuerySkuStockListRequest;
import com.ninesale.valinor.item.api.model.sku.request.DubboUpdateItemSkuRequest;
import com.ninesale.valinor.item.api.model.sku.response.DubboAddItemSkuResponse;
import com.ninesale.valinor.item.api.model.sku.response.DubboQuerySkuStockListResponse;
import com.ninesale.valinor.item.api.model.sku.response.DubboUpdateItemSkuResponse;

/**
 * Sku信息远程接口
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public interface DubboItemSkuService {
	
	/**
	 * 创建Sku信息
	 * @param DubboAddItemSkuRequest Sku请求对象
	 * @return DubboAddItemSkuResponse
	 */
	public DubboAddItemSkuResponse insert(DubboAddItemSkuRequest request);
	
	/**
	 * 更新Sku信息
	 * @param DubboUpdateItemSkuRequest
	 * @return DubboUpdateItemSkuResponse 更新数量
	 */
	public DubboUpdateItemSkuResponse updateByPrimaryKeySelective(DubboUpdateItemSkuRequest request);
	
	/**
	 * 查询Sku Stock信息列表
	 * @param DubboQuerySkuStockListRequest
	 * @return DubboQuerySkuStockListResponse 
	 */
	public DubboQuerySkuStockListResponse queryItemSkuStockList(DubboQuerySkuStockListRequest request);
	
}
