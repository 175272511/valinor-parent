/**   
* @Title: ClientAlbumInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月20日 下午6:55:47 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.common.model.BasicModel;

/**
 * 笔记基础信息类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:47
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonNoteInfo extends BasicModel {

	/**
	 * 笔记ID
	 */
	private Long noteId;

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
	 * 笔记标题
	 */
	private String noteTitle;

	/**
	 * ClientPublicNoteInfo 笔记配文
	 */
	private String noteContent;

	/**
	 * 发布地址
	 */
	private String releasePlace;

	/**
	 * 标签列表
	 */
	private List<String> noteTagList;

	/**
	 * 笔记状态
	 */
	private Integer noteStatus;

	/**
	 * 图片id列表
	 */
	private List<Long> imgIdList;

	/**
	 * 图片列表
	 */
	private List<CommonNoteImgInfo> imgList;

	/**
	 * 分享数量
	 */
	private Integer shareNum = 0;
	/**
	 * 点赞数量
	 */
	private Integer praiseNum = 0;

	/**
	 * 收藏数量
	 */
	private Integer collectNum = 0;

	/**
	 * 评论数量
	 */
	private Integer commentNum = 0;

	/**
	 * 查看数量
	 */
	private Integer viewNum = 0;

	/**
	 * 赞标志
	 */
	private Integer praiseFlag = 0;

	/**
	 * 收藏标签
	 */
	private Integer collectFlag = 0;

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

	/**
	 * @return the noteTitle
	 */
	public String getNoteTitle() {
		return noteTitle;
	}

	/**
	 * @param noteTitle
	 *            the noteTitle to set
	 */
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

	/**
	 * @return the noteContent
	 */
	public String getNoteContent() {
		return noteContent;
	}

	/**
	 * @param noteContent
	 *            the noteContent to set
	 */
	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}

	/**
	 * @return the releasePlace
	 */
	public String getReleasePlace() {
		return releasePlace;
	}

	/**
	 * @param releasePlace
	 *            the releasePlace to set
	 */
	public void setReleasePlace(String releasePlace) {
		this.releasePlace = releasePlace;
	}

	/**
	 * @return the noteTagList
	 */
	public List<String> getNoteTagList() {
		return noteTagList;
	}

	/**
	 * @param noteTagList
	 *            the noteTagList to set
	 */
	public void setNoteTagList(List<String> noteTagList) {
		this.noteTagList = noteTagList;
	}

	/**
	 * @return the noteStatus
	 */
	public Integer getNoteStatus() {
		return noteStatus;
	}

	/**
	 * @param noteStatus
	 *            the noteStatus to set
	 */
	public void setNoteStatus(Integer noteStatus) {
		this.noteStatus = noteStatus;
	}

	/**
	 * @return the imgIdList
	 */
	public List<Long> getImgIdList() {
		return imgIdList;
	}

	/**
	 * @param imgIdList
	 *            the imgIdList to set
	 */
	public void setImgIdList(List<Long> imgIdList) {
		this.imgIdList = imgIdList;
	}

	/**
	 * @return the imgList
	 */
	public List<CommonNoteImgInfo> getImgList() {
		return imgList;
	}

	/**
	 * @param imgList
	 *            the imgList to set
	 */
	public void setImgList(List<CommonNoteImgInfo> imgList) {
		this.imgList = imgList;
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

	/**
	 * @return the praiseFlag
	 */
	public Integer getPraiseFlag() {
		return praiseFlag;
	}

	/**
	 * @param praiseFlag
	 *            the praiseFlag to set
	 */
	public void setPraiseFlag(Integer praiseFlag) {
		this.praiseFlag = praiseFlag;
	}

	/**
	 * @return the collectFlag
	 */
	public Integer getCollectFlag() {
		return collectFlag;
	}

	/**
	 * @param collectFlag
	 *            the collectFlag to set
	 */
	public void setCollectFlag(Integer collectFlag) {
		this.collectFlag = collectFlag;
	}
}
