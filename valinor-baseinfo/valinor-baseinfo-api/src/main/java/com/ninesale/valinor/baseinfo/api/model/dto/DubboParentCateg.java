package com.ninesale.valinor.baseinfo.api.model.dto;

import java.util.Date;
import java.util.List;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @des 类目信息Entity类
 * @author Zhoup
 * @date 2015年10月30日17:10:28
 */
public class DubboParentCateg extends BasicSeriModel{
	/**
	 * 序列化号码
	 */
	private static final long serialVersionUID = 1564214145760581334L;

	/**
	 * 类目ID
	 */
	private Long id;
	/**
	 * 类目名称
	 */
	private String categName;
	/**
	 * 类目层级
	 */
	private Integer categLevel;
	/**
	 * 父类目ID
	 */
	private Integer parentCategId;
	/**
	 * 是否有效:0有效
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
	
	private List<DubboBaseinfoCateg> subCateList; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategName() {
		return categName;
	}

	public void setCategName(String categName) {
		this.categName = categName;
	}

	public Integer getCategLevel() {
		return categLevel;
	}

	public void setCategLevel(Integer categLevel) {
		this.categLevel = categLevel;
	}

	public Integer getParentCategId() {
		return parentCategId;
	}

	public void setParentCategId(Integer parentCategId) {
		this.parentCategId = parentCategId;
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

	public List<DubboBaseinfoCateg> getSubCateList() {
		return subCateList;
	}

	public void setSubCateList(List<DubboBaseinfoCateg> subCateList) {
		this.subCateList = subCateList;
	}
	
}
