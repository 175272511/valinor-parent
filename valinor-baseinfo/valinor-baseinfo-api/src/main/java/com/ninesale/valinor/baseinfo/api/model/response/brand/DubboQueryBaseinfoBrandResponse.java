package com.ninesale.valinor.baseinfo.api.model.response.brand;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoBrand;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @des 查询：基础信息-品牌 Response类
 * @author Zhoup
 * @date 2015年11月2日14:20:38
 */
public class DubboQueryBaseinfoBrandResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private DubboBaseinfoBrand dubboBaseinfoBrand;

	public DubboBaseinfoBrand getDubboBaseinfoBrand() {
		return dubboBaseinfoBrand;
	}

	public void setDubboBaseinfoBrand(DubboBaseinfoBrand dubboBaseinfoBrand) {
		this.dubboBaseinfoBrand = dubboBaseinfoBrand;
	}
	
}
