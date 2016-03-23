package com.ninesale.valinor.image.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.image.provider.model.DtoImgTagType;

/**
 * 图片标签类型接口类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月21日 下午2:00:00
 */
public interface ImgTagTypeService {
	/**
	 * 创建图片标签类型信息
	 * @param DtoImgTagType imgTagType 
	 * @return Map<String,Object> 主键ID&新增数量
	 */
	public Map<String,Object> insert(DtoImgTagType imgTagType);
	
	/**
	 * 查询图片标签类型List
	 * @param DtoImgTagType imgTagType
	 * @return List<DtoImgTagType> 标签类型VO集合
	 */
	public List<DtoImgTagType> queryImgTagTypeList(DtoImgTagType imgTagType);
	
}
