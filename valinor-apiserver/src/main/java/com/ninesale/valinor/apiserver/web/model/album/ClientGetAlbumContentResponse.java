package com.ninesale.valinor.apiserver.web.model.album;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.note.ClientPublicNoteInfo;

/**
 * 添加评论返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:09
 *
 */
public class ClientGetAlbumContentResponse extends ClientBasicResponse {

	private List<ClientPublicNoteInfo> noteList;

	/**
	 * @return the noteList
	 */
	public List<ClientPublicNoteInfo> getNoteList() {
		return noteList;
	}

	/**
	 * @param noteList
	 *            the noteList to set
	 */
	public void setNoteList(List<ClientPublicNoteInfo> noteList) {
		this.noteList = noteList;
	}
}
