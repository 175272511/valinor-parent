package com.ninesale.valinor.order.provider.model;

import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoOrderService extends BasicModel {
	private Long id;

	private Long orderId;

	private Long orderDetlId;

	private Long skuId;

	private Long skuNum;

	private Integer serviceType;

	private String exprCompany;

	private String exprNo;

	private Integer status;

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

	public Long getOrderDetlId() {
		return orderDetlId;
	}

	public void setOrderDetlId(Long orderDetlId) {
		this.orderDetlId = orderDetlId;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuNum() {
		return skuNum;
	}

	public void setSkuNum(Long skuNum) {
		this.skuNum = skuNum;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public String getExprCompany() {
		return exprCompany;
	}

	public void setExprCompany(String exprCompany) {
		this.exprCompany = exprCompany;
	}

	public String getExprNo() {
		return exprNo;
	}

	public void setExprNo(String exprNo) {
		this.exprNo = exprNo;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}