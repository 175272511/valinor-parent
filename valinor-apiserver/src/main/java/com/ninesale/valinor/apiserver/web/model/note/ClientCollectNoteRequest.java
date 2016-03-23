package com.ninesale.valinor.apiserver.web.model.note;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * 收藏笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:59
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientCollectNoteRequest extends ClientBasicRequest {

	private Long albumId;

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

	/**
	 * @return the albumId
	 */
	public Long getAlbumId() {
		return albumId;
	}

	/**
	 * @param albumId
	 *            the albumId to set
	 */
	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

}
