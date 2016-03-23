package com.ninesale.valinor.apiserver.web.model.note;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * 评论笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:03:56
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientAddCommentRequest extends ClientBasicRequest {

	/**
	 * 笔记id
	 */
	private Long noteId;

	private List<Long> replyUserIdList;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * @return the noteId
	 */
	public Long getNoteId() {
		return noteId;
	}

	/**
	 * @param noteId
	 *            the noteId to set
	 */
	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the replyUserIdList
	 */
	public List<Long> getReplyUserIdList() {
		return replyUserIdList;
	}

	/**
	 * @param replyUserIdList
	 *            the replyUserIdList to set
	 */
	public void setReplyUserIdList(List<Long> replyUserIdList) {
		this.replyUserIdList = replyUserIdList;
	}
}
