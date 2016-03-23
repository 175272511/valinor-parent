package com.ninesale.valinor.item.api.service;

import com.ninesale.valinor.item.api.model.stock.request.DubboQueryItemStockListRequest;
import com.ninesale.valinor.item.api.model.stock.response.DubboQueryItemStockListResponse;

/**
 * 库存信息远程接口
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public interface DubboItemStockService {
	
	/**
	 * 查询库存信息列表
	 * @param DubboQueryItemStockListRequest
	 * @return DubboQueryItemSkusnapListResponse 
	 */
	public DubboQueryItemStockListResponse queryItemStockList(DubboQueryItemStockListRequest request);

}
