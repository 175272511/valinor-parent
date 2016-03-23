package com.ninesale.valinor.image.api.model.dto;

/**
 * 图片管理Entity类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
import com.pubpi.common.model.BasicSeriModel;

public class DubboImgResInfo extends BasicSeriModel {

	private static final long serialVersionUID = 1L;

	/**
	 * imgId主键
	 */
	private Long imgId;
	/**
	 * fileid
	 */
	private String fileId;

	public Long getImgId() {
		return imgId;
	}

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
}
