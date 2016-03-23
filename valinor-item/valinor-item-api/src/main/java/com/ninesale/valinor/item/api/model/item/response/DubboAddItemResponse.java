package com.ninesale.valinor.item.api.model.item.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @des 添加：基础信息-商品 Response类
 * @author fxj
 * @date 2015年11月30日14:20:38
 */
public class DubboAddItemResponse extends DubboBasicResponse {
	
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
