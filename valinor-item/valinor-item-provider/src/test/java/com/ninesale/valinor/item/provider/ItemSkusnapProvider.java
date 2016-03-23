package com.ninesale.valinor.item.provider;

import java.math.BigDecimal;
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

import com.ninesale.valinor.item.api.model.sku.request.DubboQueryItemSkusnapListRequest;
import com.ninesale.valinor.item.api.model.sku.response.DubboQueryItemSkusnapListResponse;
import com.ninesale.valinor.item.api.service.DubboItemSkusnapService;
import com.ninesale.valinor.item.provider.model.DtoItemSkusnap;
import com.ninesale.valinor.item.provider.service.ItemSkusnapService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ItemSkusnapProvider {
	
	@Resource
	private ItemSkusnapService itemSkusnapService;
	
	@Resource
	private DubboItemSkusnapService dubboItemSkusnapService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//insertItemSkusnap();
		//queryItemSkusnapList();
		queryItemSkusnapList2();
	}
	
	public void insertItemSkusnap(){
		DtoItemSkusnap record = new DtoItemSkusnap();
		record.setSkuId(new Long(2));
		record.setTitle("SPUD标题2");
		record.setStatus(new Integer(1));
		record.setArtNo("artNo2"); 
		record.setBarCode("barCode2"); 
		record.setMainImgId(new Long(100024));
		record.setMarkedPrice(new BigDecimal(12.30));  
		record.setSellprice(new BigDecimal(15.00));
		record.setWeight("25KG"); 
		record.setVolume("150M3"); 
		record.setModifyUserId(1L); 
		record.setModifyUserName("modifyUserName"); 
		record.setCreateTime(new Date()); 
		record.setUpdateTime(new Date());
		Map<String, Object>  map = itemSkusnapService.insert(record);
		System.out.println(map.toString()); 
	}
	
	public void queryItemSkusnapList(){
		DtoItemSkusnap record = new DtoItemSkusnap();
		record.setSkuId(2L); 
		record.setArtNo("artNo2"); 
		List<DtoItemSkusnap> list = itemSkusnapService.queryItemSkusnapList(record);
		System.out.println(list.toString());
	}
	
	/**
	 * 远程方法调用测试
	 * */
	public void queryItemSkusnapList2(){ 
		DubboQueryItemSkusnapListRequest request = new DubboQueryItemSkusnapListRequest();
		request.setSkuId(3L);
		request.setId(1L); 
		DubboQueryItemSkusnapListResponse response = dubboItemSkusnapService.queryItemSkusnapList(request);
		
		System.out.println(response.toString());
	}
}
