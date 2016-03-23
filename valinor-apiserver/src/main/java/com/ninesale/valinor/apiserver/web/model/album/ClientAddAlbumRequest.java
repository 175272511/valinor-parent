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
public class ClientAddAlbumRequest extends ClientBasicRequest {

	private String albumName;

	private String albumDesc;

	private Integer albumStatus;

	/**
	 * @return the albumName
	 */
	public String getAlbumName() {
		return albumName;
	}

	/**
	 * @param albumName
	 *            the albumName to set
	 */
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	/**
	 * @return the albumDesc
	 */
	public String getAlbumDesc() {
		return albumDesc;
	}

	/**
	 * @param albumDesc
	 *            the albumDesc to set
	 */
	public void setAlbumDesc(String albumDesc) {
		this.albumDesc = albumDesc;
	}

	/**
	 * @return the albumStatus
	 */
	public Integer getAlbumStatus() {
		return albumStatus;
	}

	/**
	 * @param albumStatus
	 *            the albumStatus to set
	 */
	public void setAlbumStatus(Integer albumStatus) {
		this.albumStatus = albumStatus;
	}
}
