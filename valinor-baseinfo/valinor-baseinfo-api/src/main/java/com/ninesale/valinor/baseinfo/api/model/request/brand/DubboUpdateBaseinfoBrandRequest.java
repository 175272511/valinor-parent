package com.ninesale.valinor.baseinfo.api.model.request.brand;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 修改：基础信息-品牌 Request类
 * @author Zhoup
 * @date 2015年11月2日14:11:40
 */
public class DubboUpdateBaseinfoBrandRequest extends DubboBasicRequest{

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 品牌ID
	 */
	@NotNull(message = "品牌ID不能为空")
	private Long id;
	/**
	 * 品牌商中文名
	 */
	private String brandNameCn;
	/**
	 * 品牌商英文名
	 */
	private String brandNameEn;
	
	/**
	 * 是否有效
	 */
	private Integer validFlag;

	/**
	 * 修改用户ID
	 */
	private Long modifyUserId;

	/**
	 * 修改用户名
	 */
	private String modifyUserName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrandNameCn() {
		return brandNameCn;
	}

	public void setBrandNameCn(String brandNameCn) {
		this.brandNameCn = brandNameCn;
	}

	public String getBrandNameEn() {
		return brandNameEn;
	}

	public void setBrandNameEn(String brandNameEn) {
		this.brandNameEn = brandNameEn;
	}

	public Long getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(Long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getModifyUserName() {
		return modifyUserName;
	}

	public void setModifyUserName(String modifyUserName) {
		this.modifyUserName = modifyUserName;
	}

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}
	
}
