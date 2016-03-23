package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddBaseinfoCountryRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryBaseinfoCountryRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientUpdateBaseinfoCountryRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientAddBaseinfoCountryResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientQueryBaseinfoCountryResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientUpdateBaseinfoCountryResponse;
import com.ninesale.valinor.baseinfo.api.model.request.country.DubboAddBaseinfoCountryRequest;
import com.ninesale.valinor.baseinfo.api.model.request.country.DubboQueryCountryByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.request.country.DubboUpdateBaseinfoCountryRequest;
import com.ninesale.valinor.baseinfo.api.model.response.country.DubboAddBaseinfoCountryResponse;
import com.ninesale.valinor.baseinfo.api.model.response.country.DubboQueryCountryByPageResponse;
import com.ninesale.valinor.baseinfo.api.model.response.country.DubboUpdateBaseinfoCountryResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoCountryService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

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
	 * 添加国家信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addcountry", method = RequestMethod.POST)
	public ClientAddBaseinfoCountryResponse addCountry(@RequestBody ClientAddBaseinfoCountryRequest req) {
		//添加国家信息
		ClientAddBaseinfoCountryResponse resp = new ClientAddBaseinfoCountryResponse();
		DubboAddBaseinfoCountryRequest request = BeanMapper.map(req, DubboAddBaseinfoCountryRequest.class);
		try {
			DubboAddBaseinfoCountryResponse response = dubboBaseinfoCountryService.insert(request);
			if(response!=null && ReturnCode.SUCCESS ==response.getCode()){
				resp.setCode(ReturnCode.SUCCESS); 
			}else{
				resp.setCode(ReturnCode.ALERT_ERR); 
				if(response!=null && StringUtils.isNotBlank(response.getDesc())){
					resp.setDesc(response.getDesc());
				}else{
					resp.setDesc("操作失败"); 
				}
			}
		} catch (Exception e) {
			resp.setCode(ReturnCode.ALERT_ERR);
			resp.setDesc("操作失败");
			return resp;
		}
		
		
		return resp;
	}
	
	/**
	 * 修改国家信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "updatecountry", method = RequestMethod.POST)
	public ClientUpdateBaseinfoCountryResponse updateCountry(@RequestBody ClientUpdateBaseinfoCountryRequest req) {
		//修改国家信息
		ClientUpdateBaseinfoCountryResponse resp = new ClientUpdateBaseinfoCountryResponse();
		DubboUpdateBaseinfoCountryRequest request = BeanMapper.map(req, DubboUpdateBaseinfoCountryRequest.class);
		request.setId(req.getCountryId()); 
		try {
			DubboUpdateBaseinfoCountryResponse response = dubboBaseinfoCountryService.updateByPrimaryKeySelective(request);
			if(response!=null && ReturnCode.SUCCESS ==response.getCode()){
				resp.setCode(ReturnCode.SUCCESS); 
			}else{
				resp.setCode(ReturnCode.ALERT_ERR); 
				if(response!=null && StringUtils.isNotBlank(response.getDesc())){
					resp.setDesc(response.getDesc());
				}else{
					resp.setDesc("操作失败"); 
				}
			}
		} catch (Exception e) {
			resp.setCode(ReturnCode.ALERT_ERR);
			resp.setDesc("操作失败");
			return resp;
		}
		
		return resp;
	}
	
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
			resp.setCode(ReturnCode.ALERT_ERR);
			resp.setDesc("操作失败");
			return resp;
		}
		
		return resp;
	}

}
