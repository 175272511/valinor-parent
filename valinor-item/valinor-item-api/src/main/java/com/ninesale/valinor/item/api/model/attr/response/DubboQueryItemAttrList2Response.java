package com.ninesale.valinor.item.api.model.attr.response;

import java.util.List;

import com.ninesale.valinor.item.api.model.attr.dto.DubboItemAttribute;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 查询商品属性列表Response类 
 * 创建人：fuxingjian 
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboQueryItemAttrList2Response extends DubboBasicResponse {

	private static final long serialVersionUID = 6825114663109315171L;

	private List<DubboItemAttribute> list;

	public List<DubboItemAttribute> getList() {
		return list;
	}

	public void setList(List<DubboItemAttribute> list) {
		this.list = list;
	}

}
