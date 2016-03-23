/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboConcernNoteRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2727466882460000078L;
	
	private Long userId;
	
	private Long noteId;
	
	private String noteTitle;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

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
