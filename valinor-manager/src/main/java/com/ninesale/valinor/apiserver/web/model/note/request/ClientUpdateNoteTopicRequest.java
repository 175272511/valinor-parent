package com.ninesale.valinor.apiserver.web.model.note.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 更新名称信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientUpdateNoteTopicRequest extends ClientBasicRequest{
	
	/**
	 * topicId
	 */
	private Long topicId;
	/**
	 * 话题名称
	 */
	private String topicName;
	/**
	 * 话题描述
	 */
    private String topicDes;
	public Long getTopicId() {
		return topicId;
	}
	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDes() {
		return topicDes;
	}
	public void setTopicDes(String topicDes) {
		this.topicDes = topicDes;
	}
    
}