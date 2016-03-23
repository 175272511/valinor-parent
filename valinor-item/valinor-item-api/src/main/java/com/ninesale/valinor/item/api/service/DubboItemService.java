package com.ninesale.valinor.item.api.service;

import com.ninesale.valinor.item.api.model.item.request.DubboAddItemRequest;
import com.ninesale.valinor.item.api.model.item.request.DubboDownUpRecomHotItemRequest;
import com.ninesale.valinor.item.api.model.item.request.DubboQueryItemByPageRequest;
import com.ninesale.valinor.item.api.model.item.request.DubboUpdateItemRequest;
import com.ninesale.valinor.item.api.model.item.response.DubboAddItemResponse;
import com.ninesale.valinor.item.api.model.item.response.DubboDownUpRecomHotItemResponse;
import com.ninesale.valinor.item.api.model.item.response.DubboQueryItemByPageResponse;
import com.ninesale.valinor.item.api.model.item.response.DubboUpdateItemResponse;

/**
 * @des 基础信息-商品 接口类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public interface DubboItemService {
	/**
	 * 创建商品
	 * 
	 * @param request 商品类型请求对象
	 * @return DubboAddItemResponse
	 */
	public DubboAddItemResponse insert(DubboAddItemRequest dubboAddItemRequest);

	/**
	 * 更新商品
	 * 
	 * @param DubboUpdateItemRequest
	 * @return DubboUpdateItemRequest
	 */
	public DubboUpdateItemResponse updateByPrimaryKeySelective(
			DubboUpdateItemRequest dubboUpdateItemRequest);

	/**
	 * 查询商品
	 * 
	 * @param DubboQueryItemByPageResponse
	 * @return DubboQueryItemByPageRequest
	 */
	public DubboQueryItemByPageResponse queryItemByPage(
			DubboQueryItemByPageRequest dubboQueryItemByPageRequest);
	
	/**
	 * 商品上架、下架、推荐、非推荐、热门、非热门
	 * 
	 * @param DubboDownUpRecomHotItemRequest
	 * @return DubboDownUpRecomHotItemResponse
	 */
	public DubboDownUpRecomHotItemResponse downUpRecomHotItem(
			DubboDownUpRecomHotItemRequest dubboDownUpRecomHotItemRequest);

}
