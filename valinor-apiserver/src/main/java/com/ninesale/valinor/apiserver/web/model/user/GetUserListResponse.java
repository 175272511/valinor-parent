package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 
 * @author hawk
 *
 */
public class GetUserListResponse extends ClientBasicResponse {
	private List<UserInfo> data;

	private Integer currentPage;

	private Long totalNum;

	private Integer pageSize;

	public Integer getCurrentPage() {
		return currentPage;
	}

	public List<UserInfo> getData() {
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

	public void setData(List<UserInfo> data) {
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
