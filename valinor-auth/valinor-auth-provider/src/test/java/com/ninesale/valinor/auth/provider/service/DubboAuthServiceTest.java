/**
 * 
 */
package com.ninesale.valinor.auth.provider.service;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ninesale.valinor.auth.api.model.DtoContacts;
import com.ninesale.valinor.auth.api.model.request.DubboConstactsRequest;
import com.ninesale.valinor.auth.api.model.request.DubboGetContactsRequest;
import com.ninesale.valinor.auth.api.model.response.DubboGetContactsResponse;
import com.ninesale.valinor.auth.api.service.DubboAuthService;

/**
 * @author liuhui
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext.xml", "classpath*:spring/spring-mybatis.xml" })
public class DubboAuthServiceTest {
	
	@Resource
	private DubboAuthService dubboAuthService;

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#login(com.ninesale.valinor.auth.api.model.request.DubboLoginRequest)}.
	 */
	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#getUserByUsername(com.ninesale.valinor.auth.api.model.request.DubboUserNameRequest)}.
	 */
	@Test
	public void testGetUserByUsername() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#getManagerByUsername(com.ninesale.valinor.auth.api.model.request.DubboUserNameRequest)}.
	 */
	@Test
	public void testGetManagerByUsername() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#addUser(com.ninesale.valinor.auth.api.model.request.DubboUserRequest)}.
	 */
	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#updateUser(com.ninesale.valinor.auth.api.model.request.DubboUserRequest)}.
	 */
	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#delUser(com.ninesale.valinor.auth.api.model.request.DubboDelUserRequest)}.
	 */
	@Test
	public void testDelUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#getUserList(com.ninesale.valinor.auth.api.model.request.DubboUserPageRequest)}.
	 */
	@Test
	public void testGetUserList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#getUserCount(com.ninesale.valinor.auth.api.model.request.DubboUserRequest)}.
	 */
	@Test
	public void testGetUserCount() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#getUserById(com.ninesale.valinor.auth.api.model.request.DubboUserIdRequest)}.
	 */
	@Test
	public void testGetUserById() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#getUserByOpenId(com.ninesale.valinor.auth.api.model.request.DubboOpenIdRequest)}.
	 */
	@Test
	public void testGetUserByOpenId() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#addOpenId(com.ninesale.valinor.auth.api.model.request.DubboAddOpenIdRequest)}.
	 */
	@Test
	public void testAddOpenId() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#getOpenIdByUserId(com.ninesale.valinor.auth.api.model.request.DubboUserIdRequest)}.
	 */
	@Test
	public void testGetOpenIdByUserId() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#register(com.ninesale.valinor.auth.api.model.request.DubboRegisterRequest)}.
	 */
	@Test
	public void testRegister() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.auth.api.service.DubboAuthService#sendVerifyCode(com.ninesale.valinor.auth.api.model.request.DubboVerifyRequest)}.
	 */
	@Test
	public void testSendVerifyCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testUploadContacts() {
		DubboConstactsRequest request = new DubboConstactsRequest();
		request.setUserId(123L);
		List<DtoContacts> data = new ArrayList<>();
		DtoContacts contacts = new DtoContacts();
		contacts.setLookup("111");
		contacts.setPhone("15800000000");
		contacts.setStatus("1");
		contacts.setUsername("test1");
		data.add(contacts);
		DtoContacts contacts1 = new DtoContacts();
		contacts1.setLookup("222");
		contacts1.setPhone("15800000001");
		contacts1.setStatus("1");
		contacts1.setUsername("test2");
		data.add(contacts1);
		request.setContacts(data);
		try {
			dubboAuthService.uploadContacts(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getContacts(com.ninesale.valinor.userinfo.api.model.request.DubboGetContactsRequest)}.
	 */
	@Test
	public void testGetContacts() {
		DubboGetContactsRequest request = new DubboGetContactsRequest();
		request.setUserId(123L);
		
		DubboGetContactsResponse response = null;
		try {
			response = dubboAuthService.getContacts(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(response);
	}

}
