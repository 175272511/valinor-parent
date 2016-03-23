package com.ninesale.valinor.comment.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 添加笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:21
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboAddNoteRequest extends DubboBasicRequest {
	private static final long serialVersionUID = 1L;
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
	private List<String> tagList;

	/**
	 * 图片列表
	 */
	private List<DubboNoteImgInfo> imgList;

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
	 * @return the tagList
	 */
	public List<String> getTagList() {
		return tagList;
	}

	/**
	 * @param tagList
	 *            the tagList to set
	 */
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	/**
	 * @return the imgList
	 */
	public List<DubboNoteImgInfo> getImgList() {
		return imgList;
	}

	/**
	 * @param imgList
	 *            the imgList to set
	 */
	public void setImgList(List<DubboNoteImgInfo> imgList) {
		this.imgList = imgList;
	}
}
