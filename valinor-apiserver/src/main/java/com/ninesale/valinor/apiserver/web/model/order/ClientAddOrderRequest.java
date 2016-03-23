package com.ninesale.valinor.apiserver.web.model.order;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientAddOrderRequest extends ClientBasicRequest {

	/**
	 * 订单类型
	 */
	private Integer orderType;

	/**
	 * 收件人地址
	 */
	private String address;

	/**
	 * 收件人
	 */
	private String receiver;

	/**
	 * 收件人手机号，多个手机号使用逗号分隔
	 */
	private String phone;

	/**
	 * 发票信息
	 */
	private String receiptInfo;

	/**
	 * 活动id
	 */
	private Long salesId;

	/**
	 * 优惠券id
	 */
	private Long couponId;

	/**
	 * 支付积分
	 */
	private Integer payPoints;

	/**
	 * 支付方式
	 */
	private Integer payWay;

	/**
	 * sku列表
	 */
	private List<ClientSkuInfo> skuList;

	/**
	 * @return the orderType
	 */
	public Integer getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType
	 *            the orderType to set
	 */
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
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
	 * @return the salesId
	 */
	public Long getSalesId() {
		return salesId;
	}

	/**
	 * @param salesId
	 *            the salesId to set
	 */
	public void setSalesId(Long salesId) {
		this.salesId = salesId;
	}

	/**
	 * @return the couponId
	 */
	public Long getCouponId() {
		return couponId;
	}

	/**
	 * @param couponId
	 *            the couponId to set
	 */
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}

	/**
	 * @return the payPoints
	 */
	public Integer getPayPoints() {
		return payPoints;
	}

	/**
	 * @param payPoints
	 *            the payPoints to set
	 */
	public void setPayPoints(Integer payPoints) {
		this.payPoints = payPoints;
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

	/**
	 * @return the skuList
	 */
	public List<ClientSkuInfo> getSkuList() {
		return skuList;
	}

	/**
	 * @param skuList
	 *            the skuList to set
	 */
	public void setSkuList(List<ClientSkuInfo> skuList) {
		this.skuList = skuList;
	}
}
