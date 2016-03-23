package com.ninesale.valinor.note.provider.model;

import java.util.Date;

import org.dozer.Mapping;

public class DtoAlbum {

	@Mapping(value = "albumId")
	private Long id;

	private Long userId;

	private String albumName;

	private String albumDesc;

	private Integer albumStatus;

	private Integer validFlag;

	private Date createTime;

	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getAlbumDesc() {
		return albumDesc;
	}

	public void setAlbumDesc(String albumDesc) {
		this.albumDesc = albumDesc;
	}

	public Integer getAlbumStatus() {
		return albumStatus;
	}

	public void setAlbumStatus(Integer albumStatus) {
		this.albumStatus = albumStatus;
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

	/**
	 * @return the validFlag
	 */
	public Integer getValidFlag() {
		return validFlag;
	}

	/**
	 * @param validFlag
	 *            the validFlag to set
	 */
	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}
}