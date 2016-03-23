package com.ninesale.valinor.apiserver.web.model.reportmenu;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 菜单信息
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportMenuInfo {
	private Long merchantId;

	@Min(value = 1, message = "菜单ID不合法")
	private Long menuId;

	@NotBlank(message = "菜单名称不合法")
	@Pattern(regexp = "[\\x{4e00}-\\x{9fa5}A-Za-z0-9_\\-\\.]{1,64}", message = "菜单名称格式错误")
	private String name;

	@Min(value = 1, message = "菜单父ID不合法")
	private Long pid;

	@Min(value = 1, message = "序列号不合法")
	private Long index;

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
		if (!(obj instanceof ReportMenuInfo)) {
			return false;
		}
		ReportMenuInfo other = (ReportMenuInfo) obj;
		if (index == null) {
			if (other.index != null) {
				return false;
			}
		}
		else if (!index.equals(other.index)) {
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
		if (merchantId == null) {
			if (other.merchantId != null) {
				return false;
			}
		}
		else if (!merchantId.equals(other.merchantId)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		}
		else if (!name.equals(other.name)) {
			return false;
		}
		if (pid == null) {
			if (other.pid != null) {
				return false;
			}
		}
		else if (!pid.equals(other.pid)) {
			return false;
		}
		return true;
	}

	public Long getIndex() {
		return index;
	}

	public Long getMenuId() {
		return menuId;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public String getName() {
		return name;
	}

	public Long getPid() {
		return pid;
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
		result = prime * result + ((index == null) ? 0 : index.hashCode());
		result = prime * result + ((menuId == null) ? 0 : menuId.hashCode());
		result = prime * result + ((merchantId == null) ? 0 : merchantId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		return result;
	}

	public void setIndex(Long index) {
		this.index = index;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReportMenuInfo [merchantId=");
		builder.append(merchantId);
		builder.append(", menuId=");
		builder.append(menuId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", pid=");
		builder.append(pid);
		builder.append(", index=");
		builder.append(index);
		builder.append("]");
		return builder.toString();
	}
}
