package com.ninesale.valinor.apiserver.web.model.user;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.common.constant.RexpConstant;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserListRequest extends ClientBasicRequest {

	/**
	 * 限制查询用户名为中文英文下划线中划线以及点的组合
	 */
	@Pattern(regexp = RexpConstant.USERNAME, message = "用户名不合法")
	private String username;

	/**
	 * 上报了商户ID，则查询指定商户的用户,页面上可以对应添加搜索框
	 */
	@Min(value = 1, message = "商户ID错误")
	private Long merchantId;

	@Min(value = 0, message = "pageSize不合法")
	private Integer pageSize;

	@Min(value = 0, message = "currentPage不合法")
	private Integer currentPage;
	
	private Integer userType;

	
	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	/**
	 * @return the merchantId
	 */
	public Long getMerchantId() {
		return merchantId;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public String getUsername() {
		return username;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @param merchantId
	 *            the merchantId to set
	 */
	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
