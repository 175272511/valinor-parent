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
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddBaseinfoCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientDownUpBaseinfoCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryAllCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryParentCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQuerySubCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientUpdateBaseinfoCategRequest;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:28:18
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CategControllerMvcTest extends AbstractContextControllerTests {

	/**
	 * Test method for
	 * .
	 */
	@Test
	public void addCateg() {
		
		ClientAddBaseinfoCategRequest req = new ClientAddBaseinfoCategRequest();
		req.setCategName("categName2"); 
		req.setParentCategId(0); 
		req.setCategLevel(1); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/category/addcateg.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void updateCateg() {
		
		ClientUpdateBaseinfoCategRequest req = new ClientUpdateBaseinfoCategRequest();
		req.setCategName("护肤"); 
		req.setCategId(15L); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/category/updatecateg.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void downUpCateg() {
		
		ClientDownUpBaseinfoCategRequest req = new ClientDownUpBaseinfoCategRequest();
		req.setCategId(15L);
		req.setValidFlag(1); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/category/downupcateg.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void queryParentCateg() {
		
		ClientQueryParentCategRequest req = new ClientQueryParentCategRequest();
		String result = MockUtil.mock(mockMvc, "/baseinfo/category/queryparentcateg.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void querySubCateg() {
		
		ClientQuerySubCategRequest req = new ClientQuerySubCategRequest();
		req.setParentCategId(1); 
		String result = MockUtil.mock(mockMvc, "/baseinfo/category/querysubcateg.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void queryAllCateg() {
		
		ClientQueryAllCategRequest req = new ClientQueryAllCategRequest();
		String result = MockUtil.mock(mockMvc, "/baseinfo/category/queryallcateg.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}

}
