package com.ninesale.valinor.item.provider;

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

import com.ninesale.valinor.item.api.model.attr.request.DubboAddItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboBatchAddItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboDelItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrList2Request;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrListRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboUpdateItemAttributeRequest;
import com.ninesale.valinor.item.api.model.attr.response.DubboAddItemAttributeResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboBatchAddItemAttributeResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboDelItemAttributeResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrList2Response;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrListResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboUpdateItemAttributeResponse;
import com.ninesale.valinor.item.api.service.DubboItemAttributeService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ItemAttributeProvider {
	
	@Resource
	private DubboItemAttributeService dubboItemAttributeService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//deleteByPrimaryKey();
		//queryItemAttrListByIds();
		//queryItemAttributeList();
		//updateByPrimaryKeySelective();
		//batchInsert();
		insert();
	}
	
	public void deleteByPrimaryKey(){
		DubboDelItemAttributeRequest request = new DubboDelItemAttributeRequest();
		request.setId(new Long(16));
		DubboDelItemAttributeResponse response = dubboItemAttributeService.deleteByPrimaryKey(request);
		System.out.println(response.toString());
	}
	
	public void queryItemAttrListByIds(){
		DubboQueryItemAttrList2Request request = new DubboQueryItemAttrList2Request();
		List<Long> ids = new ArrayList<Long>();
		ids.add(new Long(11));
		ids.add(new Long(12));
		ids.add(new Long(13));
		request.setIds(ids);
		DubboQueryItemAttrList2Response response = dubboItemAttributeService.queryItemAttrListByIds(request);
		System.out.println(response.toString());
	}
	
	public void queryItemAttributeList(){
		DubboQueryItemAttrListRequest request = new DubboQueryItemAttrListRequest();
		//request.setId(new Long(3));
		request.setAttrName("attrName3");
		//request.setAttrContext("updateattrContext");
		//request.setCategId(new Integer(1)); 
		//request.setValidFlag(new Integer(1));
		DubboQueryItemAttrListResponse response = dubboItemAttributeService.queryItemAttributeList(request);
		System.out.println(response.toString());
	}
	
	public void updateByPrimaryKeySelective(){
		DubboUpdateItemAttributeRequest request = new DubboUpdateItemAttributeRequest();
		request.setId(new Long(3));
		request.setAttrName("updateattrName");
		request.setAttrContext("updateattrContext");
		request.setCategId(new Integer(1)); 
		request.setModifyUserId(new Long(10001));
		request.setModifyUserName("updatemodifyUserName");
		request.setUpdateTime(new Date());
		request.setValidFlag(new Integer(1));
		DubboUpdateItemAttributeResponse response = dubboItemAttributeService.updateByPrimaryKeySelective(request);
		System.out.println(response.toString());
	}
	
	public void insert(){
		DubboAddItemAttributeRequest dto2 = new DubboAddItemAttributeRequest();
		dto2.setAttrContext("attrContext9");
		dto2.setAttrName("attrName9");
		dto2.setCategId(new Integer(9));
		dto2.setCreateTime(new Date()); 
		dto2.setModifyUserId(new Long(9)); 
		dto2.setModifyUserName("modifyUserName9");
		dto2.setUpdateTime(new Date());
		dto2.setValidFlag(new Integer(1));
		
		DubboAddItemAttributeResponse response = dubboItemAttributeService.insert(dto2);
		System.out.println(response.toString());
	}
	
	public void batchInsert() {
		DubboBatchAddItemAttributeRequest batchAddRequest = new DubboBatchAddItemAttributeRequest();
		DubboAddItemAttributeRequest dto1 = new DubboAddItemAttributeRequest();
		dto1.setAttrContext("attrContext3");
		dto1.setAttrName("attrName3");
		dto1.setCategId(new Integer(9));
		dto1.setCreateTime(new Date()); 
		dto1.setModifyUserId(new Long(13)); 
		dto1.setModifyUserName("modifyUserName3");
		dto1.setUpdateTime(new Date());
		dto1.setValidFlag(new Integer(1));
		
		DubboAddItemAttributeRequest dto2 = new DubboAddItemAttributeRequest();
		dto2.setAttrContext("attrContext4");
		dto2.setAttrName("attrName4");
		dto2.setCategId(new Integer(9));
		dto2.setCreateTime(new Date()); 
		dto2.setModifyUserId(new Long(14)); 
		dto2.setModifyUserName("modifyUserName4");
		dto2.setUpdateTime(new Date());
		dto2.setValidFlag(new Integer(2));
		
		List<DubboAddItemAttributeRequest> list = new ArrayList<DubboAddItemAttributeRequest>();
		list.add(dto1);
		list.add(dto2);
		batchAddRequest.setList(list);
		DubboBatchAddItemAttributeResponse response = dubboItemAttributeService.batchInsert(batchAddRequest);
		System.out.println(response.toString());
	}
	
	
}
