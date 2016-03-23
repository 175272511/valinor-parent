package com.ninesale.valinor.image.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.image.provider.dao.ImgTagLocationMapper;
import com.ninesale.valinor.image.provider.model.DtoImgTagLocation;
import com.ninesale.valinor.image.provider.service.ImgTagGroupService;
import com.pubpi.common.exception.DaoException;

@Service
public class ImgTagLocationServiceImpl implements ImgTagGroupService {
	
	private static final Logger logger = Logger.getLogger(ImgTagLocationServiceImpl.class);
	@Resource
	private ImgTagLocationMapper imgTagLocationMapper;
	
	@Override
	public Map<String, Object> insert(DtoImgTagLocation imgTagLocation) {
		logger.info("imgTagLocation=="+imgTagLocation.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = imgTagLocationMapper.insert(imgTagLocation);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"保存图片标签位置信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", imgTagLocation.getId());
		return map;
	}

	@Override
	public int deleteImgTagLocationByImgid(Long imgId) {
		logger.info("imgId=="+imgId); 
		int iCount = 0;
		try {
			iCount = imgTagLocationMapper.deleteImgTagLocationByImgid(imgId);   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除图片标签位置信息异常");
		}
		
		return iCount;
	}

	@Override
	public List<DtoImgTagLocation> queryImgTagInfoList(List<Long> ids) {
		logger.info("ids=="+ids.toString());
		List<DtoImgTagLocation> list = null;
		try {
			list = imgTagLocationMapper.queryImgTagInfoList(ids);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片标签位置列表异常");
		}
		return list;
	}

}
