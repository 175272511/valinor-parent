package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.dozer.Mapping;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserRequest extends ClientBasicRequest {
	@Mapping("id")
	@Min(value = 1, message = "用户ID错误")
	private Long userId;
	/**
	 * 用户名
	 */
	@Pattern(regexp = RexpConstant.USERNAME, message = "用户名格式错误")
	private String username;

	/**
	 * 用户鉴权密码
	 */
	@Pattern(regexp = RexpConstant.ENCRYPT_PASSWORD, message = "密码格式不合法")
	private String password;

	/**
	 * 用户角色
	 */
	private Integer roleId;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 性别
	 */
	private Integer sex;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 邮件地址
	 */
	private String email;
	/**
	 * 常用地址
	 */
	private String address;
	/**
	 * 个性签名
	 */
	private String remark;
	/**
	 * 图片类型ID
	 */
	private Long typeId;
	/**
	 * 图片管理链接
	 */
	private String manageUrl;
	/**
	 * 图片下载链接
	 */
	private String downloadUrl;
	/**
	 * fileid
	 */
	private String fileId;
	/**
	 * 图片描述
	 */
	private String imageText;

	public String getPassword() {
		return password;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public Long getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getManageUrl() {
		return manageUrl;
	}

	public void setManageUrl(String manageUrl) {
		this.manageUrl = manageUrl;
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

	public String getImageText() {
		return imageText;
	}

	public void setImageText(String imageText) {
		this.imageText = imageText;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
