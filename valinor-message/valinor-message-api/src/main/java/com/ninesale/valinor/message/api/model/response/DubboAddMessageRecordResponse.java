package com.ninesale.valinor.message.api.model.response;

import com.pubpi.valinor.dubbo.base.model.BaseDubboResponse;

/**
 * 添加短信记录Response类
 * 创建人：Zhoup   
 * 创建时间：2015年10月31日10:37:19
 */
public class DubboAddMessageRecordResponse extends BaseDubboResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	/***
	 * 保存更新记录
	 */
	int icount;
	public int getIcount() {
		return icount;
	}
	public void setIcount(int icount) {
		this.icount = icount;
	}
	
}
