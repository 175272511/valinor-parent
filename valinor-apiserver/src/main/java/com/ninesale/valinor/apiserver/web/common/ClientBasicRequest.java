package com.ninesale.valinor.apiserver.web.common;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.common.TidManager;
import com.pubpi.common.model.BasicModel;
import com.pubpi.common.utils.StringUtils;

/**
 * 基础请求类
 * 
 * @author hawk
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientBasicRequest extends BasicModel {

	/**
	 * TID
	 */
	protected String tid;
	/**
	 * 时间戳
	 */
	protected String time;

	public ClientBasicRequest() {
		tid = TidManager.getTid();
		if (StringUtils.isNull(tid)) {
			tid = UUID.randomUUID().toString().replace("-", "");
			TidManager.setTid(tid);
		}
	}

	public String getTid() {
		return tid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
