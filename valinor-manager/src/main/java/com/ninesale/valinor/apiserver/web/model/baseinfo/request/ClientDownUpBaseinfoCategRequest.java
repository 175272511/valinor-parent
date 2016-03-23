package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 禁用/启用类目信息Request
 * 
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientDownUpBaseinfoCategRequest extends ClientBasicRequest {
	/**
	 * validFlag：0：启用，1：禁用
	 */
	private Integer validFlag;
	/**
	 * 类目ID
	 */
	private Long categId;

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}

	public Long getCategId() {
		return categId;
	}

	public void setCategId(Long categId) {
		this.categId = categId;
	}

}