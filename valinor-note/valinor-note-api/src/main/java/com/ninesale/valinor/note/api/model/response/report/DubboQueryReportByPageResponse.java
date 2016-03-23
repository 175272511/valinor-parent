package com.ninesale.valinor.note.api.model.response.report;

import java.util.List;

import com.ninesale.valinor.note.api.model.dto.DubboNoteReport;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/****
 * 查询检举信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class DubboQueryReportByPageResponse extends DubboBasicResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 检举信息
	 */
	private List<DubboNoteReport> reportList;
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
	public Integer getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}
	public List<DubboNoteReport> getReportList() {
		return reportList;
	}
	public void setReportList(List<DubboNoteReport> reportList) {
		this.reportList = reportList;
	}
	
}
