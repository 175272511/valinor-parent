package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 查询国家信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQueryBaseinfoCountryRequest extends ClientBasicRequest{
	/**
	 * 每页大小
	 */
	private Integer pageSize;
	/**
	 * 当前页码
	 */
	private Integer currentPage;
	/**
	 * 中文名称
	 */
	private String countryNameCn;
	/**
	 * 英文名称
	 */
    private String countryNameEn;
    /**
	 * 国家编码
	 */
    private String countryCode;
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
	public String getCountryNameCn() {
		return countryNameCn;
	}
	public void setCountryNameCn(String countryNameCn) {
		this.countryNameCn = countryNameCn;
	}
	public String getCountryNameEn() {
		return countryNameEn;
	}
	public void setCountryNameEn(String countryNameEn) {
		this.countryNameEn = countryNameEn;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	
	
}