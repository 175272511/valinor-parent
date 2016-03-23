package com.ninesale.valinor.apiserver.web.model.merchant;

import java.sql.Timestamp;

public class MerchantInfo {
	private Long merchantId;
	private String merchantName;
	private String phone;
	private String email;
	private String responsible;
	private String address;
	private Timestamp createTime;

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
		if (!(obj instanceof MerchantInfo)) {
			return false;
		}
		MerchantInfo other = (MerchantInfo) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		}
		else if (!address.equals(other.address)) {
			return false;
		}
		if (createTime == null) {
			if (other.createTime != null) {
				return false;
			}
		}
		else if (!createTime.equals(other.createTime)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		}
		else if (!email.equals(other.email)) {
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
		if (merchantName == null) {
			if (other.merchantName != null) {
				return false;
			}
		}
		else if (!merchantName.equals(other.merchantName)) {
			return false;
		}
		if (phone == null) {
			if (other.phone != null) {
				return false;
			}
		}
		else if (!phone.equals(other.phone)) {
			return false;
		}
		if (responsible == null) {
			if (other.responsible != null) {
				return false;
			}
		}
		else if (!responsible.equals(other.responsible)) {
			return false;
		}
		return true;
	}

	public String getAddress() {
		return address;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public String getEmail() {
		return email;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public String getPhone() {
		return phone;
	}

	public String getResponsible() {
		return responsible;
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
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((merchantId == null) ? 0 : merchantId.hashCode());
		result = prime * result + ((merchantName == null) ? 0 : merchantName.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((responsible == null) ? 0 : responsible.hashCode());
		return result;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MerchantInfo [merchantId=");
		builder.append(merchantId);
		builder.append(", merchantName=");
		builder.append(merchantName);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", email=");
		builder.append(email);
		builder.append(", responsible=");
		builder.append(responsible);
		builder.append(", address=");
		builder.append(address);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append("]");
		return builder.toString();
	}
}
