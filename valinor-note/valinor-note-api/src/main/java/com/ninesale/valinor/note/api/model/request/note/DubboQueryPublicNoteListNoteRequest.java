package com.ninesale.valinor.note.api.model.request.note;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicPageRequest;

/**
 * 查询公开笔记列表
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:10:13
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboQueryPublicNoteListNoteRequest extends DubboBasicPageRequest {
	private static final long serialVersionUID = 1L;
	private Integer onlyFollowUser;

	/**
	 * @return the onlyFollowUser
	 */
	public Integer getOnlyFollowUser() {
		return onlyFollowUser;
	}

	/**
	 * @param onlyFollowUser
	 *            the onlyFollowUser to set
	 */
	public void setOnlyFollowUser(Integer onlyFollowUser) {
		this.onlyFollowUser = onlyFollowUser;
	}
}
