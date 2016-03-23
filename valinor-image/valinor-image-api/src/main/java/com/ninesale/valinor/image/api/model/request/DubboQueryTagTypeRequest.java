package com.ninesale.valinor.image.api.model.request;

import java.util.Date;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 图片管理DTO类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryTagTypeRequest extends DubboBasicRequest {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private Long id;

    private String typeName;

    private Date createTime;

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
