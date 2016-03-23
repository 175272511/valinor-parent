/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @author liuhui
 * 
 */
public class DtoUserCount extends BasicSeriModel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7344658169506927591L;

	private Integer concernCount;
	
	private Integer fansCount;

	public Integer getConcernCount() {
		return concernCount;
	}

	public void setConcernCount(Integer concernCount) {
		this.concernCount = concernCount;
	}

	public Integer getFansCount() {
		return fansCount;
	}

	public void setFansCount(Integer fansCount) {
		this.fansCount = fansCount;
	}
	
	

}
