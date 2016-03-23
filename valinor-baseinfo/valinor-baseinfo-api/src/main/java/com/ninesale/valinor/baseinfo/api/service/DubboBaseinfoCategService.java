package com.ninesale.valinor.baseinfo.api.service;

import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboAddCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboDownUpCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQueryAllCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQueryCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQueryParentCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQuerySubCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboUpdateCategRequest;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboAddCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboDownUpCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQueryAllCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQueryCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQueryParentCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQuerySubCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboUpdateCategResponse;

/**
 * @des 基础信息-类目 接口类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public interface DubboBaseinfoCategService {
	/**
	 * 添加类目信息
	 * 
	 * @param req
	 * @return
	 */
	public DubboAddCategResponse addCateg(DubboAddCategRequest req);
	
	/**
	 * 修改类目信息
	 * 
	 * @param req
	 * @return
	 */
	public DubboUpdateCategResponse updateCateg(DubboUpdateCategRequest req);
	
	/**
	 * 禁用/启用类目信息
	 * 
	 * @param req
	 * @return
	 */
	public DubboDownUpCategResponse downUpCateg(DubboDownUpCategRequest req);
	
	/**
	 * 查询顶级类目信息
	 * 
	 * @param req
	 * @return
	 */
	public DubboQueryParentCategResponse queryParentCateg(DubboQueryParentCategRequest req);
	
	/**
	 * 查询子类目信息
	 * 
	 * @param req
	 * @return
	 */
	public DubboQuerySubCategResponse querySubCateg(DubboQuerySubCategRequest req);
	
	/**
	 * 查询所有类目列表(父类目里面包含子类目集合)信息
	 * 
	 * @param req
	 * @return
	 */
	public DubboQueryAllCategResponse queryAllCateg(DubboQueryAllCategRequest req);
	
	/**
	 * 查询类目列表
	 * 
	 * @param DubboQueryBrandRequest
	 *            
	 * @return DubboQueryBrandResponse
	 */
	public DubboQueryCategResponse queryCategList(
			DubboQueryCategRequest dubboQueryCategRequest);
	
}
