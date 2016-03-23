/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @author liuhui
 * 
 */
public class DtoConcernTag extends BasicSeriModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4981707303447753449L;

	private Long tagId;
	
	private String tagName;

	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	
}
