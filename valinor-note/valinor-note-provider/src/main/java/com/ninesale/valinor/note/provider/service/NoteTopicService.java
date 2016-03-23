package com.ninesale.valinor.note.provider.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.note.provider.model.DtoNoteTopic;

/**
 * @des 基础信息-话题信息 服务接口类
 * @author fxj
 * @date 2015年11月3日10:26:04
 */
public interface NoteTopicService{
	
	/**
	 * 增加话题信息
	 * @param DubboNoteTopic
	 * @return Map<String,Object>
	 */
	public Map<String,Object> insert(DtoNoteTopic record);

	/**
	 * 修改话题信息
	 * @param DubboNoteTopic
	 * @return int
	 */
	public int updateByPrimaryKeySelective(DtoNoteTopic record);
	
	/**
	 * 查询话题信息
	 * @param DubboNoteTopic
	 * @return List<DubboNoteTopic>
	 */
	public List<DtoNoteTopic> queryTopicByPage(@Param("topic") DtoNoteTopic dtoBaseinfoBrand, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param DubboNoteTopic
	 * @return int
	 */
	public int queryTotalNumOfTopic(DtoNoteTopic brand);
}
