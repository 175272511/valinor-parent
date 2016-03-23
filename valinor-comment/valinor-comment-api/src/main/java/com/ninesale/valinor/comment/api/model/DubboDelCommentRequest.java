package com.ninesale.valinor.comment.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 删除笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:05:47
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboDelCommentRequest extends DubboBasicRequest {
	private static final long serialVersionUID = 1L;
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
