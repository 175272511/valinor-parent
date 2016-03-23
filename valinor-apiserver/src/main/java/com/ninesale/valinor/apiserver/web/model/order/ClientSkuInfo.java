/**   
* @Title: DubboSkuInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.order 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月2日 下午4:23:39 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.order;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.common.model.BasicModel;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月2日 下午4:23:39
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientSkuInfo extends BasicModel {

	private Long skuId;
	private Integer skuNum;

	private List<ClientGiftInfo> giftSkuInfoList;

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
	public List<ClientGiftInfo> getGiftSkuInfoList() {
		return giftSkuInfoList;
	}

	/**
	 * @param giftSkuInfoList
	 *            the giftSkuInfoList to set
	 */
	public void setGiftSkuInfoList(List<ClientGiftInfo> giftSkuInfoList) {
		this.giftSkuInfoList = giftSkuInfoList;
	}
}
