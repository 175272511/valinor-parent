package com.ninesale.valinor.apiserver.web.model.note;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * 查询公开笔记列表
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:10:13
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientQueryNoteByNoteIdRequest extends ClientBasicRequest {

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
