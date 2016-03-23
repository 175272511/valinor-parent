package com.ninesale.valinor.auth.provider.service.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.protocol.Protocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.ninesale.valinor.auth.api.common.ValinorConstant;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.auth.api.model.WeixinUser;
import com.ninesale.valinor.auth.api.model.request.DubboOpenIdRequest;
import com.ninesale.valinor.auth.api.model.request.DubboSinaCodeRequest;
import com.ninesale.valinor.auth.api.model.request.DubboWeixinCodeRequest;
import com.ninesale.valinor.auth.api.model.response.DubboSinaInfoResponse;
import com.ninesale.valinor.auth.api.model.response.DubboUserResponse;
import com.ninesale.valinor.auth.api.model.response.DubboWeixinInfoResponse;
import com.ninesale.valinor.auth.api.service.DubboOpenService;
import com.ninesale.valinor.auth.provider.dao.AuthMapper;
import com.pubpi.common.utils.Collections3;
import com.pubpi.common.utils.MySSLProtocolSocketFactory;
import com.pubpi.valinor.dubbo.base.model.DubboReturnCode;

/**
 * @author liuhui
 * 
 */

@Service("dubboOpenService")
public class DubboOpenServiceImpl implements DubboOpenService{

	private static final Logger logger = LoggerFactory.getLogger(DubboAuthServiceImpl.class);

	@Resource
	private AuthMapper authMapper;

	@Override
	public DubboWeixinInfoResponse getWeixinInfo(DubboWeixinCodeRequest weixinReq) {
		DubboWeixinInfoResponse response = null;

			HttpClient http = new HttpClient();
			String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + ValinorConstant.WEIXIN_APPID 
					+ "&secret=" + ValinorConstant.WEIXIN_SECRET + "&code=" + weixinReq.getWeixinCode()
					+ "&grant_type=authorization_code";
			Protocol myhttps = new Protocol("https", new MySSLProtocolSocketFactory(), 443);
			Protocol.registerProtocol("https", myhttps);
			GetMethod getMethod = new GetMethod(url);
			String result = null;
			try {
				http.executeMethod(getMethod);
				result = getMethod.getResponseBodyAsString();
			} catch (IOException e) {
				logger.error("getWeixinInfo error", e);
				response = new DubboWeixinInfoResponse();
				response.setTid(weixinReq.getTid());
				response.setCode(DubboReturnCode.WEIXIN_GET_DATA_ERR);
				response.setDesc("获取微信accesstoken信息失败");
				return response;
			}
			
			response = JSON.parseObject(result, DubboWeixinInfoResponse.class);
			
//			response.setOpenid("111222");
//			return response;
			
			if(response.getAccessToken() == null){
				response.setTid(weixinReq.getTid());
				response.setCode(JSON.parseObject(result).getInteger("errcode"));
				response.setDesc(JSON.parseObject(result).getString("errmsg"));
			}
			
			response.setCode(DubboReturnCode.SUCCESS);
			response.setTid(weixinReq.getTid());
			return response;
			

	}


	@Override
	public DubboSinaInfoResponse getSinaInfo(DubboSinaCodeRequest sinaReq) {
		DubboSinaInfoResponse response = null;
			HttpClient http = new HttpClient();
			String url = "https://api.weibo.com/oauth2/access_token?"
					+ "client_id=" + ValinorConstant.SINA_APPKEY + "&client_secret=" + ValinorConstant.SINA_SECRET
					+ "&grant_type=authorization_code&redirect_uri=" + ValinorConstant.SINA_REDIRECT_URL
					+ "&code=" + sinaReq.getSinaCode();
			Protocol myhttps = new Protocol("https", new MySSLProtocolSocketFactory(), 443);
			Protocol.registerProtocol("https", myhttps);
			GetMethod getMethod = new GetMethod(url);
			String result = null;
			try {
				http.executeMethod(getMethod);
				result = getMethod.getResponseBodyAsString();
			} catch (IOException e) {
				logger.error("getSinaInfo error", e);
				response = new DubboSinaInfoResponse();
				response.setTid(sinaReq.getTid());
				response.setCode(DubboReturnCode.SINA_GET_DATA_ERR);
				response.setDesc("获取新浪accesstoken信息失败");
				return response;
			}
			
			response = JSON.parseObject(result, DubboSinaInfoResponse.class);
			if(response.getAccessToken() == null){
				response.setTid(sinaReq.getTid());
				response.setCode(JSON.parseObject(result).getInteger("error_code"));
				response.setDesc(JSON.parseObject(result).getString("error_description"));
			}
			
			response.setCode(DubboReturnCode.SUCCESS);
			response.setTid(sinaReq.getSinaCode());
			return response;
			
	}
	
	@Override
	public DubboUserResponse getUserByOpenId(DubboOpenIdRequest req) {
		WeixinUser weixinUser = new WeixinUser();
		weixinUser.setOpenId(req.getOpenId());

		List<WeixinUser> weixinUserList = authMapper.getWeixinUser(weixinUser);

		Long userId = null;
		if (!Collections3.isEmpty(weixinUserList)) {
			userId = weixinUserList.get(0).getUserId();
		}

		DubboUserResponse response = new DubboUserResponse();
		if (null == userId || 0 == userId) {
			response.setCode(DubboReturnCode.ALERT_ERR);
			response.setDesc("该用户不存在");
			response.setTid(req.getTid());
			return response;
		}

		User user = new User();
		user.setId(userId);
		List<User> temp = authMapper.getUserByModel(user);
		User userResp = null != temp && temp.size() > 0 ? temp.get(0) : null;
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(req.getTid());
		response.setData(userResp);
		
		return response;
	}
}
