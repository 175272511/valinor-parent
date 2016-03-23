package com.ninesale.valinor.apiserver.web.model.note;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 获取评论列表返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:06:30
 *
 */
public class ClientGetCommentListResponse extends ClientBasicResponse {

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;

	/**
	 * 评论列表
	 */
	private List<ClientCommentInfo> commentList;

	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize
	 *            the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage
	 *            the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the totalNum
	 */
	public Integer getTotalNum() {
		return totalNum;
	}

	/**
	 * @param totalNum
	 *            the totalNum to set
	 */
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	/**
	 * @return the commentList
	 */
	public List<ClientCommentInfo> getCommentList() {
		return commentList;
	}

	/**
	 * @param commentList
	 *            the commentList to set
	 */
	public void setCommentList(List<ClientCommentInfo> commentList) {
		this.commentList = commentList;
	}
}
