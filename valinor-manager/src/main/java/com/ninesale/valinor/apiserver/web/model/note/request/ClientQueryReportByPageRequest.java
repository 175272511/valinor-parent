package com.ninesale.valinor.apiserver.web.model.note.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 查询品牌信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQueryReportByPageRequest extends ClientBasicRequest{
	/**
	 * 每页大小
	 */
	private Integer pageSize;
	/**
	 * 当前页码
	 */
	private Integer currentPage;
	/**
	 * 举报填写内容
	 */
	private String reportContent;
	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public String getReportContent() {
		return reportContent;
	}
	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}
	
	

	
}