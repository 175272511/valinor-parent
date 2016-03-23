package com.ninesale.valinor.image.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.image.provider.dao.ImgTagTypeMapper;
import com.ninesale.valinor.image.provider.model.DtoImgTagType;
import com.ninesale.valinor.image.provider.service.ImgTagTypeService;
import com.pubpi.common.exception.DaoException;

@Service
public class ImgTagTypeServiceImpl implements ImgTagTypeService {
	
	private static final Logger logger = Logger.getLogger(ImgTagTypeServiceImpl.class);
	
	@Resource
	private ImgTagTypeMapper imgTagTypeMapper;

	@Override
	public Map<String, Object> insert(DtoImgTagType imgTagType) {
		logger.info("imgTagLocation=="+imgTagType.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = imgTagTypeMapper.insert(imgTagType);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"保存图片标签类型信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", imgTagType.getId());
		return map;
	}

	@Override
	public List<DtoImgTagType> queryImgTagTypeList(DtoImgTagType imgTagType) {
		logger.info("imgStore=="+imgTagType.toString());
		List<DtoImgTagType> list = null;
		try {
			list = imgTagTypeMapper.queryImgTagTypeList(imgTagType);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片标签列表异常");
		}
		return list;
	}

}
