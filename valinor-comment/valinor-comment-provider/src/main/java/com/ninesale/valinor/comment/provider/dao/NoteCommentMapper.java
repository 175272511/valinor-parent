package com.ninesale.valinor.comment.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.comment.provider.model.DtoNoteComment;

public interface NoteCommentMapper {
	int deleteByPrimaryKey(Long id);

	int insert(DtoNoteComment record);

	int insertSelective(DtoNoteComment record);

	DtoNoteComment selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(DtoNoteComment record);

	int updateByPrimaryKeyWithBLOBs(DtoNoteComment record);

	int updateByPrimaryKey(DtoNoteComment record);

	/**
	 * @param integer2
	 * @param integer
	 * @param noteComment
	 * @return
	 */
	List<DtoNoteComment> selectCommentList(@Param("noteComment") DtoNoteComment noteComment, @Param("beginId") Integer beginId,
			@Param("pageSize") Integer pageSize);

	/**
	 * @param noteComment
	 * @return
	 */
	Integer selectCommentTotalNum(DtoNoteComment noteComment);
}