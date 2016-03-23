package com.ninesale.valinor.note.api.service;

import com.ninesale.valinor.note.api.model.request.topic.DubboAddTopicRequest;
import com.ninesale.valinor.note.api.model.request.topic.DubboDownUpTopicRequest;
import com.ninesale.valinor.note.api.model.request.topic.DubboQueryTopicByPageRequest;
import com.ninesale.valinor.note.api.model.request.topic.DubboUpdateTopicRequest;
import com.ninesale.valinor.note.api.model.response.topic.DubboAddTopicResponse;
import com.ninesale.valinor.note.api.model.response.topic.DubboDownUpTopicResponse;
import com.ninesale.valinor.note.api.model.response.topic.DubboQueryTopicByPageResponse;
import com.ninesale.valinor.note.api.model.response.topic.DubboUpdateTopicResponse;

/**
 * @des 基础信息-话题 接口类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public interface DubboTopicService {
	/**
	 * 创建话题
	 * 
	 * @param request
	 *            话题类型请求对象
	 * @return TopicResponse
	 */
	public DubboAddTopicResponse insert(DubboAddTopicRequest dubboAddTopicRequest);

	/**
	 * 更新话题
	 * 
	 * @param DubboUpdateTopicRequest
	 *            话题ID
	 * @return DubboUpdateTopicResponse
	 */
	public DubboUpdateTopicResponse updateByPrimaryKeySelective(
			DubboUpdateTopicRequest dubboUpdateTopicRequest);
	
	/**
	 * 查询话题
	 * 
	 * @param DubboQueryTopicRequest
	 *            dubboQueryTopicRequest
	 * @return DubboQueryTopicResponse
	 */
	public DubboQueryTopicByPageResponse queryTopicByPage(
			DubboQueryTopicByPageRequest dubboQueryTopicByPageRequest);
	
	/**
	 * 禁用/启用话题信息
	 * 
	 * @param req
	 * @return
	 */
	public DubboDownUpTopicResponse downUpTopic(DubboDownUpTopicRequest req);

}
