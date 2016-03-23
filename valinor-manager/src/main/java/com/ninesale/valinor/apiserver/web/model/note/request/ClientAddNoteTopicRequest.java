package com.ninesale.valinor.apiserver.web.model.note.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 添加话题信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddNoteTopicRequest extends ClientBasicRequest{
	/**
	 * 话题名称
	 */
	private String topicName;
	/**
	 * 话题描述
	 */
    private String topicDes;
    
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