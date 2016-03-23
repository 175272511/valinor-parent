package com.ninesale.valinor.apiserver.web.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientUpdateExprInfoRequest extends ClientBasicRequest {

	private Long serviceId;

	private Integer serviceType;

	private String exprCompany;

	private String exprNo;

	private Integer status;

	private String createTime;

	/**
	 * @return the serviceId
	 */
	public Long getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the serviceType
	 */
	public Integer getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType
	 *            the serviceType to set
	 */
	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the exprCompany
	 */
	public String getExprCompany() {
		return exprCompany;
	}

	/**
	 * @param exprCompany
	 *            the exprCompany to set
	 */
	public void setExprCompany(String exprCompany) {
		this.exprCompany = exprCompany;
	}

	/**
	 * @return the exprNo
	 */
	public String getExprNo() {
		return exprNo;
	}

	/**
	 * @param exprNo
	 *            the exprNo to set
	 */
	public void setExprNo(String exprNo) {
		this.exprNo = exprNo;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
