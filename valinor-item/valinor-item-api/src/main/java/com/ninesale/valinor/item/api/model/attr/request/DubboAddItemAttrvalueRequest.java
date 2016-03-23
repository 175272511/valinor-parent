package com.ninesale.valinor.item.api.model.attr.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 新增商品属性值Response类 
 * 创建人：fuxingjian 
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboAddItemAttrvalueRequest extends DubboBasicRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6964645818493749665L;

	/**
	 * 属性值名称
	 */
	@NotNull(message = "属性值名称不能为空")
	private String attrValueName;

	/**
	 * 属性ID
	 */
	@NotNull(message = "属性ID不能为空")
	private Long attrId;

	/**
	 * 是否有效0有效
	 */
	@NotNull(message = "是否有效不能为空")
	private Integer validFlag;

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

	/**
	 * 创建时间
	 */
	@NotNull(message = "创建时间不能为空")
	private Date createTime;

	/**
	 * 最后修改时间
	 */
	@NotNull(message = "最后修改时间不能为空")
	private Date updateTime;

	public String getAttrValueName() {
		return attrValueName;
	}

	public void setAttrValueName(String attrValueName) {
		this.attrValueName = attrValueName;
	}

	public Long getAttrId() {
		return attrId;
	}

	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}