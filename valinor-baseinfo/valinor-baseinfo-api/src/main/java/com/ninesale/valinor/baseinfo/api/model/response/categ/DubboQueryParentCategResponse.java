package com.ninesale.valinor.baseinfo.api.model.response.categ;

import java.util.List;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoCateg;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @des 查询：基础信息-种类 Response类
 * @author Zhoup
 * @date 2015年11月2日14:21:00
 */
public class DubboQueryParentCategResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;

	private List<DubboBaseinfoCateg> categList;

	public List<DubboBaseinfoCateg> getCategList() {
		return categList;
	}

	public void setCategList(List<DubboBaseinfoCateg> categList) {
		this.categList = categList;
	}
	
}
