package com.ninesale.valinor.image.api.service;

import com.ninesale.valinor.image.api.model.request.DubboAddImgTypeRequest;
import com.ninesale.valinor.image.api.model.request.DubboDelImgTypeRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgTypeListRequest;
import com.ninesale.valinor.image.api.model.request.DubboUpdateImgTypeRequest;
import com.ninesale.valinor.image.api.model.response.DubboAddImgTypeResponse;
import com.ninesale.valinor.image.api.model.response.DubboDelImgTypeResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTypeListResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTypeResponse;
import com.ninesale.valinor.image.api.model.response.DubboUpdateImgTypeResponse;

/**
 * 图片管理接口类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public interface DubboImgTypeService {
	/**
	 * 创建图片所属类型
	 * @param request 图片所属类型请求对象
	 * @return ImgTypeResponse
	 */
	public DubboAddImgTypeResponse insert(DubboAddImgTypeRequest dubboAddImgTypeRequest);
	
	/**
	 * 查询图片所属类型
	 * @param id 图片所属类型ID
	 * @return DubboQueryImgTypeResponse
	 */
	public DubboQueryImgTypeResponse selectByPrimaryKey(DubboQueryImgStoreRequest dubboQueryImgStoreRequest);
	
	
	/**
	 * 删除图片所属类型
	 * @param DubboDelImgTypeRequest 图片所属类型ID
	 * @return DubboDelImgTypeResponse
	 */
	public DubboDelImgTypeResponse deleteByPrimaryKey(DubboDelImgTypeRequest DubboDelImgTypeRequest);
	
	/**
	 * 更新图片所属类型
	 * @param DubboUpdateImgTypeRequest 图片所属类型VO
	 * @return DubboUpdateImgTypeResponse
	 */
	public DubboUpdateImgTypeResponse updateByPrimaryKeySelective(DubboUpdateImgTypeRequest dubboUpdateImgTypeRequest);
	
	/**
	 * 查询图片所属类型List
	 * @param DubboQueryImgListTypeRequest请求对象
	 * @return DubboQueryImgTypeListResponse
	 */
	public DubboQueryImgTypeListResponse queryImgTypeList(DubboQueryImgTypeListRequest dubboQueryImgTypeListRequest);
}
