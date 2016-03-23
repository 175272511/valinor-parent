package com.ninesale.valinor.baseinfo.api.model.request.brandtag;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 添加：基础信息-品牌标签 Request类
 * @author fxj
 * @date 2015年12月7日12:00:59
 */
public class DubboAddBrandTagRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 品牌标签
	 */
	@NotNull(message = "品牌名称不能为空")
	private String brandTagName;
	
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

	public String getBrandTagName() {
		return brandTagName;
	}

	public void setBrandTagName(String brandTagName) {
		this.brandTagName = brandTagName;
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
