package com.ninesale.valinor.image.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.image.provider.model.DtoImgTag;
import com.ninesale.valinor.image.provider.model.DtoImgTagAndType;

/**
 * 图片标签接口类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月21日 下午2:00:00
 */
public interface ImgTagService {
	/**
	 * 创建图片标签信息
	 * @param DtoImgTag imgTag 
	 * @return Map<String,Object> 主键ID&新增记录数
	 */
	public Map<String,Object> insert(DtoImgTag imgTag);
	
	/**
	 * 查询图片标签List
	 * @param DtoImgTag imgTag
	 * @return List<DtoImgTag> 图片标签VO集合
	 */
	public List<DtoImgTag> queryImgTagList(DtoImgTag imgTag);
	
	/**
	 * 查询图片标签
	 * @param tagTypeId, tagName
	 * @return DtoImgTag 图片标签VO
	 */
	public DtoImgTag queryImgTag(Long tagTypeId,String tagName);
	
	/**
	 * 查询图片标签&图片类型List
	 * @param DtoImgTag imgTag
	 * @return List<DtoImgTag> 图片标签VO集合
	 */
	public List<DtoImgTagAndType> queryImgTagAndTypeList(List<Long> ids);
	
}
