package com.ninesale.valinor.apiserver.web.model.note;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 用户获取自己的笔记返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:07:08
 *
 */
public class ClientGetMyNoteListNoteResponse extends ClientBasicResponse {

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;

	/**
	 * 笔记信息列表
	 */
	private List<ClientBaseNoteInfo> noteList;

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
	 * @return the noteList
	 */
	public List<ClientBaseNoteInfo> getNoteList() {
		return noteList;
	}

	/**
	 * @param noteList
	 *            the noteList to set
	 */
	public void setNoteList(List<ClientBaseNoteInfo> noteList) {
		this.noteList = noteList;
	}
}
