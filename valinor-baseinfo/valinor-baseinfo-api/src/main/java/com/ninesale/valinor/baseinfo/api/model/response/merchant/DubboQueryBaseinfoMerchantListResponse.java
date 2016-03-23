package com.ninesale.valinor.baseinfo.api.model.response.merchant;

import java.util.List;

import com.ninesale.valinor.baseinfo.api.model.dto.DubboBaseinfoMerchant;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * @des 查询：基础信息-商家 Response类
 * @author Zhoup
 * @date 2015年11月2日14:16:21
 */
public class DubboQueryBaseinfoMerchantListResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;

	List<DubboBaseinfoMerchant> list;

	public List<DubboBaseinfoMerchant> getList() {
		return list;
	}

	public void setList(List<DubboBaseinfoMerchant> list) {
		this.list = list;
	}
}
