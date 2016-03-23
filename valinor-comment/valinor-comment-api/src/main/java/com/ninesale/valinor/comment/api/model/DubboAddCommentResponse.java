package com.ninesale.valinor.comment.api.model;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 添加评论返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:09
 *
 */
public class DubboAddCommentResponse extends DubboBasicResponse {
	private static final long serialVersionUID = 1L;
	/**
	 * 评论信息
	 */
	private DubboCommentInfo commentInfo;

	/**
	 * @return the commentInfo
	 */
	public DubboCommentInfo getCommentInfo() {
		return commentInfo;
	}

	/**
	 * @param commentInfo
	 *            the commentInfo to set
	 */
	public void setCommentInfo(DubboCommentInfo commentInfo) {
		this.commentInfo = commentInfo;
	}
}
