package com.ninesale.valinor.apiserver.web.model.baseinfo.vo;

import org.dozer.Mapping;

import com.pubpi.common.model.BasicModel;

public class ClientBaseinfoCateg extends BasicModel{
	
	@Mapping(value="id")
	private Long categId;

	private String categName;

	private Integer categLevel;

	private Integer parentCategId;

	private Integer validFlag;

	private Long modifyUserId;

	private String modifyUserName;

	private Long createTime;

	private Long updateTime;


	public Long getCategId() {
		return categId;
	}

	public void setCategId(Long categId) {
		this.categId = categId;
	}

	public String getCategName() {
		return categName;
	}

	public void setCategName(String categName) {
		this.categName = categName;
	}

	public Integer getCategLevel() {
		return categLevel;
	}

	public void setCategLevel(Integer categLevel) {
		this.categLevel = categLevel;
	}

	public Integer getParentCategId() {
		return parentCategId;
	}

	public void setParentCategId(Integer parentCategId) {
		this.parentCategId = parentCategId;
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