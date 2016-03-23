package com.ninesale.valinor.apiserver.web.model.baseinfo.vo;

import java.util.Date;

import org.dozer.Mapping;

import com.pubpi.common.model.BasicModel;

public class ClientBrandTag extends BasicModel {
	@Mapping(value = "id")
	private Long brandTagId;

	private String brandTagName;

	private Long imgId;

	private Long modifyUserId;

	private String modifyUserName;

	private Date createTime;

	private Date updateTime;

	public Long getBrandTagId() {
		return brandTagId;
	}

	public void setBrandTagId(Long brandTagId) {
		this.brandTagId = brandTagId;
	}

	public String getBrandTagName() {
		return brandTagName;
	}

	public void setBrandTagName(String brandTagName) {
		this.brandTagName = brandTagName;
	}

	public Long getImgId() {
		return imgId;
	}

	public void setImgId(Long imgId) {
		this.imgId = imgId;
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