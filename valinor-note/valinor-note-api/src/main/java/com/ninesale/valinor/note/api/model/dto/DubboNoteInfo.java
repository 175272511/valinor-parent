/**   
* @Title: DubboNoteInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月20日 下午6:55:47 
* @version V0.1
*/
package com.ninesale.valinor.note.api.model.dto;

import java.util.List;

import com.pubpi.common.model.BasicSeriModel;

/**
 * 公开笔记信息类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:09:40
 *
 */
public class DubboNoteInfo extends BasicSeriModel {
	private static final long serialVersionUID = 1L;
	/**
	 * 发布者用户id
	 */
	private Long userId;

	/**
	 * 笔记ID
	 */
	private Integer noteId;

	/**
	 * 笔记标题
	 */
	private String noteTitle;

	/**
	 * 笔记配文
	 */
	private String noteContent;

	/**
	 * 发布地址
	 */
	private String releasePlace;

	/**
	 * 标签列表
	 */
	private List<String> noteTagList;

	/**
	 * 笔记状态
	 */
	private Integer noteStatus;

	/**
	 * 图片列表
	 */
	private List<Long> imgIdList;

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
