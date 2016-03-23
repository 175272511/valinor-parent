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
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddCurrencyRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryCurrencyByPageRequest;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:28:18
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CurrencyControllerMvcTest extends AbstractContextControllerTests {
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void addCurrency() {
		
		ClientAddCurrencyRequest req = new ClientAddCurrencyRequest();
		req.setCurrencyName("人民币"); 
		req.setCurrencyCode("CNY"); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/currency/addcurrency.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	@Test
	public void queryCurrencyByPage() {
		
		ClientQueryCurrencyByPageRequest req = new ClientQueryCurrencyByPageRequest();
		req.setCurrencyName("人民币");  
		String result = MockUtil.mock(mockMvc, "/baseinfo/currency/querycurrencybypage.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}

}
