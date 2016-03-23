package com.ninesale.valinor.baseinfo.provider;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoMerchant;
import com.ninesale.valinor.baseinfo.api.model.request.merchant.DubboAddBaseinfoMerchantRequest;
import com.ninesale.valinor.baseinfo.api.model.request.merchant.DubboDelBaseinfoMerchantRequest;
import com.ninesale.valinor.baseinfo.api.model.request.merchant.DubboDownBaseinfoMerchantRequest;
import com.ninesale.valinor.baseinfo.api.model.request.merchant.DubboQueryBaseinfoMerchantRequest;
import com.ninesale.valinor.baseinfo.api.model.request.merchant.DubboUpdateBaseinfoMerchantRequest;
import com.ninesale.valinor.baseinfo.api.model.response.merchant.DubboAddBaseinfoMerchantResponse;
import com.ninesale.valinor.baseinfo.api.model.response.merchant.DubboDelBaseinfoMerchantResponse;
import com.ninesale.valinor.baseinfo.api.model.response.merchant.DubboDownBaseinfoMerchantResponse;
import com.ninesale.valinor.baseinfo.api.model.response.merchant.DubboQueryBaseinfoMerchantResponse;
import com.ninesale.valinor.baseinfo.api.model.response.merchant.DubboUpdateBaseinfoMerchantResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoMerchantService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml"})
public class BaseinfoMerchantProvider {
	@Resource
	private DubboBaseinfoMerchantService dubboBaseinfoMerchantService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		// save();
		 selectByPrimaryKey();
		// deleteByPrimaryKey();
		// updateByPrimaryKeySelective();
//		downByPrimaryKey();
	}
	
	/**
	 * 新增测试
	 */
	public void save() {
		DubboAddBaseinfoMerchantRequest dubboAddBaseinfoMerchantRequest = new DubboAddBaseinfoMerchantRequest();

		dubboAddBaseinfoMerchantRequest.setMerchantName("YunJuHuiHuang");
		dubboAddBaseinfoMerchantRequest.setCategId(1);
		dubboAddBaseinfoMerchantRequest.setAddress("深圳市宝安区宝安中心西城雅筑");
		dubboAddBaseinfoMerchantRequest.setLinkman("小明");
		dubboAddBaseinfoMerchantRequest.setPhone("135123698741");
		dubboAddBaseinfoMerchantRequest.setEmail("abc@qq.com");
		dubboAddBaseinfoMerchantRequest.setStatus(1);
		dubboAddBaseinfoMerchantRequest.setLogoUrlId(new Long((long) 1));
		dubboAddBaseinfoMerchantRequest.setCreateTime(new Date());
		dubboAddBaseinfoMerchantRequest.setUpdateTime(new Date());
		dubboAddBaseinfoMerchantRequest.setValidFlag(0);

		DubboAddBaseinfoMerchantResponse response = dubboBaseinfoMerchantService
				.insert(dubboAddBaseinfoMerchantRequest);

		System.out.println(response.toString());
	}

	/**
	 * 查询测试
	 */
	public void selectByPrimaryKey() {
		DubboQueryBaseinfoMerchantRequest dubboQueryBaseinfoMerchantRequest = new DubboQueryBaseinfoMerchantRequest();
		dubboQueryBaseinfoMerchantRequest.setId(new Long((long) 1));
		DubboQueryBaseinfoMerchantResponse response = dubboBaseinfoMerchantService
				.selectByPrimaryKey(dubboQueryBaseinfoMerchantRequest);
		DubboBaseinfoMerchant DubboBaseinfoMerchant = response.getDubboBaseinfoMerchant();
		System.out.println(DubboBaseinfoMerchant.toString());
	}

	/**
	 * 删除测试
	 */
	public void deleteByPrimaryKey() {
		DubboDelBaseinfoMerchantRequest dubboDelBaseinfoMerchantRequest = new DubboDelBaseinfoMerchantRequest();
		dubboDelBaseinfoMerchantRequest.setId(new Long((long) 1));
		DubboDelBaseinfoMerchantResponse response = dubboBaseinfoMerchantService
				.deleteByPrimaryKey(dubboDelBaseinfoMerchantRequest);
		System.out.println(response.toString());
	}

	/**
	 * 修改测试
	 */
	public void updateByPrimaryKeySelective() {
		DubboUpdateBaseinfoMerchantRequest dubboUpdateBaseinfoMerchantRequest = new DubboUpdateBaseinfoMerchantRequest();
		dubboUpdateBaseinfoMerchantRequest.setId(new Long((long) 2));
		dubboUpdateBaseinfoMerchantRequest.setMerchantName("YunJuHuiHuang");
		dubboUpdateBaseinfoMerchantRequest.setCategId(1);
		dubboUpdateBaseinfoMerchantRequest.setAddress("深圳市宝安区宝安中心西城雅筑");
		dubboUpdateBaseinfoMerchantRequest.setLinkman("小红");
		dubboUpdateBaseinfoMerchantRequest.setPhone("15936987412");
		dubboUpdateBaseinfoMerchantRequest.setEmail("xiaohong@qq.com");
		dubboUpdateBaseinfoMerchantRequest.setStatus(1);
		dubboUpdateBaseinfoMerchantRequest.setLogoUrlId(new Long((long) 1));
		dubboUpdateBaseinfoMerchantRequest.setUpdateTime(new Date());
		dubboUpdateBaseinfoMerchantRequest.setValidFlag(0);
		DubboUpdateBaseinfoMerchantResponse response = dubboBaseinfoMerchantService
				.updateByPrimaryKeySelective(dubboUpdateBaseinfoMerchantRequest);

		System.out.println(response.toString());
	}

	/**
	 * 禁用测试
	 */
	public void downByPrimaryKey() {
		DubboDownBaseinfoMerchantRequest dubboDownBaseinfoMerchantRequest = new DubboDownBaseinfoMerchantRequest();
		dubboDownBaseinfoMerchantRequest.setId(new Long((long) 2));
		DubboDownBaseinfoMerchantResponse response = dubboBaseinfoMerchantService
				.downByPrimaryKey(dubboDownBaseinfoMerchantRequest);
		System.out.println(response.toString());
	}
}
