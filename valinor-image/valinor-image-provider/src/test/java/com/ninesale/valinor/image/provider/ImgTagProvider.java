package com.ninesale.valinor.image.provider;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.image.api.model.dto.DubboImg;
import com.ninesale.valinor.image.api.model.dto.DubboImgTagGroup;
import com.ninesale.valinor.image.api.model.request.DubboInsertUpdateImgRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgTagRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryTagRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryTagTypeRequest;
import com.ninesale.valinor.image.api.model.response.DubboInsertUpdateImgResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTagResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryTagResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryTagTypeResponse;
import com.ninesale.valinor.image.api.service.DubboImgService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ImgTagProvider {

	@Resource
	private DubboImgService dubboImgService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//queryTagTypeList();
		//queryTagList();
		queryImgLocalTagList();
		//insert();
	}
	
	public void queryTagTypeList(){
		DubboQueryTagTypeRequest request = new DubboQueryTagTypeRequest();
		request.setTypeName("typeName");
		DubboQueryTagTypeResponse response = dubboImgService.queryTagTypeList(request);
		System.out.println(response.toString()); 
	}
	
	public void queryTagList(){
		DubboQueryTagRequest request = new DubboQueryTagRequest();
		request.setId(4L);
		request.setTagTypeId(2L); 
		request.setTagName("tagName2"); 
		DubboQueryTagResponse response = dubboImgService.queryTagList(request);
		System.out.println(response.toString()); 
	}
	
	public void queryImgLocalTagList(){
		DubboQueryImgTagRequest request = new DubboQueryImgTagRequest();
		List<Long> list = new ArrayList<Long>();
		list.add(100053L);
		list.add(100054L);
		request.setImgIdList(list); 
		DubboQueryImgTagResponse response = dubboImgService.queryImgList(request);
		System.out.println(response.toString()); 
	}
	
	public void insert(){
		
		DubboInsertUpdateImgRequest request = new DubboInsertUpdateImgRequest();
		
		List<DubboImg> imgList = new ArrayList<DubboImg>();
		DubboImg imgVO = new DubboImg(); 
		//图片基本信息
		imgVO.setDownloadUrl("downloadUrl22678");
		imgVO.setFileId("fileId2267");
		imgVO.setImageText("imageText22678");
		imgVO.setManageUrl("manageUrl22678");
		imgVO.setTypeId(8L);//图片所属类型（比喻笔记图片、用户图片、商品图片等等）
		
		//标签位置信息
		List<DubboImgTagGroup> imgTagInfoList = new ArrayList<DubboImgTagGroup>();
		DubboImgTagGroup locVO = new DubboImgTagGroup();
		locVO.setCoordX(3214);
		locVO.setCoordY(3614);
		locVO.setShowWay(24);
		
		
		DubboImgTagGroup locVO2 = new DubboImgTagGroup();
		locVO2.setCoordX(321);
		locVO2.setCoordY(362);
		locVO2.setShowWay(2);
		
		//标签信息
		List<String> imgTagList = new ArrayList<String>();
		for(int i=0;i<3;i++){
			imgTagList.add("GG"+i); 
		}
		
		for(int i=0;i<3;i++){
			imgTagList.add("");  
		}
		
		locVO.setImgTagNameList(imgTagList);
		imgTagInfoList.add(locVO);
		//标签信息
		/*List<String> imgTagList2 = new ArrayList<String>();
		for(int i=0;i<2;i++){
			imgTagList2.add("bb"+i);
		}
		locVO.setImgTagNameList(imgTagList2);
		
		imgTagInfoList.add(locVO);*/
		
		//标签信息
		List<String> imgTagList3 = new ArrayList<String>();
		for(int i=0;i<6;i++){
			imgTagList3.add("cc"+i);
		}
		locVO2.setImgTagNameList(imgTagList3);
				
		imgTagInfoList.add(locVO2);
		
		imgVO.setImgTagGroupList(imgTagInfoList);
		
		imgList.add(imgVO);
		
		request.setImgList(imgList);
		
		DubboInsertUpdateImgResponse reponse = dubboImgService.insertUpdateImgAndTag(request);
		System.out.println(reponse.toString());
		
	}
}
