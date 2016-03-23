package com.ninesale.valinor.image.api.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.ninesale.valinor.image.api.model.dto.DubboImgType;
import com.ninesale.valinor.image.api.model.request.DubboAddImgTypeRequest;
import com.ninesale.valinor.image.api.model.request.DubboDelImgTypeRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgStoreRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgTypeListRequest;
import com.ninesale.valinor.image.api.model.request.DubboUpdateImgTypeRequest;
import com.ninesale.valinor.image.api.model.response.DubboAddImgTypeResponse;
import com.ninesale.valinor.image.api.model.response.DubboDelImgTypeResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTypeListResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTypeResponse;
import com.ninesale.valinor.image.api.model.response.DubboUpdateImgTypeResponse;
import com.ninesale.valinor.image.api.service.DubboImgTypeService;
import com.ninesale.valinor.image.provider.model.DtoImgType;
import com.ninesale.valinor.image.provider.service.ImgTypeService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;

public class DubboImgTypeServiceImpl implements DubboImgTypeService {
	
	private static final Logger logger = Logger.getLogger(DubboImgTypeServiceImpl.class);
	
	@Resource
	private ImgTypeService imgTypeService;
	
	@Override
	public DubboAddImgTypeResponse insert(DubboAddImgTypeRequest dubboAddImgTypeRequest) {
		logger.info("***start***ImgTypeServiceImpl.insert***start***"); 
		logger.info(dubboAddImgTypeRequest.toString()); 
		DubboAddImgTypeResponse dubboAddImgTypeResponse = new DubboAddImgTypeResponse();
		DtoImgType dtoImgType = BeanMapper.map(dubboAddImgTypeRequest, DtoImgType.class);
		logger.info(dtoImgType.toString());
		Map<String,Object> map = null;
		try {
			map = imgTypeService.insert(dtoImgType);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"保存图片所属类型异常");
		}
		
		if(map!=null && map.size()>0){
			dubboAddImgTypeResponse.setCode(0);
			dubboAddImgTypeResponse.setiCount(map.get("iCount")!=null?(int)map.get("iCount"):0);  
			dubboAddImgTypeResponse.setId(map.get("id")!=null?(Long)map.get("id"):null);
		}else{
			dubboAddImgTypeResponse.setCode(4);
			dubboAddImgTypeResponse.setDesc("没有数据可保存");  
		}
		
		logger.info(dubboAddImgTypeResponse.toString());
		logger.info("***end***ImgTypeServiceImpl.insert***end***");
		return dubboAddImgTypeResponse;
	}

	@Override
	public DubboQueryImgTypeResponse selectByPrimaryKey(DubboQueryImgStoreRequest dubboQueryImgStoreRequest) {
		logger.info("***start***ImgTypeServiceImpl.selectByPrimaryKey***start***"); 
		logger.info("dubboQueryImgStoreRequest:"+dubboQueryImgStoreRequest.toString()); 
		DubboQueryImgTypeResponse dubboQueryImgTypeResponse = new DubboQueryImgTypeResponse();
		
		DtoImgType dtoImgType = null;
		try {
			dtoImgType = imgTypeService.selectByPrimaryKey(dubboQueryImgStoreRequest.getId()); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片所属类型信息异常");
		}
		if(dtoImgType!=null){
			DubboImgType dubboImgType = BeanMapper.map(dtoImgType, DubboImgType.class);
			dubboQueryImgTypeResponse.setDubboImgType(dubboImgType);
		}
		
		dubboQueryImgTypeResponse.setCode(0); 
		logger.info(dubboQueryImgTypeResponse.toString());
		logger.info("***end***ImgTypeServiceImpl.selectByPrimaryKey***end***");
		return dubboQueryImgTypeResponse;
	}

	@Override
	public DubboDelImgTypeResponse deleteByPrimaryKey(DubboDelImgTypeRequest DubboDelImgTypeRequest) {
		logger.info("***start***ImgStoreServiceImpl.deleteByPrimaryKey***start***"); 
		logger.info("DubboDelImgTypeRequest:"+DubboDelImgTypeRequest.toString()); 
		DubboDelImgTypeResponse dubboDelImgTypeResponse = new DubboDelImgTypeResponse();
		
		int iCount = 0;
		try {
			iCount = imgTypeService.deleteByPrimaryKey(DubboDelImgTypeRequest.getId());   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除图片所属类型信息异常");
		}
		
		dubboDelImgTypeResponse.setiCount(iCount);
		dubboDelImgTypeResponse.setCode(0); 
		logger.info(dubboDelImgTypeResponse.toString());
		logger.info("***end***ImgTypeServiceImpl.deleteByPrimaryKey***end***");
		return dubboDelImgTypeResponse;
	}

	@Override
	public DubboUpdateImgTypeResponse updateByPrimaryKeySelective(DubboUpdateImgTypeRequest dubboUpdateImgTypeRequest) {
		logger.info("***start***ImgStoreServiceImpl.updateByPrimaryKeySelective***start***"); 
		logger.info("dubboUpdateImgTypeRequest=="+dubboUpdateImgTypeRequest); 
		DubboUpdateImgTypeResponse dubboUpdateImgTypeResponse = new DubboUpdateImgTypeResponse();
		int iCount = 0;
		try {
			DtoImgType dtoImgType = BeanMapper.map(dubboUpdateImgTypeRequest, DtoImgType.class);
			iCount = imgTypeService.updateByPrimaryKeySelective(dtoImgType);   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"更新图片所属类型信息异常");
		}
		
		dubboUpdateImgTypeResponse.setiCount(iCount);
		dubboUpdateImgTypeResponse.setCode(0); 
		logger.info(dubboUpdateImgTypeResponse.toString());
		logger.info("***end***ImgTypeServiceImpl.updateByPrimaryKeySelective***end***");
		return dubboUpdateImgTypeResponse;
	}

	@Override
	public DubboQueryImgTypeListResponse queryImgTypeList(DubboQueryImgTypeListRequest dubboQueryImgTypeListRequest) {
		logger.info("***start***ImgTypeServiceImpl.queryImgTypeList***start***"); 
		logger.info("dubboQueryImgTypeListRequest=="+dubboQueryImgTypeListRequest.toString()); 
		DubboQueryImgTypeListResponse dubboQueryImgTypeListResponse = new DubboQueryImgTypeListResponse();
		List<DtoImgType> list = null;
		try {
			DtoImgType dtoImgType = BeanMapper.map(dubboQueryImgTypeListRequest, DtoImgType.class);
			list = imgTypeService.queryImgTypeList(dtoImgType);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片所属类型信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboImgType> resultlist = BeanMapper.map(list, DubboImgType.class);
			dubboQueryImgTypeListResponse.setList(resultlist);
		}
		
		dubboQueryImgTypeListResponse.setCode(0); 
		logger.info(dubboQueryImgTypeListResponse.toString());
		logger.info("***end***ImgTypeServiceImpl.queryImgTypeList***end***");
		return dubboQueryImgTypeListResponse;
	}

}
