package com.ninesale.valinor.baseinfo.api.model.response.addrtag;

import java.util.List;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboAddress2Tag;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/****
 * 查询购物地点标签信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class DubboQueryAddrTagByPageResponse extends DubboBasicResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 购物地点标签信息
	 */
	private List<DubboAddress2Tag> addrTagList;
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
	public List<DubboAddress2Tag> getAddrTagList() {
		return addrTagList;
	}
	public void setAddrTagList(List<DubboAddress2Tag> addrTagList) {
		this.addrTagList = addrTagList;
	}
	
	
}
