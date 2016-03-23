package com.ninesale.valinor.item.api.model.sku.response;

import java.util.List;

import com.ninesale.valinor.item.api.model.sku.dto.DubboItemSkusnap;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 查询SPUList Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryItemSkusnapListResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private List<DubboItemSkusnap> list;

	public List<DubboItemSkusnap> getList() {
		return list;
	}

	public void setList(List<DubboItemSkusnap> list) {
		this.list = list;
	}
	
}
