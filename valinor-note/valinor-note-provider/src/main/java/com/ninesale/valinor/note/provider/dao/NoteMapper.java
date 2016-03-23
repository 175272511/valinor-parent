package com.ninesale.valinor.note.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.note.provider.model.DtoNote;

public interface NoteMapper {
	int deleteByPrimaryKey(Long id);

	int insert(DtoNote record);

	int insertSelective(DtoNote record);

	DtoNote selectByPrimaryKey(Long id);
	
	List<DtoNote> selectByIdList(List<Long> idList);

	int updateByPrimaryKeySelective(DtoNote record);

	int updateByPrimaryKey(DtoNote record);

	/**
	 * @param dtoNote
	 * @param beginId
	 * @param pageSize
	 */
	List<DtoNote> selectNoteByPage(@Param("note") DtoNote dtoNote, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param dtoNote
	 * @return
	 */
	Integer setTotalNumOfNote(DtoNote dtoNote);
}