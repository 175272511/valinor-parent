package com.ninesale.valinor.baseinfo.api.model.response.brandtag;

import java.util.List;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBrandTag;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/****
 * 查询品牌标签信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class DubboQueryBrandTagByPageResponse extends DubboBasicResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 品牌标签
	 */
	private List<DubboBrandTag> brandTagList;
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
	public List<DubboBrandTag> getBrandTagList() {
		return brandTagList;
	}
	public void setBrandTagList(List<DubboBrandTag> brandTagList) {
		this.brandTagList = brandTagList;
	}
	
}
