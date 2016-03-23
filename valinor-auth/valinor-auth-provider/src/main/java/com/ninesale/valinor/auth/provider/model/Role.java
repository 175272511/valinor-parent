package com.ninesale.valinor.auth.provider.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 角色
 * 
 * @author skyhawk
 *
 */
public class Role implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5182924078308149389L;

	/**
	 * 角色id
	 */
	private Integer id;

	/**
	 * 角色名称
	 */
	private String roleName;

	/**
	 * 角色标签
	 */
	private String roleSign;

	/**
	 * 描述
	 */
	private String desc;


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @return the roleSign
	 */
	public String getRoleSign() {
		return roleSign;
	}


	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @param roleName
	 *            the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @param roleSign
	 *            the roleSign to set
	 */
	public void setRoleSign(String roleSign) {
		this.roleSign = roleSign;
	}

	
	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}