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

import com.ninesale.valinor.item.api.model.stock.request.DubboQueryItemStockListRequest;
import com.ninesale.valinor.item.api.model.stock.response.DubboQueryItemStockListResponse;
import com.ninesale.valinor.item.api.service.DubboItemStockService;
import com.ninesale.valinor.item.provider.model.DtoItemStock;
import com.ninesale.valinor.item.provider.service.ItemStockService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ItemStockProvider {
	
	@Resource
	private ItemStockService itemStockService;
	
	@Resource
	private DubboItemStockService dubboItemStockService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//insertItemStock();
		//queryItemStockList();
		//updateByPrimaryKeySelective();
		queryItemStockList2();
	}
	
	public void queryItemStockList(){
		DtoItemStock record = new DtoItemStock();
		record.setSkuId(2L); 
		List<DtoItemStock> list = itemStockService.queryItemStockList(record);
		System.out.println(list.toString());
	}
	
	public void queryItemStockList2(){
		
		DubboQueryItemStockListRequest request = new DubboQueryItemStockListRequest();
		request.setSkuId(3L);
		request.setId(1L);
		DubboQueryItemStockListResponse response = dubboItemStockService.queryItemStockList(request);
		System.out.println(response.toString());
	
	}
	
	public void insertItemStock(){
		DtoItemStock record = new DtoItemStock();
		record.setSkuId(2L); 
		record.setStockSnapId(1L); 
		record.setCostPrice(new BigDecimal(12.50)); 
		record.setStockNum(0); 
		record.setOrderLockNum(10); 
		record.setPayLockNum(0); 
		record.setActvPreLockNum(0); 
		record.setActvOrderLockNum(0); 
		record.setActvPayLockNum(0); 
		record.setOrderTotalNum(0); 
		record.setPayTotalNum(0); 
		record.setExptDlvHours(10); 
		record.setCreateTime(new Date()); 
		record.setUpdateTime(new Date()); 
		
		Map<String, Object>  map = itemStockService.insert(record);
		System.out.println(map.toString()); 
		
	}
	
	public void updateByPrimaryKeySelective(){
		DtoItemStock record = new DtoItemStock();
		record.setSkuId(2L);
		record.setStockNum(99); 
		record.setOrderLockNum(1);
		record.setUpdateTime(new Date());
		int iCount = itemStockService.updateByPrimaryKeySelective(record);
		System.out.println(iCount); 
	}
	
}
