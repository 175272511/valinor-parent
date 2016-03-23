package com.ninesale.valinor.baseinfo.api.model.request.merchant;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 修改：基础信息-商家信息 Request类
 * @author Zhoup
 * @date 2015年11月2日14:12:22
 */
public class DubboUpdateBaseinfoMerchantRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 商家ID
	 */
	private Long id;

	/**
	 * 商家名称
	 */
	@NotNull(message = "商家名称不能为空")
	private String merchantName;

	/**
	 * 主营类目
	 */
	@NotNull(message = "主营类目不能为空")
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
	 * 邮箱
	 */
	private String email;

	/**
	 * 状态
	 */
	@NotNull(message = "状态不能为空")
	private int status;

	/**
	 * logoUrlid
	 */
	private Long logoUrlId;

	/**
	 * logUrl
	 */
	private String logoUrl;

	/**
	 * url
	 */
	private String url;

	/**
	 * downloadUrl
	 */
	private String downloadUrl;

	/**
	 * fileId
	 */
	private String fileId;

	/**
	 * newflag
	 */
	private Integer newflag;

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
	@NotNull(message = "创建时间不能为空")
	private Date createTime;

	/**
	 * 修改时间
	 */
	@NotNull(message = "修改时间不能为空")
	private Date updateTime;

	/**
	 * 物理状态
	 */
	@NotNull(message = "物理状态不能为空")
	private int validFlag;

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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Integer getNewflag() {
		return newflag;
	}

	public void setNewflag(Integer newflag) {
		this.newflag = newflag;
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

	public int getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(int validFlag) {
		this.validFlag = validFlag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
