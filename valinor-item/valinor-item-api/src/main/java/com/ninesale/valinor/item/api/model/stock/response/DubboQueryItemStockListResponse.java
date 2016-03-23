package com.ninesale.valinor.item.api.model.stock.response;

import java.util.List;

import com.ninesale.valinor.item.api.model.stock.dto.DubboItemStock;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 查询库存List Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryItemStockListResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private List<DubboItemStock> list;

	public List<DubboItemStock> getList() {
		return list;
	}

	public void setList(List<DubboItemStock> list) {
		this.list = list;
	}
	
}
