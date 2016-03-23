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
public class DubboGetPraiseAndCollectResponse extends DubboBasicResponse {
	private static final long serialVersionUID = 1L;

	private List<DubboPraiseInfo> praiseInfoList;

	private List<DubboCollectInfo> collectInfoList;

	/**
	 * @return the praiseInfoList
	 */
	public List<DubboPraiseInfo> getPraiseInfoList() {
		return praiseInfoList;
	}

	/**
	 * @param praiseInfoList
	 *            the praiseInfoList to set
	 */
	public void setPraiseInfoList(List<DubboPraiseInfo> praiseInfoList) {
		this.praiseInfoList = praiseInfoList;
	}

	/**
	 * @return the collectInfoList
	 */
	public List<DubboCollectInfo> getCollectInfoList() {
		return collectInfoList;
	}

	/**
	 * @param collectInfoList
	 *            the collectInfoList to set
	 */
	public void setCollectInfoList(List<DubboCollectInfo> collectInfoList) {
		this.collectInfoList = collectInfoList;
	}
}
