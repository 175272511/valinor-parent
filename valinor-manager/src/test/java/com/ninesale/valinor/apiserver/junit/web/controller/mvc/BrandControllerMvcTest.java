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
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryBrandByPageRequest;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:28:18
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class BrandControllerMvcTest extends AbstractContextControllerTests {

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#delCollectNote(com.ninesale.valinor.apiserver.web.model.note.ClientDelCollectNoteRequest)}
	 * .
	 */
	@Test
	public void testCollectCommentClientDelCollectNoteRequest() {
		
		ClientQueryBrandByPageRequest req = new ClientQueryBrandByPageRequest();
		req.setPageSize(2); 
		req.setCurrentPage(1);
		String result = MockUtil.mock(mockMvc, "/baseinfo/brand/querybrandbypage.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}

}
