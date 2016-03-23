package com.ninesale.valinor.comment.provider.dao;

import com.ninesale.valinor.comment.provider.model.DtoNoteShare;

public interface NoteShareMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoNoteShare record);

    int insertSelective(DtoNoteShare record);

    DtoNoteShare selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoNoteShare record);

    int updateByPrimaryKey(DtoNoteShare record);
}