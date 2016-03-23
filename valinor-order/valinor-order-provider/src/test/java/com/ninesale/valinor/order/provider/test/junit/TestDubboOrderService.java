/**   
* @Title: TestDubboOrderService.java 
* @Package com.ninesale.valinor.order.provider.test.junit 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月5日 下午3:17:03 
* @version V0.1
*/
package com.ninesale.valinor.order.provider.test.junit;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ninesale.valinor.order.api.model.request.DubboAddOrderRequest;
import com.ninesale.valinor.order.api.model.response.DubboAddOrderResponse;
import com.ninesale.valinor.order.api.service.DubboOrderService;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月5日 下午3:17:03
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml", "classpath*:spring/consumer/*" })
public class TestDubboOrderService {

	@Resource
	private DubboOrderService dubboOrderService;

	@Test
	public void test() {

		DubboAddOrderRequest request = new DubboAddOrderRequest();
//		request.setCreateTime(new Date());
//		request.setOrderId(10L);
//
//		request.setOrderNo("20151014");
		DubboAddOrderResponse resp = dubboOrderService.addOrder(request);
		System.out.println(resp.toString());
	}
}
