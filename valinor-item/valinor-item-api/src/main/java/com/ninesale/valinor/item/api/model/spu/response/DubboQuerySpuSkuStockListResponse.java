package com.ninesale.valinor.item.api.model.spu.response;

import java.util.List;

import com.ninesale.valinor.item.api.model.spu.dto.DubboItemSpuSkuStock;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 查询SPUList Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQuerySpuSkuStockListResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private List<DubboItemSpuSkuStock> list;

	public List<DubboItemSpuSkuStock> getList() {
		return list;
	}

	public void setList(List<DubboItemSpuSkuStock> list) {
		this.list = list;
	}
	
}
