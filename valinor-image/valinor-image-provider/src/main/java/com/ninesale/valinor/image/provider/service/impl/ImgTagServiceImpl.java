package com.ninesale.valinor.image.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.image.provider.dao.ImgTagMapper;
import com.ninesale.valinor.image.provider.model.DtoImgTag;
import com.ninesale.valinor.image.provider.model.DtoImgTagAndType;
import com.ninesale.valinor.image.provider.service.ImgTagService;
import com.pubpi.common.exception.DaoException;

@Service
public class ImgTagServiceImpl implements ImgTagService {
	
	private static final Logger logger = Logger.getLogger(ImgTagServiceImpl.class);
	
	@Resource
	private ImgTagMapper imgTagMapper;

	@Override
	public Map<String, Object> insert(DtoImgTag imgTag) {
		logger.info("imgTagLocation=="+imgTag.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = imgTagMapper.insert(imgTag);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"保存图片标签异常");
		}
		map.put("iCount", iCount);
		map.put("id", imgTag.getId());
		return map;
	}

	@Override
	public List<DtoImgTag> queryImgTagList(DtoImgTag imgTag) {
		logger.info("imgStore=="+imgTag.toString());
		List<DtoImgTag> list = null;
		try {
			list = imgTagMapper.queryImgTagList(imgTag);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片标签列表异常");
		}
		return list;
	}

	@Override
	public DtoImgTag queryImgTag(Long tagTypeId, String tagName) {
		logger.info("tagTypeId=="+tagTypeId+"tagName=="+tagName);
		DtoImgTag imgTag = null;
		try {
			imgTag = imgTagMapper.queryImgTag(tagTypeId,tagName);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片标签异常");
		}
		return imgTag;
	}

	@Override
	public List<DtoImgTagAndType> queryImgTagAndTypeList(List<Long> ids) {
		logger.info("ids=="+ids.toString());
		List<DtoImgTagAndType> list = null;
		try {
			list = imgTagMapper.queryImgTagAndTypeList(ids);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片标签列表异常");
		}
		return list;
	}

}
