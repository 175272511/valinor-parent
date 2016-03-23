package com.ninesale.valinor.item.api.service;

import com.ninesale.valinor.item.api.model.attr.request.DubboAddItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboBatchAddItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboDelItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrList2Request;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrListRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboUpdateItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.response.DubboAddItemAttributeResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboBatchAddItemAttributeResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboDelItemAttributeResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrList2Response;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrListResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboUpdateItemAttributeResponse;

/**
 * 商品属性远程接口
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public interface DubboItemAttributeService {
	/**
	 * 批量新增商品属性
	 * @param request 商品属性List请求对象
	 * @return DubboBatchAddItemAttributeResponse
	 */
	public DubboBatchAddItemAttributeResponse batchInsert(DubboBatchAddItemAttributeRequest request);
	
	/**
	 * 单条记录新增商品属性
	 * @param request 商品属性请求对象
	 * @return DubboAddItemAttributeResponse
	 */
	public DubboAddItemAttributeResponse insert(DubboAddItemAttributeRequest request);
	
	/**
	 * 更新商品属性信息
	 * @param DubboUpdateItemAttributeRequest
	 * @return DubboUpdateItemAttributeResponse 更新数量
	 */
	public DubboUpdateItemAttributeResponse updateByPrimaryKeySelective(DubboUpdateItemAttributeRequest request);
	
	/**
	 * 查询商品属性信息列表
	 * @param DubboQueryItemAttrListRequest
	 * @return DubboQueryItemAttrListResponse 
	 */
	public DubboQueryItemAttrListResponse queryItemAttributeList(DubboQueryItemAttrListRequest request);
	
	/**
	 * 查询商品属性信息列表
	 * @param DubboQueryItemAttrList2Request
	 * @return DubboQueryItemAttrList2Response 
	 */
	public DubboQueryItemAttrList2Response queryItemAttrListByIds(DubboQueryItemAttrList2Request request);
	
	/**
	 * 删除商品属性信息
	 * @param DubboDelItemAttributeRequest 商品属性信息ID
	 * @return DubboDelItemAttributeResponse
	 */
	public DubboDelItemAttributeResponse deleteByPrimaryKey(DubboDelItemAttributeRequest request);
}
