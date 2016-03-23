package com.ninesale.valinor.note.api.model.request.note;

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
public class DubboCollectNoteRequest extends DubboBasicRequest {
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
