package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 查询类目信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQuerySubCategRequest extends ClientBasicRequest{
	
	private Integer parentCategId;

	public Integer getParentCategId() {
		return parentCategId;
	}

	public void setParentCategId(Integer parentCategId) {
		this.parentCategId = parentCategId;
	}

}