package com.ninesale.valinor.comment.provider.model;

import java.util.Date;

public class DtoNoteStatisticsInfo {
	private Long id;

	private Long noteId;

	private Integer shareNum;

	private Integer praiseNum;

	private Integer collectNum;

	private Integer commentNum;

	private Integer viewNum;

	private Date createTime;

	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNoteId() {
		return noteId;
	}

	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}

	public Integer getShareNum() {
		return shareNum;
	}

	public void setShareNum(Integer shareNum) {
		this.shareNum = shareNum;
	}

	public Integer getPraiseNum() {
		return praiseNum;
	}

	public void setPraiseNum(Integer praiseNum) {
		this.praiseNum = praiseNum;
	}

	public Integer getCollectNum() {
		return collectNum;
	}

	public void setCollectNum(Integer collectNum) {
		this.collectNum = collectNum;
	}

	public Integer getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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