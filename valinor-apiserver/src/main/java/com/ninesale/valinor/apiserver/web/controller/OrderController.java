package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.order.ClientAddOrderRequest;
import com.ninesale.valinor.apiserver.web.model.order.ClientAfterSaleServiceRequest;
import com.ninesale.valinor.apiserver.web.model.order.ClientCancelOrderRequest;
import com.ninesale.valinor.apiserver.web.model.order.ClientDelOrderRequest;
import com.ninesale.valinor.apiserver.web.model.order.ClientGetOrderListOrderRequest;
import com.ninesale.valinor.apiserver.web.model.order.ClientUpdateExprInfoRequest;
import com.ninesale.valinor.apiserver.web.model.order.ClientUpdateOrderRequest;
import com.ninesale.valinor.order.api.model.request.DubboAddOrderRequest;
import com.ninesale.valinor.order.api.model.response.DubboAddOrderResponse;
import com.ninesale.valinor.order.api.service.DubboOrderService;
import com.pubpi.common.utils.BeanMapper;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {

	@Resource
	private DubboOrderService dubboOrderService;

	/**
	 * 添加订单信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addorder", method = RequestMethod.POST)
	public ClientBasicResponse addOrder(@RequestBody ClientAddOrderRequest req) {
		DubboAddOrderRequest request = BeanMapper.map(req, DubboAddOrderRequest.class);
		DubboAddOrderResponse resp = dubboOrderService.addOrder(request);

		return null;
	}

	/**
	 * 更新订单信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "updateorder", method = RequestMethod.POST)
	public ClientBasicResponse updateOrder(@RequestBody ClientUpdateOrderRequest req) {
		return null;
	}

	/**
	 * 删除订单信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "delorder", method = RequestMethod.POST)
	public ClientBasicResponse delOrder(@RequestBody ClientDelOrderRequest req) {
		return null;
	}

	/**
	 * 获取订单列表
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getorderlist", method = RequestMethod.POST)
	public ClientBasicResponse getOrderList(@RequestBody ClientGetOrderListOrderRequest req) {
		return null;
	}

	/**
	 * 取消订单
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "cancelorder", method = RequestMethod.POST)
	public ClientBasicResponse cancelOrder(@RequestBody ClientCancelOrderRequest req) {
		return null;
	}

	/**
	 * 售后服务单
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "aftersaleservice", method = RequestMethod.POST)
	public ClientBasicResponse afterSaleService(@RequestBody ClientAfterSaleServiceRequest req) {
		return null;
	}

	/**
	 * 更新物流单信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "updateexprinfo", method = RequestMethod.POST)
	public ClientBasicResponse updateExprInfo(@RequestBody ClientUpdateExprInfoRequest req) {
		return null;
	}
}
