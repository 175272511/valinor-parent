package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientAddCurrencyRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.request.ClientQueryCurrencyByPageRequest;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientAddCurrencyResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.response.ClientQueryCurrencyByPageResponse;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.baseinfo.api.model.request.currency.DubboAddCurrencyRequest;
import com.ninesale.valinor.baseinfo.api.model.request.currency.DubboQueryCurrencyByPageRequest;
import com.ninesale.valinor.baseinfo.api.model.response.currency.DubboAddCurrencyResponse;
import com.ninesale.valinor.baseinfo.api.model.response.currency.DubboQueryCurrencyByPageResponse;
import com.ninesale.valinor.baseinfo.api.service.DubboCurrencyService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.StringUtils;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("baseinfo/currency/")
public class CurrencyController extends BaseController {

	@Resource
	private DubboCurrencyService dubboCurrencyService;
	
	/**
	 * 添加品牌标签信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addcurrency", method = RequestMethod.POST)
	public ClientAddCurrencyResponse addCurrency(@RequestBody ClientAddCurrencyRequest req) {
		//添加品牌标签标签
		ClientAddCurrencyResponse resp = new ClientAddCurrencyResponse();
		DubboAddCurrencyRequest request = BeanMapper.map(req, DubboAddCurrencyRequest.class);
		try {
			User user = getCurrentUser();
			request.setModifyUserId(user.getId()); 
			request.setModifyUserName(user.getUsername());
			DubboAddCurrencyResponse response = dubboCurrencyService.insert(request);
			if(response!=null && ReturnCode.SUCCESS ==response.getCode()){
				resp.setCode(ReturnCode.SUCCESS);  
				resp.setCurrencyId(response.getId()); 
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
	 * 查询币种信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "querycurrencybypage", method = RequestMethod.POST)
	public ClientQueryCurrencyByPageResponse queryCurrencyByPage(@RequestBody ClientQueryCurrencyByPageRequest req) {
		//查询币种
		ClientQueryCurrencyByPageResponse resp = new ClientQueryCurrencyByPageResponse();
		
		DubboQueryCurrencyByPageRequest request = BeanMapper.map(req, DubboQueryCurrencyByPageRequest.class);
		try {
			if(null == request.getCurrentPage()){
				request.setCurrentPage(1);
			}
			if(null == request.getPageSize()){
				request.setPageSize(10); 
			}
			DubboQueryCurrencyByPageResponse response = dubboCurrencyService.queryCurrencyByPage(request);
			if(response!=null && ReturnCode.SUCCESS == response.getCode()){
				resp = BeanMapper.map(response, ClientQueryCurrencyByPageResponse.class);
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
