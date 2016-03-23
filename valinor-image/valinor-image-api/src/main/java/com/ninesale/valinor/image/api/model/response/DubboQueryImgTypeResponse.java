package com.ninesale.valinor.image.api.model.response;

import com.ninesale.valinor.image.api.model.dto.DubboImgType;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 图片类型Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryImgTypeResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private DubboImgType dubboImgType;

	public DubboImgType getDubboImgType() {
		return dubboImgType;
	}

	public void setDubboImgType(DubboImgType dubboImgType) {
		this.dubboImgType = dubboImgType;
	}
	
	
}
