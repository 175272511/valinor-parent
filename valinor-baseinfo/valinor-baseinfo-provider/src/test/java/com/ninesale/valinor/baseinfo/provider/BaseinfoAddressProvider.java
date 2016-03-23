package com.ninesale.valinor.baseinfo.provider;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoAddress;
import com.ninesale.valinor.baseinfo.api.model.request.address.DubboAddBaseinfoAddressRequest;
import com.ninesale.valinor.baseinfo.api.model.request.address.DubboDelBaseinfoAddressRequest;
import com.ninesale.valinor.baseinfo.api.model.request.address.DubboDownBaseinfoAddressRequest;
import com.ninesale.valinor.baseinfo.api.model.request.address.DubboQueryBaseinfoAddressRequest;
import com.ninesale.valinor.baseinfo.api.model.request.address.DubboUpdateBaseinfoAddressRequest;
import com.ninesale.valinor.baseinfo.api.model.response.address.DubboAddBaseinfoAddressResponse;
import com.ninesale.valinor.baseinfo.api.model.response.address.DubboDelBaseinfoAddressResponse;
import com.ninesale.valinor.baseinfo.api.model.response.address.DubboDownBaseinfoAddressResponse;
import com.ninesale.valinor.baseinfo.api.model.response.address.DubboQueryBaseinfoAddressResponse;
import com.ninesale.valinor.baseinfo.api.model.response.address.DubboUpdateBaseinfoAddressResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoAddressService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class BaseinfoAddressProvider {
	@Resource
	private DubboBaseinfoAddressService dubboBaseinfoAddressService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
//		save();
		selectByPrimaryKey();
//		deleteByPrimaryKey();
//		updateByPrimaryKeySelective();
//		downByPrimaryKey();
	}

	public void save() {
		DubboAddBaseinfoAddressRequest dubboAddBaseinfoAddressRequest = new DubboAddBaseinfoAddressRequest();
		dubboAddBaseinfoAddressRequest.setAddressName("湖北");
		dubboAddBaseinfoAddressRequest.setAddressLevel(1);
		dubboAddBaseinfoAddressRequest.setLevelName("省份");
		dubboAddBaseinfoAddressRequest.setParentCategId(0);
		dubboAddBaseinfoAddressRequest.setModifyUserId(new Long(100001));
		dubboAddBaseinfoAddressRequest.setModifyUserName("Messi");
		dubboAddBaseinfoAddressRequest.setCreateTime(new Date());
		dubboAddBaseinfoAddressRequest.setUpdateTime(new Date());
		dubboAddBaseinfoAddressRequest.setValidFlag(0);

		DubboAddBaseinfoAddressResponse response = dubboBaseinfoAddressService
				.insert(dubboAddBaseinfoAddressRequest);

		System.out.println(response.toString());
	}

	public void selectByPrimaryKey() {
		DubboQueryBaseinfoAddressRequest dubboQueryBaseinfoAddressRequest = new DubboQueryBaseinfoAddressRequest();
		dubboQueryBaseinfoAddressRequest.setId(new Long((long) 1));
		DubboQueryBaseinfoAddressResponse response = dubboBaseinfoAddressService
				.selectByPrimaryKey(dubboQueryBaseinfoAddressRequest);
		DubboBaseinfoAddress DubboBaseinfoAddress = response.getDubboBaseinfoAddress();
		System.out.println(DubboBaseinfoAddress.toString());
	}

	public void deleteByPrimaryKey() {
		DubboDelBaseinfoAddressRequest dubboDelBaseinfoAddressRequest = new DubboDelBaseinfoAddressRequest();
		dubboDelBaseinfoAddressRequest.setId(new Long((long) 1));
		DubboDelBaseinfoAddressResponse response = dubboBaseinfoAddressService
				.deleteByPrimaryKey(dubboDelBaseinfoAddressRequest);
		System.out.println(response.toString());
	}
	
	public void updateByPrimaryKeySelective() {
		DubboUpdateBaseinfoAddressRequest dubboUpdateBaseinfoAddressRequest = new DubboUpdateBaseinfoAddressRequest();
		dubboUpdateBaseinfoAddressRequest.setId(1);
		dubboUpdateBaseinfoAddressRequest.setAddressName("湖南");
		dubboUpdateBaseinfoAddressRequest.setAddressLevel(1);
		dubboUpdateBaseinfoAddressRequest.setLevelName("省份");
		dubboUpdateBaseinfoAddressRequest.setParentCategId(0);
		dubboUpdateBaseinfoAddressRequest.setModifyUserId(new Long(100001));
		dubboUpdateBaseinfoAddressRequest.setModifyUserName("Messi");
		dubboUpdateBaseinfoAddressRequest.setCreateTime(new Date());
		dubboUpdateBaseinfoAddressRequest.setUpdateTime(new Date());
		dubboUpdateBaseinfoAddressRequest.setValidFlag(0);
		DubboUpdateBaseinfoAddressResponse response = dubboBaseinfoAddressService
				.updateByPrimaryKeySelective(dubboUpdateBaseinfoAddressRequest);
		
		System.out.println(response.toString());
	}
	/**
	 * 禁用测试
	 */
	public void downByPrimaryKey() {
		DubboDownBaseinfoAddressRequest dubboDownBaseinfoAddressRequest = new DubboDownBaseinfoAddressRequest();
		dubboDownBaseinfoAddressRequest.setId(new Long((long) 1));
		DubboDownBaseinfoAddressResponse response = dubboBaseinfoAddressService
				.downByPrimaryKey(dubboDownBaseinfoAddressRequest);
		System.out.println(response.toString());
	}
}
