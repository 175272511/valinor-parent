package com.ninesale.valinor.image.api.model.request;

import java.util.List;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 图片管理DTO类 创建人：fuxingjian 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryImgStoreTypeListRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	private List<Long> ids;

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}
	
}
