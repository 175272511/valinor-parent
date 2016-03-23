package com.ninesale.valinor.image.api.model.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.pubpi.common.model.BasicSeriModel;

/**
 * 图片管理Entity类 创建人：fuxingjian 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboImg extends BasicSeriModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1564214145760581334L;

	/**
	 * 图片类型ID
	 */
	@NotNull(message = "图片类型ID不能为空")
	private Long typeId;

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
	 * 图片组合标签位置List
	 */
	private List<DubboImgTagGroup> imgTagGroupList;

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
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

	public List<DubboImgTagGroup> getImgTagGroupList() {
		return imgTagGroupList;
	}

	public void setImgTagGroupList(List<DubboImgTagGroup> imgTagGroupList) {
		this.imgTagGroupList = imgTagGroupList;
	}

}
