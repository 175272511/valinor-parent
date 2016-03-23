package com.ninesale.valinor.baseinfo.api.model.request.address;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 修改：基础信息-地址  Request类
 * @author Zhoup
 * @date 2015年11月2日13:58:49
 */
public class DubboUpdateBaseinfoAddressRequest extends DubboBasicRequest{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2397275983173531283L;
	/**
	 * 通用地址ID
	 */
	@NotNull(message = "通用地址ID不能为空")
	private long id;
	/**
	 * 地址名称
	 */
	@NotNull(message = "地址名称不能为空")
	private String addressName;
	/**
	 * 层级
	 */
	@NotNull(message = "层级不能为空")
	private Integer addressLevel;
	/**
	 * 层级名称
	 */
	@NotNull(message = "层级名称不能为空")
	private String levelName;
	/**
	 * 父层级ID
	 */
	@NotNull(message = "父层级ID不能为空")
	private Integer parentCategId;
	/**
	 * 是否有效:0有效
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public Integer getAddressLevel() {
		return addressLevel;
	}

	public void setAddressLevel(Integer addressLevel) {
		this.addressLevel = addressLevel;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
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
}
