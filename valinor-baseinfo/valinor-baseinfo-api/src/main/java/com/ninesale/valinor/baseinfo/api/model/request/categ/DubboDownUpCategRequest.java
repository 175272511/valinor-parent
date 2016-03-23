package com.ninesale.valinor.baseinfo.api.model.request.categ;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 禁用：基础信息-类目信息 Request类
 * @author Zhoup
 * @date 2015年11月4日10:28:51
 */
public class DubboDownUpCategRequest extends DubboBasicRequest{

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 类目ID
	 */
	@NotNull(message = "类目ID不能为空")
	private Long id;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	
}
