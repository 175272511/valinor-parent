package com.ninesale.valinor.note.api.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.note.api.contant.DubboNoteConstants;
import com.ninesale.valinor.note.api.model.dto.DubboNoteTopic;
import com.ninesale.valinor.note.api.model.request.topic.DubboAddTopicRequest;
import com.ninesale.valinor.note.api.model.request.topic.DubboDownUpTopicRequest;
import com.ninesale.valinor.note.api.model.request.topic.DubboQueryTopicByPageRequest;
import com.ninesale.valinor.note.api.model.request.topic.DubboUpdateTopicRequest;
import com.ninesale.valinor.note.api.model.response.topic.DubboAddTopicResponse;
import com.ninesale.valinor.note.api.model.response.topic.DubboDownUpTopicResponse;
import com.ninesale.valinor.note.api.model.response.topic.DubboQueryTopicByPageResponse;
import com.ninesale.valinor.note.api.model.response.topic.DubboUpdateTopicResponse;
import com.ninesale.valinor.note.api.service.DubboTopicService;
import com.ninesale.valinor.note.provider.model.DtoNoteTopic;
import com.ninesale.valinor.note.provider.service.NoteTopicService;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboTopicServiceImpl implements DubboTopicService {
	
	private static final Logger logger = Logger.getLogger(DubboTopicServiceImpl.class);

	@Resource
	private NoteTopicService noteTopicService;
	
	@Override
	public DubboAddTopicResponse insert(DubboAddTopicRequest request) {
		DubboAddTopicResponse response = new DubboAddTopicResponse();
		DtoNoteTopic dto = BeanMapper.map(request, DtoNoteTopic.class);
		dto.setCreateTime(new Date()); 
		dto.setUpdateTime(new Date()); 
		dto.setValidFlag(DubboNoteConstants.VALID_FLAG); 
		logger.info(dto.toString());
		Map<String,Object> map = null;
		try {
			map = noteTopicService.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"保存话题信息异常");
		}
		if(map!=null && map.size()>0){
			response.setCode(DubboNoteConstants.SUCCESS_CODE);
			response.setIcount(map.get("iCount")!=null?(int)map.get("iCount"):0);  
			response.setId(map.get("id")!=null?(Long)map.get("id"):null);
		}else{
			response.setCode(DubboNoteConstants.FAILURE_CODE);
			response.setDesc("没有数据可保存");  
		}
		logger.info(response.toString());
		logger.info("***end***DubboTopicServiceImpl.insert***end***");
		return response;
	}

	@Override
	public DubboUpdateTopicResponse updateByPrimaryKeySelective(DubboUpdateTopicRequest request) {
		DubboUpdateTopicResponse response = new DubboUpdateTopicResponse();
		int iCount = 0;
		try {
			DtoNoteTopic dto = BeanMapper.map(request, DtoNoteTopic.class);
			dto.setUpdateTime(new Date()); 
			iCount = noteTopicService.updateByPrimaryKeySelective(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新话题信息异常");
		}
		response.setCode(DubboNoteConstants.SUCCESS_CODE); 
		response.setIcount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboTopicServiceImpl.updateByPrimaryKeySelective***end***");
		return response;
	}

	@Override
	public DubboQueryTopicByPageResponse queryTopicByPage(DubboQueryTopicByPageRequest request) {
		
		DubboQueryTopicByPageResponse response = new DubboQueryTopicByPageResponse();
		
		DtoNoteTopic dto = BeanMapper.map(request, DtoNoteTopic.class);
		List<DtoNoteTopic> countryList;
		int totalNum=0;
		try {
			countryList = noteTopicService.queryTopicByPage(dto, request.getBeginId(), request.getPageSize());
			totalNum = noteTopicService.queryTotalNumOfTopic(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询国家列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(countryList)){ 
			List<DubboNoteTopic> brandList2 = BeanMapper.map(countryList, DubboNoteTopic.class);
			response.setTopicList(brandList2);
		}
		
		response.setPageSize(request.getPageSize()); 
		response.setCurrentPage(request.getCurrentPage());
		response.setTotalNum(totalNum);
		response.setCode(DubboNoteConstants.SUCCESS_CODE); 
		logger.info(response.toString());
		logger.info("***end***DubboTopicServiceImpl.queryTopicByPage***end***");
		return response;
	}

	@Override
	public DubboDownUpTopicResponse downUpTopic(DubboDownUpTopicRequest req) {
		DubboDownUpTopicResponse response = new DubboDownUpTopicResponse();
		int iCount = 0;
		try {
			DtoNoteTopic dto = BeanMapper.map(req, DtoNoteTopic.class);
			dto.setUpdateTime(new Date()); 
			iCount = noteTopicService.updateByPrimaryKeySelective(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"更新话题信息异常");
		}
		response.setCode(DubboNoteConstants.SUCCESS_CODE); 
		response.setIcount(iCount);
		logger.info(response.toString());
		logger.info("***end***DubboTopicServiceImpl.downUpCateg***end***");
		return response;
	}

}
