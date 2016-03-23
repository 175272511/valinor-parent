package com.ninesale.valinor.image.api.model.dto;

import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

public class DubboImgTagAndType extends BasicSeriModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8226970909064409958L;
	/**
	 * 主键ID
	 */
	private Long id;
	/**
	 * 标签类型ID
	 */
	private Long tagTypeId;
	/**
	 * 标签名称
	 */
	private String tagName;
	/**
	 * 标签描述
	 */
	private String tagDesc;
	/**
	 * 创建日期
	 */
	private Date createTime;
	/**
	 * 更新日期
	 */
	private Date updateTime;
	/**
	 * 图片标签
	 */
	private DubboImgTagType imgTagType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTagTypeId() {
		return tagTypeId;
	}

	public void setTagTypeId(Long tagTypeId) {
		this.tagTypeId = tagTypeId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagDesc() {
		return tagDesc;
	}

	public void setTagDesc(String tagDesc) {
		this.tagDesc = tagDesc;
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

	public DubboImgTagType getImgTagType() {
		return imgTagType;
	}

	public void setImgTagType(DubboImgTagType imgTagType) {
		this.imgTagType = imgTagType;
	}

}