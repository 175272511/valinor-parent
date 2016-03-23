package com.ninesale.valinor.apiserver.web.model.baseinfo.vo;

import org.dozer.Mapping;

import com.pubpi.common.model.BasicModel;

public class ClientBaseinfoBrand extends BasicModel{
	
	@Mapping(value = "id")
	private Long brandId;

	private String brandNameCn;

	private String brandNameEn;

	private String brandNameFull;

	private Integer validFlag;

	private Long modifyUserId;

	private String modifyUserName;

	private Long createTime;

	private Long updateTime;

	public String getBrandNameCn() {
		return brandNameCn;
	}

	public void setBrandNameCn(String brandNameCn) {
		this.brandNameCn = brandNameCn;
	}

	public String getBrandNameEn() {
		return brandNameEn;
	}

	public void setBrandNameEn(String brandNameEn) {
		this.brandNameEn = brandNameEn;
	}

	public String getBrandNameFull() {
		return brandNameFull;
	}

	public void setBrandNameFull(String brandNameFull) {
		this.brandNameFull = brandNameFull;
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

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	
}