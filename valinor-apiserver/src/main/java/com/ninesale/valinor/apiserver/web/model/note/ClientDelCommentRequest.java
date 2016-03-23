package com.ninesale.valinor.apiserver.web.model.note;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * 删除笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:05:47
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientDelCommentRequest extends ClientBasicRequest {

	/**
	 * 评论id
	 */
	private Long commentId;

	/**
	 * @return the commentId
	 */
	public Long getCommentId() {
		return commentId;
	}

	/**
	 * @param commentId
	 *            the commentId to set
	 */
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}
}
