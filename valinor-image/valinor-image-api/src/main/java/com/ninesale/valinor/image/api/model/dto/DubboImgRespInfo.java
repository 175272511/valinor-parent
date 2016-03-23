package com.ninesale.valinor.image.api.model.dto;

import java.util.Date;
import java.util.List;

import com.pubpi.common.model.BasicSeriModel;

/**
 * 图片管理Entity类 创建人：fuxingjian 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboImgRespInfo extends BasicSeriModel {

	/**
	 * @Fields serialVersionUID : TODO(desc the field)
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * id主键
	 */
	private Long imgId;
	/**
	 * 图片类型ID
	 */
	private Long typeId;
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
	 * 图片类型
	 */
	private DubboImgType imgType;

	/**
	 * 图片组合标签位置集合
	 */
	private List<DubboImgTagGroupRespInfo> imgTagGroupList;

	/**
	 * @return the imgId
	 */
	public Long getImgId() {
		return imgId;
	}

	/**
	 * @param imgId
	 *            the imgId to set
	 */
	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	/**
	 * @return the typeId
	 */
	public Long getTypeId() {
		return typeId;
	}

	/**
	 * @param typeId
	 *            the typeId to set
	 */
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	/**
	 * @return the manageUrl
	 */
	public String getManageUrl() {
		return manageUrl;
	}

	/**
	 * @param manageUrl
	 *            the manageUrl to set
	 */
	public void setManageUrl(String manageUrl) {
		this.manageUrl = manageUrl;
	}

	/**
	 * @return the downloadUrl
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}

	/**
	 * @param downloadUrl
	 *            the downloadUrl to set
	 */
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	/**
	 * @return the fileId
	 */
	public String getFileId() {
		return fileId;
	}

	/**
	 * @param fileId
	 *            the fileId to set
	 */
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	/**
	 * @return the imageText
	 */
	public String getImageText() {
		return imageText;
	}

	/**
	 * @param imageText
	 *            the imageText to set
	 */
	public void setImageText(String imageText) {
		this.imageText = imageText;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the imgType
	 */
	public DubboImgType getImgType() {
		return imgType;
	}

	/**
	 * @param imgType
	 *            the imgType to set
	 */
	public void setImgType(DubboImgType imgType) {
		this.imgType = imgType;
	}

	/**
	 * @return the imgTagGroupList
	 */
	public List<DubboImgTagGroupRespInfo> getImgTagGroupList() {
		return imgTagGroupList;
	}

	/**
	 * @param imgTagGroupList
	 *            the imgTagGroupList to set
	 */
	public void setImgTagGroupList(List<DubboImgTagGroupRespInfo> imgTagGroupList) {
		this.imgTagGroupList = imgTagGroupList;
	}

}
