package com.ninesale.valinor.baseinfo.provider.model;

import java.util.Date;
import java.util.List;

import com.pubpi.common.model.BasicModel;

public class DtoParentCateg extends BasicModel{
	
	private Long id;

	private String categName;

	private Integer categLevel;

	private Integer parentCategId;

	private Integer validFlag;

	private Long modifyUserId;

	private String modifyUserName;

	private Date createTime;

	private Date updateTime;
	
	private List<DtoBaseinfoCateg> subCateList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<DtoBaseinfoCateg> getSubCateList() {
		return subCateList;
	}

	public void setSubCateList(List<DtoBaseinfoCateg> subCateList) {
		this.subCateList = subCateList;
	}
	
}