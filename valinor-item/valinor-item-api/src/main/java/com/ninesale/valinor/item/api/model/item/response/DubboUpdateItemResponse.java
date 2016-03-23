package com.ninesale.valinor.item.api.model.item.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @des 修改：基础信息-商品 Response类
 * @author fxj
 * @date 2015年11月30日14:16:21
 */
public class DubboUpdateItemResponse extends DubboBasicResponse {
	
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
