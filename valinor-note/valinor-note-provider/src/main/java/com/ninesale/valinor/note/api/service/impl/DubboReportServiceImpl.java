package com.ninesale.valinor.note.api.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.ninesale.valinor.note.api.contant.DubboNoteConstants;
import com.ninesale.valinor.note.api.model.dto.DubboNoteReport;
import com.ninesale.valinor.note.api.model.request.report.DubboQueryReportByPageRequest;
import com.ninesale.valinor.note.api.model.response.report.DubboQueryReportByPageResponse;
import com.ninesale.valinor.note.api.service.DubboReportService;
import com.ninesale.valinor.note.provider.model.DtoNoteReport;
import com.ninesale.valinor.note.provider.service.NoteReportService;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;

public class DubboReportServiceImpl implements DubboReportService {
	
	private static final Logger logger = Logger.getLogger(DubboReportServiceImpl.class);

	@Resource
	private NoteReportService noteReportService;
	
	@Override
	public DubboQueryReportByPageResponse queryReportByPage(
			DubboQueryReportByPageRequest request) {
		
		logger.info(request.toString());
		DubboQueryReportByPageResponse response = new DubboQueryReportByPageResponse();
		
		DtoNoteReport dto = BeanMapper.map(request, DtoNoteReport.class);
		List<DtoNoteReport> reportList;
		int totalNum=0;
		try {
			reportList = noteReportService.queryReportByPage(dto, request.getBeginId(), request.getPageSize());
			totalNum = noteReportService.queryTotalNumOfReport(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(1,"查询检举审核列表信息异常");
		}
		if(CollectionUtils.isNotEmpty(reportList)){ 
			List<DubboNoteReport> reportList2 = BeanMapper.map(reportList, DubboNoteReport.class);
			response.setReportList(reportList2); 
		}
		
		response.setPageSize(request.getPageSize()); 
		response.setCurrentPage(request.getCurrentPage());
		response.setTotalNum(totalNum);
		response.setCode(DubboNoteConstants.SUCCESS_CODE); 
		
		return response;
	}

}
