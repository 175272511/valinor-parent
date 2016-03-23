/**
 * 
 */
package com.ninesale.valinor.auth.api.model;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @author liuhui
 * 
 */
public class DtoConcernPerson extends BasicSeriModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5657227447880153410L;

	private Long concernId;
	
	private String concernName;
	
	private Integer fansCount;
	
	private String userImg;

	public Long getConcernId() {
		return concernId;
	}

	public void setConcernId(Long concernId) {
		this.concernId = concernId;
	}

	public String getConcernName() {
		return concernName;
	}

	public void setConcernName(String concernName) {
		this.concernName = concernName;
	}

	public Integer getFansCount() {
		return fansCount;
	}

	public void setFansCount(Integer fansCount) {
		this.fansCount = fansCount;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	
}

