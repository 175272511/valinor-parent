package com.ninesale.valinor.baseinfo.api.service;

import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboAddBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboDownBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboQueryBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboQueryBrandByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboQueryBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboUpdateBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboAddBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboDownBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboQueryBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboQueryBrandByPageResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboQueryBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboUpdateBaseinfoBrandResponse;

/**
 * @des 基础信息-品牌 接口类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public interface DubboBaseinfoBrandService {
	/**
	 * 创建品牌
	 * 
	 * @param request
	 *            品牌类型请求对象
	 * @return BaseinfoBrandResponse
	 */
	public DubboAddBaseinfoBrandResponse insert(DubboAddBaseinfoBrandRequest dubboAddBaseinfoBrandRequest);

	/**
	 * 更新品牌
	 * 
	 * @param DubboUpdateBaseinfoBrandRequest
	 *            品牌ID
	 * @return DubboUpdateBaseinfoBrandResponse
	 */
	public DubboUpdateBaseinfoBrandResponse updateByPrimaryKeySelective(
			DubboUpdateBaseinfoBrandRequest dubboUpdateBaseinfoBrandRequest);

	/**
	 * 查询品牌
	 * 
	 * @param DubboQueryBaseinfoBrandRequest
	 *            dubboQueryBaseinfoBrandRequest
	 * @return DubboQueryBaseinfoBrandResponse
	 */
	public DubboQueryBaseinfoBrandResponse selectByPrimaryKey(
			DubboQueryBaseinfoBrandRequest dubboQueryBaseinfoBrandRequest);
	
	/**
	 * 查询品牌
	 * 
	 * @param DubboQueryBaseinfoBrandRequest
	 *            dubboQueryBaseinfoBrandRequest
	 * @return DubboQueryBaseinfoBrandResponse
	 */
	public DubboQueryBrandByPageResponse queryBrandByPage(
			DubboQueryBrandByPageRequest dubboQueryBrandByPageRequest);

	/**
	 * 禁用地址信息
	 * 
	 * @param DubboDownBaseinfoBrandRequest
	 *            dubboDownBaseinfoBrandRequest
	 * @return DubboDownBaseinfoBrandResponse
	 */
	public DubboDownBaseinfoBrandResponse downuUpBrand(DubboDownBaseinfoBrandRequest dubboDownBaseinfoBrandRequest);
	
	
	/**
	 * 查询品牌列表
	 * 
	 * @param DubboQueryBrandRequest
	 *            
	 * @return DubboQueryBrandResponse
	 */
	public DubboQueryBrandResponse queryBrandList(
			DubboQueryBrandRequest dubboQueryBrandRequest);
}
