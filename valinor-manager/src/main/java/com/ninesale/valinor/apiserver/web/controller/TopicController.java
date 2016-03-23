package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.note.request.ClientAddNoteTopicRequest;
import com.ninesale.valinor.apiserver.web.model.note.request.ClientDownUpNoteTopicRequest;
import com.ninesale.valinor.apiserver.web.model.note.request.ClientQueryTopicByPageRequest;
import com.ninesale.valinor.apiserver.web.model.note.request.ClientUpdateNoteTopicRequest;
import com.ninesale.valinor.apiserver.web.model.note.response.ClientAddNoteTopicResponse;
import com.ninesale.valinor.apiserver.web.model.note.response.ClientDownUpNoteTopicResponse;
import com.ninesale.valinor.apiserver.web.model.note.response.ClientQueryTopicByPageResponse;
import com.ninesale.valinor.apiserver.web.model.note.response.ClientUpdateNoteTopicResponse;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.note.api.model.request.topic.DubboAddTopicRequest;
import com.ninesale.valinor.note.api.model.request.topic.DubboDownUpTopicRequest;
import com.ninesale.valinor.note.api.model.request.topic.DubboQueryTopicByPageRequest;
import com.ninesale.valinor.note.api.model.request.topic.DubboUpdateTopicRequest;
import com.ninesale.valinor.note.api.model.response.topic.DubboAddTopicResponse;
import com.ninesale.valinor.note.api.model.response.topic.DubboDownUpTopicResponse;
import com.ninesale.valinor.note.api.model.response.topic.DubboQueryTopicByPageResponse;
import com.ninesale.valinor.note.api.model.response.topic.DubboUpdateTopicResponse;
import com.ninesale.valinor.note.api.service.DubboTopicService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("note/topic/")
public class TopicController extends BaseController {
	
	@Resource
	private DubboTopicService dubboTopicService;
	
	/**
	 * 添加话题信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addtopic", method = RequestMethod.POST)
	public ClientAddNoteTopicResponse addTopic(@RequestBody ClientAddNoteTopicRequest req) {
		//添加话题信息
		ClientAddNoteTopicResponse resp = new ClientAddNoteTopicResponse();
		DubboAddTopicRequest request = BeanMapper.map(req, DubboAddTopicRequest.class);
		User user = getCurrentUser();
		if(user!=null){
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername()); 
		}
		request.setModifyUserId(1L); 
		request.setModifyUserName("admin"); 
		try {
			DubboAddTopicResponse response = dubboTopicService.insert(request);
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
	 * 修改话题信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "updatetopic", method = RequestMethod.POST)
	public ClientUpdateNoteTopicResponse updateTopic(@RequestBody ClientUpdateNoteTopicRequest req) {
		//修改话题信息
		ClientUpdateNoteTopicResponse resp = new ClientUpdateNoteTopicResponse();
		DubboUpdateTopicRequest request = BeanMapper.map(req, DubboUpdateTopicRequest.class);
		request.setId(req.getTopicId()); 
		try {
			DubboUpdateTopicResponse response = dubboTopicService.updateByPrimaryKeySelective(request);
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
	 * 禁用/启用话题信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "downuptopic", method = RequestMethod.POST)
	public ClientDownUpNoteTopicResponse downUpTopic(@RequestBody ClientDownUpNoteTopicRequest req) {
		//禁用/启用话题信息
		ClientDownUpNoteTopicResponse resp = new ClientDownUpNoteTopicResponse();
		DubboDownUpTopicRequest request = BeanMapper.map(req, DubboDownUpTopicRequest.class);
		request.setId(req.getTopicId()); 
		try {
			DubboDownUpTopicResponse response = dubboTopicService.downUpTopic(request);
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
	 * 查询话题信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "querytopicbypage", method = RequestMethod.POST)
	public ClientQueryTopicByPageResponse queryTopicByPage(@RequestBody ClientQueryTopicByPageRequest req) {
		//查询话题列表信息
		ClientQueryTopicByPageResponse resp = new ClientQueryTopicByPageResponse();
		DubboQueryTopicByPageRequest request = BeanMapper.map(req, DubboQueryTopicByPageRequest.class);
		try {
			if(null == request.getCurrentPage()){
				request.setCurrentPage(1);
			}
			if(null == request.getPageSize()){
				request.setPageSize(10); 
			}
			DubboQueryTopicByPageResponse response = dubboTopicService.queryTopicByPage(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryTopicByPageResponse.class);
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
