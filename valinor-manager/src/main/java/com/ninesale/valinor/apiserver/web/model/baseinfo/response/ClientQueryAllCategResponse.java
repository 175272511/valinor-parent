package com.ninesale.valinor.apiserver.web.model.baseinfo.response;

import java.util.List;

import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.baseinfo.vo.ClientParentCateg;

/****
 * 查询类目信息Response
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientQueryAllCategResponse extends ClientBasicResponse {
	
	/**
	 * 类目信息
	 */
	private List<ClientParentCateg> categList;

	public List<ClientParentCateg> getCategList() {
		return categList;
	}

	public void setCategList(List<ClientParentCateg> categList) {
		this.categList = categList;
	}

}
