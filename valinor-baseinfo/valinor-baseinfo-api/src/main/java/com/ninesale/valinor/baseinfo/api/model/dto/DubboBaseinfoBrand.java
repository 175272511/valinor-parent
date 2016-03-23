package com.ninesale.valinor.baseinfo.api.model.dto;

import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @des 品牌信息Entity类
 * @author Zhoup
 * @date 2015年10月30日17:12:56
 */
public class DubboBaseinfoBrand extends BasicSeriModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * id主键
	 */
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
	 * 品牌全称,中英文合并
	 */
	private String brandNameFull;
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

	public String getBrandNameFull() {
		return brandNameFull;
	}

	public void setBrandNameFull(String brandNameFull) {
		this.brandNameFull = brandNameFull;
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
