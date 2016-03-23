package com.ninesale.valinor.image.api.model.response;

import java.util.List;

import com.ninesale.valinor.image.api.model.dto.DubboImgTagType;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 图片标签类型Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryTagTypeResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	/**
	 * 标签类型List
	 */
	private List<DubboImgTagType> imgTagTypeList;

	public List<DubboImgTagType> getImgTagTypeList() {
		return imgTagTypeList;
	}

	public void setImgTagTypeList(List<DubboImgTagType> imgTagTypeList) {
		this.imgTagTypeList = imgTagTypeList;
	}
	
}
