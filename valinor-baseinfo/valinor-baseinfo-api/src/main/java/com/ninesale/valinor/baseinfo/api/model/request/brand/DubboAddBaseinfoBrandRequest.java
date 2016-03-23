package com.ninesale.valinor.baseinfo.api.model.request.brand;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 添加：基础信息-品牌 Request类
 * @author Zhoup
 * @date 2015年11月2日12:00:59
 */
public class DubboAddBaseinfoBrandRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 品牌商中文名
	 */
	@NotNull(message = "品牌商中文名不能为空")
	private String brandNameCn;
	/**
	 * 品牌商英文名
	 */
	@NotNull(message = "品牌商英文名不能为空")
	private String brandNameEn;

	/**
	 * 修改用户ID
	 */
	@NotNull(message = "修改用户ID不能为空")
	private Long modifyUserId;

	/**
	 * 修改用户名
	 */
	@NotNull(message = "修改用户名不能为空")
	private String modifyUserName;

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

	
}
