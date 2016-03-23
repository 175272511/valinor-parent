package com.ninesale.valinor.auth.api.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 权限
 * 
 * @author skyhawk
 *
 */
public class Permission implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6481335413377343006L;

	/**
	 * 权限名称
	 */
	private Long id;

	/**
	 * 权限名称
	 */
	private String permissionName;

	/**
	 * 权限sign(shiro进行权限管理时使用)
	 */
	private String permissionSign;

	/**
	 * 对应的链接
	 */
	private String href;

	/**
	 * 描述
	 */
	private String description;


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the href
	 */
	public String getHref() {
		return href;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @return the permissionName
	 */
	public String getPermissionName() {
		return permissionName;
	}

	/**
	 * @return the permissionSign
	 */
	public String getPermissionSign() {
		return permissionSign;
	}


	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param href
	 *            the href to set
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @param permissionName
	 *            the permissionName to set
	 */
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	/**
	 * @param permissionSign
	 *            the permissionSign to set
	 */
	public void setPermissionSign(String permissionSign) {
		this.permissionSign = permissionSign;
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