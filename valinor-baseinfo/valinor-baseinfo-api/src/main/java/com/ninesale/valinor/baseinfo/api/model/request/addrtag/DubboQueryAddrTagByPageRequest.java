package com.ninesale.valinor.baseinfo.api.model.request.addrtag;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * 
 * @date 2015年11月21日 下午2:06:53
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboQueryAddrTagByPageRequest extends DubboBasicPageRequest {
	private static final long serialVersionUID = 1L;
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
