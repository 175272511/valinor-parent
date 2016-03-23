/**   
* @Title: ClientPayInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.order 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月2日 下午7:30:49 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.order;

import com.pubpi.common.model.BasicModel;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月2日 下午7:30:49
 * 
 */
public class ClientPayInfo extends BasicModel {
	private Long payId;

	private Long orderId;

	private String payOrderNo;

	private String currency;

	private Integer totalFee;

	private Integer payFee;

	private Integer transFee;

	private Integer pointsDeductFee;

	private Integer salesDeductFee;

	private Integer couponDeductFee;

	private Integer status;
	
	private String payNo;
	
	private Integer payType;
	
	private String payTime;

	private String expireTime;

	private String createTime;

	/**
	 * @return the payId
	 */
	public Long getPayId() {
		return payId;
	}

	/**
	 * @param payId the payId to set
	 */
	public void setPayId(Long payId) {
		this.payId = payId;
	}

	/**
	 * @return the orderId
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the payOrderNo
	 */
	public String getPayOrderNo() {
		return payOrderNo;
	}

	/**
	 * @param payOrderNo the payOrderNo to set
	 */
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
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
	 * @param totalFee the totalFee to set
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
	 * @param payFee the payFee to set
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
	 * @param transFee the transFee to set
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
	 * @param pointsDeductFee the pointsDeductFee to set
	 */
	public void setPointsDeductFee(Integer pointsDeductFee) {
		this.pointsDeductFee = pointsDeductFee;
	}

	/**
	 * @return the salesDeductFee
	 */
	public Integer getSalesDeductFee() {
		return salesDeductFee;
	}

	/**
	 * @param salesDeductFee the salesDeductFee to set
	 */
	public void setSalesDeductFee(Integer salesDeductFee) {
		this.salesDeductFee = salesDeductFee;
	}

	/**
	 * @return the couponDeductFee
	 */
	public Integer getCouponDeductFee() {
		return couponDeductFee;
	}

	/**
	 * @param couponDeductFee the couponDeductFee to set
	 */
	public void setCouponDeductFee(Integer couponDeductFee) {
		this.couponDeductFee = couponDeductFee;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the payNo
	 */
	public String getPayNo() {
		return payNo;
	}

	/**
	 * @param payNo the payNo to set
	 */
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	/**
	 * @return the payType
	 */
	public Integer getPayType() {
		return payType;
	}

	/**
	 * @param payType the payType to set
	 */
	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	/**
	 * @return the payTime
	 */
	public String getPayTime() {
		return payTime;
	}

	/**
	 * @param payTime the payTime to set
	 */
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	/**
	 * @return the expireTime
	 */
	public String getExpireTime() {
		return expireTime;
	}

	/**
	 * @param expireTime the expireTime to set
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
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
