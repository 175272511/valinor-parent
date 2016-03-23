/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.NotNull;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * @author liuhui
 * 
 */
public class ClientConcernNoteRequest extends ClientBasicRequest{
	
	@NotNull(message = "笔记id不能为空")
	private Long noteId;
	
	private String noteTitle;

	public Long getNoteId() {
		return noteId;
	}

	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}

	public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	

}
