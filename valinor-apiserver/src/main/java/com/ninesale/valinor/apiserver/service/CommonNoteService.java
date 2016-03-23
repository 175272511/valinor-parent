package com.ninesale.valinor.apiserver.service;

import java.util.List;

import com.ninesale.valinor.apiserver.model.CommonNoteInfo;

public interface CommonNoteService {

	/**
	 * 根据笔记ID获取笔记
	 * 
	 * @param noteIdList
	 * @return
	 */
	List<CommonNoteInfo> getNoteByIdList(List<Long> noteIdList);

	/**
	 * 补全图片信息
	 * 
	 * @param noteList
	 * @return
	 */
	void fillImgInfo(List<CommonNoteInfo> noteList);

	/**
	 * 补全用户信息
	 * 
	 * @param noteList
	 * @return
	 */
	void fillUserInfo(List<CommonNoteInfo> noteList);

	/**
	 * 补全评论，分享，收藏等数量信息
	 */
	void fillCommentNumInfo(List<CommonNoteInfo> noteList);

	/**
	 * 补全图片信息
	 * 
	 * @param noteList
	 * @return
	 */
	void fillImgInfo(CommonNoteInfo commonNoteInfo);

	/**
	 * 补全用户信息
	 * 
	 * @param noteList
	 * @return
	 */
	void fillUserInfo(CommonNoteInfo commonNoteInfo);

	/**
	 * 补全评论，分享，收藏等数量信息
	 */
	void fillCommentNumInfo(CommonNoteInfo commonNoteInfo);

	/**
	 * 添加收藏和评论标示
	 * 
	 * @param commonNoteInfoList
	 */
	void fillCommentFlag(List<CommonNoteInfo> commonNoteInfoList);
	
	void fillCommentFlag(CommonNoteInfo commonNoteInfo);

}
