/**   
* @Title: TestDubboNoteService.java 
* @Package com.ninesale.valinor.note.provider.test.junit 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月5日 下午3:17:03 
* @version V0.1
*/
package com.ninesale.valinor.note.provider.test.junit;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ninesale.valinor.note.api.model.request.note.DubboAddNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboGetMyNoteListNoteRequest;
import com.ninesale.valinor.note.api.model.response.note.DubboAddNoteResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboGetMyNoteListNoteResponse;
import com.ninesale.valinor.note.api.service.DubboNoteService;
import com.ninesale.valinor.note.provider.model.DtoNote;
import com.pubpi.common.utils.BeanMapper;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月5日 下午3:17:03
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml", "classpath*:spring/consumer/*" })
public class TestDubboNoteService {

	@Resource
	private DubboNoteService dubboNoteService;

	@Test
	public void testAddNote() {

		DubboAddNoteRequest request = new DubboAddNoteRequest();
		request.setUserId(10L);
		request.setNoteTitle("笔记标题");
		request.setNoteContent("日记描述");
		request.setNoteStatus(0);
		List<Long> imgIdList = new ArrayList<>();
		imgIdList.add(1L);
		imgIdList.add(2L);
		imgIdList.add(3L);
		request.setImgIdList(imgIdList);
		DubboAddNoteResponse addNoteResponse = dubboNoteService.addNote(request);

		System.out.println(addNoteResponse);
	}
	
	@Test
	public void test1() {

		DubboAddNoteRequest request = new DubboAddNoteRequest();
		request.setUserId(10L);
		request.setNoteTitle("笔记标题");
		request.setNoteContent("日记描述");
		request.setNoteStatus(0);
		List<Long> imgIdList = new ArrayList<>();
		imgIdList.add(1L);
		imgIdList.add(2L);
		imgIdList.add(3L);
		request.setImgIdList(imgIdList);
		
		DtoNote note = BeanMapper.map(request, DtoNote.class);
		
		DubboAddNoteResponse addNoteResponse = dubboNoteService.addNote(request);

		System.out.println(addNoteResponse);
	}
	
	@Test
	public void testGetMyNoteList() {

		DubboGetMyNoteListNoteRequest request = new DubboGetMyNoteListNoteRequest();
		request.setCurrentPage(1);
		request.setPageSize(10);
		request.setNoteStatus(0);
		
		DubboGetMyNoteListNoteResponse response = dubboNoteService.getMyNoteList(request);

		System.out.println(response);
	}
}
