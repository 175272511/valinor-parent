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

import com.ninesale.valinor.item.api.model.attr.request.DubboAddItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboBatchAddItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboDelItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrvalueList2Request;
import com.ninesale.valinor.item.api.model.attr.request.DubboQueryItemAttrvalueListRequest;
import com.ninesale.valinor.item.api.model.attr.request.DubboUpdateItemAttrvalueRequest;
import com.ninesale.valinor.item.api.model.attr.response.DubboAddItemAttrvalueResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboBatchAddItemAttrvalueResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboDelItemAttrvalueResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrvalueList2Response;
import com.ninesale.valinor.item.api.model.attr.response.DubboQueryItemAttrvalueListResponse;
import com.ninesale.valinor.item.api.model.attr.response.DubboUpdateItemAttrvalueResponse;
import com.ninesale.valinor.item.api.service.DubboItemAttrvalueService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ItemAttrvalueProvider {
	
	@Resource
	private DubboItemAttrvalueService dubboItemAttrvalueService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//deleteByPrimaryKey();
		//queryItemAttrListByIds();
		//queryItemAttrvalueList();
		//updateByPrimaryKeySelective();
		//batchInsert();
		insert();
	}
	
	public void deleteByPrimaryKey(){
		DubboDelItemAttrvalueRequest request = new DubboDelItemAttrvalueRequest();
		request.setId(new Long(9)); 
		DubboDelItemAttrvalueResponse response = dubboItemAttrvalueService.deleteByPrimaryKey(request);
		System.out.println(response.toString());
	}
	
	public void queryItemAttrListByIds(){
		DubboQueryItemAttrvalueList2Request request = new DubboQueryItemAttrvalueList2Request();
		List<Long> ids = new ArrayList<Long>();
		ids.add(new Long(1));
		ids.add(new Long(2));
		ids.add(new Long(3));
		ids.add(new Long(4));
		ids.add(new Long(9));
		ids.add(new Long(10));
		request.setIds(ids);
		DubboQueryItemAttrvalueList2Response response = dubboItemAttrvalueService.queryItemAttrvaluevalueListByIds(request);
		System.out.println(response.toString());
	}
	
	public void queryItemAttrvalueList(){
		DubboQueryItemAttrvalueListRequest request = new DubboQueryItemAttrvalueListRequest();
		request.setAttrId(new Long(4));
		request.setAttrValueName("白色");
		request.setId(new Long(1));
		request.setValidFlag(new Integer(1)); 
		DubboQueryItemAttrvalueListResponse response = dubboItemAttrvalueService.queryItemAttrvaluevalueList(request);
		System.out.println(response.toString());
	}
	
	public void updateByPrimaryKeySelective(){
		DubboUpdateItemAttrvalueRequest request = new DubboUpdateItemAttrvalueRequest();
		request.setId(new Long(9));
		request.setValidFlag(new Integer(1));
		request.setAttrValueName("红色修改"); 
		request.setAttrId(new Long(3)); 
		request.setModifyUserId(new Long(10001));
		request.setModifyUserName("updatemodifyUserName");
		request.setUpdateTime(new Date());
		
		DubboUpdateItemAttrvalueResponse response = dubboItemAttrvalueService.updateByPrimaryKeySelective(request);
		System.out.println(response.toString());
	}
	
	public void insert(){
		DubboAddItemAttrvalueRequest dto2 = new DubboAddItemAttrvalueRequest();
		dto2.setAttrId(new Long(3)); 
		dto2.setAttrValueName("480*240"); 
		dto2.setValidFlag(new Integer(1));
		dto2.setModifyUserId(new Long(31)); 
		dto2.setModifyUserName("modifyUserName31");
		dto2.setCreateTime(new Date()); 
		dto2.setUpdateTime(new Date());
		DubboAddItemAttrvalueResponse response = dubboItemAttrvalueService.insert(dto2);
		System.out.println(response.toString());
	}
	
	public void batchInsert() {
		DubboBatchAddItemAttrvalueRequest batchAddRequest = new DubboBatchAddItemAttrvalueRequest();
		DubboAddItemAttrvalueRequest dto1 = new DubboAddItemAttrvalueRequest();
		dto1.setAttrId(new Long(4)); 
		dto1.setAttrValueName("红色1"); 
		dto1.setValidFlag(new Integer(1));
		dto1.setModifyUserId(new Long(14)); 
		dto1.setModifyUserName("modifyUserName4");
		dto1.setCreateTime(new Date()); 
		dto1.setUpdateTime(new Date());
		
		DubboAddItemAttrvalueRequest dto2 = new DubboAddItemAttrvalueRequest();
		
		dto2.setAttrId(new Long(4)); 
		dto2.setAttrValueName("灰色"); 
		dto2.setValidFlag(new Integer(1));
		dto2.setModifyUserId(new Long(14)); 
		dto2.setModifyUserName("modifyUserName41");
		dto2.setCreateTime(new Date()); 
		dto2.setUpdateTime(new Date());
		
		List<DubboAddItemAttrvalueRequest> list = new ArrayList<DubboAddItemAttrvalueRequest>();
		list.add(dto1);
		list.add(dto2);
		batchAddRequest.setList(list);
		DubboBatchAddItemAttrvalueResponse response = dubboItemAttrvalueService.batchInsert(batchAddRequest);
		System.out.println(response.toString());
	}
	
}
