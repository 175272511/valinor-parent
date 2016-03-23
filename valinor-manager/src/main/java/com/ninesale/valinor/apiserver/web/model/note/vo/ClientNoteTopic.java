package com.ninesale.valinor.apiserver.web.model.note.vo;

import org.dozer.Mapping;

import com.pubpi.common.model.BasicModel;

public class ClientNoteTopic extends BasicModel{
	
	@Mapping(value="id")
    private Long topicId;

    private String topicName;

    private String topicDes;

    private Integer validFlag;

    private String modifyUserName;

    private Long createTime;

    private Long updateTime;

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

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}

	public String getModifyUserName() {
		return modifyUserName;
	}

	public void setModifyUserName(String modifyUserName) {
		this.modifyUserName = modifyUserName;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	
}