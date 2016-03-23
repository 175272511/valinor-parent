package com.ninesale.valinor.apiserver.web.model.order;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.pubpi.common.model.BasicModel;

/**
 * 添加订单返回结果
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月3日 下午8:27:26
 *
 */
public class ClientAddOrderResponse extends ClientBasicResponse {

	/**
	 * 返回结果
	 */
	private ClientOrderWithPayInfo data;

	public static class ClientOrderWithPayInfo extends BasicModel {
		private List<ClientOrderInfo> orderInfoList;

		private ClientPayInfo payInfo;

		/**
		 * @return the orderInfoList
		 */
		public List<ClientOrderInfo> getOrderInfoList() {
			return orderInfoList;
		}

		/**
		 * @param orderInfoList
		 *            the orderInfoList to set
		 */
		public void setOrderInfoList(List<ClientOrderInfo> orderInfoList) {
			this.orderInfoList = orderInfoList;
		}

		/**
		 * @return the payInfo
		 */
		public ClientPayInfo getPayInfo() {
			return payInfo;
		}

		/**
		 * @param payInfo
		 *            the payInfo to set
		 */
		public void setPayInfo(ClientPayInfo payInfo) {
			this.payInfo = payInfo;
		}
	}

	/**
	 * @return the data
	 */
	public ClientOrderWithPayInfo getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(ClientOrderWithPayInfo data) {
		this.data = data;
	}
}
