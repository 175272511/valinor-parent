/**
 * 
 */
package com.ninesale.valinor.apiserver.web.common;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author liuhui
 * 
 */
public class ClientBasicPageResponse extends ClientBasicResponse{
	

	private Integer pageSize;
	
	private Integer currentPage;
	
	private Integer totalNum;
	

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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
