package com.ninesale.valinor.baseinfo.api.service;

import com.ninesale.valinor.baseinfo.api.model.request.brandtag.DubboAddBrandTagRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brandtag.DubboQueryBrandTagByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.brandtag.DubboAddBrandTagResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brandtag.DubboQueryBrandTagByPageResponse;

/**
 * @des 基础信息-品牌标签 接口类
 * @author fxj
 * @date 2015年12月07日14:33:38
 */
public interface DubboBrandTagService {
	/**
	 * 创建品牌标签
	 * 
	 * @param DubboAddBrandTagRequest
	 * @return DubboAddBrandTagResponse
	 */
	public DubboAddBrandTagResponse insert(DubboAddBrandTagRequest dubboAddBrandTagRequest);

	/**
	 * 查询品牌标签
	 * 
	 * @param DubboQueryBrandTagByPageRequest
	 * @return DubboQueryBrandTagByPageResponse
	 */
	public DubboQueryBrandTagByPageResponse queryBrandTagByPage(
			DubboQueryBrandTagByPageRequest dubboQueryBrandTagByPageRequest);
	
}
