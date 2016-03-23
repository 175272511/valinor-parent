/**   
* @Title: ClientAlbumInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月20日 下午6:55:47 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.note;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 笔记信息类，包含分享，点赞等的数量信息
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:09:17
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientNoteInfoWithNumInfo extends ClientBaseNoteInfo {

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

	private Integer praiseFlag = 0;

	private Integer collectFlag = 0;

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
