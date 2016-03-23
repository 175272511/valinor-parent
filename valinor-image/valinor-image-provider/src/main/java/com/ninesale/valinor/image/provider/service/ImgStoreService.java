package com.ninesale.valinor.image.provider.service;

import java.util.List;
import java.util.Map;

import com.ninesale.valinor.image.provider.model.DtoImgStore;
import com.ninesale.valinor.image.provider.model.DtoImgStoreType;
import com.ninesale.valinor.image.provider.model.DtoImgStoreTypeLocation;

/**
 * 图片管理接口类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public interface ImgStoreService {
	/**
	 * 创建图片信息
	 * @param request 创建图片信息请求对象
	 * @return ImgStoreResponse
	 */
	public Map<String,Object> insert(DtoImgStore imgStore);
	
	/**
	 * 查询图片信息
	 * @param dubboQueryImgStoreRequest 图片信息ID
	 * @return DubboQueryImgStoreResponse
	 */
	public DtoImgStore selectByPrimaryKey(Long id);
	
	/**
	 * 查询图片List
	 * @param dubboQueryImgStoreListRequest idList请求对象
	 * @return DubboQueryImgStoreListResponse
	 */
	public List<DtoImgStore> queryImgStoreList(DtoImgStore imgStore);
	
	/**
	 * 删除图片信息
	 * @param dubboDelImgStoreRequest 图片信息ID
	 * @return DubboDelImgStoreResponse
	 */
	public int deleteByPrimaryKey(Long id);
	
	/**
	 * 删除图片信息列表
	 * @param dubboDelImgStoreListRequest 图片信息IDList
	 * @return DubboDelImgStoreResponse
	 */
	public int deleteImgStoreByIds(List<Long> ids);
	
	/**
	 * 查询图片信息列表
	 * @param List<Long> 图片信息IDList
	 * @return List<DtoImgStoreType>
	 */
	public List<DtoImgStoreType> queryImgStoreTypeList(List<Long> ids);
	
	/**
	 * 查询图片&图片类型&图片标签位置信息列表
	 * @param DtoImgStore imgStore
	 * @return List<DtoImgStoreTypeLocation>
	 */
	public List<DtoImgStoreTypeLocation> queryImgLocationList(List<Long> ids);
	
	/***
	 * 主键更新图片描述信息
	 * @param record
	 * @return
	 */
	public int updateByPrimaryKeySelective(DtoImgStore record);
	
}
