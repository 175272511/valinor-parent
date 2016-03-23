/**
 * 
 */
package com.ninesale.valinor.apiserver.web.model.user;

import org.hibernate.validator.constraints.NotBlank;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/**
 * @author liuhui
 * 
 */
public class ClientConcernTagRequest extends ClientBasicRequest{
	
	@NotBlank(message = "标签Id不能为空")
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
