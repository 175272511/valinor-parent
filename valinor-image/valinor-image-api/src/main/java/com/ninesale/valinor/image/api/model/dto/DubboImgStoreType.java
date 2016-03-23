package com.ninesale.valinor.image.api.model.dto;

import java.util.Date;

/**
 * 图片管理Entity类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
import com.pubpi.common.model.BasicSeriModel;

public class DubboImgStoreType extends BasicSeriModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1564214145760581334L;

	/**
	 * id主键
	 */
	private Long id;
	/**
	 * 图片管理链接
	 */
	private String manageUrl;
	/**
	 * 图片下载链接
	 */
	private String downloadUrl;
	/**
	 * fileid
	 */
	private String fileId;
	/**
	 * 图片描述
	 */
	private String imageText;
	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 最后修改时间
	 */
	private Date updateTime;

	/**
	 * 图片类型ID
	 */
	private DubboImgType dubboImgType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public DubboImgType getDubboImgType() {
		return dubboImgType;
	}

	public void setDubboImgType(DubboImgType dubboImgType) {
		this.dubboImgType = dubboImgType;
	}

}
