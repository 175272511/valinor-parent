package com.ninesale.valinor.baseinfo.api.model.request.categ;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 查询：基础信息-种类 Request类
 * @author Zhoup
 * @date 2015年11月2日14:09:45
 */
public class DubboQuerySubCategRequest extends DubboBasicRequest {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private Integer parentCategId;

	public Integer getParentCategId() {
		return parentCategId;
	}

	public void setParentCategId(Integer parentCategId) {
		this.parentCategId = parentCategId;
	}
	
}
