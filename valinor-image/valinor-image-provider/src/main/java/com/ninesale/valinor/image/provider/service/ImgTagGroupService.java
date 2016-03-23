package com.ninesale.valinor.image.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.image.provider.model.DtoImgTagLocation;

/**
 * 图片标签定位接口类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月21日 下午2:00:00
 */
public interface ImgTagGroupService {
	/**
	 * 创建图片标签定位信息
	 * @param DtoImgTagLocation imgTagLocation
	 * @return Map<String,Object> 主键ID&记录数
	 */
	public Map<String,Object> insert(DtoImgTagLocation imgTagLocation);
	
	/**
	 * 删除图片标签定位信息
	 * @param Long id 图片ID
	 * @return int 删除图片信息
	 */
	public int deleteImgTagLocationByImgid(Long id);
	
	/**
	 * 查询图片标签定位信息列表
	 * @param List<Long> 标签IDList
	 * @return List<DtoImgTagLocation> 图片类型VO集合
	 */
	public List<DtoImgTagLocation> queryImgTagInfoList(List<Long> ids);
	
}
