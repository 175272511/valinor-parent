package com.ninesale.valinor.note.provider.dao;

import java.util.List;

import com.ninesale.valinor.note.provider.model.DtoAlbum;

public interface AlbumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoAlbum record);

    int insertSelective(DtoAlbum record);

    DtoAlbum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoAlbum record);

    int updateByPrimaryKey(DtoAlbum record);
    
    
    List<DtoAlbum> selectBySelective(DtoAlbum record);
}