package com.ninesale.valinor.image.provider;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.image.api.model.request.DubboAddImgTypeRequest;
import com.ninesale.valinor.image.api.model.request.DubboDelImgTypeRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgTypeListRequest;
import com.ninesale.valinor.image.api.model.request.DubboUpdateImgTypeRequest;
import com.ninesale.valinor.image.api.model.response.DubboAddImgTypeResponse;
import com.ninesale.valinor.image.api.model.response.DubboDelImgTypeResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTypeListResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTypeResponse;
import com.ninesale.valinor.image.api.model.response.DubboUpdateImgTypeResponse;
import com.ninesale.valinor.image.api.service.DubboImgTypeService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ImgTypeProvider {

	@Resource
	private DubboImgTypeService dubboImgTypeService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//save();
		//selectByPrimaryKey();
		//deleteByPrimaryKey();
		//updateByPrimaryKeySelective();
		queryImgTypeList();
	}
	
	public void save(){
		DubboAddImgTypeRequest dubboAddImgTypeRequest = new DubboAddImgTypeRequest();
		dubboAddImgTypeRequest.setCreateTime(new Date()); 
		dubboAddImgTypeRequest.setUpdateTime(new Date()); 
		dubboAddImgTypeRequest.setRemark("remark32");
		dubboAddImgTypeRequest.setTypeDesc("typedesc42"); 
		DubboAddImgTypeResponse response = dubboImgTypeService.insert(dubboAddImgTypeRequest);
		System.out.println(response.toString());
	}
	
	public void selectByPrimaryKey(){
		DubboQueryImgStoreRequest dubboQueryImgStoreRequest = new DubboQueryImgStoreRequest();
		Long id = new Long(14);
		dubboQueryImgStoreRequest.setId(id); 
		DubboQueryImgTypeResponse response = dubboImgTypeService.selectByPrimaryKey(dubboQueryImgStoreRequest);
		System.out.println(response.toString());
	}
	
	public void deleteByPrimaryKey(){
		DubboDelImgTypeRequest DubboDelImgTypeRequest = new DubboDelImgTypeRequest();
		Long id = new Long(14);
		DubboDelImgTypeRequest.setId(id); 
		DubboDelImgTypeResponse response = dubboImgTypeService.deleteByPrimaryKey(DubboDelImgTypeRequest);
		System.out.println(response.toString());
	}
	
	public void updateByPrimaryKeySelective(){
		DubboUpdateImgTypeRequest dubboUpdateImgTypeRequest = new DubboUpdateImgTypeRequest();
		dubboUpdateImgTypeRequest.setId(new Long(15));
		dubboUpdateImgTypeRequest.setRemark("updateRemark");
		dubboUpdateImgTypeRequest.setTypeDesc("updatRes"); 
		DubboUpdateImgTypeResponse response = dubboImgTypeService.updateByPrimaryKeySelective(dubboUpdateImgTypeRequest);
		System.out.println(response.toString());
	}
	
	
	public void queryImgTypeList(){
		DubboQueryImgTypeListRequest dubboQueryImgTypeListRequest = new DubboQueryImgTypeListRequest();
		
		DubboQueryImgTypeListResponse response = dubboImgTypeService.queryImgTypeList(dubboQueryImgTypeListRequest);
		System.out.println(response.toString());
	}
	
}
