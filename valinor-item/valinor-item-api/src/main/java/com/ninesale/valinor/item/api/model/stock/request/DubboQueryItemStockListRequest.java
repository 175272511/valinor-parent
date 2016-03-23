package com.ninesale.valinor.item.api.model.stock.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 查询库存 Request类 
 * 创建人：fuxingjian 
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryItemStockListRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * 快照版本号
	 */
	private Long id;
	/**
	 * SKUID
	 */
    private Long skuId;
    /**
	 * 库存快照版本号
	 */
    private Long stockSnapId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSkuId() {
		return skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getStockSnapId() {
		return stockSnapId;
	}
	public void setStockSnapId(Long stockSnapId) {
		this.stockSnapId = stockSnapId;
	}
    
}
