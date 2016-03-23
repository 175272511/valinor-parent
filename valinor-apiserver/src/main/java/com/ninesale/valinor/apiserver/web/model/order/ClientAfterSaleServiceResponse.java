package com.ninesale.valinor.apiserver.web.model.order;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 添加订单返回结果
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月3日 下午8:27:26
 *
 */
public class ClientAfterSaleServiceResponse extends ClientBasicResponse {

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
