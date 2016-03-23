package com.ninesale.valinor.auth.api.model;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.ninesale.valinor.auth.api.common.ValinorConstant;
import com.pubpi.common.utils.StringUtils;

/**
 * 用户
 * 
 * @author hawk
 *
 */
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 519211445298909511L;

	/**
	 * 用户ID
	 */
	private Long id;
	/**
	 * 用户类型
	 */
	private Integer userType;

	/**
	 * 用户名称
	 */
	private String username;
	
	/**
	 * 用户密码
	 */
	private String password;

	/**
	 * 角色名称
	 */
	private String roleName;
	
	/**
	 * 用户性别
	 */
	private Integer sex;

	/**
	 * 用户昵称
	 */
	private String nickname;

	/**
	 * 用户手机号码
	 */
	private String phone;

	/**
	 * 角色id
	 */
	private Integer roleId;

	/**
	 * 用户状态
	 */
	private String status;
	
	/**
	 * 用户邮箱
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
	 * 头像地址
	 */
	private String userImg;

	/**
	 * 用户创建时间
	 */
	private Timestamp createTime;

	/**
	 * 用户最后登录时间
	 */
	private Timestamp updateTime;
	
	public Integer getUserType() {
		return userType;
	}



	public void setUserType(Integer userType) {
		this.userType = userType;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
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



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public Integer getRoleId() {
		return roleId;
	}



	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Timestamp getCreateTime() {
		return createTime;
	}



	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}



	public Timestamp getUpdateTime() {
		return updateTime;
	}



	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}



	public String getRoleName() {
		return roleName;
	}



	public void setRoleName(String roleName) {
		this.roleName = roleName;
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



	public String getUserImg() {
		if(StringUtils.isBlank(userImg))
			return ValinorConstant.DEFAULT_USERIMG;
		return userImg;
	}



	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}



	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}