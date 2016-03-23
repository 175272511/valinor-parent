package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 添加购物地点标签Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddAddressTagRequest extends ClientBasicRequest{
	/**
	 * 购物地点标签名称
	 */
	private String addrTagName;
	/**
	 * 国家或是城市ID
	 */
	private Long countryCityId;
	public String getAddrTagName() {
		return addrTagName;
	}
	public void setAddrTagName(String addrTagName) {
		this.addrTagName = addrTagName;
	}
	public Long getCountryCityId() {
		return countryCityId;
	}
	public void setCountryCityId(Long countryCityId) {
		this.countryCityId = countryCityId;
	}

}