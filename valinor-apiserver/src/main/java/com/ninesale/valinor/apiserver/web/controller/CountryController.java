package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryBaseinfoCountryRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientQueryBaseinfoCountryResponse;
import com.ninesale.valinor.baseinfo.api.model.request.country.DubboQueryCountryByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.country.DubboQueryCountryByPageResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoCountryService;
import com.pubpi.common.utils.BeanMapper;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("baseinfo/country/")
public class CountryController extends BaseController {
	
	@Resource
	private DubboBaseinfoCountryService dubboBaseinfoCountryService;
	
	/**
	 * 查询国家信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "querycountrybypage", method = RequestMethod.POST)
	public ClientQueryBaseinfoCountryResponse queryCountryByPage(@RequestBody ClientQueryBaseinfoCountryRequest req) {
		//查询国家列表信息
		ClientQueryBaseinfoCountryResponse resp = new ClientQueryBaseinfoCountryResponse();
		DubboQueryCountryByPageRequest request = BeanMapper.map(req, DubboQueryCountryByPageRequest.class);
		try {
			if(null == request.getCurrentPage()){
				request.setCurrentPage(1);
			}
			if(null == request.getPageSize()){
				request.setPageSize(10); 
			}
			DubboQueryCountryByPageResponse response = dubboBaseinfoCountryService.queryCountryByPage(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryBaseinfoCountryResponse.class);
			}else{
				resp.setCode(ReturnCode.ALERT_ERR); 
				resp.setDesc("操作失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.setCode(ReturnCode.ALERT_ERR);
			resp.setDesc("操作失败");
			return resp;
		}
		
		return resp;
	}

}
