/**   
* @Title: NoteControllerMvcTest.java 
* @Package com.ninesale.valinor.apiserver.junit.web.controller.mvc 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月21日 下午2:28:18 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.junit.web.controller.mvc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ninesale.valinor.apiserver.test.utils.MockUtil;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddBrandTagRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryBrandTagByPageRequest;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:28:18
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class BrandTagControllerMvcTest extends AbstractContextControllerTests {
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void addBrandTag() {
		
		ClientAddBrandTagRequest req = new ClientAddBrandTagRequest();
		req.setBrandTagName("李宁"); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/brandtag/addbrandtag.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	@Test
	public void queryBrandTagByPage() {
		
		ClientQueryBrandTagByPageRequest req = new ClientQueryBrandTagByPageRequest();
		req.setBrandTagName("好孩子"); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/brandtag/querybrandtagbypage.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}


}
