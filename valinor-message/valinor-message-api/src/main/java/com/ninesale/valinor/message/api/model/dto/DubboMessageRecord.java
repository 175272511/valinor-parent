package com.ninesale.valinor.message.api.model.dto;

import java.util.Date;

/**
 * @des 短信记录Entity类
 * @author Zhoup
 * @date 2015年10月28日 下午3:00:00
 */
public class DubboMessageRecord {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1564214145760581334L;
	
	/**
	 * id主键
	 */
	private Integer id;
	/**
	 * 短信模板
	 */
	private Integer typeId;
	/**
	 * 短信内容
	 */
	private String manageUrl;
	/**
	 * 发送时间
	 */
	private String downloadUrl;
	/**
	 * 发送人姓名
	 */
	private String fileId;
	/**
	 * 创建时间 
	 */
	private Date createTime;
	
	/**
	 * 最后修改时间
	 */
	private Date updateTime;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
