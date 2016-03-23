package com.ninesale.valinor.baseinfo.api.model.dto;

import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @des 短信记录Entity类
 * @author Zhoup
 * @date 2015年10月30日17:12:48
 */
public class DubboBaseinfoMerchant extends BasicSeriModel {
	/**
	 * 序列化号码
	 */
	private static final long serialVersionUID = 1564214145760581334L;

	/**
	 * 商家ID
	 */
	private Long id;

	/**
	 * 商家名称
	 */
	private String merchantName;

	/**
	 * 主营类目
	 */
	private Integer categId;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 联系人
	 */
	private String linkman;

	/**
	 * 电话
	 */
	private String phone;

	/**
	 * 用户邮箱
	 */
	private String email;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * logoUrlid
	 */
	private Long logoUrlId;

	/**
	 * logoUrl
	 */
	private String logoUrl;

	/**
	 * 品牌商描述
	 */
	private String orgDesc;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 物理状态,1:已删除，0:正常状态
	 */
	private Integer validFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public Integer getCategId() {
		return categId;
	}

	public void setCategId(Integer categId) {
		this.categId = categId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getLogoUrlId() {
		return logoUrlId;
	}

	public void setLogoUrlId(Long logoUrlId) {
		this.logoUrlId = logoUrlId;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}
}
