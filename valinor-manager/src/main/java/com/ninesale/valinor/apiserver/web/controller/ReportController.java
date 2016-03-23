package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.note.request.ClientQueryReportByPageRequest;
import com.ninesale.valinor.apiserver.web.model.note.response.ClientQueryReportByPageResponse;
import com.ninesale.valinor.note.api.model.request.report.DubboQueryReportByPageRequest;
import com.ninesale.valinor.note.api.model.response.report.DubboQueryReportByPageResponse;
import com.ninesale.valinor.note.api.service.DubboReportService;
import com.pubpi.common.utils.BeanMapper;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("note/report/")
public class ReportController extends BaseController {
	
	@Resource
	private DubboReportService dubboReportService;
	
	/**
	 * 查询审批举报信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "queryreportbypage", method = RequestMethod.POST)
	public ClientQueryReportByPageResponse queryReportByPage(@RequestBody ClientQueryReportByPageRequest req) {
		//查询举报审核列表信息
		ClientQueryReportByPageResponse resp = new ClientQueryReportByPageResponse();
		DubboQueryReportByPageRequest request = BeanMapper.map(req, DubboQueryReportByPageRequest.class);
		try {
			if(null == request.getCurrentPage()){
				request.setCurrentPage(1);
			}
			if(null == request.getPageSize()){
				request.setPageSize(10); 
			}
			DubboQueryReportByPageResponse response = dubboReportService.queryReportByPage(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryReportByPageResponse.class);
			}else{
				resp.setCode(ReturnCode.ALERT_ERR); 
				resp.setDesc("操作失败");
			}
		} catch (Exception e) {
			resp.setCode(ReturnCode.ALERT_ERR);
			resp.setDesc("操作失败");
			return resp;
		}
		
		return resp;
	}

}
