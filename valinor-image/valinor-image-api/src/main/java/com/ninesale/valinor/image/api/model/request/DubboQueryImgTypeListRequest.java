package com.ninesale.valinor.image.api.model.request;

import java.util.Date;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 图片类型DTO类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryImgTypeListRequest extends DubboBasicRequest {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * id主键
	 */
	
	private Long id;
	/**
	 * 类型描述
	 */
	private String typeDesc;
	/**
	 * 用途描述
	 */
	private String remark;
	/**
	 * 创建时间 
	 */
	private Date createTime;
	
	/**
	 * 最后修改时间
	 */
	private Date updateTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeDesc() {
		return typeDesc;
	}

	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
