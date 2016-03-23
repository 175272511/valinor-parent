package com.ninesale.valinor.note.api.model.request.topic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * 
 * @date 2015年11月21日 下午2:06:53
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboQueryTopicByPageRequest extends DubboBasicPageRequest {
	private static final long serialVersionUID = 1L;
	/**
	 * 话题名称
	 */
	private String topicName;
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
}
