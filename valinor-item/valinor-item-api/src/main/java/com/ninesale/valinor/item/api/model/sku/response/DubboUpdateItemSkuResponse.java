package com.ninesale.valinor.item.api.model.sku.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 更新sku、stock库存信息， 保存sku快照、库存快照操作日志 Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboUpdateItemSkuResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * sku快照主键
	 */
	private Long skusnapId;
	
	/***
	 * 更新记录数
	 */
	int iCount;
	
	public int getiCount() {
		return iCount;
	}

	public void setiCount(int iCount) {
		this.iCount = iCount;
	}

	public Long getSkusnapId() {
		return skusnapId;
	}

	public void setSkusnapId(Long skusnapId) {
		this.skusnapId = skusnapId;
	}
	
}
