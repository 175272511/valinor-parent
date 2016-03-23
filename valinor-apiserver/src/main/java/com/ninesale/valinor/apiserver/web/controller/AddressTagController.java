package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddAddressTagRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryAddressTagByPageRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientAddAddressTagResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientQueryAddressTagByPageResponse;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.baseinfo.api.model.request.addrtag.DubboAddAddrTagRequest;
import com.ninesale.valinor.baseinfo.api.model.request.addrtag.DubboQueryAddrTagByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.addrtag.DubboAddAddrTagResponse;
import com.ninesale.valinor.baseinfo.api.model.response.addrtag.DubboQueryAddrTagByPageResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboAddressTagService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("baseinfo/addresstag/")
public class AddressTagController extends BaseController {

	@Resource
	private DubboAddressTagService dubboAddressTagService;
	
	/**
	 * 添加购物地点标签信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addaddrtag", method = RequestMethod.POST)
	public ClientAddAddressTagResponse addAddrTag(@RequestBody ClientAddAddressTagRequest req) {
		//添加购物地点标签
		ClientAddAddressTagResponse resp = new ClientAddAddressTagResponse();
		DubboAddAddrTagRequest request = BeanMapper.map(req, DubboAddAddrTagRequest.class);
		try {
			User user = getCurrentUser();
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername());
			DubboAddAddrTagResponse response = dubboAddressTagService.insert(request);
			if(response!=null && ReturnCode.SUCCESS ==response.getCode()){
				resp.setCode(ReturnCode.SUCCESS); 
				resp.setAddrTagId(response.getId()); 
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
	 * 查询购物地点标签信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "queryaddrtagbypage", method = RequestMethod.POST)
	public ClientQueryAddressTagByPageResponse queryAddrTagByPage(@RequestBody ClientQueryAddressTagByPageRequest req) {
		//查询购物地点标签
		ClientQueryAddressTagByPageResponse resp = new ClientQueryAddressTagByPageResponse();
		
		DubboQueryAddrTagByPageRequest request = BeanMapper.map(req, DubboQueryAddrTagByPageRequest.class);
		try {
			if(null == request.getCurrentPage()){
				request.setCurrentPage(1);
			}
			if(null == request.getPageSize()){
				request.setPageSize(10); 
			}
			DubboQueryAddrTagByPageResponse response = dubboAddressTagService.queryAddrTagByPage(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryAddressTagByPageResponse.class);
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
