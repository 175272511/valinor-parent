package com.ninesale.valinor.comment.provider.dao;

import java.util.List;

import com.ninesale.valinor.comment.provider.model.DtoNoteCollectInfo;

public interface NoteCollectInfoMapper {
	int deleteByPrimaryKey(Long id);

	int insert(DtoNoteCollectInfo record);

	int insertSelective(DtoNoteCollectInfo record);

	DtoNoteCollectInfo selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(DtoNoteCollectInfo record);

	int updateByPrimaryKey(DtoNoteCollectInfo record);

	List<DtoNoteCollectInfo> selectBySelective(DtoNoteCollectInfo record);

	/**
	 * @param record
	 */
	void updateValidFlag(DtoNoteCollectInfo record);
}