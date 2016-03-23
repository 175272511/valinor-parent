package com.ninesale.valinor.apiserver.web.model.note;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 添加评论返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:09
 *
 */
public class ClientAddCommentResponse extends ClientBasicResponse {

	/**
	 * 评论信息
	 */
	private ClientCommentInfo commentInfo;

	/**
	 * @return the commentInfo
	 */
	public ClientCommentInfo getCommentInfo() {
		return commentInfo;
	}

	/**
	 * @param commentInfo
	 *            the commentInfo to set
	 */
	public void setCommentInfo(ClientCommentInfo commentInfo) {
		this.commentInfo = commentInfo;
	}
}
