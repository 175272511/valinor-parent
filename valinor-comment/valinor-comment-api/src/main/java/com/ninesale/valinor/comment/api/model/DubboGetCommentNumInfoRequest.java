package com.ninesale.valinor.comment.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 评论笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:03:56
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboGetCommentNumInfoRequest extends DubboBasicRequest {

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
