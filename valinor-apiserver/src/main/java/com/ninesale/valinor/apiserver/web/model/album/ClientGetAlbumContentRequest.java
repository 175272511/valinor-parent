package com.ninesale.valinor.apiserver.web.model.album;

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
public class ClientGetAlbumContentRequest extends ClientBasicRequest {

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
