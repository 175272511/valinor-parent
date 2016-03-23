/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @author liuhui
 * 
 */
public class DtoUserWallet extends BasicSeriModel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7582239515735676616L;
	private Integer amount;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	

}
