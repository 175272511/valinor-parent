package com.ninesale.valinor.image.api.model.request;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 图片类型Entity类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboUpdateImgTypeRequest extends DubboBasicRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1564214145760581334L;
	
	/**
	 * id主键
	 */
	@NotNull(message = "ID不能为空")
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
	 * 最后修改时间
	 */
	@NotNull(message = "更新日期不能为空")
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
