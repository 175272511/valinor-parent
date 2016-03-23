package com.ninesale.valinor.baseinfo.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.baseinfo.provider.dao.BaseinfoBrandMapper;
import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoBrand;
import com.ninesale.valinor.baseinfo.provider.service.BaseinfoBrandService;
import com.pubpi.common.exception.DaoException;

/**
 * @des 基础信息-品牌信息 实现类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
@Service
public class BaseinfoBrandServiceImpl implements BaseinfoBrandService {

	private static final Logger logger = Logger.getLogger(BaseinfoBrandServiceImpl.class);

	@Resource
	private BaseinfoBrandMapper baseinfoBrandMapper;

	/**
	 * 增加品牌信息
	 * 
	 * @param DubboAddAddrTagRequest
	 *            dubboAddBaseinfoBrandRequest
	 * @return DubboAddAddrTagResponse
	 */
	public Map<String,Object> insert(DtoBaseinfoBrand dtoBaseinfoBrand) {
		logger.info("dtoBaseinfoBrand=="+dtoBaseinfoBrand.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount = 0;
		try {
			iCount = baseinfoBrandMapper.insert(dtoBaseinfoBrand);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存品牌信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", dtoBaseinfoBrand.getId());
		return map;
	}

	/**
	 * 删除品牌信息
	 * 
	 * @param DubboAddAddrTagRequest
	 *            dubboAddBaseinfoBrandRequest
	 * @return DubboDelBaseinfoBrandResponse
	 */
	public int deleteByPrimaryKey(Long id) {
		logger.info("id=="+id); 
		int iCount = 0;
		try {
			iCount = baseinfoBrandMapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "删除品牌信息异常");
		}
		return iCount;
	}

	/**
	 * 修改品牌信息
	 * 
	 * @param DubboUpdateBaseinfoBrandRequest
	 *            dubboUpdateBaseinfoBrandRequest
	 * @return DubboUpdateBaseinfoBrandResponse
	 */
	public int updateByPrimaryKeySelective(DtoBaseinfoBrand dtoBaseinfoBrand) {
		logger.info("DtoBaseinfoBrand==" + dtoBaseinfoBrand.toString());
		int iCount = 0;
		try {
			iCount = baseinfoBrandMapper.updateByPrimaryKeySelective(dtoBaseinfoBrand);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "更新品牌信息异常");
		}

		return iCount;
	}

	/**
	 * 查询品牌信息
	 * 
	 * @param DubboAddAddrTagRequest
	 *            dubboAddBaseinfoBrandRequest
	 * @return DubboQueryBaseinfoBrandResponse
	 */
	public DtoBaseinfoBrand selectByPrimaryKey(Long id) {
		logger.info("id=="+id); 
		DtoBaseinfoBrand dtoIBaseinfoBrand = null;
		try {
			dtoIBaseinfoBrand = baseinfoBrandMapper.selectByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询品牌信息异常");
		}
		return dtoIBaseinfoBrand;
	}

	/**
	 * 禁用品牌信息
	 * 
	 * @param DubboDownBaseinfoBrandRequest
	 *            dubboDownBaseinfoBrandRequest
	 * @return DubboDownBaseinfoBrandResponse
	 */
	public int downByPrimaryKey(DtoBaseinfoBrand dtoBaseinfoBrand) {
		logger.info("***start***BaseinfoBrandServiceImpl.downByPrimaryKey***start***");
		logger.info(dtoBaseinfoBrand.toString());
		int iCount = 0;
		try {
			iCount = baseinfoBrandMapper.updateByPrimaryKey(dtoBaseinfoBrand);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "禁用品牌信息异常");
		}
		return iCount;
	}

	@Override
	public List<DtoBaseinfoBrand> queryBrandByPage(DtoBaseinfoBrand brand, Integer beginId,
			Integer pageSize) {
		logger.info("beginId=="+beginId+"pageSize=="+pageSize+brand.toString()); 
		List<DtoBaseinfoBrand> brandList = null;
		try {
			brandList = baseinfoBrandMapper.queryBrandByPage(brand, beginId, pageSize); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询品牌列表信息异常");
		}
		return brandList;
	}

	@Override
	public int queryTotalNumOfBrand(DtoBaseinfoBrand brand) {
		logger.info(brand.toString());
		int iCount = 0;
		try {
			iCount = baseinfoBrandMapper.queryTotalNumOfBrand(brand);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询品牌总数异常");
		}
		return iCount;
	}

	@Override
	public List<DtoBaseinfoBrand> queryBrandList(DtoBaseinfoBrand brand) {
		logger.info("DtoBaseinfoBrand=="+brand.toString()); 
		List<DtoBaseinfoBrand> brandList = null;
		try {
			brandList = baseinfoBrandMapper.queryBrandList(brand); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询品牌列表信息异常");
		}
		return brandList;
	}
}
