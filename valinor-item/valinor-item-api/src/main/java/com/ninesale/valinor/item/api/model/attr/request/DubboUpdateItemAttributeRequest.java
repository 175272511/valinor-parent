package com.ninesale.valinor.item.api.model.attr.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 更新商品属性Request类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboUpdateItemAttributeRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6964645818493749665L;
	
	/**
	 * 属性ID
	 */
	@NotNull(message = "属性ID不能为空")
	private Long id;

	/**
	 * 属性名称
	 */
	private String attrName;

	/**
	 * 类目ID
	 */
	private Integer categId;

	/**
	 * 属性说明
	 */
	private String attrContext;

	/**
	 * 是否有效0有效
	 */
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
	 * 最后修改时间
	 */
	@NotNull(message = "最后修改时间不能为空")
	private Date updateTime;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}