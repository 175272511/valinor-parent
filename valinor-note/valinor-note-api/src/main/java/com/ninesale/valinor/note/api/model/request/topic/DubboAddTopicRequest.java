package com.ninesale.valinor.note.api.model.request.topic;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 添加：基础信息-话题 Request类
 * @author Zhoup
 * @date 2015年11月2日12:00:59
 */
public class DubboAddTopicRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * 话题名称
	 */
	@NotNull(message = "话题名称不能为空")
	private String topicName;
	/**
	 * 话题描述
	 */
	private String topicDes;
	/**
	 * 修改用户ID
	 */
    private Long modifyUserId;
    /**
	 * 修改用户名称
	 */
    private String modifyUserName;
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
	public Long getModifyUserId() {
		return modifyUserId;
	}
	public void setModifyUserId(Long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}
	public String getModifyUserName() {
		return modifyUserName;
	}
	public void setModifyUserName(String modifyUserName) {
		this.modifyUserName = modifyUserName;
	}

}
