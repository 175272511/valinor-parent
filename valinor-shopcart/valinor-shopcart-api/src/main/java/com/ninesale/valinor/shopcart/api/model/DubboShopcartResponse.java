package com.ninesale.valinor.shopcart.api.model;

import java.util.List;

import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

public class DubboShopcartResponse extends DubboBasicResponse {

	private static final long serialVersionUID = 698321737893781943L;

	private Integer retCode;
	
	private Integer affectNum;
	
	private List<DubboShopcartList> skus;

	public Integer getRetCode() {
		return retCode;
	}

	public void setRetCode(Integer retCode) {
		this.retCode = retCode;
	}

	public Integer getAffectNum() {
		return affectNum;
	}

	public void setAffectNum(Integer affectNum) {
		this.affectNum = affectNum;
	}

	public List<DubboShopcartList> getSkus() {
		return skus;
	}

	public void setSkus(List<DubboShopcartList> skus) {
		this.skus = skus;
	}
	
}
