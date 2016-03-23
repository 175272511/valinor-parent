package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 添加类目信息Request
 * 
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddBaseinfoCategRequest extends ClientBasicRequest {
	/**
	 * 类目名称
	 */
	private String categName;
	/**
	 * 类目层级
	 */
	private Integer categLevel;
	/**
	 * 父类目ID
	 */
	private Integer parentCategId;

	public String getCategName() {
		return categName;
	}

	public void setCategName(String categName) {
		this.categName = categName;
	}

	public Integer getCategLevel() {
		return categLevel;
	}

	public void setCategLevel(Integer categLevel) {
		this.categLevel = categLevel;
	}

	public Integer getParentCategId() {
		return parentCategId;
	}

	public void setParentCategId(Integer parentCategId) {
		this.parentCategId = parentCategId;
	}

}