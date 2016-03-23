package com.ninesale.valinor.apiserver.web.model.baseinfo.response;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.vo.ClientBaseinfoCateg;

/****
 * 查询类目信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQuerySubCategResponse extends ClientBasicResponse {
	
	/**
	 * 类目信息
	 */
	private List<ClientBaseinfoCateg> categList;

	public List<ClientBaseinfoCateg> getCategList() {
		return categList;
	}

	public void setCategList(List<ClientBaseinfoCateg> categList) {
		this.categList = categList;
	}
	
}
