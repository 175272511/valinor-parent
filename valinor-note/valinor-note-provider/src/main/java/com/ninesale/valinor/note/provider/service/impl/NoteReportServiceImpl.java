package com.ninesale.valinor.note.provider.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.note.provider.dao.NoteReportMapper;
import com.ninesale.valinor.note.provider.model.DtoNoteReport;
import com.ninesale.valinor.note.provider.service.NoteReportService;
import com.pubpi.common.exception.DaoException;

@Service
public class NoteReportServiceImpl implements NoteReportService {
	
	private static final Logger logger = Logger.getLogger(NoteReportServiceImpl.class);

	@Resource
	private NoteReportMapper noteReportMapper;
	
	@Override
	public Map<String, Object> insert(DtoNoteReport record) {
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(DtoNoteReport record) {
		return 0;
	}

	@Override
	public List<DtoNoteReport> queryReportByPage(DtoNoteReport report, Integer beginId, Integer pageSize) {
		logger.info("beginId=="+beginId+"pageSize=="+pageSize+report.toString()); 
		List<DtoNoteReport> reportList = null;
		try {
			reportList = noteReportMapper.queryReportByPage(report, beginId, pageSize); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询举报审核列表信息异常");
		}
		return reportList;
	}

	@Override
	public int queryTotalNumOfReport(DtoNoteReport report) {
		logger.info(report.toString());
		int iCount = 0;
		try {
			iCount = noteReportMapper.queryTotalNumOfReport(report);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(1, "查询举报审核总数异常");
		}
		return iCount;
	}

}
