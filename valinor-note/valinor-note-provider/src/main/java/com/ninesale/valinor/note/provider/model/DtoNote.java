package com.ninesale.valinor.note.provider.model;

import java.util.Date;
import java.util.List;

import org.dozer.Mapping;

import com.pubpi.common.model.BasicModel;

public class DtoNote extends BasicModel {
	private Long id;

	private Long userId;

	private String noteTitle;

	private String noteContent;

	private String releasePlace;

	private List<Long> imgIdList;

	private String imgIdlistStr;

	private List<String> noteTagList;

	private String noteTagListStr;

	private Integer noteStatus;

	private Date createTime;

	private Date updateTime;

	/**
	 * @return the id
	 */
	@Mapping("noteId")
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the noteContent
	 */
	public String getNoteContent() {
		return noteContent;
	}

	/**
	 * @param noteContent
	 *            the noteContent to set
	 */
	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}

	/**
	 * @return the releasePlace
	 */
	public String getReleasePlace() {
		return releasePlace;
	}

	/**
	 * @param releasePlace
	 *            the releasePlace to set
	 */
	public void setReleasePlace(String releasePlace) {
		this.releasePlace = releasePlace;
	}

	/**
	 * @return the imgIdlistStr
	 */
	public String getImgIdlistStr() {
		return imgIdlistStr;
	}

	/**
	 * @param imgIdlistStr
	 *            the imgIdlistStr to set
	 */
	public void setImgIdlistStr(String imgIdlistStr) {
		this.imgIdlistStr = imgIdlistStr;
	}

	/**
	 * @return the noteTagListStr
	 */
	public String getNoteTagListStr() {
		return noteTagListStr;
	}

	/**
	 * @param noteTagListStr
	 *            the noteTagListStr to set
	 */
	public void setNoteTagListStr(String noteTagListStr) {
		this.noteTagListStr = noteTagListStr;
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
	 * @return the imgIdList
	 */
	public List<Long> getImgIdList() {
		return imgIdList;
	}

	/**
	 * @param imgIdList
	 *            the imgIdList to set
	 */
	public void setImgIdList(List<Long> imgIdList) {
		this.imgIdList = imgIdList;
	}

	/**
	 * @return the noteTagList
	 */
	public List<String> getNoteTagList() {
		return noteTagList;
	}

	/**
	 * @param noteTagList
	 *            the noteTagList to set
	 */
	public void setNoteTagList(List<String> noteTagList) {
		this.noteTagList = noteTagList;
	}

	/**
	 * @return the noteStatus
	 */
	public Integer getNoteStatus() {
		return noteStatus;
	}

	/**
	 * @param noteStatus
	 *            the noteStatus to set
	 */
	public void setNoteStatus(Integer noteStatus) {
		this.noteStatus = noteStatus;
	}

	/**
	 * @return the noteTitle
	 */
	public String getNoteTitle() {
		return noteTitle;
	}

	/**
	 * @param noteTitle
	 *            the noteTitle to set
	 */
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
}