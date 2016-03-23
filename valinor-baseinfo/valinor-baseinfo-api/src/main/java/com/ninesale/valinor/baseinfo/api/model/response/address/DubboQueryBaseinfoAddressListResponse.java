package com.ninesale.valinor.baseinfo.api.model.response.address;

import java.util.List;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoAddress;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @des 查询：基础信息-地址 Response类
 * @author Zhoup
 * @date 2015年11月2日14:28:19
 */
public class DubboQueryBaseinfoAddressListResponse extends DubboBasicResponse {

	private static final long serialVersionUID = 6825114663109315171L;

	List<DubboBaseinfoAddress> list;

	public List<DubboBaseinfoAddress> getList() {
		return list;
	}

	public void setList(List<DubboBaseinfoAddress> list) {
		this.list = list;
	}

}
