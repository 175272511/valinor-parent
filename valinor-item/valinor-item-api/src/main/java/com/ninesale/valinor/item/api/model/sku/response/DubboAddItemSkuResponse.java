package com.ninesale.valinor.item.api.model.sku.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 新增sku、stock库存、sku快照、stock库存快照  Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboAddItemSkuResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * sku主键
	 */
	private Long skuId;
	
	/**
	 * sku快照主键
	 */
	private Long skusnapId;
	
	/**
	 * 库存快照主键
	 */
	private Long stocksnapId;
	
	/**
	 * 库存主键
	 */
	private Long stockId;
	
	/***
	 * 保存记录
	 */
	int iCount;
	
	public int getiCount() {
		return iCount;
	}

	public void setiCount(int iCount) {
		this.iCount = iCount;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkusnapId() {
		return skusnapId;
	}

	public void setSkusnapId(Long skusnapId) {
		this.skusnapId = skusnapId;
	}

	public Long getStocksnapId() {
		return stocksnapId;
	}

	public void setStocksnapId(Long stocksnapId) {
		this.stocksnapId = stocksnapId;
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

}
