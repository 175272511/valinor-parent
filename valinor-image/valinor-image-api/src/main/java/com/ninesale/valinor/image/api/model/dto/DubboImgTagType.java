package com.ninesale.valinor.image.api.model.dto;

import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

public class DubboImgTagType extends BasicSeriModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6648811965982352297L;
	/**
	 * 主键ID
	 */
	private Long id;
	/**
	 * 标签类型名称
	 */
	private String typeName;
	/**
	 * 创建日期
	 */
	private Date createTime;
	/**
	 * 更新日期
	 */
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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