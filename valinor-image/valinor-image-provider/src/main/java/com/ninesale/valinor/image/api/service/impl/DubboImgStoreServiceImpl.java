package com.ninesale.valinor.image.api.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.ninesale.valinor.image.api.model.dto.DubboImgStore;
import com.ninesale.valinor.image.api.model.dto.DubboImgStoreType;
import com.ninesale.valinor.image.api.model.dto.DubboImgType;
import com.ninesale.valinor.image.api.model.request.DubboAddImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboDelImgStoreListRequest;
import com.ninesale.valinor.image.api.model.request.DubboDelImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreListRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreTypeListRequest;
import com.ninesale.valinor.image.api.model.response.DubboAddImgStoreResponse;
import com.ninesale.valinor.image.api.model.response.DubboDelImgStoreResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgStoreListResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgStoreResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgStoreTypeListResponse;
import com.ninesale.valinor.image.api.service.DubboImgStoreService;
import com.ninesale.valinor.image.provider.model.DtoImgStore;
import com.ninesale.valinor.image.provider.model.DtoImgStoreType;
import com.ninesale.valinor.image.provider.service.ImgStoreService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboImgStoreServiceImpl implements DubboImgStoreService {
	
	private static final Logger logger = Logger.getLogger(DubboImgStoreServiceImpl.class);
	
	@Resource
	private ImgStoreService imgStoreService;
	
	@Override
	public DubboAddImgStoreResponse insert(DubboAddImgStoreRequest dubboAddImgStoreRequest) {
		logger.info("***start***ImgStoreServiceImpl.insert***start***"); 
		logger.info(dubboAddImgStoreRequest.toString()); 
		DubboAddImgStoreResponse dubboAddImgStoreResponse = new DubboAddImgStoreResponse();
		DtoImgStore imgStore = BeanMapper.map(dubboAddImgStoreRequest, DtoImgStore.class);
		logger.info(imgStore.toString());
		Map<String,Object> map = null;
		try {
			map = imgStoreService.insert(imgStore);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存图片信息异常");
		}
		if(map!=null && map.size()>0){
			dubboAddImgStoreResponse.setCode(0);
			dubboAddImgStoreResponse.setiCount(map.get("iCount")!=null?(int)map.get("iCount"):0);  
			dubboAddImgStoreResponse.setId(map.get("id")!=null?(Long)map.get("id"):null);
		}else{
			dubboAddImgStoreResponse.setCode(4);
			dubboAddImgStoreResponse.setDesc("没有数据可保存");  
		}
		logger.info(dubboAddImgStoreResponse.toString());
		logger.info("***end***insertImgStore.insert***end***");
		return dubboAddImgStoreResponse;
	}

	@Override
	public DubboQueryImgStoreResponse selectByPrimaryKey(DubboQueryImgStoreRequest dubboQueryImgStoreRequest) {
		logger.info("***start***ImgStoreServiceImpl.selectByPrimaryKey***start***"); 
		logger.info("dubboQueryImgStoreRequest:"+dubboQueryImgStoreRequest.toString()); 
		DubboQueryImgStoreResponse dubboQueryImgStoreResponse = new DubboQueryImgStoreResponse();
		DtoImgStore dtoImgStore = null;
		try {
			dtoImgStore = imgStoreService.selectByPrimaryKey(dubboQueryImgStoreRequest.getId()); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询图片信息异常");
		}
		
		if(dtoImgStore!=null){
			DubboImgStore dubboImgStore = BeanMapper.map(dtoImgStore, DubboImgStore.class);
			dubboQueryImgStoreResponse.setDubboImgStore(dubboImgStore);
		}
		
		dubboQueryImgStoreResponse.setCode(0); 
		logger.info(dubboQueryImgStoreResponse.toString());
		logger.info("***end***insertImgStore.selectByPrimaryKey***end***");
		return dubboQueryImgStoreResponse;
	}

	@Override
	public DubboQueryImgStoreListResponse queryImgStoreList(DubboQueryImgStoreListRequest dubboQueryImgStoreListRequest) {
		logger.info("***start***ImgStoreServiceImpl.queryImgStoreListByIds***start***"); 
		logger.info("dubboQueryImgStoreListRequest:"+dubboQueryImgStoreListRequest.toString()); 
		DubboQueryImgStoreListResponse dubboQueryImgStoreListResponse = new DubboQueryImgStoreListResponse();
		DtoImgStore dtoImgStore = BeanMapper.map(dubboQueryImgStoreListRequest, DtoImgStore.class);
		List<DtoImgStore> list = null;
		try {
			list = imgStoreService.queryImgStoreList(dtoImgStore);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboImgStore> resultlist = BeanMapper.map(list, DubboImgStore.class);
			dubboQueryImgStoreListResponse.setList(resultlist);
		}
		
		dubboQueryImgStoreListResponse.setCode(0); 
		logger.info(dubboQueryImgStoreListResponse.toString());
		logger.info("***end***insertImgStore.queryImgStoreListByIds***end***");
		return dubboQueryImgStoreListResponse;
	}

	@Override
	public DubboDelImgStoreResponse deleteByPrimaryKey(DubboDelImgStoreRequest dubboDelImgStoreRequest) {
		logger.info("***start***ImgStoreServiceImpl.deleteByPrimaryKey***start***"); 
		logger.info("dubboDelImgStoreRequest:"+dubboDelImgStoreRequest.toString()); 
		DubboDelImgStoreResponse dubboDelImgStoreResponse = new DubboDelImgStoreResponse();
		int iCount = 0;
		try {
			iCount = imgStoreService.deleteByPrimaryKey(dubboDelImgStoreRequest.getId());   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除图片信息异常");
		}
		
		dubboDelImgStoreResponse.setiCount(iCount);
		dubboDelImgStoreResponse.setCode(0); 
		logger.info(dubboDelImgStoreResponse.toString());
		logger.info("***end***insertImgStore.deleteByPrimaryKey***end***");
		return dubboDelImgStoreResponse;
	}

	@Override
	public DubboDelImgStoreResponse deleteImgStoreByIds(DubboDelImgStoreListRequest dubboDelImgStoreListRequest) {
		logger.info("***start***ImgStoreServiceImpl.deleteImgStoreByIds***start***"); 
		logger.info("dubboDelImgStoreListRequest:"+dubboDelImgStoreListRequest.toString()); 
		DubboDelImgStoreResponse dubboDelImgStoreResponse = new DubboDelImgStoreResponse();
		int iCount = 0;
		try {
			iCount = imgStoreService.deleteImgStoreByIds(dubboDelImgStoreListRequest.getIds());
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除图片信息列表异常");
		}
		
		dubboDelImgStoreResponse.setiCount(iCount);
		dubboDelImgStoreResponse.setCode(0); 
		logger.info(dubboDelImgStoreResponse.toString());
		logger.info("***end***insertImgStore.deleteImgStoreByIds***end***");
		return dubboDelImgStoreResponse;
	}

	@Override
	public DubboQueryImgStoreTypeListResponse queryImgStoreTypeList(
			DubboQueryImgStoreTypeListRequest request) {
		logger.info("***start***ImgStoreServiceImpl.DubboQueryImgStoreTypeListResponse***start***"); 
		logger.info("DubboQueryImgStoreTypeListRequest:"+request.toString()); 
		DubboQueryImgStoreTypeListResponse response = new DubboQueryImgStoreTypeListResponse();
		List<DtoImgStoreType> list = null;
		try {
			list = imgStoreService.queryImgStoreTypeList(request.getIds());  
		} catch (Exception e) {
			logger.error("查询图片信息列表异常"); 
			e.printStackTrace();
			throw new DaoException(1,"查询图片信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboImgStoreType> resultlist = BeanMapper.map(list, DubboImgStoreType.class);
			DubboImgType dubboImgType = null;
			for(DubboImgStoreType objTar :resultlist){
				dubboImgType = null;
				for(DtoImgStoreType objRes :list){
					if(objTar.getId().longValue() == objRes.getId().longValue()){
						dubboImgType = BeanMapper.map(objRes.getDtoImgType(), DubboImgType.class);
						objTar.setDubboImgType(dubboImgType); 
						break;
					}
				}
			}
			response.setList(resultlist);
		}
		
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***insertImgStore.queryImgStoreTypeList***end***");
		return response;
	}
	
}
