package com.ninesale.valinor.image.api.model.response;

import com.ninesale.valinor.image.api.model.dto.DubboImgStore;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 图片管理Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryImgStoreResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private DubboImgStore dubboImgStore;

	public DubboImgStore getDubboImgStore() {
		return dubboImgStore;
	}

	public void setDubboImgStore(DubboImgStore dubboImgStore) {
		this.dubboImgStore = dubboImgStore;
	}
	
}
