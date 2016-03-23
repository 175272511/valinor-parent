package com.ninesale.valinor.apiserver.web.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientAfterSaleServiceRequest extends ClientBasicRequest {
	private Long orderId;

	private Long orderDetlId;

	private Long skuId;

	private Integer skuNum;

	private Integer serviceType;

	/**
	 * @return the orderId
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderDetlId
	 */
	public Long getOrderDetlId() {
		return orderDetlId;
	}

	/**
	 * @param orderDetlId
	 *            the orderDetlId to set
	 */
	public void setOrderDetlId(Long orderDetlId) {
		this.orderDetlId = orderDetlId;
	}

	/**
	 * @return the skuId
	 */
	public Long getSkuId() {
		return skuId;
	}

	/**
	 * @param skuId
	 *            the skuId to set
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	/**
	 * @return the skuNum
	 */
	public Integer getSkuNum() {
		return skuNum;
	}

	/**
	 * @param skuNum
	 *            the skuNum to set
	 */
	public void setSkuNum(Integer skuNum) {
		this.skuNum = skuNum;
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
}
