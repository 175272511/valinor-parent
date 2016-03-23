package com.ninesale.valinor.baseinfo.api.model.request.itemtag;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 添加：基础信息-商品标签 Request类
 * @author fxj
 * @date 2015年12月07日12:00:59
 */
public class DubboAddItemTagRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 商品标签名称
	 */
	@NotNull(message = "商品标签名称不能为空")
	private String itemTagName;
	
	/**
	 * 品牌标签ID
	 */
	private Long brandTagId;
	 
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

	public String getItemTagName() {
		return itemTagName;
	}

	public void setItemTagName(String itemTagName) {
		this.itemTagName = itemTagName;
	}

	public Long getBrandTagId() {
		return brandTagId;
	}

	public void setBrandTagId(Long brandTagId) {
		this.brandTagId = brandTagId;
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
