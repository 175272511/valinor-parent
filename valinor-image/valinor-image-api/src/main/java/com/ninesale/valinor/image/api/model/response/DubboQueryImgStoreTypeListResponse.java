package com.ninesale.valinor.image.api.model.response;

import java.util.List;

import com.ninesale.valinor.image.api.model.dto.DubboImgStoreType;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 图片管理Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryImgStoreTypeListResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	List<DubboImgStoreType> list;

	public List<DubboImgStoreType> getList() {
		return list;
	}

	public void setList(List<DubboImgStoreType> list) {
		this.list = list;
	}
	
}
