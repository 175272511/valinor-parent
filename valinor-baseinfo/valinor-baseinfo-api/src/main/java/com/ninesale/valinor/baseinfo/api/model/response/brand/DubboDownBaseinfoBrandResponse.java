package com.ninesale.valinor.baseinfo.api.model.response.brand;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @des 禁用：基础信息-品牌信息 Response类
 * @author Zhoup
 * @date 2015年11月4日10:32:56
 */
public class DubboDownBaseinfoBrandResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * id主键
	 */
	private Long id;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
