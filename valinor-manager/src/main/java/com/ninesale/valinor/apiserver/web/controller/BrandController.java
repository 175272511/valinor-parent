package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddBaseinfoBrandRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientDownUpBaseinfoBrandRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryBrandByPageRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientUpdateBaseinfoBrandRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientAddBaseinfoBrandResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientDownUpBaseinfoBrandResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientQueryBrandByPageResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientUpdateBaseinfoBrandResponse;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboAddBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboQueryBrandByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brand.DubboUpdateBaseinfoBrandRequest;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboAddBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboQueryBrandByPageResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brand.DubboUpdateBaseinfoBrandResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoBrandService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("baseinfo/brand/")
public class BrandController extends BaseController {

	@Resource
	private DubboBaseinfoBrandService dubboBaseinfoBrandService;

	/**
	 * 添加品牌信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addbrand", method = RequestMethod.POST)
	public ClientAddBaseinfoBrandResponse addBrand(@RequestBody ClientAddBaseinfoBrandRequest req) {
		//添加品牌信息
		ClientAddBaseinfoBrandResponse resp = new ClientAddBaseinfoBrandResponse();
		DubboAddBaseinfoBrandRequest request = BeanMapper.map(req, DubboAddBaseinfoBrandRequest.class);
		User user = getCurrentUser();
		if(user!=null){
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername()); 
		}
		try {
			DubboAddBaseinfoBrandResponse response = dubboBaseinfoBrandService.insert(request);
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
	 * 修改品牌信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "updatebrand", method = RequestMethod.POST)
	public ClientUpdateBaseinfoBrandResponse updateBrand(@RequestBody ClientUpdateBaseinfoBrandRequest req) {
		//修改品牌信息
		ClientUpdateBaseinfoBrandResponse resp = new ClientUpdateBaseinfoBrandResponse();
		DubboUpdateBaseinfoBrandRequest request = BeanMapper.map(req, DubboUpdateBaseinfoBrandRequest.class);
		request.setId(req.getBrandId()); 
		User user = getCurrentUser();
		if(user!=null){
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername()); 
		}
		try {
			DubboUpdateBaseinfoBrandResponse response = dubboBaseinfoBrandService.updateByPrimaryKeySelective(request);
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
	 * 禁用/启用品牌信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "downupbrand", method = RequestMethod.POST)
	public ClientDownUpBaseinfoBrandResponse downuUpBrand(@RequestBody ClientDownUpBaseinfoBrandRequest req) {
		//添加品牌信息
		ClientDownUpBaseinfoBrandResponse resp = new ClientDownUpBaseinfoBrandResponse();
		DubboUpdateBaseinfoBrandRequest request = BeanMapper.map(req, DubboUpdateBaseinfoBrandRequest.class);
		request.setId(req.getBrandId()); 
		
		User user = getCurrentUser();
		if(user!=null){
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername()); 
		}
		try {
			DubboUpdateBaseinfoBrandResponse response = dubboBaseinfoBrandService.updateByPrimaryKeySelective(request);
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
	 * 查询品牌信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "querybrandbypage", method = RequestMethod.POST)
	public ClientQueryBrandByPageResponse queryBrandByPage(@RequestBody ClientQueryBrandByPageRequest req) {
		ClientQueryBrandByPageResponse resp = new ClientQueryBrandByPageResponse();
		DubboQueryBrandByPageRequest request = BeanMapper.map(req, DubboQueryBrandByPageRequest.class);
		try {
			if(null == request.getCurrentPage()){
				request.setCurrentPage(1);
			}
			if(null == request.getPageSize()){
				request.setPageSize(10); 
			}
			DubboQueryBrandByPageResponse response = dubboBaseinfoBrandService.queryBrandByPage(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryBrandByPageResponse.class);
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
