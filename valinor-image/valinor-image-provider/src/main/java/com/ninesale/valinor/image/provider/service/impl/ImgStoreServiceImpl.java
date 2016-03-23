package com.ninesale.valinor.image.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.image.provider.dao.ImgStoreMapper;
import com.ninesale.valinor.image.provider.model.DtoImgStore;
import com.ninesale.valinor.image.provider.model.DtoImgStoreType;
import com.ninesale.valinor.image.provider.model.DtoImgStoreTypeLocation;
import com.ninesale.valinor.image.provider.service.ImgStoreService;
import com.pubpi.common.exception.DaoException;

@Service
public class ImgStoreServiceImpl implements ImgStoreService {
	
	private static final Logger logger = Logger.getLogger(ImgStoreServiceImpl.class);
	@Resource
	private ImgStoreMapper imgStoreMapper;
	
	@Override
	public Map<String,Object> insert(DtoImgStore imgStore) {
		logger.info("imgStore=="+imgStore.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount=0;
		try {
			iCount = imgStoreMapper.insert(imgStore);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"保存图片信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", imgStore.getId());
		return map;
	}

	@Override
	public DtoImgStore selectByPrimaryKey(Long id) {
		logger.info("id=="+id); 
		DtoImgStore dtoImgStore = null;
		try {
			dtoImgStore = imgStoreMapper.selectByPrimaryKey(id); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片信息异常");
		}
		return dtoImgStore;
	}

	@Override
	public List<DtoImgStore> queryImgStoreList(DtoImgStore imgStore) {
		logger.info("imgStore=="+imgStore.toString());
		List<DtoImgStore> list = null;
		try {
			list = imgStoreMapper.queryImgStoreList(imgStore);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片信息列表异常");
		}
		return list;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		logger.info("id=="+id); 
		int iCount = 0;
		try {
			iCount = imgStoreMapper.deleteByPrimaryKey(id);   
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除图片信息异常");
		}
		
		return iCount;
	}

	@Override
	public int deleteImgStoreByIds(List<Long> ids) {
		logger.info("ids=="+ids.toString()); 
		int iCount = 0;
		try {
			iCount = imgStoreMapper.deleteImgStoreByIds(ids);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"删除图片信息列表异常");
		}
		return iCount;
	}

	@Override
	public List<DtoImgStoreType> queryImgStoreTypeList(List<Long> ids) {
		logger.info("ids=="+ids.toString());
		List<DtoImgStoreType> list = null;
		try {
			list = imgStoreMapper.queryImgStoreTypeList(ids);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片信息列表异常");
		}
		return list;
	}

	@Override
	public List<DtoImgStoreTypeLocation> queryImgLocationList(List<Long> ids) {
		logger.info("ids=="+ids.toString());
		List<DtoImgStoreTypeLocation> list = null;
		try {
			list = imgStoreMapper.queryImgLocationList(ids);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询图片、图片类型和图片标签位置列表异常");
		}
		return list;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoImgStore imgStore) {
		logger.info("DtoImgStore=="+imgStore.toString()); 
		int iCount=0;
		try {
			iCount = imgStoreMapper.updateByPrimaryKeySelective(imgStore);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"更新图片信息异常");
		}
		return iCount;
	}
	
}
