package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 查询类目信息Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQueryAllCategRequest extends ClientBasicRequest{
	
	/**
	 * 类目ID
	 */
	private Long id;
	/**
	 * 类目名称
	 */
	private String categName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategName() {
		return categName;
	}
	public void setCategName(String categName) {
		this.categName = categName;
	}
	
	
	
}