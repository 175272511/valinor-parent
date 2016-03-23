package com.ninesale.valinor.note.api.model.request.note;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;
import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 用户获取自己的笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:06:53
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboGetMyNoteListNoteRequest extends DubboBasicPageRequest {
	private static final long serialVersionUID = 1L;

	/**
	 * 冗余id字段
	 */
	private Long noteId;

	/**
	 * 笔记状态
	 */
	private Integer noteStatus;

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

}
