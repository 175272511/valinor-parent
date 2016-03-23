package com.ninesale.valinor.order.provider.model;

import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoOrderDetlLog extends BasicModel{
    private Long id;

    private Long orderDetlId;

    private Long orderId;

    private Long skuId;

    private Long skuSnapId;

    private Integer skuNum;

    private String currency;

    private Integer totalFee;

    private Integer payPoints;

    private String salesNo;

    private Integer saleDeductFee;

    private Integer couponId;

    private Integer couponDeductFee;

    private Integer payFee;

    private Integer status;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderDetlId() {
        return orderDetlId;
    }

    public void setOrderDetlId(Long orderDetlId) {
        this.orderDetlId = orderDetlId;
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

    public String getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(String salesNo) {
        this.salesNo = salesNo;
    }

    public Integer getSaleDeductFee() {
        return saleDeductFee;
    }

    public void setSaleDeductFee(Integer saleDeductFee) {
        this.saleDeductFee = saleDeductFee;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}