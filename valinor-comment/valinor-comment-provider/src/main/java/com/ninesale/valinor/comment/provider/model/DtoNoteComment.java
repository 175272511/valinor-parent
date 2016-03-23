package com.ninesale.valinor.comment.provider.model;

import java.util.Date;
import java.util.List;

import org.dozer.Mapping;

public class DtoNoteComment {
	@Mapping(value = "commentId")
	private Long id;

	private Long userId;

	private List<Long> replyUserIdList;

	private String replyUserIdListStr;

	private List<String> replyUserNameList;

	private String replyUserNameListStr;

	private Long replyCommentId;

	private Integer noteId;

	private Integer validFlag;

	private Date createTime;

	private Date updateTime;

	private String content;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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

	/**
	 * @return the replyUserIdListStr
	 */
	public String getReplyUserIdListStr() {
		return replyUserIdListStr;
	}

	/**
	 * @param replyUserIdListStr
	 *            the replyUserIdListStr to set
	 */
	public void setReplyUserIdListStr(String replyUserIdListStr) {
		this.replyUserIdListStr = replyUserIdListStr;
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
	 * @return the replyUserNameListStr
	 */
	public String getReplyUserNameListStr() {
		return replyUserNameListStr;
	}

	/**
	 * @param replyUserNameListStr
	 *            the replyUserNameListStr to set
	 */
	public void setReplyUserNameListStr(String replyUserNameListStr) {
		this.replyUserNameListStr = replyUserNameListStr;
	}

	/**
	 * @return the replyCommentId
	 */
	public Long getReplyCommentId() {
		return replyCommentId;
	}

	/**
	 * @param replyCommentId
	 *            the replyCommentId to set
	 */
	public void setReplyCommentId(Long replyCommentId) {
		this.replyCommentId = replyCommentId;
	}

	/**
	 * @return the noteId
	 */
	public Integer getNoteId() {
		return noteId;
	}

	/**
	 * @param noteId
	 *            the noteId to set
	 */
	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
	}

	/**
	 * @return the validFlag
	 */
	public Integer getValidFlag() {
		return validFlag;
	}

	/**
	 * @param validFlag
	 *            the validFlag to set
	 */
	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
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

}