package com.ninesale.valinor.note.api.service;

import com.ninesale.valinor.note.api.model.request.report.DubboQueryReportByPageRequest;
import com.ninesale.valinor.note.api.model.response.report.DubboQueryReportByPageResponse;

/**
 * @des 基础信息-检举审核 接口类
 * @author Zhoup
 * @date 2015年11月2日14:33:38
 */
public interface DubboReportService {
	
	/**
	 * 查询检举审核
	 * 
	 * @param DubboQueryReportRequest
	 *            dubboQueryReportRequest
	 * @return DubboQueryReportResponse
	 */
	public DubboQueryReportByPageResponse queryReportByPage(
			DubboQueryReportByPageRequest dubboQueryReportByPageRequest);

}
