package com.ninesale.valinor.baseinfo.api.service;

import com.ninesale.valinor.baseinfo.api.model.request.addrtag.DubboAddAddrTagRequest;
import com.ninesale.valinor.baseinfo.api.model.request.addrtag.DubboQueryAddrTagByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.addrtag.DubboAddAddrTagResponse;
import com.ninesale.valinor.baseinfo.api.model.response.addrtag.DubboQueryAddrTagByPageResponse;

/**
 * @des 基础信息-购物地点标签 接口类
 * @author fxj
 * @date 2015年12月07日14:33:38
 */
public interface DubboAddressTagService {
	/**
	 * 创建购物地点标签
	 * 
	 * @param DubboAddAddrTagRequest
	 * @return DubboAddAddrTagResponse
	 */
	public DubboAddAddrTagResponse insert(DubboAddAddrTagRequest dubboAddAddrTagRequest);

	/**
	 * 查询购物地点标签
	 * 
	 * @param DubboQueryAddrTagByPageResponse
	 * @return DubboQueryAddrTagByPageRequest
	 */
	public DubboQueryAddrTagByPageResponse queryAddrTagByPage(
			DubboQueryAddrTagByPageRequest dubboQueryAddrTagByPageRequest);
	
}
