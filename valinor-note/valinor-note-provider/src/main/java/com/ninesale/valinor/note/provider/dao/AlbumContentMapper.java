package com.ninesale.valinor.note.provider.dao;

import java.util.List;

import com.ninesale.valinor.note.provider.model.DtoAlbumContent;

public interface AlbumContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoAlbumContent record);

    int insertSelective(DtoAlbumContent record);

    DtoAlbumContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoAlbumContent record);

    int updateByPrimaryKey(DtoAlbumContent record);
    
    List<DtoAlbumContent> selectBySelective(DtoAlbumContent record);
    
}