package com.ninesale.valinor.apiserver.web.model.order;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.order.ClientAddOrderResponse.ClientOrderWithPayInfo;

/**
 * 添加订单返回结果
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月3日 下午8:27:26
 *
 */
public class ClientGetOrderListResponse extends ClientBasicResponse {

	/**
	 * 返回结果
	 */
	private List<ClientOrderWithPayInfo> data;

	/**
	 * @return the data
	 */
	public List<ClientOrderWithPayInfo> getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(List<ClientOrderWithPayInfo> data) {
		this.data = data;
	}
}
