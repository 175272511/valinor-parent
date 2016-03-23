/**
 * 
 */
package com.pubpi.valinor.dubbo.base.model;

/**
 * @author liuhui
 * 
 */
public class DubboBasicPageRequest extends DubboBasicRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -69953890804147110L;

	private Integer pageSize;

	private Integer currentPage;

	private Integer beginId;

	public void initPage() {
		this.beginId = 0;
		if (pageSize != null && currentPage != null) {
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

		if (null == beginId) {
			initPage();
		}
		return beginId;
	}

	public void setBeginId(Integer beginId) {
		this.beginId = beginId;
	}

}
