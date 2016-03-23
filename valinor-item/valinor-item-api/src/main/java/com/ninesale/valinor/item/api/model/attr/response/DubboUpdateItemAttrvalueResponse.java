package com.ninesale.valinor.item.api.model.attr.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 更新商品属性值Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboUpdateItemAttrvalueResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/***
	 * 更新记录数
	 */
	int iCount;
	
	public int getiCount() {
		return iCount;
	}

	public void setiCount(int iCount) {
		this.iCount = iCount;
	}

}
