package com.ninesale.valinor.item.api.model.attr.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 新增商品属性Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboAddItemAttributeRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6964645818493749665L;

	/**
	 * 属性名称
	 */
	@NotNull(message = "属性名称不能为空")
	private String attrName;

	/**
	 * 类目ID
	 */
	@NotNull(message = "类目ID不能为空")
	private Integer categId;

	/**
	 * 属性说明
	 */
	@NotNull(message = "属性说明不能为空")
	private String attrContext;

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

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public Integer getCategId() {
		return categId;
	}

	public void setCategId(Integer categId) {
		this.categId = categId;
	}

	public String getAttrContext() {
		return attrContext;
	}

	public void setAttrContext(String attrContext) {
		this.attrContext = attrContext;
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