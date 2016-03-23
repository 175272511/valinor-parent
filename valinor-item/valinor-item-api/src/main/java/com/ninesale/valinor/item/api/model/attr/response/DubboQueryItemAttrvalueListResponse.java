package com.ninesale.valinor.item.api.model.attr.response;

import java.util.List;

import com.ninesale.valinor.item.api.model.attr.dto.DubboItemAttrvalue;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 查询商品属性值列表Response类 
 * 创建人：fuxingjian 
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboQueryItemAttrvalueListResponse extends DubboBasicResponse {

	private static final long serialVersionUID = 6825114663109315171L;

	private List<DubboItemAttrvalue> list;

	public List<DubboItemAttrvalue> getList() {
		return list;
	}

	public void setList(List<DubboItemAttrvalue> list) {
		this.list = list;
	}

}
