package com.ninesale.valinor.apiserver.web.model.merchant;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 获取商户列表响应类
 * 
 * @author hawk
 *
 */
public class GetMerchantListResponse extends ClientBasicResponse {
	private Integer currentPage;

	private Long totalNum;

	private Integer pageSize;

	private List<MerchantInfo> data;

	public Integer getCurrentPage() {
		return currentPage;
	}

	public List<MerchantInfo> getData() {
		return data;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Long getTotalNum() {
		return totalNum;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setData(List<MerchantInfo> data) {
		this.data = data;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
