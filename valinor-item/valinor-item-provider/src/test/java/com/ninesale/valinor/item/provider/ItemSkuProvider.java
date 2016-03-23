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

import com.ninesale.valinor.item.api.model.sku.request.DubboAddItemSkuRequest;
import com.ninesale.valinor.item.api.model.sku.request.DubboQuerySkuStockListRequest;
import com.ninesale.valinor.item.api.model.sku.request.DubboUpdateItemSkuRequest;
import com.ninesale.valinor.item.api.model.sku.response.DubboAddItemSkuResponse;
import com.ninesale.valinor.item.api.model.sku.response.DubboQuerySkuStockListResponse;
import com.ninesale.valinor.item.api.model.sku.response.DubboUpdateItemSkuResponse;
import com.ninesale.valinor.item.api.service.DubboItemSkuService;
import com.ninesale.valinor.item.provider.model.DtoItemSku;
import com.ninesale.valinor.item.provider.service.ItemSkuService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ItemSkuProvider {
	
	@Resource
	private ItemSkuService itemSkuService;
	
	@Resource
	private DubboItemSkuService dubboItemSkuService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//updateByPrimaryKeySelective2();
		//insertItemSku2();
		//updateByPrimaryKeySelective();
		//queryItemSkuList();
		queryItemSkuList2();
		//insertItemSku();
	}
	
	public void updateByPrimaryKeySelective2(){
		DubboUpdateItemSkuRequest request = new DubboUpdateItemSkuRequest();
		
		request.setSkuId(new Long(5)); 
		request.setTitle("SPUD标题");
		request.setAttrList("1,3"); 
		request.setAttrValueList("2,4"); 
		request.setCategLvl1Id(new Integer(1)); 
		request.setCategLvl2Id(new Integer(2)); 
		request.setCategLvl3Id(new Integer(3)); 
		request.setBrandId(new Long(1));
		request.setStatus(new Integer(1));
		request.setArtNo("artNo28"); 
		request.setBarCode("barCode28"); 
		request.setMainImgId(new Long(100024));
		request.setMainImgUrl("http://ninesale-10000941.image.myqcloud.com/04afc3aa-5f01-46a9-abe6-ff9200ade9ad");
		request.setMarkedPrice(new BigDecimal(120.30));  
		request.setSellprice(new BigDecimal(150.00));
		request.setWeight("456KG"); 
		request.setVolume("456M3"); 
		request.setUpdateTime(new Date());
		request.setLastUpTime(new Date()); 
		request.setLastDownTime(new Date());
		request.setModifyUserId(8L); 
		request.setModifyUserName("modifyUserName456"); 
		
		DubboUpdateItemSkuResponse response = dubboItemSkuService.updateByPrimaryKeySelective(request);
		System.out.println(response.toString()); 
		
	}
	
	public void insertItemSku2(){
		DubboAddItemSkuRequest request = new DubboAddItemSkuRequest();
		
		request.setSpuId(new Long(1));
		request.setTitle("SPUD标题");
		request.setAttrList("1,3"); 
		request.setAttrValueList("2,4"); 
		request.setCategLvl1Id(new Integer(1)); 
		request.setCategLvl2Id(new Integer(2)); 
		request.setCategLvl3Id(new Integer(3)); 
		request.setBrandId(new Long(1));
		request.setStatus(new Integer(1));
		request.setArtNo("artNo28"); 
		request.setBarCode("barCode28"); 
		request.setMainImgId(new Long(100024));
		request.setMainImgUrl("http://ninesale-10000941.image.myqcloud.com/04afc3aa-5f01-46a9-abe6-ff9200ade9ad");
		request.setMarkedPrice(new BigDecimal(12.30));  
		request.setSellprice(new BigDecimal(15.00));
		request.setWeight("258KG"); 
		request.setVolume("1508M3"); 
		request.setCreateTime(new Date()); 
		request.setUpdateTime(new Date());
		request.setLastUpTime(new Date()); 
		request.setLastDownTime(new Date());
		request.setModifyUserId(8L); 
		request.setModifyUserName("modifyUserName8"); 
		
		request.setCostPrice(new BigDecimal(12.50)); 
		request.setStockNum(0); 
		request.setOrderLockNum(10); 
		request.setPayLockNum(0); 
		request.setActvPreLockNum(0); 
		request.setActvOrderLockNum(0); 
		request.setActvPayLockNum(0); 
		request.setOrderTotalNum(0); 
		request.setPayTotalNum(0); 
		request.setExptDlvHours(10); 
		
		DubboAddItemSkuResponse response = dubboItemSkuService.insert(request);
		System.out.println(response.toString());
	}
	
	public void updateByPrimaryKeySelective(){
		DtoItemSku record = new DtoItemSku();
		record.setId(new Long(2)); 
		record.setStatus(0); 
		record.setLastUpTime(new Date()); 
		record.setLastDownTime(new Date()); 
		record.setUpdateTime(new Date());
		
		int iCount = itemSkuService.updateByPrimaryKeySelective(record);
		System.out.println(iCount); 
	}
	
	public void queryItemSkuList(){
		DtoItemSku record = new DtoItemSku();
		record.setSpuId(new Long(2));
		List<DtoItemSku> list = itemSkuService.queryItemSkuList(record);
		System.out.println(list.toString());
	}
	
	public void queryItemSkuList2(){
		DubboQuerySkuStockListRequest request = new DubboQuerySkuStockListRequest();
		request.setId(2L); 
		DubboQuerySkuStockListResponse reponse = dubboItemSkuService.queryItemSkuStockList(request);
		System.out.println(reponse.toString());
	}
	
	public void insertItemSku(){
		DtoItemSku record = new DtoItemSku();
		record.setSpuId(new Long(2));
		record.setTitle("SPUD标题2");
		record.setAttrList("1,3"); 
		record.setAttrValueList("2,4"); 
		record.setCategLvl1Id(new Integer(1)); 
		record.setCategLvl2Id(new Integer(2)); 
		record.setCategLvl3Id(new Integer(3)); 
		record.setBrandId(new Long(1));
		record.setStatus(new Integer(1));
		record.setArtNo("artNo2"); 
		record.setBarCode("barCode2"); 
		record.setMainImgId(new Long(100024));
		record.setMainImgUrl("http://ninesale-10000941.image.myqcloud.com/04afc3aa-5f01-46a9-abe6-ff9200ade9ad");
		record.setMarkedPrice(new BigDecimal(12.30));  
		record.setSellprice(new BigDecimal(15.00));
		record.setWeight("25KG"); 
		record.setVolume("150M3"); 
		record.setSkuSnapId(new Long(1)); 
		record.setCreateTime(new Date()); 
		record.setLastUpTime(new Date()); 
		record.setUpdateTime(new Date());
		record.setLastDownTime(new Date());
		Map<String, Object>  map = itemSkuService.insert(record);
		System.out.println(map.toString()); 
	}
}
