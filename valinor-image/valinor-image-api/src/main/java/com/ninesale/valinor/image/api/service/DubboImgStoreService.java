package com.ninesale.valinor.image.api.service;

import com.ninesale.valinor.image.api.model.request.DubboAddImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboDelImgStoreListRequest;
import com.ninesale.valinor.image.api.model.request.DubboDelImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreListRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreTypeListRequest;
import com.ninesale.valinor.image.api.model.response.DubboAddImgStoreResponse;
import com.ninesale.valinor.image.api.model.response.DubboDelImgStoreResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgStoreListResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgStoreResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgStoreTypeListResponse;

/**
 * 图片管理接口类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public interface DubboImgStoreService {
	/**
	 * 创建图片信息
	 * @param request 创建图片信息请求对象
	 * @return ImgStoreResponse
	 */
	public DubboAddImgStoreResponse insert(DubboAddImgStoreRequest dubboAddImgStoreRequest);
	
	/**
	 * 查询图片信息
	 * @param dubboQueryImgStoreRequest 图片信息ID
	 * @return DubboQueryImgStoreResponse
	 */
	public DubboQueryImgStoreResponse selectByPrimaryKey(DubboQueryImgStoreRequest dubboQueryImgStoreRequest);
	
	/**
	 * 查询图片List
	 * @param dubboQueryImgStoreListRequest idList请求对象
	 * @return DubboQueryImgStoreListResponse
	 */
	public DubboQueryImgStoreListResponse queryImgStoreList(DubboQueryImgStoreListRequest dubboQueryImgStoreListRequest);
	
	/**
	 * 删除图片信息
	 * @param dubboDelImgStoreRequest 图片信息ID
	 * @return DubboDelImgStoreResponse
	 */
	public DubboDelImgStoreResponse deleteByPrimaryKey(DubboDelImgStoreRequest dubboDelImgStoreRequest);
	
	/**
	 * 删除图片信息列表
	 * @param dubboDelImgStoreListRequest 图片信息IDList
	 * @return DubboDelImgStoreResponse
	 */
	public DubboDelImgStoreResponse deleteImgStoreByIds(DubboDelImgStoreListRequest dubboDelImgStoreListRequest);
	
	/**
	 * 查询图片List
	 * @param dubboQueryImgStoreListRequest idList请求对象
	 * @return DubboQueryImgStoreListResponse
	 */
	public DubboQueryImgStoreTypeListResponse queryImgStoreTypeList(DubboQueryImgStoreTypeListRequest dubboQueryImgStoreTypeListRequest);
	
}
