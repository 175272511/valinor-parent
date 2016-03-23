/**   
* @Title: AddOrderRequest.java 
* @Package com.ninesale.valinor.order.api.model 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年10月28日 上午11:09:55 
* @version V0.1
*/
package com.ninesale.valinor.order.api.model.response;

import java.util.Date;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年10月28日 上午11:09:55
 * 
 */
public class DubboAddOrderResponse extends DubboBasicResponse {
	/**
	 * @Fields serialVersionUID : TODO(desc the field)
	 */
	private static final long serialVersionUID = 9166946924021169281L;

	private Long orderId;

	private String orderNo;

	private Date createTime;

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
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
