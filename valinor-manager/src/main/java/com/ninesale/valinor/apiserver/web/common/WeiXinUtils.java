package com.ninesale.valinor.apiserver.web.common;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.protocol.Protocol;

import com.alibaba.fastjson.JSON;
import com.pubpi.common.utils.MySSLProtocolSocketFactory;

public class WeiXinUtils {
	private static String APPID = "wx0e3bc5f86a6d083e";
	private static String SECRET = "8844555d0dc3118cc23d3f60b629fdba";

	public static String getOpenIdByCode(String code) {
		try {
			HttpClient http = new HttpClient();
			String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + APPID + "&secret=" + SECRET + "&code=" + code
					+ "&grant_type=authorization_code";
			Protocol myhttps = new Protocol("https", new MySSLProtocolSocketFactory(), 443);
			Protocol.registerProtocol("https", myhttps);
			GetMethod getMethod = new GetMethod(url);
			http.executeMethod(getMethod);
			String result = getMethod.getResponseBodyAsString();
			return JSON.parseObject(result).getString("openid");
//			 return "123456" + code;
		}
		catch (HttpException e) {
		}
		catch (IOException e) {
		}
		return null;
	}
}
