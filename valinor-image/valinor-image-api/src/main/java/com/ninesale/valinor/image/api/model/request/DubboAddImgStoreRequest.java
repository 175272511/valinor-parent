package com.ninesale.valinor.image.api.model.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 图片管理DTO类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboAddImgStoreRequest extends DubboBasicRequest {
	
	private static final long serialVersionUID = 6825114663109315171L;
	

	/**
	 * 图片类型ID
	 */
	@NotNull(message = "图片所属类型不能为空")
	private Integer typeId;
	/**
	 * 图片管理链接
	 */
	@NotNull(message = "图片管理链接不能为空")
	private String manageUrl;
	/**
	 * 图片下载链接
	 */
	@NotNull(message = "图片下载链接不能为空")
	private String downloadUrl;
	/**
	 * fileid
	 */
	@NotNull(message = "文件ID不能为空")
	private String fileId;
	/**
	 * 图片描述
	 */
	private String imageText;
	/**
	 * 创建时间 
	 */
	@NotNull(message = "创建时间不能为空")
	private Date createTime;
	
	/**
	 * 最后修改时间
	 */
	@NotNull(message = "最后修改时间不能为空")
	private Date updateTime;

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getManageUrl() {
		return manageUrl;
	}

	public void setManageUrl(String manageUrl) {
		this.manageUrl = manageUrl;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getImageText() {
		return imageText;
	}

	public void setImageText(String imageText) {
		this.imageText = imageText;
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
