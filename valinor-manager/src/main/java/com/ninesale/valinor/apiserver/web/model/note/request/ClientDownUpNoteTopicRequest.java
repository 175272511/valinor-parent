package com.ninesale.valinor.apiserver.web.model.note.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 禁用/启用话题信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientDownUpNoteTopicRequest extends ClientBasicRequest{
	/**
	 * validFlag：0：启用，1：禁用
	 */
	private Integer validFlag;
	/**
	 * 话题ID
	 */
	private Long topicId;
	public Integer getValidFlag() {
		return validFlag;
	}
	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}
	public Long getTopicId() {
		return topicId;
	}
	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	
	
}