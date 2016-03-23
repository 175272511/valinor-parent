/**
 * 
 */
package com.ninesale.valinor.comment.api.model;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @author liuhui
 * 
 */
public class DubboPraiseRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7107038917227283335L;

	private Long userId;
	
	private Long noteId;
	
	private String noteTitle;

	public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

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
	
}
