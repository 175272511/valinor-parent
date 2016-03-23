package com.ninesale.valinor.item.provider;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.item.api.model.spu.request.DubboQuerySpuSkuStockListRequest;
import com.ninesale.valinor.item.api.model.spu.response.DubboQuerySpuSkuStockListResponse;
import com.ninesale.valinor.item.api.service.DubboItemSpuService;
import com.ninesale.valinor.item.provider.model.DtoItemSpu;
import com.ninesale.valinor.item.provider.model.DtoItemSpuSkuStock;
import com.ninesale.valinor.item.provider.service.ItemSpuService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ItemSpuProvider {
	
	@Resource
	private ItemSpuService itemSpuService;
	
	@Resource
	private DubboItemSpuService dubboItemSpuService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//insertItemSpu();
		//updateByPrimaryKeySelective();
		//deleteByPrimaryKey();
		//queryItemSpuList();
		//queryItemSpuSkuStockList();
		queryItemSpuSkuStockList2();
	}
	
	public void queryItemSpuSkuStockList2(){
		DubboQuerySpuSkuStockListRequest request = new DubboQuerySpuSkuStockListRequest();
		DubboQuerySpuSkuStockListResponse reponse = dubboItemSpuService.queryItemSpuSkuStockList(request);
		System.out.println(reponse.toString());
	}
	
	public void queryItemSpuSkuStockList(){
		DtoItemSpu record = new DtoItemSpu();
		//record.setTitle("SPUD标题2");
		record.setId(2L); 
		List<DtoItemSpuSkuStock> list = itemSpuService.queryItemSpuSkuStockList(record); 
		System.out.println(list.toString());
	}
	
	
	public void queryItemSpuList(){
		DtoItemSpu record = new DtoItemSpu();
		record.setId(new Long(2)); 
		List<DtoItemSpu> list = itemSpuService.queryItemSpuList(record);
		System.out.println(list.toString());
	}
	
	public void insertItemSpu(){
		DtoItemSpu record = new DtoItemSpu();
		record.setTitle("SPUD标题2"); 
		record.setCaption("副标题2"); 
		record.setSlogan("促销语2"); 
		record.setCategLvl1Id(new Integer(1)); 
		record.setCategLvl2Id(new Integer(2));
		record.setCategLvl3Id(new Integer(3));
		record.setBrandId(new Long(1));
		record.setStatus(new Integer(1)); 
		record.setMainImgIds("1,2,3"); 
		record.setMainImgList("[{'url':'www.baidu.com1'},{'url':'www.baidu.com3'},{'url':'www.baidu.com4'}]"); 
		record.setProfileImgIds("1,2,3"); 
		record.setProfileImgList("[{'url':'www.baidu.com1'},{'url':'www.baidu.com3'},{'url':'www.baidu.com4'}]");
		record.setAttrList("1,3,4"); 
		record.setCreateTime(new Date()); 
		record.setUpdateTime(new Date()); 
		
		itemSpuService.insert(record);
	}
	
	public void updateByPrimaryKeySelective(){
		DtoItemSpu record = new DtoItemSpu();
		record.setId(new Long(1));
		record.setTitle("title26"); 
		record.setCaption("caption26"); 
		record.setSlogan("slogan26"); 
		record.setCategLvl1Id(new Integer(1)); 
		record.setCategLvl2Id(new Integer(2));
		record.setCategLvl3Id(new Integer(3));
		record.setBrandId(new Long(1));
		record.setStatus(new Integer(0)); 
		record.setMainImgIds("1,2,3,6"); 
		record.setMainImgList("[{'url':'www.baidu.com'},{'url':'www.baidu.com1'},{'url':'www.baidu.com3'},{'url':'www.baidu.com6'}]"); 
		record.setProfileImgIds("1,2,3,6"); 
		record.setProfileImgList("[{'url':'www.baidu.com'},{'url':'www.baidu.com1'},{'url':'www.baidu.com3',{'url':'www.baidu.com6'}}]");
		record.setAttrList("1,2,3,6"); 
		record.setCreateTime(new Date()); 
		record.setUpdateTime(new Date());
		int iCount = itemSpuService.updateByPrimaryKeySelective(record);
		System.out.println(iCount); 
	}
	
	public void deleteByPrimaryKey(){
		int iCount = itemSpuService.deleteByPrimaryKey(new Long(1));
		System.out.println(iCount); 
	}
	
}
