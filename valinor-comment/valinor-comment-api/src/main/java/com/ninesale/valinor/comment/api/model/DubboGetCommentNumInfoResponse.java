package com.ninesale.valinor.comment.api.model;

import java.util.List;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 添加评论返回类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:09
 *
 */
public class DubboGetCommentNumInfoResponse extends DubboBasicResponse {
	private static final long serialVersionUID = 1L;

	/**
	 * 评论数量信息
	 */
	private List<DubboNoteStatisticsInfo> noteStatisticsInfoList;

	/**
	 * @return the noteStatisticsInfoList
	 */
	public List<DubboNoteStatisticsInfo> getNoteStatisticsInfoList() {
		return noteStatisticsInfoList;
	}

	/**
	 * @param noteStatisticsInfoList
	 *            the noteStatisticsInfoList to set
	 */
	public void setNoteStatisticsInfoList(List<DubboNoteStatisticsInfo> noteStatisticsInfoList) {
		this.noteStatisticsInfoList = noteStatisticsInfoList;
	}
}
