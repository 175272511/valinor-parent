package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddItemTagRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryItemTagByPageRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientAddItemTagResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientQueryItemTagByPageResponse;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.baseinfo.api.model.request.itemtag.DubboAddItemTagRequest;
import com.ninesale.valinor.baseinfo.api.model.request.itemtag.DubboQueryItemTagByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.itemtag.DubboAddItemTagResponse;
import com.ninesale.valinor.baseinfo.api.model.response.itemtag.DubboQueryItemTagByPageResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboItemTagService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("baseinfo/itemtag/")
public class ItemTagController extends BaseController {

	@Resource
	private DubboItemTagService dubboItemTagService;
	
	/**
	 * 添加商品标签信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "additemtag", method = RequestMethod.POST)
	public ClientAddItemTagResponse addItemTag(@RequestBody ClientAddItemTagRequest req) {
		//添加商品标签
		ClientAddItemTagResponse resp = new ClientAddItemTagResponse();
		DubboAddItemTagRequest request = BeanMapper.map(req, DubboAddItemTagRequest.class);
		try {
			User user = getCurrentUser();
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername());
			DubboAddItemTagResponse response = dubboItemTagService.insert(request);
			if(response!=null && ReturnCode.SUCCESS ==response.getCode()){
				resp.setCode(ReturnCode.SUCCESS);  
				resp.setItemTagId(response.getId()); 
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
	 * 查询商品标签信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "queryitemtagbypage", method = RequestMethod.POST)
	public ClientQueryItemTagByPageResponse queryItemTagByPage(@RequestBody ClientQueryItemTagByPageRequest req) {
		//查询商品标签
		ClientQueryItemTagByPageResponse resp = new ClientQueryItemTagByPageResponse();
		
		DubboQueryItemTagByPageRequest request = BeanMapper.map(req, DubboQueryItemTagByPageRequest.class);
		try {
			if(null == request.getCurrentPage()){
				request.setCurrentPage(1);
			}
			if(null == request.getPageSize()){
				request.setPageSize(10); 
			}
			DubboQueryItemTagByPageResponse response = dubboItemTagService.queryItemTagByPage(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryItemTagByPageResponse.class);
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
