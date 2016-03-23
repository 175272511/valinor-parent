package com.ninesale.valinor.image.api.model.response;

import java.util.List;

import com.ninesale.valinor.image.api.model.dto.DubboImgType;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 图片类型Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryImgTypeListResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	List<DubboImgType> list;

	public List<DubboImgType> getList() {
		return list;
	}

	public void setList(List<DubboImgType> list) {
		this.list = list;
	}
	
}
