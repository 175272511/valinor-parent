package com.ninesale.valinor.item.api.model.attr.dto;

import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

/**
 * 商品属性值DTO类 
 * 创建人：fuxingjian 
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboItemAttrvalue extends BasicSeriModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7600558592230930028L;

	/**
	 * 属性值ID
	 */
	private Long id;

	/**
	 * 属性值名称
	 */
	private String attrValueName;
	
	/**
	 * 属性ID
	 */
	private Long attrId;
	
	/**
	 * 是否有效0有效
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
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 最后修改时间
	 */
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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