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

import com.ninesale.valinor.item.api.model.stock.request.DubboQueryItemStocksnapListRequest;
import com.ninesale.valinor.item.api.model.stock.response.DubboQueryItemStocksnapListResponse;
import com.ninesale.valinor.item.api.service.DubboItemStocksnapService;
import com.ninesale.valinor.item.provider.model.DtoItemStocksnap;
import com.ninesale.valinor.item.provider.service.ItemStocksnapService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class ItemStocksnapProvider {
	
	@Resource
	private ItemStocksnapService itemStocksnapService;
	
	@Resource
	private DubboItemStocksnapService dubboItemStocksnapService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		//insertItemStocksnap();
		//queryItemStocksnapList();
		queryItemStocksnapList2();
	}
	public void insertItemStocksnap(){
		DtoItemStocksnap record = new DtoItemStocksnap();
		record.setSkuId(2L); 
		record.setCostPrice(new BigDecimal(12.50)); 
		record.setStockNum(0); 
		record.setOrderLockNum(10); 
		record.setPayLockNum(0); 
		record.setActvPreLockNum(0); 
		record.setActvOrderLockNum(0); 
		record.setActvPayLockNum(0); 
		record.setExptDlvHours(10); 
		record.setModifyUserId(11L); 
		record.setModifyUserName("modifyUserName"); 
		record.setCreateTime(new Date()); 
		record.setUpdateTime(new Date()); 
		
		Map<String, Object>  map = itemStocksnapService.insert(record);
		System.out.println(map.toString()); 
	}
	
	public void queryItemStocksnapList(){
		DtoItemStocksnap record = new DtoItemStocksnap();
		record.setSkuId(2L); 
		List<DtoItemStocksnap> list = itemStocksnapService.queryItemStocksnapList(record);
		System.out.println(list.toString());
	}
	
	public void queryItemStocksnapList2(){
		DubboQueryItemStocksnapListRequest request = new DubboQueryItemStocksnapListRequest();
		request.setSkuId(2L); 
		request.setId(1L); 
		DubboQueryItemStocksnapListResponse response = dubboItemStocksnapService.queryItemStocksnapList(request);
		System.out.println(response.toString());
	}
	
}
