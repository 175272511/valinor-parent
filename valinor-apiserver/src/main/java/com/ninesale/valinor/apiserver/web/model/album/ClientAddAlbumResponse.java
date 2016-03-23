package com.ninesale.valinor.apiserver.web.model.album;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 添加评论返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:09
 *
 */
public class ClientAddAlbumResponse extends ClientBasicResponse {
	private ClientAlbumInfo albumInfo;

	/**
	 * @return the albumInfo
	 */
	public ClientAlbumInfo getAlbumInfo() {
		return albumInfo;
	}

	/**
	 * @param albumInfo
	 *            the albumInfo to set
	 */
	public void setAlbumInfo(ClientAlbumInfo albumInfo) {
		this.albumInfo = albumInfo;
	}
}
