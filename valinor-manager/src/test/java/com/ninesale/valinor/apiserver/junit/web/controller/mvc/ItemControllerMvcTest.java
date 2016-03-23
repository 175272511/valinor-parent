/**   
* @Title: NoteControllerMvcTest.java 
* @Package com.ninesale.valinor.apiserver.junit.web.controller.mvc 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月21日 下午2:28:18 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.junit.web.controller.mvc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ninesale.valinor.apiserver.test.utils.MockUtil;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.item.request.ClientAddItemRequest;
import com.ninesale.valinor.apiserver.web.model.item.request.ClientDownUpRecomHotItemRequest;
import com.ninesale.valinor.apiserver.web.model.item.request.ClientQueryItemByPageRequest;
import com.ninesale.valinor.apiserver.web.model.item.request.ClientUpdateItemRequest;
import com.ninesale.valinor.apiserver.web.model.item.vo.ClientImg;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:28:18
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class ItemControllerMvcTest extends AbstractContextControllerTests {

	/**
	 * Test method for
	 * .
	 */
	@Test
	public void addItem() {
		
		ClientAddItemRequest req = new ClientAddItemRequest();
		req.setArtNo("artNo236");
		req.setBarCode("barCode236");
		req.setBrandId(13L);
		req.setCategLvlId(15); 
		req.setItemDesc("itemDesc236");
		req.setSellprice(new BigDecimal(123.00));
		req.setTimeToMarket(12345788888L);
		req.setTitle("title236");
		req.setVolume("12L"); 
		req.setWeight("12KG"); 
		ClientImg mainImg = new ClientImg();
		mainImg.setDownloadUrl("downloadUrl68236");
		mainImg.setFileId("fileId68236");
		mainImg.setImageText("imageText68236"); 
		mainImg.setManageUrl("manageUrl68236");  
		req.setMainImg(mainImg);
		
		List<ClientImg> assistImgList = new ArrayList<ClientImg>();
		
		ClientImg mainImg2 = new ClientImg();
		mainImg2.setDownloadUrl("downloadUrl68234");
		mainImg2.setFileId("fileId68234");
		mainImg2.setImageText("imageText68234"); 
		mainImg2.setManageUrl("manageUrl68234"); 
		assistImgList.add(mainImg2);
		
		ClientImg mainImg3 = new ClientImg();
		mainImg3.setDownloadUrl("downloadUrl68235");
		mainImg3.setFileId("fileId68235");
		mainImg3.setImageText("imageText68235"); 
		mainImg3.setManageUrl("manageUrl68235"); 
		assistImgList.add(mainImg3);
		
		req.setAssistImgList(assistImgList);
		String result = MockUtil.mock(mockMvc, "/item/additem.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void updateItem() {
		
		ClientUpdateItemRequest req = new ClientUpdateItemRequest();
		req.setItemId(8L); 
		req.setArtNo("artNoUp");
		req.setBarCode("barCodeUp");
		req.setBrandId(13L);
		req.setCategLvlId(15); 
		req.setItemDesc("itemDescUpUp");
		req.setSellprice(new BigDecimal(123.00));
		req.setTimeToMarketStr("2014-10-16");
		req.setTitle("titleUp");
		req.setVolume("16L"); 
		req.setWeight("16KG"); 
		
		ClientImg mainImg = new ClientImg();
		mainImg.setDownloadUrl("downloadUrl68236");
		mainImg.setFileId("fileId68236");
		mainImg.setImageText("imageText1"); 
		mainImg.setManageUrl("manageUrl68236");  
		req.setMainImg(mainImg);
		
		List<ClientImg> assistImgList = new ArrayList<ClientImg>();
		
		ClientImg mainImg2 = new ClientImg();
		mainImg2.setDownloadUrl("downloadUrl68234");
		mainImg2.setFileId("fileId68234");
		mainImg2.setImageText("imageText2"); 
		mainImg2.setManageUrl("manageUrl68234"); 
		assistImgList.add(mainImg2);
		
		ClientImg mainImg3 = new ClientImg();
		mainImg3.setDownloadUrl("downloadUrl68235");
		mainImg3.setFileId("fileId68235");
		mainImg3.setImageText("imageText3"); 
		mainImg3.setManageUrl("manageUrl68235"); 
		assistImgList.add(mainImg3);
		
		req.setAssistImgList(assistImgList);
		
		
		String result = MockUtil.mock(mockMvc, "/item/updateitem.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void downUpRecomHotItem() {
		
		ClientDownUpRecomHotItemRequest req = new ClientDownUpRecomHotItemRequest();
		req.setItemId(1L);
		//req.setStatus(1); 
		//req.setRecommendItem(1);
		req.setHotItem(1); 
		String result = MockUtil.mock(mockMvc, "/item/downuprecomhotitem.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}
	
	/**
	 * Test method for
	 * .
	 */
	@Test
	public void queryItemByPage() {
		
		ClientQueryItemByPageRequest req = new ClientQueryItemByPageRequest();
		req.setPageSize(3);
		req.setCurrentPage(1); 
		String result = MockUtil.mock(mockMvc, "/item/queryitembypage.do", req);
		Assert.assertEquals(ReturnCode.SUCCESS, getCode(result));
		
		System.out.println(result);
	}

}
