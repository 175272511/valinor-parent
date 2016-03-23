package com.ninesale.valinor.apiserver.web.model.note;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * 查询公开笔记列表
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:10:13
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientQueryPublicNoteListNoteRequest extends ClientBasicRequest {

	private Integer onlyFollowUser;

	private Integer pageSize;

	private Integer currentPage;

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
	 * @return the onlyFollowUser
	 */
	public Integer getOnlyFollowUser() {
		return onlyFollowUser;
	}

	/**
	 * @param onlyFollowUser
	 *            the onlyFollowUser to set
	 */
	public void setOnlyFollowUser(Integer onlyFollowUser) {
		this.onlyFollowUser = onlyFollowUser;
	}
}
