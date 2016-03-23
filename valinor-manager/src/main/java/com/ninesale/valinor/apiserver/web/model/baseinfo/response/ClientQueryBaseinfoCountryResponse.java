package com.ninesale.valinor.apiserver.web.model.baseinfo.response;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.vo.ClientBaseinfoCountry;

/****
 * 查询国家信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQueryBaseinfoCountryResponse extends ClientBasicResponse {
	
	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 国家信息
	 */
	private List<ClientBaseinfoCountry> countryList;
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
	public List<ClientBaseinfoCountry> getCountryList() {
		return countryList;
	}
	public void setCountryList(List<ClientBaseinfoCountry> countryList) {
		this.countryList = countryList;
	}
	
	
}
