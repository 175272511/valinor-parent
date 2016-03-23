package com.ninesale.valinor.apiserver.web.model.note;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * 评论笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:03:56
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientShareNoteRequest extends ClientBasicRequest {

	/**
	 * 笔记id
	 */
	private Long noteId;

	private String shareDest;

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
