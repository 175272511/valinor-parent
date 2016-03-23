/**   
* @Title: DubboNoteImgInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月20日 下午4:54:02 
* @version V0.1
*/
package com.ninesale.valinor.comment.api.model;

import java.util.List;

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
	private String url;

	/**
	 * 图片下载URL,万象优图返回
	 */
	private String download_url;

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
	private List<DubboImgTagInfo> imgTagInfo;

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the download_url
	 */
	public String getDownload_url() {
		return download_url;
	}

	/**
	 * @param download_url
	 *            the download_url to set
	 */
	public void setDownload_url(String download_url) {
		this.download_url = download_url;
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
	 * @return the imgTagInfo
	 */
	public List<DubboImgTagInfo> getImgTagInfo() {
		return imgTagInfo;
	}

	/**
	 * @param imgTagInfo
	 *            the imgTagInfo to set
	 */
	public void setImgTagInfo(List<DubboImgTagInfo> imgTagInfo) {
		this.imgTagInfo = imgTagInfo;
	}
}
