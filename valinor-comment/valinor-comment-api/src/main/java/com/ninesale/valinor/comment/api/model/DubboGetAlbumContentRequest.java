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
public class DubboGetAlbumContentRequest extends DubboBasicRequest {

	private Long albumId;

	/**
	 * @return the albumId
	 */
	public Long getAlbumId() {
		return albumId;
	}

	/**
	 * @param albumId
	 *            the albumId to set
	 */
	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}
}
