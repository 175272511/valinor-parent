package com.ninesale.valinor.item.api.service;

import com.ninesale.valinor.item.api.model.attr.request.DubboAddItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboBatchAddItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboDelItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrvalueList2Request;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrvalueListRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboUpdateItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.response.DubboAddItemAttrvalueResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboBatchAddItemAttrvalueResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboDelItemAttrvalueResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrvalueList2Response;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrvalueListResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboUpdateItemAttrvalueResponse;

/**
 * 商品属性值远程接口
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public interface DubboItemAttrvalueService {
	/**
	 * 批量新增商品属性值
	 * @param request 商品属性值List请求对象
	 * @return DubboBatchAddItemAttrvalueResponse
	 */
	public DubboBatchAddItemAttrvalueResponse batchInsert(DubboBatchAddItemAttrvalueRequest request);
	
	/**
	 * 单条记录新增商品属性值
	 * @param request 商品属性值请求对象
	 * @return DubboAddItemAttrvalueResponse
	 */
	public DubboAddItemAttrvalueResponse insert(DubboAddItemAttrvalueRequest request);
	
	/**
	 * 更新商品属性值信息
	 * @param DubboUpdateItemAttrvalueRequest
	 * @return DubboUpdateItemAttrvalueResponse 更新数量
	 */
	public DubboUpdateItemAttrvalueResponse updateByPrimaryKeySelective(DubboUpdateItemAttrvalueRequest request);
	
	/**
	 * 查询商品属性值信息列表
	 * @param DubboQueryItemAttrvalueListRequest
	 * @return DubboQueryItemAttrvalueListResponse 
	 */
	public DubboQueryItemAttrvalueListResponse queryItemAttrvaluevalueList(DubboQueryItemAttrvalueListRequest request);
	
	/**
	 * 查询商品属性值信息列表
	 * @param DubboQueryItemAttrvalueList2Request
	 * @return DubboQueryItemAttrvalueList2Response 
	 */
	public DubboQueryItemAttrvalueList2Response queryItemAttrvaluevalueListByIds(DubboQueryItemAttrvalueList2Request request);
	
	/**
	 * 删除商品属性值信息
	 * @param DubboDelItemSpuRequest 商品属性值信息ID
	 * @return DubboDelItemAttrvalueResponse
	 */
	public DubboDelItemAttrvalueResponse deleteByPrimaryKey(DubboDelItemAttrvalueRequest request);
}
