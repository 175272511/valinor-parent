package com.ninesale.valinor.item.api.model.sku.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

/**
 * SKU快照 Dubbo类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月10日 上午10:00:00
 */
public class DubboItemSkusnap extends BasicSeriModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8308899286803891402L;
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
	 * SKU主图
	 */
    private Long mainImgId;
    /**
	 * 市场价
	 */
    private BigDecimal markedPrice;
    /**
	 * 销售价
	 */
    private BigDecimal sellprice;
    /**
	 * 重量
	 */
    private String weight;
    /**
	 * 体积
	 */
    private String volume;
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
    /**
	 * 最后修改时间
	 */
    private Date updateTime;
    
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

    public Long getMainImgId() {
        return mainImgId;
    }

    public void setMainImgId(Long mainImgId) {
        this.mainImgId = mainImgId;
    }

	public BigDecimal getMarkedPrice() {
		return markedPrice;
	}

	public void setMarkedPrice(BigDecimal markedPrice) {
		this.markedPrice = markedPrice;
	}

	public BigDecimal getSellprice() {
		return sellprice;
	}

	public void setSellprice(BigDecimal sellprice) {
		this.sellprice = sellprice;
	}

	public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}