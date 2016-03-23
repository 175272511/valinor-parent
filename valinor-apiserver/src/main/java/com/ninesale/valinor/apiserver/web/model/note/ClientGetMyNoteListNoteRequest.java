package com.ninesale.valinor.apiserver.web.model.note;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * 用户获取自己的笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:06:53
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientGetMyNoteListNoteRequest extends ClientBasicRequest {

	/**
	 * 笔记状态
	 */
	private Integer noteStatus;

	private Integer pageSize;

	private Integer currentPage;

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
}
