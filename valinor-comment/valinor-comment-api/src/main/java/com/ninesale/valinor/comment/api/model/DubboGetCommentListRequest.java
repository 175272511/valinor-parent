package com.ninesale.valinor.comment.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * 获取笔记评论列表
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:06:14
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboGetCommentListRequest extends DubboBasicPageRequest {
	private static final long serialVersionUID = 1L;
	private Long noteId;

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
