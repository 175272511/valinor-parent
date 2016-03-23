package com.ninesale.valinor.baseinfo.api.model.request.merchant;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 查询：基础信息-商家 Request类
 * @author Zhoup
 * @date 2015年11月2日14:09:40
 */
public class DubboQueryBaseinfoMerchantRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * id主键
	 */
	@NotNull(message = "商家ID不能为空")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
