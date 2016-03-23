/**
 * 
 */
package com.ninesale.valinor.apiserver.web.common;

import javax.validation.constraints.Min;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author liuhui
 * 
 */
public class ClientBasicPageRequest extends ClientBasicRequest{
	

	@Min(value = 0, message = "pageSize不合法")
	private Integer pageSize;
	
	@Min(value = 0, message = "currentPage不合法")
	private Integer currentPage;
	
	private Integer beginId;
	
	public void initPage(){
		this.beginId = 0;
		if(pageSize != null && currentPage != null){
			this.beginId = (this.currentPage - 1) * this.pageSize;
		}
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
	
	public Integer getBeginId() {
		return beginId;
	}

	public void setBeginId(Integer beginId) {
		this.beginId = beginId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
