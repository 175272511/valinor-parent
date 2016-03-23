/**   
* @Title: ClientCommentInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月21日 上午11:40:04 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.note;

import java.util.List;

import org.dozer.Mapping;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.model.common.ClientReplyUser;
import com.pubpi.common.model.BasicModel;

/**
 * 评论信息基础类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:05:25
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientCommentInfo extends BasicModel {

	/**
	 * 评论id
	 */
	private Long commentId;

	/**
	 * 用户id
	 */
	private Long userId;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 用户图片
	 */
	private String userImg;

	/**
	 * 回复联系人列表
	 */
	private List<ClientReplyUser> replyUserList;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 创建时间
	 */
	@Mapping
	private Long createTime;

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
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the userName to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the createTime
	 */
	public Long getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the commentId
	 */
	public Long getCommentId() {
		return commentId;
	}

	/**
	 * @param commentId
	 *            the commentId to set
	 */
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
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

	/**
	 * @return the replyUserList
	 */
	public List<ClientReplyUser> getReplyUserList() {
		return replyUserList;
	}

	/**
	 * @param replyUserList
	 *            the replyUserList to set
	 */
	public void setReplyUserList(List<ClientReplyUser> replyUserList) {
		this.replyUserList = replyUserList;
	}
}
