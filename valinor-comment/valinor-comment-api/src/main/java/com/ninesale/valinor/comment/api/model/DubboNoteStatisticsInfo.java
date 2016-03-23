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
public class DubboNoteStatisticsInfo extends BasicSeriModel {

	private static final long serialVersionUID = 1L;

	private Long noteId;

	private Integer shareNum;

	private Integer praiseNum;

	private Integer collectNum;

	private Integer commentNum;

	private Integer viewNum;

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
	 * @return the shareNum
	 */
	public Integer getShareNum() {
		return shareNum;
	}

	/**
	 * @param shareNum
	 *            the shareNum to set
	 */
	public void setShareNum(Integer shareNum) {
		this.shareNum = shareNum;
	}

	/**
	 * @return the praiseNum
	 */
	public Integer getPraiseNum() {
		return praiseNum;
	}

	/**
	 * @param praiseNum
	 *            the praiseNum to set
	 */
	public void setPraiseNum(Integer praiseNum) {
		this.praiseNum = praiseNum;
	}

	/**
	 * @return the collectNum
	 */
	public Integer getCollectNum() {
		return collectNum;
	}

	/**
	 * @param collectNum
	 *            the collectNum to set
	 */
	public void setCollectNum(Integer collectNum) {
		this.collectNum = collectNum;
	}

	/**
	 * @return the commentNum
	 */
	public Integer getCommentNum() {
		return commentNum;
	}

	/**
	 * @param commentNum
	 *            the commentNum to set
	 */
	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	/**
	 * @return the viewNum
	 */
	public Integer getViewNum() {
		return viewNum;
	}

	/**
	 * @param viewNum
	 *            the viewNum to set
	 */
	public void setViewNum(Integer viewNum) {
		this.viewNum = viewNum;
	}

}
