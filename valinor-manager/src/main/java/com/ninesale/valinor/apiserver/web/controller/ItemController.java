package com.ninesale.valinor.apiserver.web.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.baseinfo.vo.ClientBaseinfoBrand;
import com.ninesale.valinor.apiserver.web.model.baseinfo.vo.ClientBaseinfoCateg;
import com.ninesale.valinor.apiserver.web.model.item.reponse.ClientAddItemResponse;
import com.ninesale.valinor.apiserver.web.model.item.reponse.ClientDownUpRecomHotItemResponse;
import com.ninesale.valinor.apiserver.web.model.item.reponse.ClientQueryItemByPageResponse;
import com.ninesale.valinor.apiserver.web.model.item.reponse.ClientUpdateItemResponse;
import com.ninesale.valinor.apiserver.web.model.item.request.ClientAddItemRequest;
import com.ninesale.valinor.apiserver.web.model.item.request.ClientDownUpRecomHotItemRequest;
import com.ninesale.valinor.apiserver.web.model.item.request.ClientQueryItemByPageRequest;
import com.ninesale.valinor.apiserver.web.model.item.request.ClientUpdateItemRequest;
import com.ninesale.valinor.apiserver.web.model.item.vo.ClientImg;
import com.ninesale.valinor.apiserver.web.model.item.vo.ClientResItem;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboQueryBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQueryCategRequest;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboQueryBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQueryCategResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoBrandService;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoCategService;
import com.ninesale.valinor.image.api.constant.DubboImageConstants;
import com.ninesale.valinor.image.api.model.dto.DubboImg;
import com.ninesale.valinor.image.api.model.dto.DubboImgResInfo;
import com.ninesale.valinor.image.api.model.dto.DubboImgRespInfo;
import com.ninesale.valinor.image.api.model.request.DubboInsertUpdateImgRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgTagRequest;
import com.ninesale.valinor.image.api.model.response.DubboInsertUpdateImgResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTagResponse;
import com.ninesale.valinor.image.api.service.DubboImgService;
import com.ninesale.valinor.item.api.model.item.request.DubboAddItemRequest;
import com.ninesale.valinor.item.api.model.item.request.DubboDownUpRecomHotItemRequest;
import com.ninesale.valinor.item.api.model.item.request.DubboQueryItemByPageRequest;
import com.ninesale.valinor.item.api.model.item.request.DubboUpdateItemRequest;
import com.ninesale.valinor.item.api.model.item.response.DubboAddItemResponse;
import com.ninesale.valinor.item.api.model.item.response.DubboDownUpRecomHotItemResponse;
import com.ninesale.valinor.item.api.model.item.response.DubboQueryItemByPageResponse;
import com.ninesale.valinor.item.api.model.item.response.DubboUpdateItemResponse;
import com.ninesale.valinor.item.api.service.DubboItemService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("item/")
public class ItemController extends BaseController {
	
	@Resource
	private DubboItemService dubboItemService;
	
	@Resource
	private DubboImgService dubboImgService;
	
	@Resource
	private DubboBaseinfoCategService dubboBaseinfoCategService;
	
	@Resource
	private DubboBaseinfoBrandService dubboBaseinfoBrandService;

