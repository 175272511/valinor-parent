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
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQuerySubCategRequest;
import com.ninesale.valinor.apiserver.web.model.note.request.ClientAddNoteTopicRequest;
import com.ninesale.valinor.apiserver.web.model.note.request.ClientDownUpNoteTopicRequest;
import com.ninesale.valinor.apiserver.web.model.note.request.ClientQueryTopicByPageRequest;
import com.ninesale.valinor.apiserver.web.model.note.request.ClientUpdateNoteTopicRequest;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:28:18
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TopicControllerMvcTest extends AbstractContextControllerTests {

	/**
	 * Test method for
	 * .
	 */
	@Test
	public void addTopic() {
		
		ClientAddNoteTopicRequest req = new ClientAddNoteTopicRequest();
		req.setTopicName("topicName1");
		req.setTopicDes("topicDes1"); 
		String result = MockUtil.mock(mockMvc, "/note/topic/addtopic.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void updateTopic() {
		
		ClientUpdateNoteTopicRequest req = new ClientUpdateNoteTopicRequest();
		req.setTopicId(1L);
		req.setTopicName("topicNameupdate"); 
		String result = MockUtil.mock(mockMvc, "/note/topic/updatetopic.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void downUpTopic() {
		
		ClientDownUpNoteTopicRequest req = new ClientDownUpNoteTopicRequest();
		req.setTopicId(1L);
		req.setValidFlag(1); 
		String result = MockUtil.mock(mockMvc, "/note/topic/downuptopic.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void queryTopicByPage() {
		
		ClientQueryTopicByPageRequest req = new ClientQueryTopicByPageRequest();
		req.setPageSize(2);
		req.setCurrentPage(1); 
		String result = MockUtil.mock(mockMvc, "/note/topic/querytopicbypage.do", req);
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

}
