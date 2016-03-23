package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 禁用/启用国家信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientUpdateBaseinfoCountryRequest extends ClientBasicRequest{
	
	/**
	 * 国家商ID
	 */
	private Long countryId;
	/**
	 * 中文名称
	 */
	private String countryNameCn;
	/**
	 * 英文名称
	 */
    private String countryNameEn;
    /**
	 * 国家编码
	 */
    private String countryCode;
    /**
	 * 国家描述
	 */
    private String countryDesc;
	public Long getCountryId() {
		return countryId;
	}
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	public String getCountryNameCn() {
		return countryNameCn;
	}
	public void setCountryNameCn(String countryNameCn) {
		this.countryNameCn = countryNameCn;
	}
	public String getCountryNameEn() {
		return countryNameEn;
	}
	public void setCountryNameEn(String countryNameEn) {
		this.countryNameEn = countryNameEn;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryDesc() {
		return countryDesc;
	}
	public void setCountryDesc(String countryDesc) {
		this.countryDesc = countryDesc;
	}
	
	
	
}