package com.ninesale.valinor.baseinfo.api.model.response.address;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @des 修改：基础信息-地址 Response类
 * @author Zhoup
 * @date 2015年11月2日14:16:21
 */
public class DubboUpdateBaseinfoAddressResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * id主键
	 */
	private Long id;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
