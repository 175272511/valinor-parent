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
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryBaseinfoCountryRequest;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:28:18
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CountryControllerMvcTest extends AbstractContextControllerTests {
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void querycountrybypage() {
		
		ClientQueryBaseinfoCountryRequest req = new ClientQueryBaseinfoCountryRequest();
		req.setCountryNameCn("中文3"); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/country/querycountrybypage.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}

}
