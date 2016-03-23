package com.ninesale.valinor.note.api.model.response.album;

import com.ninesale.valinor.note.api.model.dto.DubboAlbumInfo;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 添加评论返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:09
 *
 */
public class DubboAddAlbumResponse extends DubboBasicResponse {
	private DubboAlbumInfo albumInfo;

	/**
	 * @return the albumInfo
	 */
	public DubboAlbumInfo getAlbumInfo() {
		return albumInfo;
	}

	/**
	 * @param albumInfo
	 *            the albumInfo to set
	 */
	public void setAlbumInfo(DubboAlbumInfo albumInfo) {
		this.albumInfo = albumInfo;
	}
}
