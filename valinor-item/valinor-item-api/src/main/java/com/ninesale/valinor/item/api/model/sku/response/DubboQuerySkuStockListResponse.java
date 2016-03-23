package com.ninesale.valinor.item.api.model.sku.response;

import java.util.List;

import com.ninesale.valinor.item.api.model.sku.dto.DubboItemSkuStock;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 查询sku&库存List Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQuerySkuStockListResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private List<DubboItemSkuStock> list;

	public List<DubboItemSkuStock> getList() {
		return list;
	}

	public void setList(List<DubboItemSkuStock> list) {
		this.list = list;
	}
	
}
