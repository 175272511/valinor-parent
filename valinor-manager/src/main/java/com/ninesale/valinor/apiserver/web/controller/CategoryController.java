package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddBaseinfoCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientDownUpBaseinfoCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryAllCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryParentCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQuerySubCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientUpdateBaseinfoCategRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientAddBaseinfoCategResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientDownUpBaseinfoCategResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientQueryAllCategResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientQueryParentCategResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientQuerySubCategResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientUpdateBaseinfoCategResponse;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboAddCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboDownUpCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQueryAllCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQueryParentCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboQuerySubCategRequest;
import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboUpdateCategRequest;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboAddCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboDownUpCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQueryAllCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQueryParentCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboQuerySubCategResponse;
import com.ninesale.valinor.baseinfo.api.model.response.categ.DubboUpdateCategResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoCategService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("baseinfo/category/")
public class CategoryController extends BaseController {

	@Resource
	private DubboBaseinfoCategService dubboBaseinfoCategService;

	/**
	 * 添加类目信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addcateg", method = RequestMethod.POST)
	public ClientAddBaseinfoCategResponse addCateg(@RequestBody ClientAddBaseinfoCategRequest req) {
		//添加类目信息
		ClientAddBaseinfoCategResponse resp = new ClientAddBaseinfoCategResponse();
		DubboAddCategRequest request = BeanMapper.map(req, DubboAddCategRequest.class);
		User user = getCurrentUser();
		if(user!=null){
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername()); 
		}
		try {
			DubboAddCategResponse response = dubboBaseinfoCategService.addCateg(request); 
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
	 * 修改类目信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "updatecateg", method = RequestMethod.POST)
	public ClientUpdateBaseinfoCategResponse updateCateg(@RequestBody ClientUpdateBaseinfoCategRequest req) {
		//修改类目信息
		ClientUpdateBaseinfoCategResponse resp = new ClientUpdateBaseinfoCategResponse();
		
		DubboUpdateCategRequest request = BeanMapper.map(req, DubboUpdateCategRequest.class);
		request.setId(req.getCategId()); 
		
		User user = getCurrentUser();
		if(user!=null){
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername()); 
		}
		
		try {
			DubboUpdateCategResponse response = dubboBaseinfoCategService.updateCateg(request);
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
	 * 禁用/启用类目信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "downupcateg", method = RequestMethod.POST)
	public ClientDownUpBaseinfoCategResponse downUpCateg(@RequestBody ClientDownUpBaseinfoCategRequest req) {
		//禁用/启用类目信息
		ClientDownUpBaseinfoCategResponse resp = new ClientDownUpBaseinfoCategResponse();
		
		DubboDownUpCategRequest request = BeanMapper.map(req, DubboDownUpCategRequest.class);
		request.setId(req.getCategId()); 
		User user = getCurrentUser();
		if(user!=null){
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername()); 
		}
		try {
			DubboDownUpCategResponse response = dubboBaseinfoCategService.downUpCateg(request);
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
	 * 查询顶级类目信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "queryparentcateg", method = RequestMethod.POST)
	public ClientQueryParentCategResponse queryParentCateg(@RequestBody ClientQueryParentCategRequest req) {
		//查询根目录类目列表信息
		ClientQueryParentCategResponse resp = new ClientQueryParentCategResponse();
		
		DubboQueryParentCategRequest request = BeanMapper.map(req, DubboQueryParentCategRequest.class);
		try {
			DubboQueryParentCategResponse response = dubboBaseinfoCategService.queryParentCateg(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryParentCategResponse.class);
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
	
	/**
	 * 查询子类目信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "querysubcateg", method = RequestMethod.POST)
	public ClientQuerySubCategResponse querySubCateg(@RequestBody ClientQuerySubCategRequest req) {
		//添加子类目信息
		ClientQuerySubCategResponse resp = new ClientQuerySubCategResponse();
		
		DubboQuerySubCategRequest request = BeanMapper.map(req, DubboQuerySubCategRequest.class);
		try { 
			DubboQuerySubCategResponse response = dubboBaseinfoCategService.querySubCateg(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQuerySubCategResponse.class);
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
	
	
	/**
	 * 查询子类目信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "queryallcateg", method = RequestMethod.POST)
	public ClientQueryAllCategResponse queryAllCateg(@RequestBody ClientQueryAllCategRequest req) {
		ClientQueryAllCategResponse resp = new ClientQueryAllCategResponse();
		
		DubboQueryAllCategRequest request = BeanMapper.map(req, DubboQueryAllCategRequest.class);
		try { 
			DubboQueryAllCategResponse response = dubboBaseinfoCategService.queryAllCateg(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryAllCategResponse.class);
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
