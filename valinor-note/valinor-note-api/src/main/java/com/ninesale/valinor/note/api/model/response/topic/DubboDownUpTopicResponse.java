package com.ninesale.valinor.note.api.model.response.topic;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @des 禁用：基础信息-类目信息 Response类
 * @author Zhoup
 * @date 2015年11月4日10:32:56
 */
public class DubboDownUpTopicResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/***
	 * 保存更新记录
	 */
	int icount;
	
	public int getIcount() {
		return icount;
	}
	
	public void setIcount(int icount) {
		this.icount = icount;
	}

}
