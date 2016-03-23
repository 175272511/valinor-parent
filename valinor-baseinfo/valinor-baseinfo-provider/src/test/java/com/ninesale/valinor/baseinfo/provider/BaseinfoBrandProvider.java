package com.ninesale.valinor.baseinfo.provider;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoBrand;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboAddBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboQueryBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboQueryBrandByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboUpdateBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboAddBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboQueryBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboQueryBrandByPageResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboUpdateBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoBrandService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class BaseinfoBrandProvider {
	@Resource
	private DubboBaseinfoBrandService dubboBaseinfoBrandService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//save();
		//updateByPrimaryKeySelective();
		//downuUpBrand();
		queryBrandByPage();
		// selectByPrimaryKey();
		// deleteByPrimaryKey();
	}
	
	public void queryBrandByPage() {
		DubboQueryBrandByPageRequest request = new DubboQueryBrandByPageRequest();
		request.setPageSize(2);
		request.setCurrentPage(1); 
		request.setBrandNameCn("新浪");
		DubboQueryBrandByPageResponse response = dubboBaseinfoBrandService.queryBrandByPage(request);
		System.out.println(response.toString());
	}

	public void save() {
		
		DubboAddBaseinfoBrandRequest dubboAddBaseinfoBrandRequest = new DubboAddBaseinfoBrandRequest();
		dubboAddBaseinfoBrandRequest.setBrandNameCn("新浪234");
		dubboAddBaseinfoBrandRequest.setBrandNameEn("Sina234");
		dubboAddBaseinfoBrandRequest.setModifyUserId(new Long(100001));
		dubboAddBaseinfoBrandRequest.setModifyUserName("Messi234");

		DubboAddBaseinfoBrandResponse response = dubboBaseinfoBrandService.insert(dubboAddBaseinfoBrandRequest);

		System.out.println(response.toString());
	}

	public void selectByPrimaryKey() {
		DubboQueryBaseinfoBrandRequest dubboQueryBaseinfoBrandRequest = new DubboQueryBaseinfoBrandRequest();
		dubboQueryBaseinfoBrandRequest.setId(new Long((long) 1));
		DubboQueryBaseinfoBrandResponse response = dubboBaseinfoBrandService
				.selectByPrimaryKey(dubboQueryBaseinfoBrandRequest);
		DubboBaseinfoBrand DubboBaseinfoBrand = response.getDubboBaseinfoBrand();
		System.out.println(DubboBaseinfoBrand.toString());
	}

	public void deleteByPrimaryKey() {
		/*DubboDelBaseinfoBrandRequest dubboDelBaseinfoBrandRequest = new DubboDelBaseinfoBrandRequest();
		dubboDelBaseinfoBrandRequest.setId(new Long((long) 1));
		DubboDelBaseinfoBrandResponse response = dubboBaseinfoBrandService
				.deleteByPrimaryKey(dubboDelBaseinfoBrandRequest);
		System.out.println(response.toString());*/
	}

	public void updateByPrimaryKeySelective() {
		DubboUpdateBaseinfoBrandRequest dubboUpdateBaseinfoBrandRequest = new DubboUpdateBaseinfoBrandRequest();
		dubboUpdateBaseinfoBrandRequest.setId(1L);
		dubboUpdateBaseinfoBrandRequest.setBrandNameCn("修改百度");
		dubboUpdateBaseinfoBrandRequest.setBrandNameEn("xiugbaidu");
		dubboUpdateBaseinfoBrandRequest.setModifyUserId(new Long(100001));
		dubboUpdateBaseinfoBrandRequest.setModifyUserName("Messi");
		DubboUpdateBaseinfoBrandResponse response = dubboBaseinfoBrandService
				.updateByPrimaryKeySelective(dubboUpdateBaseinfoBrandRequest);

		System.out.println(response.toString());
	}

	/**
	 * 禁用测试
	 */
	public void downuUpBrand() {
		
		DubboUpdateBaseinfoBrandRequest dubboUpdateBaseinfoBrandRequest = new DubboUpdateBaseinfoBrandRequest();
		dubboUpdateBaseinfoBrandRequest.setId(2L);
		dubboUpdateBaseinfoBrandRequest.setValidFlag(1); 
		dubboUpdateBaseinfoBrandRequest.setModifyUserId(new Long(100003));
		dubboUpdateBaseinfoBrandRequest.setModifyUserName("Messi3");
		DubboUpdateBaseinfoBrandResponse response = dubboBaseinfoBrandService
				.updateByPrimaryKeySelective(dubboUpdateBaseinfoBrandRequest);

		System.out.println(response.toString());
	}
}
