package com.ninesale.valinor.apiserver.web.model.user;

import org.dozer.Mapping;

import com.pubpi.common.model.BasicModel;

public class UserInfo extends BasicModel{
	
	/**
	 * 用户id
	 */
	@Mapping("id")
	private Long userId;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 角色id
	 */
	private Integer roleId;

	/**
	 * 角色名称
	 */
	private String roleName;

	/**
	 * app登录用token
	 */
	private String token;
	
	/**
	 * 用户昵称
	 */
	private String nickname;
	
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


	public String getUserImg() {
		return userImg;
	}


	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPhone() {
		return phone;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public Long getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userImg == null) {
			if (other.userImg != null)
				return false;
		} else if (!userImg.equals(other.userImg))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userImg == null) ? 0 : userImg.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	

}
