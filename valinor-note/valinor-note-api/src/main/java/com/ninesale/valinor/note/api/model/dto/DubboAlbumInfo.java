/**   
* @Title: DubboAlbumInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月20日 下午6:55:47 
* @version V0.1
*/
package com.ninesale.valinor.note.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.common.model.BasicSeriModel;

/**
 * 笔记基础信息类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:47
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboAlbumInfo extends BasicSeriModel {

	private Long albumId;

	private String albumName;

	private String albumDesc;

	private Integer albumStatus;

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
