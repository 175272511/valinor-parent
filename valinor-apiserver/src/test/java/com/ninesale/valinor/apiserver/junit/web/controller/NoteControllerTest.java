/**   
* @Title: NoteControllerTest.java 
* @Package com.ninesale.valinor.apiserver.junit.web.controller 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月20日 下午5:09:07 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.junit.web.controller;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ninesale.valinor.apiserver.web.model.note.ClientAddNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientImgTagGroup;
import com.ninesale.valinor.apiserver.web.model.note.ClientNoteImgInfo;
import com.ninesale.valinor.apiserver.web.model.note.ClientNoteInfoWithNumInfo;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月20日 下午5:09:07
 * 
 */
public class NoteControllerTest {
	private static ObjectMapper mapper = new ObjectMapper();

	@Test
	public void test() throws JsonProcessingException {
		ClientAddNoteRequest req = new ClientAddNoteRequest();

		List<ClientNoteImgInfo> imgList = new ArrayList<ClientNoteImgInfo>();
		for (int i = 0; i < 2; i++) {
			ClientNoteImgInfo temp = new ClientNoteImgInfo();

			temp.setDownloadUrl("http://www.yuntubdp.com/downloadurl");
			temp.setFileId("abcdefgh");
			temp.setImageText("图片配文");
			temp.setManageUrl("http://www.yuntubdp.com/managerurl");

			List<ClientImgTagGroup> imgTagInfo = new ArrayList<ClientImgTagGroup>();

			for (int j = 0; j < 2; j++) {
				ClientImgTagGroup temp1 = new ClientImgTagGroup();

				temp1.setCoordX(50);
				temp1.setCoordY(50);
				temp1.setShowWay(1);
				List<String> imgTagList = new ArrayList<String>();

				imgTagList.add("品牌1");
				imgTagList.add("商品名1");
				imgTagList.add("币种");
				imgTagList.add("");
				imgTagList.add("韩国");
				imgTagList.add("");

				temp1.setImgTagNameList(imgTagList);
				imgTagInfo.add(temp1);
			}

			temp.setImgTagGroupList(imgTagInfo);
			imgList.add(temp);
		}
		req.setImgList(imgList);

		req.setNoteContent("笔记配文");
		req.setNoteStatus(0);
		req.setNoteTitle("笔记标题");
		req.setReleasePlace("中国,湖北省,武汉市");

		List<String> tagList = new ArrayList<String>();
		tagList.add("中国");
		tagList.add("衣服");
		tagList.add("哈哈");
		tagList.add("你傻");
		req.setNoteTagList(tagList);

		 System.out.println(JSON.toJSONString(req));

//		System.out.println(mapper.writeValueAsString(req));
	}
	
	@Test
	public void test1() throws JsonProcessingException
	{
		ClientNoteInfoWithNumInfo temp = new ClientNoteInfoWithNumInfo();
		temp.setCollectNum(0);
		 System.out.println(JSON.toJSONString(temp));

		System.out.println(mapper.writeValueAsString(temp));		
	}
	


	/**
	 * Test method for {@link com.ninesale.valinor.apiserver.web.controller.NoteController#addNote(com.ninesale.valinor.apiserver.web.model.note.ClientAddNoteRequest)}.
	 */
	@Test
	public void testAddNote() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.apiserver.web.controller.NoteController#updateNote(com.ninesale.valinor.apiserver.web.model.note.ClientUpdateNoteRequest)}.
	 */
	@Test
	public void testUpdateNote() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.apiserver.web.controller.NoteController#getMyNoteList(com.ninesale.valinor.apiserver.web.model.note.ClientGetMyNoteListNoteRequest)}.
	 */
	@Test
	public void testGetMyNoteList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.apiserver.web.controller.NoteController#delNote(com.ninesale.valinor.apiserver.web.model.note.ClientDelNoteRequest)}.
	 */
	@Test
	public void testDelNote() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.apiserver.web.controller.NoteController#queryPublicNote(com.ninesale.valinor.apiserver.web.model.note.ClientQueryPublicNoteListNoteRequest)}.
	 */
	@Test
	public void testQueryPublicNote() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.apiserver.web.controller.NoteController#getCommentList(com.ninesale.valinor.apiserver.web.model.note.ClientGetCommentListRequest)}.
	 */
	@Test
	public void testGetCommentList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.apiserver.web.controller.NoteController#addComment(com.ninesale.valinor.apiserver.web.model.note.ClientAddCommentRequest)}.
	 */
	@Test
	public void testAddComment() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.apiserver.web.controller.NoteController#delComment(com.ninesale.valinor.apiserver.web.model.note.ClientDelCommentRequest)}.
	 */
	@Test
	public void testDelComment() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.apiserver.web.controller.NoteController#collectNote(com.ninesale.valinor.apiserver.web.model.note.ClientCollectNoteRequest)}.
	 */
	@Test
	public void testCollectCommentClientCollectNoteRequest() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.ninesale.valinor.apiserver.web.controller.NoteController#delCollectNote(com.ninesale.valinor.apiserver.web.model.note.ClientDelCollectNoteRequest)}.
	 */
	@Test
	public void testCollectCommentClientDelCollectNoteRequest() {
		fail("Not yet implemented");
	}



}
