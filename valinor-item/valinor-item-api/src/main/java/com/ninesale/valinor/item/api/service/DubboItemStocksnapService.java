package com.ninesale.valinor.item.api.service;

import com.ninesale.valinor.item.api.model.stock.request.DubboQueryItemStocksnapListRequest;
import com.ninesale.valinor.item.api.model.stock.response.DubboQueryItemStocksnapListResponse;

/**
 * 库存快照信息远程接口
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public interface DubboItemStocksnapService {
	
	/**
	 * 查询库存快照信息列表
	 * @param DubboQueryItemStocksnapListRequest
	 * @return DubboQueryItemStocksnapListResponse 
	 */
	public DubboQueryItemStocksnapListResponse queryItemStocksnapList(DubboQueryItemStocksnapListRequest request);

}
