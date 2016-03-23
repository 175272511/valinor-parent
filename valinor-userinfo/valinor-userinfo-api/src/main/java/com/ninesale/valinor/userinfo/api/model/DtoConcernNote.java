/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @author liuhui
 * 
 */
public class DtoConcernNote extends BasicSeriModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4981707303447753449L;

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
