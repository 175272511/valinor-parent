package com.ninesale.valinor.image.api.model.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 图片类型Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboUpdateImgTypeResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/***
	 * 保存更新记录
	 */
	int iCount;

	public int getiCount() {
		return iCount;
	}

	public void setiCount(int iCount) {
		this.iCount = iCount;
	}
	
}
