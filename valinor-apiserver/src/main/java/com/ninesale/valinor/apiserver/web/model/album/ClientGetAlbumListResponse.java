package com.ninesale.valinor.apiserver.web.model.album;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 添加评论返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:09
 *
 */
public class ClientGetAlbumListResponse extends ClientBasicResponse {

	private List<ClientAlbumInfo> privateAlbumList;

	private List<ClientAlbumInfo> publicAlbumList;

	/**
	 * @return the privateAlbumList
	 */
	public List<ClientAlbumInfo> getPrivateAlbumList() {
		return privateAlbumList;
	}

	/**
	 * @param privateAlbumList
	 *            the privateAlbumList to set
	 */
	public void setPrivateAlbumList(List<ClientAlbumInfo> privateAlbumList) {
		this.privateAlbumList = privateAlbumList;
	}

	/**
	 * @return the publicAlbumList
	 */
	public List<ClientAlbumInfo> getPublicAlbumList() {
		return publicAlbumList;
	}

	/**
	 * @param publicAlbumList
	 *            the publicAlbumList to set
	 */
	public void setPublicAlbumList(List<ClientAlbumInfo> publicAlbumList) {
		this.publicAlbumList = publicAlbumList;
	}
}
