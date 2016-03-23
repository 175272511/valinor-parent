package com.ninesale.valinor.item.api.service;

import com.ninesale.valinor.item.api.model.sku.request.DubboQueryItemSkusnapListRequest;
import com.ninesale.valinor.item.api.model.sku.response.DubboQueryItemSkusnapListResponse;

/**
 * SKU快照信息远程接口
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public interface DubboItemSkusnapService {
	
	/**
	 * 查询SKU快照信息列表
	 * @param DubboQueryItemStockListRequest
	 * @return DubboQueryItemSkusnapListResponse 
	 */
	public DubboQueryItemSkusnapListResponse queryItemSkusnapList(DubboQueryItemSkusnapListRequest request);

}
