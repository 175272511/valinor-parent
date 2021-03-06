package com.ninesale.valinor.note.api.model.request.note;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 公开笔记类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:11:41
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboUpdateNoteRequest extends DubboBasicRequest {
	private static final long serialVersionUID = 1L;
	/**
	 * 笔记ID
	 */
	private Integer noteId;
	/**
	 * 笔记标题
	 */
	private String noteTitle;

	/**
	 * 笔记描述
	 */
	private String noteContent;

	/**
	 * 笔记状态 0:公开 1：私有
	 */
	private Integer noteStatus;

	/**
	 * 发布位置
	 */
	private String releasePlace;

	/**
	 * 标签列表
	 */
	private List<String> noteTagList;

	/**
	 * 图片id列表
	 */
	private List<Long> imgIdList;

	/**
	 * @return the noteId
	 */
	public Integer getNoteId() {
		return noteId;
	}

	/**
	 * @param noteId
	 *            the noteId to set
	 */
	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
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
}
