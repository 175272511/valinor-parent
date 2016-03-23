package com.ninesale.valinor.baseinfo.api.model.response.currency;

import java.util.List;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboCurrency;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/****
 * 查询币种信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class DubboQueryCurrencyByPageResponse extends DubboBasicResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 币种
	 */
	private List<DubboCurrency> currencyList;
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
	public List<DubboCurrency> getCurrencyList() {
		return currencyList;
	}
	public void setCurrencyList(List<DubboCurrency> currencyList) {
		this.currencyList = currencyList;
	}
	
}
