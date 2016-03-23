package com.ninesale.valinor.note.api.model.response.note;

import com.ninesale.valinor.note.api.model.dto.DubboNoteInfo;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 查询公开笔记信息返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:11:25
 *
 */
public class DubboQueryNoteByNoteIdResponse extends DubboBasicResponse {
	private static final long serialVersionUID = 1L;

	/**
	 * 笔记信息
	 */
	private DubboNoteInfo noteInfo;

	/**
	 * @return the noteInfo
	 */
	public DubboNoteInfo getNoteInfo() {
		return noteInfo;
	}

	/**
	 * @param noteInfo
	 *            the noteInfo to set
	 */
	public void setNoteInfo(DubboNoteInfo noteInfo) {
		this.noteInfo = noteInfo;
	}

}
