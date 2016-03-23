package com.ninesale.valinor.image.provider;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.image.api.model.request.DubboImgUploadRequest;
import com.ninesale.valinor.image.api.model.response.DubboImgUploadSignResponse;
import com.ninesale.valinor.image.api.service.DubboImgUploadService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ImgUploadProvider {

	@Resource
	private DubboImgUploadService dubboImgUploadService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//createSign();
		//uploadImg();
	}
	
	public void createSign(){
		
		DubboImgUploadSignResponse dubboImgUploadSignResponse = dubboImgUploadService.createSign();
		System.out.println(dubboImgUploadSignResponse.toString()); 
	}
	public void uploadImg(){
		DubboImgUploadRequest dubboImgUploadRequest = new DubboImgUploadRequest();
		dubboImgUploadRequest.setCreateTime(new Date());
		dubboImgUploadRequest.setTypeId(new Integer(8));
		//DubboImgUploadResponse dubboImgUploadResponse = dubboImgUploadService.uploadImg(dubboImgUploadRequest);
		//System.out.println(dubboImgUploadResponse.toString()); 
	}
	 
}
