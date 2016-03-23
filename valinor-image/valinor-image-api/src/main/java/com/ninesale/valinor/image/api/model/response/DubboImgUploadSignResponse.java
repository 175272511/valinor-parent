package com.ninesale.valinor.image.api.model.response;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 图片管理Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboImgUploadSignResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	/***
	 * 签名字符串
	 */
	private String sign;
	/**
	 * 万象优图请求URL
	 * */
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
