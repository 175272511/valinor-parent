package com.ninesale.valinor.apiserver.web.model.user;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.reportmenu.MenuInfo;

public class GetMenuListResponse extends ClientBasicResponse {
	private List<MenuInfo> data;

	public List<MenuInfo> getData() {
		return data;
	}

	public void setData(List<MenuInfo> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
