package com.ninesale.valinor.image.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.image.provider.model.DtoImgType;

/**
 * 图片管理接口类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public interface ImgTypeService {
	/**
	 * 创建图片所属类型
	 * @param request 图片所属类型请求对象
	 * @return ImgTypeResponse
	 */
	public Map<String,Object> insert(DtoImgType dtoImgType);
	
	/**
	 * 查询图片所属类型
	 * @param id 图片所属类型ID
	 * @return DubboQueryImgTypeResponse
	 */
	public DtoImgType selectByPrimaryKey(Long id);
	
	
	/**
	 * 删除图片所属类型
	 * @param DubboDelImgTypeRequest 图片所属类型ID
	 * @return DubboDelImgTypeResponse
	 */
	public int deleteByPrimaryKey(Long id);
	
	/**
	 * 更新图片所属类型
	 * @param DubboUpdateImgTypeRequest 图片所属类型VO
	 * @return DubboUpdateImgTypeResponse
	 */
	public int updateByPrimaryKeySelective(DtoImgType dtoImgType);
	
	/**
	 * 查询图片所属类型List
	 * @param DubboQueryImgListTypeRequest请求对象
	 * @return DubboQueryImgTypeListResponse
	 */
	public List<DtoImgType> queryImgTypeList(DtoImgType dtoImgType);
}
