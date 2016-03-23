package com.ninesale.valinor.apiserver.web.model.merchant;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

/**
 * 获取商户列表请求类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetMerchantListRequest extends ClientBasicRequest {
	@Pattern(regexp = RexpConstant.USERNAME, message = "商户名不合法")
	private String merchantName;

	@Min(value = 0, message = "pageSize不合法")
	private Integer pageSize;

	@Min(value = 0, message = "currentPage不合法")
	private Integer currentPage;

	public Integer getCurrentPage() {
		return currentPage;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
