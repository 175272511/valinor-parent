/**   
* @Title: DubboGiftInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.order 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月2日 下午4:25:35 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.common.model.BasicModel;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月2日 下午4:25:35
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientGiftInfo extends BasicModel {

	private Long giftSkuId;

	private Integer giftSkuNum;

	/**
	 * @return the giftSkuId
	 */
	public Long getGiftSkuId() {
		return giftSkuId;
	}

	/**
	 * @param giftSkuId
	 *            the giftSkuId to set
	 */
	public void setGiftSkuId(Long giftSkuId) {
		this.giftSkuId = giftSkuId;
	}

	/**
	 * @return the giftSkuNum
	 */
	public Integer getGiftSkuNum() {
		return giftSkuNum;
	}

	/**
	 * @param giftSkuNum
	 *            the giftSkuNum to set
	 */
	public void setGiftSkuNum(Integer giftSkuNum) {
		this.giftSkuNum = giftSkuNum;
	}
}
