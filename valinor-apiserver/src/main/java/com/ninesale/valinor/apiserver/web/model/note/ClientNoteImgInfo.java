/**   
* @Title: ClientNoteImgInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月20日 下午4:54:02 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.note;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.common.model.BasicModel;

/**
 * 笔记图片信息类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:09:02
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientNoteImgInfo extends BasicModel {

	private Long imgId;

	/**
	 * 图片管理URL,万象优图返回
	 */
	private String manageUrl;

	/**
	 * 图片下载URL,万象优图返回
	 */
	private String downloadUrl;

	/**
	 * 文件ID
	 */
	private String fileId;

	/**
	 * 图片配文
	 */
	private String imageText;

	/**
	 * 图片标签信息
	 */
	private List<ClientImgTagGroup> imgTagGroupList;

	/**
	 * @return the manageUrl
	 */
	public String getManageUrl() {
		return manageUrl;
	}

	/**
	 * @param manageUrl
	 *            the manageUrl to set
	 */
	public void setManageUrl(String url) {
		this.manageUrl = url;
	}

	/**
	 * @return the downloadUrl
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}

	/**
	 * @param downloadUrl
	 *            the downloadUrl to set
	 */
	public void setDownloadUrl(String download_url) {
		this.downloadUrl = download_url;
	}

	/**
	 * @return the fileId
	 */
	public String getFileId() {
		return fileId;
	}

	/**
	 * @param fileId
	 *            the fileId to set
	 */
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	/**
	 * @return the imageText
	 */
	public String getImageText() {
		return imageText;
	}

	/**
	 * @param imageText
	 *            the imageText to set
	 */
	public void setImageText(String imageText) {
		this.imageText = imageText;
	}

	/**
	 * @return the imgTagGroupList
	 */
	public List<ClientImgTagGroup> getImgTagGroupList() {
		return imgTagGroupList;
	}

	/**
	 * @param imgTagGroupList
	 *            the imgTagGroupList to set
	 */
	public void setImgTagGroupList(List<ClientImgTagGroup> imgTagGroupList) {
		this.imgTagGroupList = imgTagGroupList;
	}

	/**
	 * @return the imgId
	 */
	public Long getImgId() {
		return imgId;
	}

	/**
	 * @param imgId
	 *            the imgId to set
	 */
	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}
}
