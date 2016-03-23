package com.ninesale.valinor.apiserver.web.model.note.response;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.note.vo.ClientNoteTopic;

/****
 * 查询品牌信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQueryTopicByPageResponse extends ClientBasicResponse {
	
	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 笔记信息
	 */
	private List<ClientNoteTopic> topicList;
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
	public List<ClientNoteTopic> getTopicList() {
		return topicList;
	}
	public void setTopicList(List<ClientNoteTopic> topicList) {
		this.topicList = topicList;
	}
	
	
}
