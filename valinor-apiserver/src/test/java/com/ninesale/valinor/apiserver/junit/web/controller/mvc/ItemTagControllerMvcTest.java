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
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddItemTagRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryItemTagByPageRequest;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:28:18
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class ItemTagControllerMvcTest extends AbstractContextControllerTests {
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void addItemTag() {
		
		ClientAddItemTagRequest req = new ClientAddItemTagRequest();
		req.setItemTagName("好孩子商品名称4"); 
		req.setBrandTagId(1L);//
		String result = MockUtil.mock(mockMvc, "/baseinfo/itemtag/additemtag.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	@Test
	public void queryItemTagByPage() {
		
		ClientQueryItemTagByPageRequest req = new ClientQueryItemTagByPageRequest();
		req.setItemTagName("名称1");  
		req.setBrandTagId(2L); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/itemtag/queryitemtagbypage.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}

}
