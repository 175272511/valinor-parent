/**   
* @Title: NoteControllerMvcTest.java 
* @Package com.ninesale.valinor.apiserver.junit.web.controller.mvc 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月21日 下午2:28:18 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.junit.web.controller.mvc;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ninesale.valinor.apiserver.test.utils.MockUtil;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.note.ClientAddCommentRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientAddNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientGetCommentListRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientGetMyNoteListNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientImgTagGroup;
import com.ninesale.valinor.apiserver.web.model.note.ClientNoteImgInfo;
import com.ninesale.valinor.apiserver.web.model.note.ClientQueryNoteByNoteIdRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientQueryPublicNoteListNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientUpdateNoteRequest;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:28:18
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class NoteControllerMvcTest extends AbstractContextControllerTests {
	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#addNote(com.ninesale.valinor.apiserver.web.model.note.ClientAddNoteRequest)}
	 * .
	 * 
	 * @throws JsonProcessingException
	 */
	@Test
	public void testAddNote() throws JsonProcessingException {
		ClientAddNoteRequest req = new ClientAddNoteRequest();

		List<ClientNoteImgInfo> imgList = new ArrayList<ClientNoteImgInfo>();
		for (int i = 0; i < 2; i++) {

			ClientNoteImgInfo temp = new ClientNoteImgInfo();

			temp.setDownloadUrl("http://www.yuntubdp.com/downloadurl" + UUID.randomUUID().toString());
			temp.setFileId(UUID.randomUUID().toString() + i);
			temp.setImageText("图片配文");
			temp.setManageUrl("http://www.yuntubdp.com/managerurl" + UUID.randomUUID().toString());

			List<ClientImgTagGroup> imgTagInfo = new ArrayList<ClientImgTagGroup>();

			for (int j = 0; j < 2; j++) {
				ClientImgTagGroup temp1 = new ClientImgTagGroup();

				temp1.setCoordX(50);
				temp1.setCoordY(50);
				temp1.setShowWay(1);
				List<String> imgTagList = new ArrayList<String>();

				imgTagList.add("GXG");
				imgTagList.add("短袖衬衫");
				imgTagList.add("人民币");
				imgTagList.add("10");
				imgTagList.add("韩国" + i + j);
				imgTagList.add("首尔下水道");

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

		String result = MockUtil.mock(mockMvc, "/note/addnote.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		System.out.println(mapper.writeValueAsString(req));
		System.out.println(result);

	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#updateNote(com.ninesale.valinor.apiserver.web.model.note.ClientUpdateNoteRequest)}
	 * .
	 * 
	 * @throws JsonProcessingException
	 */
	@Test
	public void testUpdateNote() throws JsonProcessingException {
		ClientUpdateNoteRequest req = new ClientUpdateNoteRequest();

		req.setNoteId(1L);
		List<ClientNoteImgInfo> imgList = new ArrayList<ClientNoteImgInfo>();
		for (int i = 0; i < 2; i++) {

			ClientNoteImgInfo temp = new ClientNoteImgInfo();

			temp.setDownloadUrl("http://www.yuntubdp.com/downloadurl" + i);
			temp.setFileId("gxabcdefgh" + i);
			temp.setImageText("更新图片配文");
			temp.setManageUrl("http://www.yuntubdp.com/managerurl");

			List<ClientImgTagGroup> imgTagInfo = new ArrayList<ClientImgTagGroup>();

			for (int j = 0; j < 2; j++) {
				ClientImgTagGroup temp1 = new ClientImgTagGroup();

				temp1.setCoordX(50);
				temp1.setCoordY(50);
				temp1.setShowWay(1);
				List<String> imgTagList = new ArrayList<String>();

				imgTagList.add("品1牌1");
				imgTagList.add("商品名1");
				imgTagList.add("币种");
				imgTagList.add("");
				imgTagList.add("韩国111" + i + j);
				imgTagList.add("");

				temp1.setImgTagNameList(imgTagList);
				imgTagInfo.add(temp1);
			}

			temp.setImgTagGroupList(imgTagInfo);
			imgList.add(temp);
		}
		req.setImgList(imgList);

		req.setNoteContent("笔记配文1234123");
		req.setNoteStatus(0);
		req.setNoteTitle("笔记标题12341234");
		req.setReleasePlace("中国1111,湖北省,11111武汉市");

		List<String> tagList = new ArrayList<String>();
		tagList.add("中国");
		tagList.add("衣服");
		tagList.add("哈哈");
		tagList.add("你傻");
		req.setNoteTagList(tagList);

		String result = MockUtil.mock(mockMvc, "/note/updatenote.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));

		System.out.println(mapper.writeValueAsString(req));
		System.out.println(result);
	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#getMyNoteList(com.ninesale.valinor.apiserver.web.model.note.ClientGetMyNoteListNoteRequest)}
	 * .
	 * 
	 * @throws JsonProcessingException
	 */
	@Test
	public void testGetMyNoteList() throws JsonProcessingException {
		ClientGetMyNoteListNoteRequest req = new ClientGetMyNoteListNoteRequest();

		req.setCurrentPage(1);
		req.setPageSize(10);
		req.setNoteStatus(0);

		String result = MockUtil.mock(mockMvc, "/note/getmynotelist.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));

		System.out.println(mapper.writeValueAsString(req));
		System.out.println(result);
	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#delNote(com.ninesale.valinor.apiserver.web.model.note.ClientDelNoteRequest)}
	 * .
	 */
	@Test
	public void testDelNote() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#queryPublicNote(com.ninesale.valinor.apiserver.web.model.note.ClientQueryPublicNoteListNoteRequest)}
	 * .
	 * 
	 * @throws JsonProcessingException
	 */
	@Test
	public void testQueryPublicNote() throws JsonProcessingException {
		ClientQueryPublicNoteListNoteRequest req = new ClientQueryPublicNoteListNoteRequest();

		req.setCurrentPage(1);
		req.setPageSize(2);

		String result = MockUtil.mock(mockMvc, "/note/querypublicnote.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));

		System.out.println(mapper.writeValueAsString(req));
		System.out.println(result);
	}

	@Test
	public void testQueryNoteById() throws JsonProcessingException {
		ClientQueryNoteByNoteIdRequest req = new ClientQueryNoteByNoteIdRequest();

		req.setNoteId(1L);
		String result = MockUtil.mock(mockMvc, "/note/querynotebyid.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));

		System.out.println(mapper.writeValueAsString(req));
		System.out.println(result);
	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#getCommentList(com.ninesale.valinor.apiserver.web.model.note.ClientGetCommentListRequest)}
	 * .
	 */
	@Test
	public void testGetCommentList() {
		ClientGetCommentListRequest req = new ClientGetCommentListRequest();

		req.setNoteId(10L);
		req.setPageSize(10);
		req.setCurrentPage(1);

		String result = MockUtil.mock(mockMvc, "/note/getcommentlist.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#addComment(com.ninesale.valinor.apiserver.web.model.note.ClientAddCommentRequest)}
	 * .
	 */
	@Test
	public void testAddComment() {

		ClientAddCommentRequest req = new ClientAddCommentRequest();

		req.setNoteId(10L);
		req.setContent("1111111111111");

		String result = MockUtil.mock(mockMvc, "/note/addcomment.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));

	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#delComment(com.ninesale.valinor.apiserver.web.model.note.ClientDelCommentRequest)}
	 * .
	 */
	@Test
	public void testDelComment() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#collectNote(com.ninesale.valinor.apiserver.web.model.note.ClientCollectNoteRequest)}
	 * .
	 */
	@Test
	public void testCollectCommentClientCollectNoteRequest() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.ninesale.valinor.apiserver.web.controller.NoteController#delCollectNote(com.ninesale.valinor.apiserver.web.model.note.ClientDelCollectNoteRequest)}
	 * .
	 */
	@Test
	public void testCollectCommentClientDelCollectNoteRequest() {
		fail("Not yet implemented");
	}

}
