package com.ninesale.valinor.note.api.model.request.topic;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 禁用：基础信息-话题信息 Request类
 * @author Zhoup
 * @date 2015年11月4日10:28:51
 */
public class DubboDownUpTopicRequest extends DubboBasicRequest{

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 话题ID
	 */
	@NotNull(message = "话题ID不能为空")
	private long id;
	
	/**
	 * 是否有效
	 */
	@NotNull(message = "启用或是禁用标识不能为空")
	private Integer validFlag;
	
	/**
	 * 修改用户ID
	 */
	private Long modifyUserId;

	/**
	 * 修改用户名
	 */
	private String modifyUserName;
	
	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
