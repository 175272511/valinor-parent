package com.ninesale.valinor.image.provider;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.image.api.model.request.DubboAddImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboDelImgStoreListRequest;
import com.ninesale.valinor.image.api.model.request.DubboDelImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreListRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreTypeListRequest;
import com.ninesale.valinor.image.api.model.response.DubboAddImgStoreResponse;
import com.ninesale.valinor.image.api.model.response.DubboDelImgStoreResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgStoreListResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgStoreResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgStoreTypeListResponse;
import com.ninesale.valinor.image.api.service.DubboImgStoreService;
import com.ninesale.valinor.image.provider.model.DtoImgStore;
import com.ninesale.valinor.image.provider.model.DtoImgStoreTypeLocation;
import com.ninesale.valinor.image.provider.service.ImgStoreService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ImgStoreProvider {

	@Resource
	private DubboImgStoreService dubboImgStoreService;
	
	@Resource
	private ImgStoreService ImgStoreService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		update();
		//queryImgLocationList();
		//queryImgStoreTypeList();
		//save();
		//selectByPrimaryKey();
		//queryImgStoreList();
		//deleteByPrimaryKey();
		//deleteImgStoreByIds();
	}
	
	public void update(){
		DtoImgStore vo = new DtoImgStore();
		vo.setId(100082L); 
		vo.setImageText("图片配方2"); 
		ImgStoreService.updateByPrimaryKeySelective(vo);
	}
	
	public void queryImgLocationList(){
		List<Long> list2 = new ArrayList<Long>();
		list2.add(100038L);
		List<DtoImgStoreTypeLocation> list = ImgStoreService.queryImgLocationList(list2);
		System.out.println(list.toString());
		
	}
	
	public void queryImgStoreTypeList(){
		DubboQueryImgStoreTypeListRequest request = new DubboQueryImgStoreTypeListRequest();
		List<Long> ids = new ArrayList<Long>();
		ids.add(new Long(100025));
		ids.add(new Long(100026));
		ids.add(new Long(100027));
		ids.add(new Long(100028));
		request.setIds(ids);
		DubboQueryImgStoreTypeListResponse response = dubboImgStoreService.queryImgStoreTypeList(request);
		System.out.println(response.toString());
	}
	
	public void save(){
		DubboAddImgStoreRequest dubboAddImgStoreRequest = new DubboAddImgStoreRequest();
		
		dubboAddImgStoreRequest.setCreateTime(new Date()); 
		dubboAddImgStoreRequest.setDownloadUrl("http://xizai"); 
		dubboAddImgStoreRequest.setFileId("fileid6662"); 
		dubboAddImgStoreRequest.setImageText("imageText6662");
		dubboAddImgStoreRequest.setManageUrl("ManageUr6662"); 
		dubboAddImgStoreRequest.setTypeId(12345); 
		dubboAddImgStoreRequest.setUpdateTime(new Date()); 
		DubboAddImgStoreResponse response = dubboImgStoreService.insert(dubboAddImgStoreRequest);
		
		System.out.println(response.toString());
	}
	
	public void selectByPrimaryKey(){
		DubboQueryImgStoreRequest dubboQueryImgStoreRequest = new DubboQueryImgStoreRequest();
		dubboQueryImgStoreRequest.setId(new Long(100021)); 
		DubboQueryImgStoreResponse response = dubboImgStoreService.selectByPrimaryKey(dubboQueryImgStoreRequest);
		System.out.println(response.toString()); 
	}
	
	public void queryImgStoreList(){
		DubboQueryImgStoreListRequest dubboQueryImgStoreListRequest = new DubboQueryImgStoreListRequest();
		
		//dubboQueryImgStoreListRequest.setFileId("2f5f8860-279c-423e-a0c4-895a927853d9");
		dubboQueryImgStoreListRequest.setDownloadUrl("http://ninesale-10000941.image.myqcloud.com/04afc3aa-5f01-46a9-abe6-ff9200ade9ad");
		DubboQueryImgStoreListResponse response = dubboImgStoreService.queryImgStoreList(dubboQueryImgStoreListRequest);
		System.out.println(response.toString()); 
	}
	
	public void deleteByPrimaryKey(){
		DubboDelImgStoreRequest dubboDelImgStoreRequest = new DubboDelImgStoreRequest();
		Long id = new Long(100021);	
		dubboDelImgStoreRequest.setId(id); 
		DubboDelImgStoreResponse response = dubboImgStoreService.deleteByPrimaryKey(dubboDelImgStoreRequest);
		System.out.println(response.toString());
	}
	
	public void deleteImgStoreByIds(){
		DubboDelImgStoreListRequest dubboDelImgStoreListRequest = new DubboDelImgStoreListRequest();
		List<Long> ids = new ArrayList<Long>();
		ids.add(new Long(100021));
		ids.add(new Long(100023));
		ids.add(new Long(100022));
		dubboDelImgStoreListRequest.setIds(ids);
		DubboDelImgStoreResponse response = dubboImgStoreService.deleteImgStoreByIds(dubboDelImgStoreListRequest);
		System.out.println(response.toString());
	}
}
