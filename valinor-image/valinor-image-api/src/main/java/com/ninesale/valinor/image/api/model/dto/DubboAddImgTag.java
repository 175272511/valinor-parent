package com.ninesale.valinor.image.api.model.dto;

import com.pubpi.common.model.BasicSeriModel;

public class DubboAddImgTag extends BasicSeriModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8226970909064409958L;

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

}