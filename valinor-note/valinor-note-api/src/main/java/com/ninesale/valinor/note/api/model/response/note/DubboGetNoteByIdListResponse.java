package com.ninesale.valinor.note.api.model.response.note;

import java.util.List;

import com.ninesale.valinor.note.api.model.dto.DubboNoteInfo;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 用户获取自己的笔记返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:07:08
 *
 */
public class DubboGetNoteByIdListResponse extends DubboBasicResponse {
	private static final long serialVersionUID = 1L;

	/**
	 * 笔记信息列表
	 */
	private List<DubboNoteInfo> noteList;

	/**
	 * @return the noteList
	 */
	public List<DubboNoteInfo> getNoteList() {
		return noteList;
	}

	/**
	 * @param noteList
	 *            the noteList to set
	 */
	public void setNoteList(List<DubboNoteInfo> noteList) {
		this.noteList = noteList;
	}
}
