package org.valinor.apiserver;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.order.api.model.request.DubboAddOrderRequest;
import com.ninesale.valinor.order.api.model.response.DubboAddOrderResponse;
import com.ninesale.valinor.order.api.service.DubboOrderService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml", "classpath:spring/spring-mvc.xml", "classpath*:spring/spring-mybatis.xml",
		"classpath*:spring/spring-shiro.xml" })
public class MerchantProviderTest {

	@Resource
	private DubboOrderService demoOrderService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {}
}
