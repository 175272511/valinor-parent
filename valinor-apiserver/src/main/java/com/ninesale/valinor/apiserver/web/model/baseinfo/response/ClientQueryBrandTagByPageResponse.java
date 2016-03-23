package com.ninesale.valinor.apiserver.web.model.baseinfo.response;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.vo.ClientBrandTag;

/****
 * 查询品牌标签信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQueryBrandTagByPageResponse extends ClientBasicResponse {
	
	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	
	/**
	 * 品牌标签
	 */
	private List<ClientBrandTag> brandTagList;

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

	public List<ClientBrandTag> getBrandTagList() {
		return brandTagList;
	}

	public void setBrandTagList(List<ClientBrandTag> brandTagList) {
		this.brandTagList = brandTagList;
	}
	
}
