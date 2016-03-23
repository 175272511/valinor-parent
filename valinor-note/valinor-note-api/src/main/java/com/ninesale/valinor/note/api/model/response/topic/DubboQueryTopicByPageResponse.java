package com.ninesale.valinor.note.api.model.response.topic;

import java.util.List;

import com.ninesale.valinor.note.api.model.dto.DubboNoteTopic;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/****
 * 查询话题信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class DubboQueryTopicByPageResponse extends DubboBasicResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalNum;
	/**
	 * 话题信息
	 */
	private List<DubboNoteTopic> topicList;
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
	public List<DubboNoteTopic> getTopicList() {
		return topicList;
	}
	public void setTopicList(List<DubboNoteTopic> topicList) {
		this.topicList = topicList;
	}
	
}
