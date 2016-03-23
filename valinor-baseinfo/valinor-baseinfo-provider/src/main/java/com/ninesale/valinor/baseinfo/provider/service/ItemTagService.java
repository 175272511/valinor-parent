package com.ninesale.valinor.baseinfo.provider.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoItem2Tag;
import com.ninesale.valinor.baseinfo.provider.model.DtoItemTag;

/**
 * @des 基础信息-商品标签信息 服务接口类
 * @author Zhoup
 * @date 2015年11月3日10:26:04
 */
public interface ItemTagService{
	
	/**
	 * 增加商品标签信息
	 * @param DubboItemTag
	 * @return Map<String,Object>
	 */
	public Map<String,Object> insert(DtoItemTag dtoItemTag);

	/**
	 * @param brandTag
	 * @param beginId
	 * @param pageSize
	 */
	List<DtoItem2Tag> queryItemTagByPage(@Param("itemTag") DtoItemTag itemTag, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param DubboItemTag
	 * @return
	 */
	int queryTotalNumOfItemTag(DtoItemTag dtoItemTag);
	
	/**
	 * @param DubboItemTag
	 * @return
	 */
	List<DtoItemTag> queryItemTagList(DtoItemTag dtoItemTag);
	
}
