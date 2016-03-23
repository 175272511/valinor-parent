package com.ninesale.valinor.order.api.service.impl;

import javax.annotation.Resource;

import com.ninesale.valinor.order.api.model.request.DubboAddOrderRequest;
import com.ninesale.valinor.order.api.model.response.DubboAddOrderResponse;
import com.ninesale.valinor.order.api.service.DubboOrderService;
import com.ninesale.valinor.order.provider.dao.OrderDeliveryMapper;
import com.ninesale.valinor.order.provider.model.DtoOrderDelivery;

public class DubboDemoOrderServiceImpl implements DubboOrderService {

	@Resource
	private OrderDeliveryMapper orderDeliveryMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.order.api.service.DemoOrderService#addOrder(com.
	 * ninesale.valinor.order.api.model.AddOrderRequest)
	 */
	@Override
	public DubboAddOrderResponse addOrder(DubboAddOrderRequest request) {

		DtoOrderDelivery record = new DtoOrderDelivery();
		record.setExprCompany("天天快递");
		record.setOrderDetlId(1111L);
		record.setStatus(1);
		record.setOrderId(10L);
		orderDeliveryMapper.insertSelective(record);

		DubboAddOrderResponse resp = new DubboAddOrderResponse();
	
		return resp;
	}

}
