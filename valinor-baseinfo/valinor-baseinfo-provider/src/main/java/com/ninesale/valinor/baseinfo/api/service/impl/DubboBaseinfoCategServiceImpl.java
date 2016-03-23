package com.ninesale.valinor.baseinfo.api.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.baseinfo.api.constant.DubboBaseinfoConstants;
import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoCateg;
import com.ninesale.valinor.baseinfo.api.model.dto.DubboParentCateg;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboAddCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboDownUpCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQueryAllCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQueryCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQueryParentCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQuerySubCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboUpdateCategRequest;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboAddCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboDownUpCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQueryAllCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQueryCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQueryParentCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQuerySubCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboUpdateCategResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoCategService;
import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoCateg;
import com.ninesale.valinor.baseinfo.provider.model.DtoParentCateg;
import com.ninesale.valinor.baseinfo.provider.service.BaseinfoCategService;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

/**
 * @des 基础信息-类目信息 实现类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public class DubboBaseinfoCategServiceImpl implements DubboBaseinfoCategService {

	private static final Logger logger = Logger.getLogger(DubboBaseinfoCategServiceImpl.class);

	@Resource
	private BaseinfoCategService baseinfoCategService;

	@Override
	public DubboAddCategResponse addCateg(DubboAddCategRequest req) {
		DubboAddCategResponse response = new DubboAddCategResponse();
		DtoBaseinfoCateg dto = BeanMapper.map(req, DtoBaseinfoCateg.class);
		dto.setCreateTime(new Date()); 
		dto.setUpdateTime(new Date()); 
		dto.setValidFlag(DubboBaseinfoConstants.VALID_FLAG);
		logger.info(dto.toString());
		Map<String,Object> map = null;
		try {
			map = baseinfoCategService.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存类目信息异常");
		}
		if(map!=null && map.size()>0){
			response.setCode(DubboBaseinfoConstants.SUCCESS_CODE);
			response.setIcount(map.get("iCount")!=null?(int)map.get("iCount"):0);  
			response.setId(map.get("id")!=null?(Long)map.get("id"):null);
		}else{
			response.setCode(DubboBaseinfoConstants.FAILURE_CODE);
			response.setDesc("没有数据可保存");  
		}
		logger.info(response.toString());
		logger.info("***end***DubboBaseinfoCategServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboUpdateCategResponse updateCateg(DubboUpdateCategRequest req) {
		DubboUpdateCategResponse response = new DubboUpdateCategResponse();
		int iCount = 0;
		try {
			DtoBaseinfoCateg dto = BeanMapper.map(req, DtoBaseinfoCateg.class);
			dto.setUpdateTime(new Date()); 
			iCount = baseinfoCategService.updateByPrimaryKeySelective(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新类目信息异常");
		}
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		response.setIcount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboBaseinfoCategServiceImpl.updateCateg***end***");
		return response;
	}

	@Override
	public DubboDownUpCategResponse downUpCateg(DubboDownUpCategRequest req) {
		DubboDownUpCategResponse response = new DubboDownUpCategResponse();
		int iCount = 0;
		try {
			DtoBaseinfoCateg dto = BeanMapper.map(req, DtoBaseinfoCateg.class);
			dto.setUpdateTime(new Date()); 
			iCount = baseinfoCategService.updateByPrimaryKeySelective(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新类目信息异常");
		}
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		response.setIcount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboBaseinfoCategServiceImpl.downuUpCateg***end***");
		return response;
	}

	@Override
	public DubboQueryParentCategResponse queryParentCateg(DubboQueryParentCategRequest req) {
		DubboQueryParentCategResponse response = new DubboQueryParentCategResponse();
		
		DtoBaseinfoCateg dto = new DtoBaseinfoCateg();
		dto.setParentCategId(0); 
		
		List<DtoBaseinfoCateg> cateList;
		try {
			cateList = baseinfoCategService.queryCategList(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询类目列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(cateList)){ 
			List<DubboBaseinfoCateg> brandList2 = BeanMapper.map(cateList, DubboBaseinfoCateg.class);
			response.setCategList(brandList2); 
		}
		
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		
		return response;
	}

	@Override
	public DubboQuerySubCategResponse querySubCateg(DubboQuerySubCategRequest req) {
		DubboQuerySubCategResponse response = new DubboQuerySubCategResponse();
		
		DtoBaseinfoCateg dto = BeanMapper.map(req, DtoBaseinfoCateg.class);
		List<DtoBaseinfoCateg> cateList;
		try {
			cateList = baseinfoCategService.queryCategList(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询类目列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(cateList)){ 
			List<DubboBaseinfoCateg> brandList2 = BeanMapper.map(cateList, DubboBaseinfoCateg.class);
			response.setCategList(brandList2); 
		}
		
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		
		return response;
	}

	@Override
	public DubboQueryAllCategResponse queryAllCateg(DubboQueryAllCategRequest req) {
		DubboQueryAllCategResponse response = new DubboQueryAllCategResponse();
		
		DtoBaseinfoCateg dto = BeanMapper.map(req, DtoBaseinfoCateg.class);
		List<DtoParentCateg> cateList;
		try {
			cateList = baseinfoCategService.queryAllCategList(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询类目列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(cateList)){ 
			List<DubboParentCateg> brandList2 = BeanMapper.map(cateList, DubboParentCateg.class);
			response.setCategList(brandList2); 
		}
		
		response.setCode(DubboBaseinfoConstants.SUCCESS_CODE); 
		
		return response;
	}

	@Override
	public DubboQueryCategResponse queryCategList(DubboQueryCategRequest req) {
		
		DubboQueryCategResponse response = new DubboQueryCategResponse();
		
		DtoBaseinfoCateg dto = BeanMapper.map(req, DtoBaseinfoCateg.class);
		List<DtoBaseinfoCateg> cateList; 
		try {
			cateList = baseinfoCategService.queryCategList(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询类目列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(cateList)){ 
			List<DubboBaseinfoCateg> brandList2 = BeanMapper.map(cateList, DubboBaseinfoCateg.class);
			response.setCategList(brandList2); 
		}
		
		return response;
	}

}
