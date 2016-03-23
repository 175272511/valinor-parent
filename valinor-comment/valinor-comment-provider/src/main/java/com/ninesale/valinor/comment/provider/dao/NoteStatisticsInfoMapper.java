package com.ninesale.valinor.comment.provider.dao;

import java.util.List;

import com.ninesale.valinor.comment.provider.model.DtoNoteStatisticsInfo;

public interface NoteStatisticsInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoNoteStatisticsInfo record);

    int insertSelective(DtoNoteStatisticsInfo record);

    DtoNoteStatisticsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoNoteStatisticsInfo record);

    int updateByPrimaryKey(DtoNoteStatisticsInfo record);

	/**
	 * @param temp
	 */
	List<DtoNoteStatisticsInfo> selectBySelective(DtoNoteStatisticsInfo temp);

	/**
	 * @param record
	 */
	void updateCommentInfo(DtoNoteStatisticsInfo record);

	/**
	 * @return
	 */
	List<DtoNoteStatisticsInfo> selectByNoteIdList(List<Long> noteIdList);
}