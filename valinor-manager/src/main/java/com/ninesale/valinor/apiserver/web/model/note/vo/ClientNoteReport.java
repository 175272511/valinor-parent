package com.ninesale.valinor.apiserver.web.model.note.vo;

import org.dozer.Mapping;

import com.pubpi.common.model.BasicModel;

public class ClientNoteReport extends BasicModel{
	
	@Mapping(value = "id")
    private Long reportedId;

    private String reportedName;

    private String publisherName;

    private String reportContent;

    private Integer reportProductType;

    private String productTitle;

    private Long createTime;

    private Long updateTime;

	public Long getReportedId() {
		return reportedId;
	}

	public void setReportedId(Long reportedId) {
		this.reportedId = reportedId;
	}

	public String getReportedName() {
		return reportedName;
	}

	public void setReportedName(String reportedName) {
		this.reportedName = reportedName;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getReportContent() {
		return reportContent;
	}

	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}

	public Integer getReportProductType() {
		return reportProductType;
	}

	public void setReportProductType(Integer reportProductType) {
		this.reportProductType = reportProductType;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

}