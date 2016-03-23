package com.ninesale.valinor.order.provider.model;

import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoOrderDelivery extends BasicModel {
	private Long id;

	private Long orderId;

	private Long orderDetlId;

	private Integer status;

	private String exprCompany;

	private String exprNo;

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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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