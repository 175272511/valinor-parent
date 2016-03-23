package com.ninesale.valinor.baseinfo.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.baseinfo.provider.dao.AddressTagMapper;
import com.ninesale.valinor.baseinfo.provider.model.DtoAddress2Tag;
import com.ninesale.valinor.baseinfo.provider.model.DtoAddressTag;
import com.ninesale.valinor.baseinfo.provider.service.AddressTagService;
import com.pubpi.common.exception.DaoException;

/**
 * @des 基础信息-购物地点标签 实现类
 * @author fxj
 * @date 2015年12月07日14:33:38
 */
@Service
public class AddressTagServiceImpl implements AddressTagService {
	
	private static final Logger logger = Logger.getLogger(AddressTagServiceImpl.class);

	@Resource
	private AddressTagMapper addressTagMapper;

	@Override
	public Map<String, Object> insert(DtoAddressTag record) {
		logger.info("DubboAddressTag=="+record!=null?record.toString():null); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount = 0;
		try {
			iCount = addressTagMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存购物地点信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public List<DtoAddress2Tag> queryAddrTagByPage(DtoAddressTag record, Integer beginId, Integer pageSize) {
		logger.info("beginId=="+beginId+"pageSize=="+pageSize); 
		logger.info("DubboAddressTag=="+record!=null?record.toString():null);
		List<DtoAddress2Tag> addressTagList = null;
		try {
			addressTagList = addressTagMapper.queryAddrTagByPage(record, beginId, pageSize); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询购物地点列表异常");
		}
		return addressTagList;
	}

	@Override
	public int queryTotalNumOfAddrTag(DtoAddressTag record) {
		logger.info("DubboAddressTag=="+record!=null?record.toString():null);
		int iCount = 0;
		try {
			iCount = addressTagMapper.queryTotalNumOfAddrTag(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询购物地点总数异常");
		}
		return iCount;
	}

	@Override
	public List<DtoAddressTag> queryAddrTagList(DtoAddressTag record) {
		logger.info("DubboAddressTag=="+record!=null?record.toString():null); 
		List<DtoAddressTag> addressTagList = null;
		try {
			addressTagList = addressTagMapper.queryAddrTagList(record); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询购物地点列表信息异常");
		}
		return addressTagList;
	}

}
