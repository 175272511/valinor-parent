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

import com.pubpi.common.model.BasicSeriModel;

/**
 * 赞基础信息类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年12月5日 上午11:53:57
 *
 */
public class DubboPraiseInfo extends BasicSeriModel {

	private static final long serialVersionUID = 1L;

	private Long praiseId;

	private Long userId;

	private Long noteId;

	private Date createTime;

	private Date updateTime;

	/**
	 * @return the praiseId
	 */
	public Long getPraiseId() {
		return praiseId;
	}

	/**
	 * @param praiseId
	 *            the praiseId to set
	 */
	public void setPraiseId(Long praiseId) {
		this.praiseId = praiseId;
	}

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
	 * @return the noteId
	 */
	public Long getNoteId() {
		return noteId;
	}

	/**
	 * @param noteId
	 *            the noteId to set
	 */
	public void setNoteId(Long noteId) {
		this.noteId = noteId;
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
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
