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
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddBaseinfoCountryRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryBaseinfoCountryRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientUpdateBaseinfoCountryRequest;

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
	public void addCountry() {
		
		ClientAddBaseinfoCountryRequest req = new ClientAddBaseinfoCountryRequest();
		req.setCountryNameCn("countryNameCn");
		req.setCountryNameEn("countryNameEn");
		req.setCountryCode("countryCode");
		req.setCountryDesc("countryDesc"); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/country/addcountry.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void updateCountry() {
		
		ClientUpdateBaseinfoCountryRequest req = new ClientUpdateBaseinfoCountryRequest();
		req.setCountryId(1L);
		req.setCountryNameCn("countryNameCnUpdate");
		req.setCountryNameEn("countryNameEnUpdate"); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/country/updatecountry.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void querycountrybypage() {
		
		ClientQueryBaseinfoCountryRequest req = new ClientQueryBaseinfoCountryRequest();
		req.setPageSize(2);
		req.setCurrentPage(1); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/country/querycountrybypage.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}

}
