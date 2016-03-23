package com.ninesale.valinor.baseinfo.api.model.request.country;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 添加：基础信息-品牌 Request类
 * @author Zhoup
 * @date 2015年11月2日12:00:59
 */
public class DubboAddBaseinfoCountryRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 中文名称
	 */
	@NotNull(message = "中文名称不能为空")
	private String countryNameCn;
	
	/**
	 * 英文名称
	 */
	@NotNull(message = "英文名称不能为空")
    private String countryNameEn;
    
    /**
	 * 国家编码
	 */
	@NotNull(message = "国家编码不能为空")
    private String countryCode;
    
    /**
	 * 国家描述
	 */
    private String countryDesc;

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
