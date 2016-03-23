package com.ninesale.valinor.note.provider.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.note.provider.dao.NoteTopicMapper;
import com.ninesale.valinor.note.provider.model.DtoNoteTopic;
import com.ninesale.valinor.note.provider.service.NoteTopicService;
import com.pubpi.common.exception.DaoException;

@Service
public class NoteTopicServiceImpl implements NoteTopicService {
	
	private static final Logger logger = Logger.getLogger(NoteTopicServiceImpl.class);

	@Resource
	private NoteTopicMapper noteTopicMapper;
	
	@Override
	public Map<String, Object> insert(DtoNoteTopic record) {
		logger.info("DubboNoteTopic=="+record.toString()); 
		Map<String,Object> map = new HashMap<String,Object>();
		int iCount = 0;
		try {
			iCount = noteTopicMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "保存话题信息异常");
		}
		map.put("iCount", iCount);
		map.put("id", record.getId());
		return map;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoNoteTopic record) {
		logger.info("DubboNoteTopic==" + record.toString());
		int iCount = 0;
		try {
			iCount = noteTopicMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "更新话题信息异常");
		}

		return iCount;
	}

	@Override
	public List<DtoNoteTopic> queryTopicByPage(DtoNoteTopic topic, Integer beginId, Integer pageSize) {
		logger.info("beginId=="+beginId+"pageSize=="+pageSize+topic.toString()); 
		List<DtoNoteTopic> countryList = null;
		try {
			countryList = noteTopicMapper.queryTopicByPage(topic, beginId, pageSize); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询话题列表信息异常");
		}
		return countryList;
	}

	@Override
	public int queryTotalNumOfTopic(DtoNoteTopic dtoNoteTopic) {
		logger.info(dtoNoteTopic.toString());
		int iCount = 0;
		try {
			iCount = noteTopicMapper.queryTotalNumOfTopic(dtoNoteTopic);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询话题总数异常");
		}
		return iCount;
	}

}
