package com.ninesale.valinor.item.provider.model;

import java.math.BigDecimal;
import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoItemStocksnap extends BasicModel{
    private Long id;

    private Long skuId;

    private BigDecimal costPrice;

    private Integer stockNum;

    private Integer orderLockNum;

    private Integer payLockNum;

    private Integer actvPreLockNum;

    private Integer actvOrderLockNum;

    private Integer actvPayLockNum;

    private Integer exptDlvHours;

    private Long modifyUserId;

    private String modifyUserName;

    private Date createTime;

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