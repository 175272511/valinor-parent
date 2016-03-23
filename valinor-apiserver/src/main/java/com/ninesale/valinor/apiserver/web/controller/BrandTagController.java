package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddBrandTagRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryBrandTagByPageRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientAddBrandTagResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientQueryBrandTagByPageResponse;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.baseinfo.api.model.request.brandtag.DubboAddBrandTagRequest;
import com.ninesale.valinor.baseinfo.api.model.request.brandtag.DubboQueryBrandTagByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.brandtag.DubboAddBrandTagResponse;
import com.ninesale.valinor.baseinfo.api.model.response.brandtag.DubboQueryBrandTagByPageResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboBrandTagService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("baseinfo/brandtag/")
public class BrandTagController extends BaseController {

	@Resource
	private DubboBrandTagService dubboBrandTagService;
	
	/**
	 * 添加品牌标签信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addbrandtag", method = RequestMethod.POST)
	public ClientAddBrandTagResponse addBrandTag(@RequestBody ClientAddBrandTagRequest req) {
		//添加品牌标签标签
		ClientAddBrandTagResponse resp = new ClientAddBrandTagResponse();
		DubboAddBrandTagRequest request = BeanMapper.map(req, DubboAddBrandTagRequest.class);
		try {
			User user = getCurrentUser();
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername()); 
			DubboAddBrandTagResponse response = dubboBrandTagService.insert(request);
			if(response!=null && ReturnCode.SUCCESS ==response.getCode()){
				resp.setCode(ReturnCode.SUCCESS); 
				resp.setBrandTagId(response.getId()); 
			}else{
				resp.setCode(ReturnCode.ALERT_ERR); 
				if(response!=null && StringUtils.isNotBlank(response.getDesc())){
					resp.setDesc(response.getDesc());
				}else{
					resp.setDesc("操作失败"); 
				}
			}
		} catch (Exception e) {
			e.printStackTrace();  
			resp.setCode(ReturnCode.ALERT_ERR);
			resp.setDesc("操作失败");
			return resp;
		}
		
		return resp;
	}
	
	
	/**
	 * 查询品牌标签信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "querybrandtagbypage", method = RequestMethod.POST)
	public ClientQueryBrandTagByPageResponse queryBrandTagByPage(@RequestBody ClientQueryBrandTagByPageRequest req) {
		//查询品牌标签
		ClientQueryBrandTagByPageResponse resp = new ClientQueryBrandTagByPageResponse();
		
		DubboQueryBrandTagByPageRequest request = BeanMapper.map(req, DubboQueryBrandTagByPageRequest.class);
		try {
			if(null == request.getCurrentPage()){
				request.setCurrentPage(1);
			}
			if(null == request.getPageSize()){
				request.setPageSize(10); 
			}
			DubboQueryBrandTagByPageResponse response = dubboBrandTagService.queryBrandTagByPage(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryBrandTagByPageResponse.class);
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
