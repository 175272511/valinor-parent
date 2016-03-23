/**   
* @Title: TestApi.java 
* @Package com.ninesale.valinor.order.provider.test.testapi 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月5日 下午5:32:55 
* @version V0.1
*/
package com.ninesale.valinor.order.provider.test.testapi;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ninesale.valinor.order.api.model.request.DubboAddOrderRequest;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月5日 下午5:32:55
 * 
 */
public class TestApi {

	@Test
	public void test() {
		DubboAddOrderRequest req = new DubboAddOrderRequest();
		req.setTid("1111");

		System.out.println(req.toString());
	}

}
