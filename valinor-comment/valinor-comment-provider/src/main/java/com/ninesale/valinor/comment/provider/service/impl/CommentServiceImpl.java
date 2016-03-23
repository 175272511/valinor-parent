/**   
* @Title: CommentServiceImpl.java 
* @Package com.ninesale.valinor.comment.provider.service.impl 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月3日 上午10:25:47 
* @version V0.1
*/
package com.ninesale.valinor.comment.provider.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ninesale.valinor.comment.provider.dao.NoteStatisticsInfoMapper;
import com.ninesale.valinor.comment.provider.model.DtoNoteStatisticsInfo;
import com.ninesale.valinor.comment.provider.service.CommentService;
import com.pubpi.common.utils.Collections3;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月3日 上午10:25:47
 * 
 */
@Service
public class CommentServiceImpl implements CommentService {

	@Resource
	private NoteStatisticsInfoMapper noteStatisticsInfoMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.provider.service.CommentService#
	 * addCommentInfo(com.ninesale.valinor.comment.provider.model.
	 * DtoNoteStatisticsInfo)
	 */
	@Override
	public void addCommentInfo(DtoNoteStatisticsInfo record) {
		DtoNoteStatisticsInfo temp = new DtoNoteStatisticsInfo();
		temp.setNoteId(record.getNoteId());
		List<DtoNoteStatisticsInfo> noteStatisticsInfoList = noteStatisticsInfoMapper.selectBySelective(temp);
		if (Collections3.isEmpty(noteStatisticsInfoList)) {
			noteStatisticsInfoMapper.insertSelective(record);
		}
		else {
			noteStatisticsInfoMapper.updateCommentInfo(record);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.provider.service.CommentService#
	 * updateShareNum(java.lang.Long)
	 */
	@Override
	public void updateShareNum(Long noteId) {
		DtoNoteStatisticsInfo record = new DtoNoteStatisticsInfo();
		record.setNoteId(noteId);
		record.setShareNum(1);
		addCommentInfo(record);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.provider.service.CommentService#
	 * updatePraiseNum(java.lang.Long)
	 */
	@Override
	public void updatePraiseNum(Long noteId) {
		DtoNoteStatisticsInfo record = new DtoNoteStatisticsInfo();
		record.setNoteId(noteId);
		record.setPraiseNum(1);
		addCommentInfo(record);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.provider.service.CommentService#
	 * updateCollectNum(java.lang.Long)
	 */
	@Override
	public void updateCollectNum(Long noteId) {
		DtoNoteStatisticsInfo record = new DtoNoteStatisticsInfo();
		record.setNoteId(noteId);
		record.setCollectNum(1);
		addCommentInfo(record);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.provider.service.CommentService#
	 * updateCommentNum(java.lang.Long)
	 */
	@Override
	public void updateCommentNum(Long noteId) {
		DtoNoteStatisticsInfo record = new DtoNoteStatisticsInfo();
		record.setNoteId(noteId);
		record.setCommentNum(1);
		addCommentInfo(record);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.provider.service.CommentService#
	 * updateviewNum(java.lang.Long)
	 */
	@Override
	public void updateviewNum(Long noteId) {
		DtoNoteStatisticsInfo record = new DtoNoteStatisticsInfo();
		record.setNoteId(noteId);
		record.setViewNum(1);
		addCommentInfo(record);
	}
}
