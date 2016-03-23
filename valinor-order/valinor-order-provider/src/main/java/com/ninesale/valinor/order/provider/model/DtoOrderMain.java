package com.ninesale.valinor.order.provider.model;

import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoOrderMain extends BasicModel{
    private Long id;

    private String orderNo;

    private Long parentOrderId;

    private String parentOrderNo;

    private Integer orderType;

    private String currency;

    private Integer totalFee;

    private Integer payPoints;

    private Integer pointsDeductFee;

    private Long salesNo;

    private Integer saleDeductFee;

    private String couponNo;

    private Integer couponDeductFee;

    private Integer transFee;

    private Integer payFee;

    private Integer payWay;

    private Integer payType;

    private Long userId;

    private String receiver;

    private String address;

    private String phone;

    private Integer status;

    private String receiptInfo;

    private Integer validFlag;

    private String payNo;

    private String payOrderNo;

    private Date payTime;

    private Date cancelTime;

    private Date expireTime;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(Long parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public String getParentOrderNo() {
        return parentOrderNo;
    }

    public void setParentOrderNo(String parentOrderNo) {
        this.parentOrderNo = parentOrderNo;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
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

    public Long getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(Long salesNo) {
        this.salesNo = salesNo;
    }

    public Integer getSaleDeductFee() {
        return saleDeductFee;
    }

    public void setSaleDeductFee(Integer saleDeductFee) {
        this.saleDeductFee = saleDeductFee;
    }

    public String getCouponNo() {
        return couponNo;
    }

    public void setCouponNo(String couponNo) {
        this.couponNo = couponNo;
    }

    public Integer getCouponDeductFee() {
        return couponDeductFee;
    }

    public void setCouponDeductFee(Integer couponDeductFee) {
        this.couponDeductFee = couponDeductFee;
    }

    public Integer getTransFee() {
        return transFee;
    }

    public void setTransFee(Integer transFee) {
        this.transFee = transFee;
    }

    public Integer getPayFee() {
        return payFee;
    }

    public void setPayFee(Integer payFee) {
        this.payFee = payFee;
    }

    public Integer getPayWay() {
        return payWay;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReceiptInfo() {
        return receiptInfo;
    }

    public void setReceiptInfo(String receiptInfo) {
        this.receiptInfo = receiptInfo;
    }

    public Integer getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Integer validFlag) {
        this.validFlag = validFlag;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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