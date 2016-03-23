package com.ninesale.valinor.apiserver.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.image.request.ClientCreateSignRequest;
import com.ninesale.valinor.apiserver.web.model.image.response.ClientCreateSignResponse;
import com.ninesale.valinor.image.api.model.response.DubboImgUploadSignResponse;
import com.ninesale.valinor.image.api.service.DubboImgUploadService;
import com.pubpi.common.utils.BeanMapper;

/**
 * 图片管理
 * 创建人：fuxingjian   
 * 创建时间：2015年11月17日 上午10:00:00
 */
@RestController
@RequestMapping("image/")
public class ImageController extends BaseController {
	
	@Resource
	private DubboImgUploadService dubboImgUploadService;
	
	/**
	 * 测试方法
	 * @param req 请求对象
	 * @return ImgStoreResponse
	 * @RequestBody ClientCreateSignRequest req
	 */
	@RequestMapping(value = "test", method = RequestMethod.POST)
	public ClientBasicResponse testMethod(@RequestBody ClientCreateSignRequest req) {
		return null;
	}
	
	/**
	 * 获取签名
	 * @param req 请求对象
	 * @return ImgStoreResponse
	 * @RequestBody 
	 */
	@RequestMapping(value = "createsign", method = RequestMethod.GET)
	public ClientBasicResponse createSign(ClientCreateSignRequest req) {
		ClientCreateSignResponse clientResponse = new ClientCreateSignResponse();
		DubboImgUploadSignResponse dubboreponse = dubboImgUploadService.createSign();
		clientResponse.setTid(req.getTid());
		
		if(dubboreponse!=null){
			clientResponse = BeanMapper.map(dubboreponse, ClientCreateSignResponse.class);
			clientResponse.setCode(ReturnCode.SUCCESS);
			clientResponse.setDesc("success");
		}else{
			clientResponse.setCode(ReturnCode.REPORT_GET_DATA_ERR);
			clientResponse.setDesc("获取签名失败");
		}
		return clientResponse;
		
	}
}
 