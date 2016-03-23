package com.ninesale.valinor.apiserver.web.model.order;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 添加订单返回结果
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月3日 下午8:27:26
 *
 */
public class ClientGetOrderHandleInfoOrderResponse extends ClientBasicResponse {

	private List<ClientOrderHandleInfo> data;

	/**
	 * @return the data
	 */
	public List<ClientOrderHandleInfo> getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(List<ClientOrderHandleInfo> data) {
		this.data = data;
	}
}
