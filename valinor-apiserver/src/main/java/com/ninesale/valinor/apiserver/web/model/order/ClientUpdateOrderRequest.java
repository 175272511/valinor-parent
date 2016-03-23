package com.ninesale.valinor.apiserver.web.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientUpdateOrderRequest extends ClientBasicRequest {

	/**
	 * 订单id
	 */
	private Long orderId;

	/**
	 * 收件人地址
	 */
	private String address;

	/**
	 * 收件人
	 */
	private String receiver;

	/**
	 * 收件人号码
	 */
	private String phone;

	/**
	 * 发票信息
	 */
	private String receiptInfo;

	/**
	 * 支付方式
	 */
	private Integer payWay;

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver
	 *            the receiver to set
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the receiptInfo
	 */
	public String getReceiptInfo() {
		return receiptInfo;
	}

	/**
	 * @param receiptInfo
	 *            the receiptInfo to set
	 */
	public void setReceiptInfo(String receiptInfo) {
		this.receiptInfo = receiptInfo;
	}

	/**
	 * @return the payWay
	 */
	public Integer getPayWay() {
		return payWay;
	}

	/**
	 * @param payWay
	 *            the payWay to set
	 */
	public void setPayWay(Integer payWay) {
		this.payWay = payWay;
	}
}
