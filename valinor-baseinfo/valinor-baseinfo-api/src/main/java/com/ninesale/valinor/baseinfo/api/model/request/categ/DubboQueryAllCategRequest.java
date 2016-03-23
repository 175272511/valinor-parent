package com.ninesale.valinor.baseinfo.api.model.request.categ;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 查询：基础信息-种类 Request类
 * @author Zhoup
 * @date 2015年11月2日14:09:45
 */
public class DubboQueryAllCategRequest extends DubboBasicRequest {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
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
