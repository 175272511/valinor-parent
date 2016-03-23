package com.ninesale.valinor.apiserver.web.model.item.vo;

import com.pubpi.common.model.BasicSeriModel;

/**
 * 图片管理Entity类 创建人：fuxingjian 创建时间：2015年10月28日 下午3:00:00
 */
public class ClientImg extends BasicSeriModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1564214145760581334L;

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

	
}
