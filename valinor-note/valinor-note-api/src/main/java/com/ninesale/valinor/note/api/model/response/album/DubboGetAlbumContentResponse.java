package com.ninesale.valinor.note.api.model.response.album;

import java.util.List;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 添加评论返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:09
 *
 */
public class DubboGetAlbumContentResponse extends DubboBasicResponse {

	private static final long serialVersionUID = 1L;

	private List<Long> noteIdList;

	/**
	 * @return the noteIdList
	 */
	public List<Long> getNoteIdList() {
		return noteIdList;
	}

	/**
	 * @param noteIdList
	 *            the noteIdList to set
	 */
	public void setNoteIdList(List<Long> noteIdList) {
		this.noteIdList = noteIdList;
	}

}
