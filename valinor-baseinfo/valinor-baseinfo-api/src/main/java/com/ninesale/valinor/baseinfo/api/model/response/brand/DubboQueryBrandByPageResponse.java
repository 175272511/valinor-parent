package com.ninesale.valinor.baseinfo.api.model.response.brand;

import java.util.List;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoBrand;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/****
 * 查询品牌信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class DubboQueryBrandByPageResponse extends DubboBasicResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 笔记信息
	 */
	private List<DubboBaseinfoBrand> brandList;
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
	public List<DubboBaseinfoBrand> getBrandList() {
		return brandList;
	}
	public void setBrandList(List<DubboBaseinfoBrand> brandList) {
		this.brandList = brandList;
	}
	
	
}
