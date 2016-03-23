/**   
* @Title: ClientReplyUser.java 
* @Package com.ninesale.valinor.apiserver.web.model.common 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年12月3日 下午4:30:03 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.common;

import org.dozer.Mapping;

import com.pubpi.common.model.BasicModel;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年12月3日 下午4:30:03
 * 
 */
public class ClientReplyUser extends BasicModel {

	@Mapping(value = "id")
	private Long userId;

	private String username;

	private String nickname;

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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname
	 *            the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
