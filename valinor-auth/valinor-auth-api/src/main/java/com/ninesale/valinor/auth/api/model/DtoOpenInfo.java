/**
 * 
 */
package com.ninesale.valinor.auth.api.model;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @author liuhui
 * 
 */
public class DtoOpenInfo extends BasicSeriModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2701113384939786435L;

	private String userId;

	private Integer openType;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getOpenType() {
		return openType;
	}

	public void setOpenType(Integer openType) {
		this.openType = openType;
	}
	
	
}
