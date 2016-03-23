/**   
* @Title: DubboNoteImgInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月20日 下午4:54:02 
* @version V0.1
*/
package com.ninesale.valinor.note.api.model.dto;

import java.util.List;

import org.dozer.Mapping;

import com.pubpi.common.model.BasicSeriModel;

/**
 * 笔记图片信息类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:09:02
 *
 */
public class DubboNoteImgInfo extends BasicSeriModel {
	private static final long serialVersionUID = 1L;
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
	private List<DubboImgTagInfo> imgTagInfoList;

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
	public void setManageUrl(String manageUrl) {
		this.manageUrl = manageUrl;
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
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
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
	 * @return the imgTagInfoList
	 */
	public List<DubboImgTagInfo> getImgTagInfoList() {
		return imgTagInfoList;
	}

	/**
	 * @param imgTagInfoList
	 *            the imgTagInfoList to set
	 */
	public void setImgTagInfoList(List<DubboImgTagInfo> imgTagInfoList) {
		this.imgTagInfoList = imgTagInfoList;
	}
}
