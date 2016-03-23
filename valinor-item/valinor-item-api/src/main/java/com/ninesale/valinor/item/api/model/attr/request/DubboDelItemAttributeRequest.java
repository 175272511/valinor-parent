package com.ninesale.valinor.item.api.model.attr.request;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 商品属性理DTO类 
 * 创建人：fuxingjian 
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboDelItemAttributeRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * id主键
	 */
	@NotNull(message = "商品属性ID不能为空")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
