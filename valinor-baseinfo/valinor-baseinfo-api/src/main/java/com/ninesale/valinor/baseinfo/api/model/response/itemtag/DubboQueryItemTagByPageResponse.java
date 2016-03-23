package com.ninesale.valinor.baseinfo.api.model.response.itemtag;

import java.util.List;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboItem2Tag;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/****
 * 查询商品标签信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class DubboQueryItemTagByPageResponse extends DubboBasicResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 商品标签
	 */
	private List<DubboItem2Tag> itemTagList;
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
	public List<DubboItem2Tag> getItemTagList() {
		return itemTagList;
	}
	public void setItemTagList(List<DubboItem2Tag> itemTagList) {
		this.itemTagList = itemTagList;
	}
	
}
