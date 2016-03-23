package com.ninesale.valinor.apiserver.web.model.image.response;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;

/**
 * 图片管理Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class ClientCreateSignResponse extends ClientBasicResponse {
	
	/***
	 * 签名字符串
	 */
	private String sign;
	
    private String url;
    
	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
