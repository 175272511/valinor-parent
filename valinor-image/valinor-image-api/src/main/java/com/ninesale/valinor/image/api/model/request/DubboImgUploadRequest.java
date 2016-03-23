package com.ninesale.valinor.image.api.model.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 图片管理DTO类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboImgUploadRequest extends DubboBasicRequest {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * 文件地址
	 */
	@NotNull(message = "文件地址不能为空")
	private String fileUrl = "D:/soft/123.jpg";
	
	/**
	 * 图片属性类型ID 
	 */
	@NotNull(message = "图片属性类型不能为空")
	private Integer typeId;
	
	/**
	 * 创建时间 
	 */
	@NotNull(message = "创建时间不能为空")
	private Date createTime;
	
	/**
	 * 图片描述
	 */
	private String imageText;
	
	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getImageText() {
		return imageText;
	}

	public void setImageText(String imageText) {
		this.imageText = imageText;
	}
	
}
