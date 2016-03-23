package com.ninesale.valinor.baseinfo.provider.model;

import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoBaseinfoAddress extends BasicModel{
	
	private Long id;

	private String addressName;

	private Integer addressLevel;

	private String levelName;

	private Integer parentCategId;

	private Integer validFlag;

	private Long modifyUserId;

	private String modifyUserName;

	private Date createTime;

	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public Integer getAddressLevel() {
		return addressLevel;
	}

	public void setAddressLevel(Integer addressLevel) {
		this.addressLevel = addressLevel;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}