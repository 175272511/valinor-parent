package com.ninesale.valinor.apiserver.web.model.item.reponse;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.item.vo.ClientResItem;

/****
 * 查询商品信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQueryItemByPageResponse extends ClientBasicResponse {
	
	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 商品信息
	 */
	private List<ClientResItem> itemList;
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
	public List<ClientResItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<ClientResItem> itemList) {
		this.itemList = itemList;
	}
	
}
