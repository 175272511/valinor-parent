/**   
* @Title: OrderDetlInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.order 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月2日 下午4:58:45 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.order;

import java.util.List;

import com.pubpi.common.model.BasicModel;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月2日 下午4:58:45
 * 
 */
public class ClientOrderDetl extends BasicModel {
	private Long orderDetlId;

	private Long skuId;

	private Integer skuNum;

	private List<ClientGiftInfo> giftInfoList;

	private boolean isGift;

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
	 * @return the giftInfoList
	 */
	public List<ClientGiftInfo> getGiftInfoList() {
		return giftInfoList;
	}

	/**
	 * @param giftInfoList
	 *            the giftInfoList to set
	 */
	public void setGiftInfoList(List<ClientGiftInfo> giftInfoList) {
		this.giftInfoList = giftInfoList;
	}

	/**
	 * @return the isGift
	 */
	public boolean isGift() {
		return isGift;
	}

	/**
	 * @param isGift
	 *            the isGift to set
	 */
	public void setGift(boolean isGift) {
		this.isGift = isGift;
	}
}
