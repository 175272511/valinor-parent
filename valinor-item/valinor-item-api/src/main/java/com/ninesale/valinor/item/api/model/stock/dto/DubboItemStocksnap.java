package com.ninesale.valinor.item.api.model.stock.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

/**
 * 库存快照 Dubbo类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月10日 上午10:00:00
 */
public class DubboItemStocksnap extends BasicSeriModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4430895123524119459L;
	
	/**
	 * 库存快照版本号
	 */
	private Long id;
	
	/**
	 * SKUID
	 */
    private Long skuId;
    /**
	 * 成本价
	 */
    private BigDecimal costPrice;
    /**
	 * 库存可用数量
	 */
    private Integer stockNum;
    /**
	 * 销售锁定数量
	 */
    private Integer orderLockNum;
    /**
	 * 付款锁定数量
	 */
    private Integer payLockNum;
    /**
	 * 活动预锁定库存数量
	 */
    private Integer actvPreLockNum;
    /**
	 * 活动销售锁定数量
	 */
    private Integer actvOrderLockNum;
    /**
	 * 活动付款锁定数量
	 */
    private Integer actvPayLockNum;
    /**
	 * 预计发货时间,小时
	 */
    private Integer exptDlvHours;
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


    public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Integer getOrderLockNum() {
        return orderLockNum;
    }

    public void setOrderLockNum(Integer orderLockNum) {
        this.orderLockNum = orderLockNum;
    }

    public Integer getPayLockNum() {
        return payLockNum;
    }

    public void setPayLockNum(Integer payLockNum) {
        this.payLockNum = payLockNum;
    }

    public Integer getActvPreLockNum() {
        return actvPreLockNum;
    }

    public void setActvPreLockNum(Integer actvPreLockNum) {
        this.actvPreLockNum = actvPreLockNum;
    }

    public Integer getActvOrderLockNum() {
        return actvOrderLockNum;
    }

    public void setActvOrderLockNum(Integer actvOrderLockNum) {
        this.actvOrderLockNum = actvOrderLockNum;
    }

    public Integer getActvPayLockNum() {
        return actvPayLockNum;
    }

    public void setActvPayLockNum(Integer actvPayLockNum) {
        this.actvPayLockNum = actvPayLockNum;
    }

    public Integer getExptDlvHours() {
        return exptDlvHours;
    }

    public void setExptDlvHours(Integer exptDlvHours) {
        this.exptDlvHours = exptDlvHours;
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