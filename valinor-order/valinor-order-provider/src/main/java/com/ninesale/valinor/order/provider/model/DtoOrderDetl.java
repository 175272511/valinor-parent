package com.ninesale.valinor.order.provider.model;

import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoOrderDetl extends BasicModel{
    private Long id;

    private Long orderId;

    private Long skuId;

    private Long skuSnapId;

    private Integer skuNum;

    private String currency;

    private Integer totalFee;

    private Integer payPoints;

    private Integer pointsDeductFee;

    private Integer saleDeductFee;

    private Integer couponDeductFee;

    private Integer payFee;

    private Integer status;

    private Date cancelTime;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuSnapId() {
        return skuSnapId;
    }

    public void setSkuSnapId(Long skuSnapId) {
        this.skuSnapId = skuSnapId;
    }

    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(Integer payPoints) {
        this.payPoints = payPoints;
    }

    public Integer getPointsDeductFee() {
        return pointsDeductFee;
    }

    public void setPointsDeductFee(Integer pointsDeductFee) {
        this.pointsDeductFee = pointsDeductFee;
    }

    public Integer getSaleDeductFee() {
        return saleDeductFee;
    }

    public void setSaleDeductFee(Integer saleDeductFee) {
        this.saleDeductFee = saleDeductFee;
    }

    public Integer getCouponDeductFee() {
        return couponDeductFee;
    }

    public void setCouponDeductFee(Integer couponDeductFee) {
        this.couponDeductFee = couponDeductFee;
    }

    public Integer getPayFee() {
        return payFee;
    }

    public void setPayFee(Integer payFee) {
        this.payFee = payFee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
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