package com.ninesale.valinor.comment.api.model;

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
public class DubboGetPraiseAndCollectRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 1L;

	private Long userId;

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
