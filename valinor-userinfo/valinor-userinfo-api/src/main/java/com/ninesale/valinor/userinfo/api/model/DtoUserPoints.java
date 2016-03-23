/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author liuhui
 * 
 */
public class DtoUserPoints implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6961105029934670957L;
	
	private Long pointsCount;

	public Long getPointsCount() {
		return pointsCount;
	}

	public void setPointsCount(Long pointsCount) {
		this.pointsCount = pointsCount;
	}
	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

}
