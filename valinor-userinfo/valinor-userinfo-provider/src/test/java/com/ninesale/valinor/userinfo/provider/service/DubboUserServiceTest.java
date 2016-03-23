/**
 * 
 */
package com.ninesale.valinor.userinfo.provider.service;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernPersonListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernTagListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernTagRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboGetUserCountRequest;
import com.ninesale.valinor.userinfo.api.model.response.DubboConcernNoteListResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboConcernPersonListResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboConcernTagListResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboGetUserCountResponse;
import com.ninesale.valinor.userinfo.api.service.DubboUserService;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @author liuhui
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext.xml", "classpath*:spring/spring-mybatis.xml" })
public class DubboUserServiceTest {

	@Resource
	private DubboUserService dubboUserService;
	
	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#addUserAddress(com.ninesale.valinor.userinfo.api.model.request.DubboAddUserAddressRequest)}.
	 */
	@Test
	public void testAddUserAddress() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getUserAddress(com.ninesale.valinor.userinfo.api.model.request.DubboGetAddressRequest)}.
	 */
	@Test
	public void testGetUserAddress() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#updateUserAddress(com.ninesale.valinor.userinfo.api.model.request.DubboAddUserAddressRequest)}.
	 */
	@Test
	public void testUpdateUserAddress() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getUserPoints(com.ninesale.valinor.userinfo.api.model.request.DubboUserPointsRequest)}.
	 */
	@Test
	public void testGetUserPoints() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getUserReceipt(com.ninesale.valinor.userinfo.api.model.request.DubboReceiptRequest)}.
	 */
	@Test
	public void testGetUserReceipt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#addUserReceipt(com.ninesale.valinor.userinfo.api.model.request.DubboAddUserReceiptRequest)}.
	 */
	@Test
	public void testAddUserReceipt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#delUserReceipt(com.ninesale.valinor.userinfo.api.model.request.DubboDelUserReceiptRequest)}.
	 */
	@Test
	public void testDelUserReceipt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getUserOrderInfo(com.ninesale.valinor.userinfo.api.model.request.DubboGetUserOrderInfoRequest)}.
	 */
	@Test
	public void testGetUserOrderInfo() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getUserCollect(com.ninesale.valinor.userinfo.api.model.request.DubboGetUserCollectRequest)}.
	 */
	@Test
	public void testGetUserCollect() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getUserWallet(com.ninesale.valinor.userinfo.api.model.request.DubboUserWalletRequest)}.
	 */
	@Test
	public void testGetUserWallet() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getSkuIdByUserId(com.ninesale.valinor.userinfo.api.model.request.DubboGetUserCollectRequest)}.
	 */
	@Test
	public void testGetSkuIdByUserId() {
		fail("Not yet implemented");
	}



	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getPersoncount(com.ninesale.valinor.userinfo.api.model.request.DubboGetUserCountRequest)}.
	 */
	@Test
	public void testGetPersoncount() {
		DubboGetUserCountRequest request = new DubboGetUserCountRequest();
		request.setUserId(5L);
		DubboGetUserCountResponse response = null;
		try {
			response = dubboUserService.getPersonCount(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("==>" + response);
		
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#concern(com.ninesale.valinor.userinfo.api.model.request.DubboConcernRequest)}.
	 */
	@Test
	public void testConcern() {
		DubboConcernRequest request = new DubboConcernRequest();
		request.setUserId(1L);
		request.setUsername("13691951952");
		request.setConcernId(5L);
		request.setConcernName("13686111551");
		
		DubboBasicResponse response = null;
		try {
			response = dubboUserService.concern(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(response);
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#cancelConcern(com.ninesale.valinor.userinfo.api.model.request.DubboConcernRequest)}.
	 */
	@Test
	public void testCancelConcern() {
		DubboConcernRequest request = new DubboConcernRequest();
		request.setUserId(1L);
		request.setUsername("13691951952");
		request.setConcernId(5L);
		request.setConcernName("13686111551");
		
		DubboBasicResponse response = null;
		try {
			response = dubboUserService.cancelConcern(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(response);
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#concernNote(com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteRequest)}.
	 */
	@Test
	public void testConcernNote() {
		DubboConcernNoteRequest request = new DubboConcernNoteRequest();
		request.setUserId(1L);
		request.setNoteId(2L);
		request.setNoteTitle("关注笔记标题");
		
		DubboBasicResponse response = null;
		try {
			response = dubboUserService.concernNote(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(response);
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#cancelConcernNote(com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteRequest)}.
	 */
	@Test
	public void testCancelConcernNote() {
		DubboConcernNoteRequest request = new DubboConcernNoteRequest();
		request.setUserId(1L);
		request.setNoteId(2L);
		
		DubboBasicResponse response = null;
		try {
			response = dubboUserService.cancelConcernNote(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(response);
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#concernTag(com.ninesale.valinor.userinfo.api.model.request.DubboConcernTagRequest)}.
	 */
	@Test
	public void testConcernTag() {
		DubboConcernTagRequest request = new DubboConcernTagRequest();
		request.setUserId(1L);
		request.setTagId(124L);
		request.setTagName("标签名");
		
		DubboBasicResponse response = null;
		try {
			response = dubboUserService.concernTag(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(response);
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#cancelConcernTag(com.ninesale.valinor.userinfo.api.model.request.DubboConcernTagRequest)}.
	 */
	@Test
	public void testCancelConcernTag() {
		DubboConcernTagRequest request = new DubboConcernTagRequest();
		request.setUserId(1L);
		request.setTagId(123L);
		
		DubboBasicResponse response = null;
		try {
			response = dubboUserService.cancelConcernTag(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(response);
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getConcernPersonList(com.ninesale.valinor.userinfo.api.model.request.DubboConcernPersonListRequest)}.
	 */
	@Test
	public void testGetConcernPersonList() {
		DubboConcernPersonListRequest request = new DubboConcernPersonListRequest();
		request.setUserId(1L);
		request.setCurrentPage(0);
		request.setPageSize(10);
		request.setBeginId(0);
		
		DubboConcernPersonListResponse response = null;
		try {
			response = dubboUserService.getConcernPersonList(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(response);
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getConcernNoteList(com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteListRequest)}.
	 */
	@Test
	public void testGetConcernNoteList() {
		DubboConcernNoteListRequest request = new DubboConcernNoteListRequest();
		request.setUserId(1L);
		request.setCurrentPage(0);
		request.setPageSize(10);
		request.setBeginId(0);
		
		DubboConcernNoteListResponse response = null;
		try {
			response = dubboUserService.getConcernNoteList(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(response);
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#getConcernTagList(com.ninesale.valinor.userinfo.api.model.request.DubboConcernTagListRequest)}.
	 */
	@Test
	public void testGetConcernTagList() {
		DubboConcernTagListRequest request = new DubboConcernTagListRequest();
		request.setUserId(1L);
		
		DubboConcernTagListResponse response = null;
		try {
			response = dubboUserService.getConcernTagList(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(response);
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#praise(com.ninesale.valinor.userinfo.api.model.request.DubboPraiseRequest)}.
	 */
	@Test
	public void testPraise() {
//		DubboPraiseRequest request = new DubboPraiseRequest();
//		request.setUserId(1L);
//		request.setNoteId(124L);
//		request.setNoteTitle("点赞笔记标题1");
//		
//		DubboBasicResponse response = null;
//		try {
//			response = dubboUserService.praise(request);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(response);
	}

	/**
	 * Test method for {@link com.ninesale.valinor.userinfo.api.service.DubboUserService#cancelPraise(com.ninesale.valinor.userinfo.api.model.request.DubboPraiseRequest)}.
	 */
	@Test
	public void testCancelPraise() {
//		DubboPraiseRequest request = new DubboPraiseRequest();
//		request.setUserId(1L);
//		request.setNoteId(124L);
//		request.setNoteTitle("点赞笔记标题1");
//		
//		DubboBasicResponse response = null;
//		try {
//			response = dubboUserService.cancelPraise(request);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(response);
	}

}
