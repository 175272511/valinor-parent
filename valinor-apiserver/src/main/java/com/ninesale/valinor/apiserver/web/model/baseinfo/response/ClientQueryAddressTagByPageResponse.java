package com.ninesale.valinor.apiserver.web.model.baseinfo.response;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.vo.ClientAddress2Tag;

/****
 * 查询购物地点信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQueryAddressTagByPageResponse extends ClientBasicResponse {
	
	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	
	/**
	 * 购物地点
	 */
	private List<ClientAddress2Tag> addrTagList;

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

	public List<ClientAddress2Tag> getAddrTagList() {
		return addrTagList;
	}

	public void setAddrTagList(List<ClientAddress2Tag> addrTagList) {
		this.addrTagList = addrTagList;
	}
	
}
