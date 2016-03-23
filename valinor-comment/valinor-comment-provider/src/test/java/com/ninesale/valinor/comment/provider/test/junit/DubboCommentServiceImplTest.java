/**   
* @Title: DubboCommentServiceImplTest.java 
* @Package com.ninesale.valinor.comment.api.service.impl 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月25日 下午4:56:42 
* @version V0.1
*/
package com.ninesale.valinor.comment.provider.test.junit;

import static org.junit.Assert.fail;

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
 * @date 2015年11月25日 下午4:56:42
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml", "classpath*:spring/consumer/*" })
public class DubboCommentServiceImplTest {

	@Resource
	private DubboCommentService dubboCommentService;

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.comment.api.service.impl.DubboCommentServiceImpl#addComment(com.ninesale.valinor.comment.api.model.DubboAddCommentRequest)}
	 * .
	 */
	@Test
	public void testAddComment() {

		DubboAddCommentRequest request = new DubboAddCommentRequest();
		request.setContent("111111111111");
		request.setNoteId(10L);
		request.setUserId(10L);

		DubboAddCommentResponse addNoteResponse = dubboCommentService.addComment(request);

		System.out.println(addNoteResponse);

	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.comment.api.service.impl.DubboCommentServiceImpl#getCommentList(com.ninesale.valinor.comment.api.model.DubboGetCommentListRequest)}
	 * .
	 */
	@Test
	public void testGetCommentList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.comment.api.service.impl.DubboCommentServiceImpl#delComment(com.ninesale.valinor.comment.api.model.DubboDelCommentRequest)}
	 * .
	 */
	@Test
	public void testDelComment() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.comment.api.service.impl.DubboCommentServiceImpl#collectNote(com.ninesale.valinor.comment.api.model.DubboCollectNoteRequest)}
	 * .
	 */
	@Test
	public void testCollectNote() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.comment.api.service.impl.DubboCommentServiceImpl#delCollectNote(com.ninesale.valinor.comment.api.model.DubboDelCollectNoteRequest)}
	 * .
	 */
	@Test
	public void testDelCollectNote() {
		fail("Not yet implemented");
	}

}
