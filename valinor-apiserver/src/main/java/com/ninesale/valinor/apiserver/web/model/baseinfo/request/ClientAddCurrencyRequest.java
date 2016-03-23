package com.ninesale.valinor.apiserver.web.model.baseinfo.request;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 添加币种Request
 * @author fxj
 * @date 2015年11月25日 上午11:00:00
 */
public class ClientAddCurrencyRequest extends ClientBasicRequest{
	/**
	 * 币种名称
	 */
	private String currencyName;
	/**
	 * 币种编码
	 */
	private String currencyCode;
	
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
}