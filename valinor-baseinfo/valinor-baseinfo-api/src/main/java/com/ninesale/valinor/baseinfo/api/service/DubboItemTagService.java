package com.ninesale.valinor.baseinfo.api.service;

import com.ninesale.valinor.baseinfo.api.model.request.itemtag.DubboAddItemTagRequest;
import com.ninesale.valinor.baseinfo.api.model.request.itemtag.DubboQueryItemTagByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.itemtag.DubboAddItemTagResponse;
import com.ninesale.valinor.baseinfo.api.model.response.itemtag.DubboQueryItemTagByPageResponse;

/**
 * @des 基础信息-商品标签 接口类
 * @author fxj
 * @date 2015年12月07日14:33:38
 */
public interface DubboItemTagService {
	/**
	 * 创建商品标签
	 * 
	 * @param DubboAddItemTagRequest
	 * @return DubboAddItemTagResponse
	 */
	public DubboAddItemTagResponse insert(DubboAddItemTagRequest dubboAddItemTagRequest);

	/**
	 * 查询商品标签
	 * 
	 * @param DubboQueryItemTagByPageRequest
	 * @return DubboQueryItemTagByPageResponse
	 */
	public DubboQueryItemTagByPageResponse queryItemTagByPage(
			DubboQueryItemTagByPageRequest dubboQueryItemTagByPageRequest);
	
}
