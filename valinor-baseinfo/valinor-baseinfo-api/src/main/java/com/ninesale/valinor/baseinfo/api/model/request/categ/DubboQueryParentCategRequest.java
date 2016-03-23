package com.ninesale.valinor.baseinfo.api.model.request.categ;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 删除：基础信息-种类 Request类
 * @author Zhoup
 * @date 2015年11月2日13:58:49
 */
public class DubboQueryParentCategRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * id主键
	 */
	@NotNull(message = "父类目ID不能为空")
	private Integer parentCategId;

	public Integer getParentCategId() {
		return parentCategId;
	}

	public void setParentCategId(Integer parentCategId) {
		this.parentCategId = parentCategId;
	}
	
}
