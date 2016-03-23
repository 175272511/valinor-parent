package com.ninesale.valinor.baseinfo.api.model.request.addrtag;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 添加：基础信息-品牌 Request类
 * @author Zhoup
 * @date 2015年11月2日12:00:59
 */
public class DubboAddAddrTagRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 购物地点标签名称
	 */
	@NotNull(message = "购物地点标签名称不能为空")
	private String addrTagName;
	/**
	 * 国家或是城市ID
	 */
	private Long countryCityId;

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
