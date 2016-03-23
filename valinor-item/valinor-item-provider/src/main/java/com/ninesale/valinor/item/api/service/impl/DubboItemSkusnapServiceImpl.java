package com.ninesale.valinor.item.api.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.ninesale.valinor.item.api.model.sku.dto.DubboItemSkusnap;
import com.ninesale.valinor.item.api.model.sku.request.DubboQueryItemSkusnapListRequest;
import com.ninesale.valinor.item.api.model.sku.response.DubboQueryItemSkusnapListResponse;
import com.ninesale.valinor.item.api.service.DubboItemSkusnapService;
import com.ninesale.valinor.item.provider.model.DtoItemSkusnap;
import com.ninesale.valinor.item.provider.service.ItemSkusnapService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;

public class DubboItemSkusnapServiceImpl implements DubboItemSkusnapService {
	
	private static final Logger logger = Logger.getLogger(DubboItemSkusnapServiceImpl.class);

	@Resource
	private ItemSkusnapService itemSkusnapService;
	
	@Override
	public DubboQueryItemSkusnapListResponse queryItemSkusnapList(DubboQueryItemSkusnapListRequest request) {
		logger.info("***start***DubboItemSkusnapServiceImpl.queryItemSkusnapList***start***"); 
		logger.info("DubboQueryItemSkusnapListRequest:"+request.toString()); 
		DubboQueryItemSkusnapListResponse response = new DubboQueryItemSkusnapListResponse();
		DtoItemSkusnap dtoItemSkusnap = BeanMapper.map(request, DtoItemSkusnap.class);
		List<DtoItemSkusnap> list = null;
		try {
			list = itemSkusnapService.queryItemSkusnapList(dtoItemSkusnap);  
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1,"查询商品属性信息列表异常");
		}
		
		if(list != null && list.size()>0){
			List<DubboItemSkusnap> resultlist = BeanMapper.map(list, DubboItemSkusnap.class);
			response.setList(resultlist);
		}
		
		response.setCode(0); 
		logger.info(response.toString());
		logger.info("***end***DubboItemSkusnapServiceImpl.queryItemSkusnapList***end***");
		return response;
	}

}
