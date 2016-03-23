package com.ninesale.valinor.item.api.model.sku.request;

import java.util.Date;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 查询SPUList Request类 
 * 创建人：fuxingjian 
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryItemSkusnapListRequest extends DubboBasicRequest {

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
	 * SKU(大部分跟SPU标题相同)标题
	 */
    private String title;
    /**
	 * 状态 上架.下架
	 */
    private Integer status;
    /**
	 * 生产商条码货号
	 */
    private String artNo;
    /**
	 * 国际通行条形码
	 */
    private String barCode;
    /**
	 * 修改用户ID
	 */
    private Long modifyUserId;
    /**
	 * 修改用户名
	 */
    private String modifyUserName;
    /**
	 * 创建时间
	 */
    private Date createTime;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getArtNo() {
		return artNo;
	}
	public void setArtNo(String artNo) {
		this.artNo = artNo;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
