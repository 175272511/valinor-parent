package com.ninesale.valinor.image.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 图片标签查询Request类 
 * 创建人：fuxingjian 
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryTagRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	private Long id;

	private Long tagTypeId;

	private String tagName;

	private String tagDesc;

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

}