	/**
	 * 添加商品信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "additem", method = RequestMethod.POST)
	public ClientAddItemResponse addItem(@RequestBody ClientAddItemRequest req) {
		//添加商品信息
		ClientAddItemResponse resp = new ClientAddItemResponse();
		try {
			DubboAddItemRequest request = BeanMapper.map(req, DubboAddItemRequest.class);
			//保存或更新图片
			DubboInsertUpdateImgResponse imgResp = null;
			List<DubboImg> imgList = new ArrayList<DubboImg>();
			if(CollectionUtils.isNotEmpty(req.getAssistImgList())){
				//商品轮播图
				imgList = BeanMapper.map(req.getAssistImgList(), DubboImg.class);
			}
			if(req.getMainImg()!=null){
				//商品主图
				DubboImg imgVO = BeanMapper.map(req.getMainImg(), DubboImg.class);
				imgList.add(imgVO);
			}
			if(CollectionUtils.isNotEmpty(imgList)){
				for(DubboImg img:imgList){
					img.setTypeId(DubboImageConstants.ITEM_IMG);
				}
			}
			DubboInsertUpdateImgRequest imgReq = new DubboInsertUpdateImgRequest();
			imgReq.setImgList(imgList);
			
			if(req.getMainImg()!=null){
				imgResp = dubboImgService.insertUpdateImgAndTag(imgReq);
			}
			List<Long> idList = new ArrayList<Long>();
			if(imgResp!=null && ReturnCode.SUCCESS ==imgResp.getCode() && CollectionUtils.isNotEmpty(imgResp.getAddImgReslist())){
				for(DubboImgResInfo imgResInfo:imgResp.getAddImgReslist()){
					if(req.getMainImg()!=null && req.getMainImg().getFileId().equals(imgResInfo.getFileId())){ 
						request.setMainImgId(imgResInfo.getImgId());
					}else{
						idList.add(imgResInfo.getImgId());
					}
				}
				if(CollectionUtils.isNotEmpty(idList)){ 
					request.setAssistImgIds(JSON.toJSONString(idList));
				}
			}
			
			DubboAddItemResponse response = dubboItemService.insert(request);
			if(response!=null && ReturnCode.SUCCESS ==response.getCode()){
				resp.setCode(ReturnCode.SUCCESS); 
			}else{
				resp.setCode(ReturnCode.ALERT_ERR); 
				if(response!=null && StringUtils.isNotBlank(response.getDesc())){
					resp.setDesc(response.getDesc());
				}else{
					resp.setDesc("操作失败"); 
				}
			}
		} catch (Exception e) {
			resp.setCode(ReturnCode.ALERT_ERR);
			resp.setDesc("操作失败");
			return resp;
		}
		
		return resp;
	}
	
	/**
	 * 修改商品信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "updateitem", method = RequestMethod.POST)
	public ClientUpdateItemResponse updateItem(@RequestBody ClientUpdateItemRequest req) {
		//添加商品信息
		ClientUpdateItemResponse resp = new ClientUpdateItemResponse();
		try {
			DubboUpdateItemRequest request = BeanMapper.map(req, DubboUpdateItemRequest.class);
			request.setId(req.getItemId()); 
			if(StringUtils.isNotBlank(req.getTimeToMarketStr())){ 
				Date date = new SimpleDateFormat("yyyy-MM-dd").parse(req.getTimeToMarketStr());
				request.setTimeToMarket(date); 
			}
			//保存或更新图片
			DubboInsertUpdateImgResponse imgResp = null;
			List<DubboImg> imgList = new ArrayList<DubboImg>();
			if(CollectionUtils.isNotEmpty(req.getAssistImgList())){
				//商品轮播图
				imgList = BeanMapper.map(req.getAssistImgList(), DubboImg.class);
			}
			if(req.getMainImg()!=null){
				//商品主图
				DubboImg imgVO = BeanMapper.map(req.getMainImg(), DubboImg.class);
				imgList.add(imgVO);
			}
			if(CollectionUtils.isNotEmpty(imgList)){
				for(DubboImg img:imgList){
					img.setTypeId(DubboImageConstants.ITEM_IMG);
				}
			}
			DubboInsertUpdateImgRequest imgReq = new DubboInsertUpdateImgRequest();
			imgReq.setImgList(imgList);
			
			if(req.getMainImg()!=null){
				imgResp = dubboImgService.insertUpdateImgAndTag(imgReq);
			}
			List<Long> idList = new ArrayList<Long>();
			if(imgResp!=null && ReturnCode.SUCCESS ==imgResp.getCode() && CollectionUtils.isNotEmpty(imgResp.getAddImgReslist())){
				for(DubboImgResInfo imgResInfo:imgResp.getAddImgReslist()){
					if(req.getMainImg()!=null && req.getMainImg().getFileId().equals(imgResInfo.getFileId())){ 
						request.setMainImgId(imgResInfo.getImgId());
					}else{
						idList.add(imgResInfo.getImgId());
					}
				}
				if(CollectionUtils.isNotEmpty(idList)){ 
					request.setAssistImgIds(JSON.toJSONString(idList));
				}
			}
			
			DubboUpdateItemResponse response = dubboItemService.updateByPrimaryKeySelective(request);
			if(response!=null && ReturnCode.SUCCESS ==response.getCode()){
				resp.setCode(ReturnCode.SUCCESS); 
			}else{
				resp.setCode(ReturnCode.ALERT_ERR); 
				if(response!=null && StringUtils.isNotBlank(response.getDesc())){
					resp.setDesc(response.getDesc());
				}else{
					resp.setDesc("操作失败"); 
				}
			}
		} catch (Exception e) {
			resp.setCode(ReturnCode.ALERT_ERR);
			resp.setDesc("操作失败");
			return resp;
		}
		
		return resp;
	}
	
	/**
	 * 商品上架、下架、推荐、非推荐、热门、非热门
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "downuprecomhotitem", method = RequestMethod.POST)
	public ClientDownUpRecomHotItemResponse downUpRecomHotItem(@RequestBody ClientDownUpRecomHotItemRequest req) {
		//添加商品信息
		ClientDownUpRecomHotItemResponse resp = new ClientDownUpRecomHotItemResponse();
		DubboDownUpRecomHotItemRequest request = BeanMapper.map(req, DubboDownUpRecomHotItemRequest.class);
		request.setId(req.getItemId()); 
		try {
			DubboDownUpRecomHotItemResponse response = dubboItemService.downUpRecomHotItem(request);
			if(response!=null && ReturnCode.SUCCESS ==response.getCode()){
				resp.setCode(ReturnCode.SUCCESS); 
			}else{
				resp.setCode(ReturnCode.ALERT_ERR); 
				if(response!=null && StringUtils.isNotBlank(response.getDesc())){
					resp.setDesc(response.getDesc());
				}else{
					resp.setDesc("操作失败"); 
				}
			}
		} catch (Exception e) {
			resp.setCode(ReturnCode.ALERT_ERR);
			resp.setDesc("操作失败");
			return resp;
		}
		
		return resp;
	}
	
	/**
	 * 查询商品信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "queryitembypage", method = RequestMethod.POST)
	public ClientQueryItemByPageResponse queryItemByPage(@RequestBody ClientQueryItemByPageRequest req) {
		//分页查询商品列表信息
		ClientQueryItemByPageResponse resp = new ClientQueryItemByPageResponse();
		DubboQueryItemByPageRequest request = BeanMapper.map(req, DubboQueryItemByPageRequest.class);
		try {
			if(null == request.getCurrentPage()){
				request.setCurrentPage(1);
			}
			if(null == request.getPageSize()){
				request.setPageSize(10); 
			}
			DubboQueryItemByPageResponse response = dubboItemService.queryItemByPage(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryItemByPageResponse.class);
				
				if(resp!=null && CollectionUtils.isNotEmpty(resp.getItemList())){
					DubboQueryImgTagResponse imgResp = null;
					ClientImg imgVO = null;
					List<ClientImg> assistImgList = null;
					for(ClientResItem itemVO:resp.getItemList()){
						
						//查询类目
						if(itemVO.getBrandId()!=null){
							DubboQueryBrandRequest brandReq = new DubboQueryBrandRequest();
							brandReq.setId(itemVO.getBrandId()); 
							DubboQueryBrandResponse brandRes = dubboBaseinfoBrandService.queryBrandList(brandReq);
							if(brandRes!=null && CollectionUtils.isNotEmpty(brandRes.getBrandList())){ 
								ClientBaseinfoBrand brandVO = BeanMapper.map(brandRes.getBrandList().get(0), ClientBaseinfoBrand.class);
								itemVO.setBrand(brandVO);
							}
						}
						
						//查询品牌
						if(itemVO.getCategLvlId()!=null){
							DubboQueryCategRequest categReq = new DubboQueryCategRequest();
							categReq.setId(new Long(itemVO.getCategLvlId().intValue())); 
							DubboQueryCategResponse categRes = dubboBaseinfoCategService.queryCategList(categReq);
							if(categRes!=null && CollectionUtils.isNotEmpty(categRes.getCategList())){ 
								ClientBaseinfoCateg categVO = BeanMapper.map(categRes.getCategList().get(0), ClientBaseinfoCateg.class);
								itemVO.setCateg(categVO);
							}
						}
						
						//查询图片列表
						DubboQueryImgTagRequest imgReq = new DubboQueryImgTagRequest();
						List<Long> imgIdList = new ArrayList<Long>();
						if(itemVO.getMainImgId()!=null){
							imgIdList.add(itemVO.getMainImgId());
						}
						if(StringUtils.isNotBlank(itemVO.getAssistImgIds())){
							imgIdList.addAll(JSON.parseArray(itemVO.getAssistImgIds(), Long.class));
						}
						
						if(CollectionUtils.isNotEmpty(imgIdList)){ 
							imgReq.setImgIdList(imgIdList);
							imgResp = dubboImgService.queryImgList(imgReq);
							if(imgResp!=null && CollectionUtils.isNotEmpty(imgResp.getImgList())){
								assistImgList = new ArrayList<ClientImg>();
								for(DubboImgRespInfo resImgVO:imgResp.getImgList()){
									if(itemVO.getMainImgId()!=null && itemVO.getMainImgId().longValue()== resImgVO.getImgId().longValue()){
										imgVO = BeanMapper.map(resImgVO, ClientImg.class); 
										itemVO.setMainImg(imgVO);
									}else{
										imgVO = BeanMapper.map(resImgVO, ClientImg.class); 
										assistImgList.add(imgVO);
									}
								}
								if(CollectionUtils.isNotEmpty(assistImgList)){
									itemVO.setAssistImgList(assistImgList);
								}
							}
						}
					}
				}
				
			}else{
				resp.setCode(ReturnCode.ALERT_ERR); 
				resp.setDesc("操作失败");
			}
		} catch (Exception e) {
			resp.setCode(ReturnCode.ALERT_ERR);
			resp.setDesc("操作失败");
			return resp;
		}
		
		return resp;
	}

}
