package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 修改类目信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientUpdateBaseinfoCategRequest extends ClientBasicRequest{
	
	/**
	 * 类目商ID
	 */
	private Long categId;
	/**
	 * 类目名称
	 */
	private String categName;
	public Long getCategId() {
		return categId;
	}
	public void setCategId(Long categId) {
		this.categId = categId;
	}
	public String getCategName() {
		return categName;
	}
	public void setCategName(String categName) {
		this.categName = categName;
	}
	
}