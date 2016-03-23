package com.ninesale.valinor.note.api.model.request.note;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 添加笔记请求类
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:04:21
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DubboGetNoteByIdListRequest extends DubboBasicRequest {
	private static final long serialVersionUID = 1L;

	/**
	 * 冗余字段，解决dozer映射问题(在使用Mapping情况下，必须有对应字段)
	 */
	private List<Long> noteIdList;

	/**
	 * @return the noteIdList
	 */
	public List<Long> getNoteIdList() {
		return noteIdList;
	}

	/**
	 * @param noteIdList
	 *            the noteIdList to set
	 */
	public void setNoteIdList(List<Long> noteIdList) {
		this.noteIdList = noteIdList;
	}
}
