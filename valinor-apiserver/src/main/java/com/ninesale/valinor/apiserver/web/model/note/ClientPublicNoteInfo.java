/**   
* @Title: ClientPublicNoteInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月20日 下午6:55:47 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.note;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 公开笔记信息类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:09:40
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientPublicNoteInfo extends ClientNoteInfoWithNumInfo {

	/**
	 * 发布者用户id
	 */
	private Long userId;

	/**
	 * 发布者用户名称
	 */
	private String userName;

	/**
	 * 发布者头像
	 */
	private String userImg;

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userImg
	 */
	public String getUserImg() {
		return userImg;
	}

	/**
	 * @param userImg
	 *            the userImg to set
	 */
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
}
