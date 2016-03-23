package com.ninesale.valinor.item.api.model.attr.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 批量新增商品属性值Request类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboBatchAddItemAttrvalueRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * 商品属性
	 */
	@NotNull(message = "商品属性值列表不能为空")
	private List<DubboAddItemAttrvalueRequest> list;

	public List<DubboAddItemAttrvalueRequest> getList() {
		return list;
	}

	public void setList(List<DubboAddItemAttrvalueRequest> list) {
		this.list = list;
	}

}
