package com.ninesale.valinor.item.api.service;

import com.ninesale.valinor.item.api.model.spu.request.DubboAddItemSpuRequest;
import com.ninesale.valinor.item.api.model.spu.request.DubboDelItemSpuRequest;
import com.ninesale.valinor.item.api.model.spu.request.DubboQuerySpuSkuStockListRequest;
import com.ninesale.valinor.item.api.model.spu.request.DubboUpdateItemSpuRequest;
import com.ninesale.valinor.item.api.model.spu.response.DubboAddItemSpuResponse;
import com.ninesale.valinor.item.api.model.spu.response.DubboDelItemSpuResponse;
import com.ninesale.valinor.item.api.model.spu.response.DubboQuerySpuSkuStockListResponse;
import com.ninesale.valinor.item.api.model.spu.response.DubboUpdateItemSpuResponse;

/**
 * SPU信息远程接口
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public interface DubboItemSpuService {
	
	/**
	 * 创建SPU信息
	 * @param DubboAddItemSpuRequest SPU请求对象
	 * @return DubboAddItemSpuResponse
	 */
	public DubboAddItemSpuResponse insert(DubboAddItemSpuRequest request);
	
	/**
	 * 更新SPU信息
	 * @param DubboUpdateItemSpuRequest
	 * @return DubboUpdateItemSpuResponse 更新数量
	 */
	public DubboUpdateItemSpuResponse updateByPrimaryKeySelective(DubboUpdateItemSpuRequest request);
	
	/**
	 * 查询SPU信息列表
	 * @param DubboQuerySpuSkuStockListRequest
	 * @return DubboQueryItemSpuListResponse 
	 */
	public DubboQuerySpuSkuStockListResponse queryItemSpuSkuStockList(DubboQuerySpuSkuStockListRequest request);
	
	/**
	 * 删除SPU信息
	 * @param DubboDelItemSkuRequest
	 * @return DubboDelItemAttributeResponse
	 */
	public DubboDelItemSpuResponse deleteByPrimaryKey(DubboDelItemSpuRequest request);
}
