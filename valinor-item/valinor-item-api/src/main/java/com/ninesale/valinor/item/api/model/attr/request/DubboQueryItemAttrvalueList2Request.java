package com.ninesale.valinor.item.api.model.attr.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 查询商品属性值列表Request类
 *  创建人：fuxingjian 
 *  创建时间：2015年11月04日 上午10:00:00
 */
public class DubboQueryItemAttrvalueList2Request extends DubboBasicRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6964645818493749665L;

	/**
	 * 属性IDList
	 */
	@NotNull(message = "商品属性值ID列表不能为空")
	private List<Long> ids;

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

}