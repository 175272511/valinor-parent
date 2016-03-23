/**   
* @Title: DubboCommentInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月21日 上午11:40:04 
* @version V0.1
*/
package com.ninesale.valinor.comment.api.model;

import java.util.Date;
import java.util.List;

import com.pubpi.common.model.BasicSeriModel;

/**
 * 评论信息基础类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:05:25
 *
 */
public class DubboCommentInfo extends BasicSeriModel {

	private static final long serialVersionUID = 1L;

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
	private String userName;

	private List<Long> replyUserIdList;

	/**
	 * 回复用户列表
	 */
	private List<String> replyUserNameList;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 创建时间
	 */
	private Date createTime;

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
	 * @return the replyUserNameList
	 */
	public List<String> getReplyUserNameList() {
		return replyUserNameList;
	}

	/**
	 * @param replyUserNameList
	 *            the replyUserNameList to set
	 */
	public void setReplyUserNameList(List<String> replyUserNameList) {
		this.replyUserNameList = replyUserNameList;
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
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
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
	 * @return the replyUserIdList
	 */
	public List<Long> getReplyUserIdList() {
		return replyUserIdList;
	}

	/**
	 * @param replyUserIdList
	 *            the replyUserIdList to set
	 */
	public void setReplyUserIdList(List<Long> replyUserIdList) {
		this.replyUserIdList = replyUserIdList;
	}
}
