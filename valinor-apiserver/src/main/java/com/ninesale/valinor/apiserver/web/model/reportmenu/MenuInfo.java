package com.ninesale.valinor.apiserver.web.model.reportmenu;

import org.dozer.Mapping;

public class MenuInfo {
	@Mapping("id")
	private Long menuId;
	private String permissionName;
	private String permissionSign;
	private String description;
	private String href;
	private Integer orderNo;
	private Integer resourceType;
	private Long parentMenuId;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MenuInfo)) {
			return false;
		}
		MenuInfo other = (MenuInfo) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		}
		else if (!description.equals(other.description)) {
			return false;
		}
		if (href == null) {
			if (other.href != null) {
				return false;
			}
		}
		else if (!href.equals(other.href)) {
			return false;
		}
		if (menuId == null) {
			if (other.menuId != null) {
				return false;
			}
		}
		else if (!menuId.equals(other.menuId)) {
			return false;
		}
		if (orderNo == null) {
			if (other.orderNo != null) {
				return false;
			}
		}
		else if (!orderNo.equals(other.orderNo)) {
			return false;
		}
		if (parentMenuId == null) {
			if (other.parentMenuId != null) {
				return false;
			}
		}
		else if (!parentMenuId.equals(other.parentMenuId)) {
			return false;
		}
		if (permissionName == null) {
			if (other.permissionName != null) {
				return false;
			}
		}
		else if (!permissionName.equals(other.permissionName)) {
			return false;
		}
		if (permissionSign == null) {
			if (other.permissionSign != null) {
				return false;
			}
		}
		else if (!permissionSign.equals(other.permissionSign)) {
			return false;
		}
		if (resourceType == null) {
			if (other.resourceType != null) {
				return false;
			}
		}
		else if (!resourceType.equals(other.resourceType)) {
			return false;
		}
		return true;
	}

	public String getDescription() {
		return description;
	}

	public String getHref() {
		return href;
	}

	public Long getMenuId() {
		return menuId;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public Long getParentMenuId() {
		return parentMenuId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	/**
	 * @return the permissionSign
	 */
	public String getPermissionSign() {
		return permissionSign;
	}

	public Integer getResourceType() {
		return resourceType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((href == null) ? 0 : href.hashCode());
		result = prime * result + ((menuId == null) ? 0 : menuId.hashCode());
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		result = prime * result + ((parentMenuId == null) ? 0 : parentMenuId.hashCode());
		result = prime * result + ((permissionName == null) ? 0 : permissionName.hashCode());
		result = prime * result + ((permissionSign == null) ? 0 : permissionSign.hashCode());
		result = prime * result + ((resourceType == null) ? 0 : resourceType.hashCode());
		return result;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public void setParentMenuId(Long parentMenuId) {
		this.parentMenuId = parentMenuId;
	}

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

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MenuInfo [menuId=");
		builder.append(menuId);
		builder.append(", permissionName=");
		builder.append(permissionName);
		builder.append(", permissionSign=");
		builder.append(permissionSign);
		builder.append(", description=");
		builder.append(description);
		builder.append(", href=");
		builder.append(href);
		builder.append(", orderNo=");
		builder.append(orderNo);
		builder.append(", resourceType=");
		builder.append(resourceType);
		builder.append(", parentMenuId=");
		builder.append(parentMenuId);
		builder.append("]");
		return builder.toString();
	}
}
