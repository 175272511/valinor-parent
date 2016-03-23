package com.ninesale.valinor.note.api.model.response.album;

import java.util.List;

import com.ninesale.valinor.note.api.model.dto.DubboAlbumInfo;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 添加评论返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:09
 *
 */
public class DubboGetAlbumListResponse extends DubboBasicResponse {

	private List<DubboAlbumInfo> privateAlbumList;

	private List<DubboAlbumInfo> publicAlbumList;

	/**
	 * @return the privateAlbumList
	 */
	public List<DubboAlbumInfo> getPrivateAlbumList() {
		return privateAlbumList;
	}

	/**
	 * @param privateAlbumList
	 *            the privateAlbumList to set
	 */
	public void setPrivateAlbumList(List<DubboAlbumInfo> privateAlbumList) {
		this.privateAlbumList = privateAlbumList;
	}

	/**
	 * @return the publicAlbumList
	 */
	public List<DubboAlbumInfo> getPublicAlbumList() {
		return publicAlbumList;
	}

	/**
	 * @param publicAlbumList
	 *            the publicAlbumList to set
	 */
	public void setPublicAlbumList(List<DubboAlbumInfo> publicAlbumList) {
		this.publicAlbumList = publicAlbumList;
	}
}
