package com.ninesale.valinor.item.api.model.attr.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 商品属性Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboDelItemAttributeResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
