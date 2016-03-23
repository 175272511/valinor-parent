package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 查询购物地点标签Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientQueryAddressTagByPageRequest extends ClientBasicRequest{
	/**
	 * 每页大小
	 */
	private Integer pageSize;
	/**
	 * 当前页码
	 */
	private Integer currentPage;
	/**
	 * 购物地点标签名称
	 */
	private String addrTagName;
	
	/**
	 * 国家或是城市ID
	 */
	private Long countryCityId;
	
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
	public String getAddrTagName() {
		return addrTagName;
	}
	public void setAddrTagName(String addrTagName) {
		this.addrTagName = addrTagName;
	}
	public Long getCountryCityId() {
		return countryCityId;
	}
	public void setCountryCityId(Long countryCityId) {
		this.countryCityId = countryCityId;
	}
	
}