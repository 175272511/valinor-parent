/**
 * 
 */
package com.pubpi.valinor.dubbo.base.model;

/**
 * @author liuhui
 * 
 */
public class DubboBasicPageResponse extends DubboBasicResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -69953890804147110L;

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
	

}
