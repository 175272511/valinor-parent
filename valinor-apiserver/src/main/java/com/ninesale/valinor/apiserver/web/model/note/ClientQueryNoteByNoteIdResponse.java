package com.ninesale.valinor.apiserver.web.model.note;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 添加笔记返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:32
 *
 */
public class ClientQueryNoteByNoteIdResponse extends ClientBasicResponse {

	/**
	 * 笔记信息
	 */
	private ClientPublicNoteInfo noteInfo;

	/**
	 * @return the noteInfo
	 */
	public ClientPublicNoteInfo getNoteInfo() {
		return noteInfo;
	}

	/**
	 * @param noteInfo
	 *            the noteInfo to set
	 */
	public void setNoteInfo(ClientPublicNoteInfo noteInfo) {
		this.noteInfo = noteInfo;
	}
}
