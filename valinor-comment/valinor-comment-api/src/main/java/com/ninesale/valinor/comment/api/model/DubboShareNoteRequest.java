package com.ninesale.valinor.comment.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 收藏笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:59
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboShareNoteRequest extends DubboBasicRequest {
	private static final long serialVersionUID = 1L;

	private Long userId;

	private Long noteId;

	private String shareDest;

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
	public Long getNoteId() {
		return noteId;
	}

	/**
	 * @param noteId
	 *            the noteId to set
	 */
	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}

	/**
	 * @return the shareDest
	 */
	public String getShareDest() {
		return shareDest;
	}

	/**
	 * @param shareDest
	 *            the shareDest to set
	 */
	public void setShareDest(String shareDest) {
		this.shareDest = shareDest;
	}
}
