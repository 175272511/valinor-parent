package com.ninesale.valinor.baseinfo.provider.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoBrandTag;

/**
 * @des 基础信息-品牌标签信息 服务接口类
 * @author Zhoup
 * @date 2015年11月3日10:26:04
 */
public interface BrandTagService{
	
	/**
	 * 增加品牌标签信息
	 * @param DubboBrandTag
	 * @return Map<String,Object>
	 */
	public Map<String,Object> insert(DtoBrandTag dtoBrandTag);

	/**
	 * @param brandTag
	 * @param beginId
	 * @param pageSize
	 */
	List<DtoBrandTag> queryBrandTagByPage(@Param("brandTag") DtoBrandTag brandTag, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param DubboBrandTag
	 * @return
	 */
	int queryTotalNumOfBrandTag(DtoBrandTag dtoBrandTag);
	
	/**
	 * @param DubboBrandTag
	 * @return
	 */
	List<DtoBrandTag> queryBrandTagList(DtoBrandTag dtoBrandTag);
	
}
