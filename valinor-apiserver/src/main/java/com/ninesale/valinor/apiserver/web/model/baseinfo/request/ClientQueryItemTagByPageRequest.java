package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 查询品牌信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientQueryItemTagByPageRequest extends ClientBasicRequest{
	/**
	 * 每页大小
	 */
	private Integer pageSize;
	/**
	 * 当前页码
	 */
	private Integer currentPage;
	/**
	 * 商品标签名称
	 */
	private String itemTagName;
	
	/**
	 * 品牌标签ID
	 */
	private Long brandTagId;
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
	public String getItemTagName() {
		return itemTagName;
	}
	public void setItemTagName(String itemTagName) {
		this.itemTagName = itemTagName;
	}
	public Long getBrandTagId() {
		return brandTagId;
	}
	public void setBrandTagId(Long brandTagId) {
		this.brandTagId = brandTagId;
	}
}