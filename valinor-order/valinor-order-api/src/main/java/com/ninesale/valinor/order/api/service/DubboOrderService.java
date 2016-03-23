package com.ninesale.valinor.order.api.service;

import com.ninesale.valinor.order.api.model.request.DubboAddOrderRequest;
import com.ninesale.valinor.order.api.model.response.DubboAddOrderResponse;

public interface DubboOrderService {
	DubboAddOrderResponse addOrder(DubboAddOrderRequest request);
}
