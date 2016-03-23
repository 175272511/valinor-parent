/**   
* @Title: DubboSkuInfo.java 
* @Package com.ninesale.valinor.order.api.model.request 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月6日 下午3:05:51 
* @version V0.1
*/
package com.ninesale.valinor.order.api.model.request;

import java.util.List;

/** 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月6日 下午3:05:51 
*  
*/
public class DubboSkuInfo {


	private Long skuId;
	private Integer skuNum;

	private List<DubboGiftInfo> giftSkuInfoList;

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
	 * @return the giftSkuInfoList
	 */
	public List<DubboGiftInfo> getGiftSkuInfoList() {
		return giftSkuInfoList;
	}

	/**
	 * @param giftSkuInfoList
	 *            the giftSkuInfoList to set
	 */
	public void setGiftSkuInfoList(List<DubboGiftInfo> giftSkuInfoList) {
		this.giftSkuInfoList = giftSkuInfoList;
	}

}
