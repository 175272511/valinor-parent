package com.ninesale.valinor.baseinfo.api.model.response.country;

import java.util.List;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoCountry;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/****
 * 查询国家信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class DubboQueryCountryByPageResponse extends DubboBasicResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 国家信息
	 */
	private List<DubboBaseinfoCountry> countryList;
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
	public List<DubboBaseinfoCountry> getCountryList() {
		return countryList;
	}
	public void setCountryList(List<DubboBaseinfoCountry> countryList) {
		this.countryList = countryList;
	}
	
}
