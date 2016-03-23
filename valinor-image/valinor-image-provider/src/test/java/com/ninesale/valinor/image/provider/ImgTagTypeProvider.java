package com.ninesale.valinor.image.provider;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.image.provider.model.DtoImgTagType;
import com.ninesale.valinor.image.provider.service.ImgTagTypeService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ImgTagTypeProvider {

	@Resource
	private ImgTagTypeService imgTagTypeService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		queryImgTagTypeList();
		//insert();
	}
	
	public void insert(){
		DtoImgTagType imgTagType = new DtoImgTagType();
		imgTagType.setTypeName("typeName3"); 
		imgTagType.setCreateTime(new Date()); 
		imgTagType.setUpdateTime(new Date()); 
		Map<String, Object>  map = imgTagTypeService.insert(imgTagType);
		System.out.println(map.get("id")); 
		
	}
	
	public void queryImgTagTypeList(){
		DtoImgTagType imgTagType = new DtoImgTagType();
		//imgTagType.setTypeName("typeName3"); 
		List<DtoImgTagType> list = imgTagTypeService.queryImgTagTypeList(imgTagType);
		System.out.println(list.toString()); 
		
	}
}
