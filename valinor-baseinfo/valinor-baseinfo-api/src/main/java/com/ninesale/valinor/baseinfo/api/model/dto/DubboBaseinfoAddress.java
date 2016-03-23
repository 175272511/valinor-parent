package com.ninesale.valinor.baseinfo.api.model.dto;

import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @des 通用地址信息Entity类
 * @author Zhoup
 * @date 2015年10月30日17:13:00
 */
/**
 * @author Zhoup
 * @date 2015年11月2日11:44:15
 */
public class DubboBaseinfoAddress extends BasicSeriModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * id主键
	 */
	private Long id;
	/**
	 * 地址名称
	 */
	private String addressName;
	/**
	 * 层级
	 */
	private String addressLevel;
	/**
	 * 层级名称
	 */
	private String levelName;
	/**
	 * 父层级ID
	 */
	private String parentCategId;
	/**
	 * 是否有效 0：有效
	 */
	private String validFlag;
	/**
	 * 修改用户ID
	 */
	private Date modifyUserId;
	
	/**
	 * 修改用户名
	 */
	private Date modifyUserName;
	
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

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAddressLevel() {
		return addressLevel;
	}

	public void setAddressLevel(String addressLevel) {
		this.addressLevel = addressLevel;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getParentCategId() {
		return parentCategId;
	}

	public void setParentCategId(String parentCategId) {
		this.parentCategId = parentCategId;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public Date getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(Date modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public Date getModifyUserName() {
		return modifyUserName;
	}

	public void setModifyUserName(Date modifyUserName) {
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
