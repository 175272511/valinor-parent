package com.ninesale.valinor.image.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 图片管理DTO类 创建人：fuxingjian 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryImgStoreListRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

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

}
