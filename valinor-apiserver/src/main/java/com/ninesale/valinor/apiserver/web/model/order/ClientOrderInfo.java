/**   
* @Title: ClientOrderInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.order 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月2日 下午4:51:20 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.order;

import java.util.List;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月2日 下午4:51:20
 * 
 */
public class ClientOrderInfo {

	/**
	 * 订单id
	 */
	private Long orderId;

	/**
	 * 订单编号
	 */
	private String orderNo;

	/**
	 * 父订单id
	 */
	private Long parentOrderId;

	/**
	 * 父订单编号
	 */
	private Long parentOrderNo;

	/**
	 * 订单类型
	 */
	private Integer orderType;

	/**
	 * 收件人地址
	 */
	private String address;

	/**
	 * 收件人电话
	 */
	private String phone;

	/**
	 * 发票信息
	 */
	private String receiptInfo;

	/**
	 * 促销活动id
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
	 * 现金类型
	 */
	private String currency;

	/**
	 * 总金额
	 */
	private Integer totalFee;

	/**
	 * 支付金额
	 */
	private Integer payFee;

	/**
	 * 运费
	 */
	private Integer transFee;

	/**
	 * 积分抵扣金额
	 */
	private Integer pointsDeductFee;

	/**
	 * 促销活动抵扣金额
	 */
	private Integer saleDeductFee;

	/**
	 * 优惠券抵扣金额
	 */
	private Integer couponDeductFee;

	/**
	 * 支付方式 (在线支付，到货支付等等)
	 */
	private Integer payWay;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 支付单id
	 */
	private Long payId;

	/**
	 * 超时时间
	 */
	private String expireTime;

	/**
	 * 创建时间
	 */
	private String createTime;

	/**
	 * 详情单列表
	 */
	private List<ClientOrderDetl> orderDetlList;

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
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the parentOrderId
	 */
	public Long getParentOrderId() {
		return parentOrderId;
	}

	/**
	 * @param parentOrderId
	 *            the parentOrderId to set
	 */
	public void setParentOrderId(Long parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	/**
	 * @return the parentOrderNo
	 */
	public Long getParentOrderNo() {
		return parentOrderNo;
	}

	/**
	 * @param parentOrderNo
	 *            the parentOrderNo to set
	 */
	public void setParentOrderNo(Long parentOrderNo) {
		this.parentOrderNo = parentOrderNo;
	}

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
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the totalFee
	 */
	public Integer getTotalFee() {
		return totalFee;
	}

	/**
	 * @param totalFee
	 *            the totalFee to set
	 */
	public void setTotalFee(Integer totalFee) {
		this.totalFee = totalFee;
	}

	/**
	 * @return the payFee
	 */
	public Integer getPayFee() {
		return payFee;
	}

	/**
	 * @param payFee
	 *            the payFee to set
	 */
	public void setPayFee(Integer payFee) {
		this.payFee = payFee;
	}

	/**
	 * @return the transFee
	 */
	public Integer getTransFee() {
		return transFee;
	}

	/**
	 * @param transFee
	 *            the transFee to set
	 */
	public void setTransFee(Integer transFee) {
		this.transFee = transFee;
	}

	/**
	 * @return the pointsDeductFee
	 */
	public Integer getPointsDeductFee() {
		return pointsDeductFee;
	}

	/**
	 * @param pointsDeductFee
	 *            the pointsDeductFee to set
	 */
	public void setPointsDeductFee(Integer pointsDeductFee) {
		this.pointsDeductFee = pointsDeductFee;
	}

	/**
	 * @return the saleDeductFee
	 */
	public Integer getSaleDeductFee() {
		return saleDeductFee;
	}

	/**
	 * @param saleDeductFee
	 *            the saleDeductFee to set
	 */
	public void setSaleDeductFee(Integer saleDeductFee) {
		this.saleDeductFee = saleDeductFee;
	}

	/**
	 * @return the couponDeductFee
	 */
	public Integer getCouponDeductFee() {
		return couponDeductFee;
	}

	/**
	 * @param couponDeductFee
	 *            the couponDeductFee to set
	 */
	public void setCouponDeductFee(Integer couponDeductFee) {
		this.couponDeductFee = couponDeductFee;
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
	 * @return the payId
	 */
	public Long getPayId() {
		return payId;
	}

	/**
	 * @param payId
	 *            the payId to set
	 */
	public void setPayId(Long payId) {
		this.payId = payId;
	}

	/**
	 * @return the expireTime
	 */
	public String getExpireTime() {
		return expireTime;
	}

	/**
	 * @param expireTime
	 *            the expireTime to set
	 */
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
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

	/**
	 * @return the orderDetlList
	 */
	public List<ClientOrderDetl> getOrderDetlList() {
		return orderDetlList;
	}

	/**
	 * @param orderDetlList
	 *            the orderDetlList to set
	 */
	public void setOrderDetlList(List<ClientOrderDetl> orderDetlList) {
		this.orderDetlList = orderDetlList;
	}
}
