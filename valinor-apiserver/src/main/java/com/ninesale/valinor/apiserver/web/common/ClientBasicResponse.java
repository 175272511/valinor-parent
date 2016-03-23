package com.ninesale.valinor.apiserver.web.common;

import java.util.UUID;

import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.pubpi.common.TidManager;
import com.pubpi.common.model.BasicModel;
import com.pubpi.common.utils.StringUtils;

/**
 * 基础响应类
 * 
 * @author hawk
 *
 */
public class ClientBasicResponse extends BasicModel {
	

	/**
	 * TID
	 */
	protected String tid;
	/**
	 * 返回码
	 */
	protected Integer code;

	/**
	 * 返回描述
	 */
	protected String desc;

	public ClientBasicResponse() {
		this.code = ReturnCode.SUCCESS;
		this.desc = "success";

		tid = TidManager.getTid();
		if (StringUtils.isNull(tid)) {
			tid = UUID.randomUUID().toString().replace("-", "");
			TidManager.setTid(tid);
		}
	}


	
	public ClientBasicResponse(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the tid
	 */
	public String getTid() {
		return tid;
	}

	/**
	 * @param tid
	 *            the tid to set
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}

}
