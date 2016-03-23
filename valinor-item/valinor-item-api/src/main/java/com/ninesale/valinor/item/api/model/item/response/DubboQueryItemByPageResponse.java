package com.ninesale.valinor.item.api.model.item.response;

import java.util.List;

import com.ninesale.valinor.item.api.model.item.dto.DubboItem;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/****
 * 查询商品信息Response
 * @author fxj
 * @date 2015年11月30日 上午11:00:00
 */
public class DubboQueryItemByPageResponse extends DubboBasicResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 商品信息
	 */
	private List<DubboItem> itemList;
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
	public List<DubboItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<DubboItem> itemList) {
		this.itemList = itemList;
	}
	
}
