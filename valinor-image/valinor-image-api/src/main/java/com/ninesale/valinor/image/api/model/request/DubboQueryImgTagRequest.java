package com.ninesale.valinor.image.api.model.request;

import java.util.List;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 图片相关信息查询Request类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryImgTagRequest extends DubboBasicRequest {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * 图片id主键
	 */
	private List<Long> imgIdList;

	public List<Long> getImgIdList() {
		return imgIdList;
	}

	public void setImgIdList(List<Long> imgIdList) {
		this.imgIdList = imgIdList;
	}
	
	
}
