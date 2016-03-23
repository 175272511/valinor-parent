package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 查询币种信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientQueryCurrencyByPageRequest extends ClientBasicRequest{
	/**
	 * 每页大小
	 */
	private Integer pageSize;
	/**
	 * 当前页码
	 */
	private Integer currentPage;
	/**
	 * 币种名称
	 */
	private String currencyName;
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
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
}