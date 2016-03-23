/**   
* @Title: TestDubboOrderService.java 
* @Package com.ninesale.valinor.comment.provider.test.junit 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月5日 下午3:17:03 
* @version V0.1
*/
package com.ninesale.valinor.comment.provider.test.junit;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ninesale.valinor.comment.api.model.DubboAddCommentRequest;
import com.ninesale.valinor.comment.api.model.DubboAddCommentResponse;
import com.ninesale.valinor.comment.api.service.DubboCommentService;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月5日 下午3:17:03
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml", "classpath*:spring/consumer/*" })
public class TestDubboOrderService {

	@Resource
	private DubboCommentService dubboCommentService;

	@Test
	public void test() {

		DubboAddCommentRequest request = new DubboAddCommentRequest();
//		request.setCreateTime(new Date());
//		request.setOrderId(10L);
//
//		request.setOrderNo("20151014");
		DubboAddCommentResponse resp = dubboCommentService.addComment(request);
		System.out.println(resp.toString());
	}
}
