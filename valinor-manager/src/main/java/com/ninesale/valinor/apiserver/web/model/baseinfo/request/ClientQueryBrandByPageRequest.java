package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 查询品牌信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientQueryBrandByPageRequest extends ClientBasicRequest{
	/**
	 * 每页大小
	 */
	private Integer pageSize;
	/**
	 * 当前页码
	 */
	private Integer currentPage;
	/**
	 * 品牌搜索字段
	 */
	private String brandNameCn;

	public String getBrandNameCn() {
		return brandNameCn;
	}

	public void setBrandNameCn(String brandNameCn) {
		this.brandNameCn = brandNameCn;
	}

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
	
}