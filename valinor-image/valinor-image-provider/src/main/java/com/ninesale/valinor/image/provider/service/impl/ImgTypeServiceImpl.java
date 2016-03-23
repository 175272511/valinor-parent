package com.ninesale.valinor.image.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.image.provider.dao.ImgTypeMapper;
import com.ninesale.valinor.image.provider.model.DtoImgType;
import com.ninesale.valinor.image.provider.service.ImgTypeService;
import com.pubpi.common.exception.DaoException;

@Service
public class ImgTypeServiceImpl implements ImgTypeService {
	
	private static final Logger logger = Logger.getLogger(ImgTypeServiceImpl.class);
	
	@Resource
	private ImgTypeMapper imgTypeMapper;
	
	@Override
	public Map<String,Object> insert(DtoImgType dtoImgType) {
		logger.info("DtoImgType=="+dtoImgType.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = imgTypeMapper.insert(dtoImgType);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"保存图片所属类型异常");
		}
		map.put("iCount", iCount);
		map.put("id", dtoImgType.getId());
		return map;
	}

	@Override
	public DtoImgType selectByPrimaryKey(Long id) {
		logger.info("id=="+id);  
		DtoImgType dtoImgType = null;
		try {
			dtoImgType = imgTypeMapper.selectByPrimaryKey(id); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片所属类型信息异常");
		}
		return dtoImgType;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		logger.info("id=="+id); 
		int iCount = 0;
		try {
			iCount = imgTypeMapper.deleteByPrimaryKey(id);   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除图片所属类型信息异常");
		}
		return iCount;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoImgType dtoImgType) {
		logger.info("DtoImgType=="+dtoImgType.toString()); 
		int iCount = 0;
		try {
			iCount = imgTypeMapper.updateByPrimaryKeySelective(dtoImgType);   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"更新图片所属类型信息异常");
		}
		
		return iCount;
	}

	@Override
	public List<DtoImgType> queryImgTypeList(DtoImgType dtoImgType) {
		logger.info("DtoImgType=="+dtoImgType.toString()); 
		List<DtoImgType> list = null;
		try {
			list = imgTypeMapper.queryImgTypeList(dtoImgType);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片所属类型信息列表异常");
		}
		
		return list;
	}

}
