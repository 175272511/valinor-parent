package com.ninesale.valinor.image.provider.model;

import java.util.Date;
import java.util.List;

import org.dozer.Mapping;

import com.pubpi.common.model.BasicModel;

/**
 * 图片&图片类型&图片标签位置Entity类 创建人：fuxingjian 创建时间：2015年10月28日 下午3:00:00
 */
public class DtoImgStoreTypeLocation extends BasicModel{

	/**
	 * id主键
	 */
	@Mapping(value="imgId") 
	private Long id;
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
	private DtoImgType imgType;
	/**
	 * 标签位置集合
	 */
	private List<DtoImgTagLocation> imgTagGroupList; 
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public DtoImgType getImgType() {
		return imgType;
	}
	public void setImgType(DtoImgType imgType) {
		this.imgType = imgType;
	}
	/**
	 * @return the imgTagGroupList
	 */
	public List<DtoImgTagLocation> getImgTagGroupList() {
		return imgTagGroupList;
	}
	/**
	 * @param imgTagGroupList the imgTagGroupList to set
	 */
	public void setImgTagGroupList(List<DtoImgTagLocation> imgTagGroupList) {
		this.imgTagGroupList = imgTagGroupList;
	}
	
}
