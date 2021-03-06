package com.ninesale.valinor.baseinfo.api.model.response.categ;

import java.util.List;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboParentCateg;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @des 查询：基础信息-种类 Response类
 * @author fxj
 * @date 2015年11月2日14:21:00
 */
public class DubboQueryAllCategResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	private List<DubboParentCateg> categList;

	public List<DubboParentCateg> getCategList() {
		return categList;
	}

	public void setCategList(List<DubboParentCateg> categList) {
		this.categList = categList;
	}

}
