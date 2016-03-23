package com.ninesale.valinor.item.api.model.stock.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 查询库存快照  Request类 
 * 创建人：fuxingjian 
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryItemStocksnapListRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * 库存快照版本号
	 */
	private Long id;
	
	/**
	 * SKUID
	 */
    private Long skuId;
    /**
	 * 修改用户ID
	 */
    private Long modifyUserId;
    /**
	 * 修改用户名
	 */
    private String modifyUserName;
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
	public Long getModifyUserId() {
		return modifyUserId;
	}
	public void setModifyUserId(Long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}
	public String getModifyUserName() {
		return modifyUserName;
	}
	public void setModifyUserName(String modifyUserName) {
		this.modifyUserName = modifyUserName;
	}
    
}
