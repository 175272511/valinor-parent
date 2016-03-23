package com.ninesale.valinor.image.provider.dao;

import java.util.List;

import com.ninesale.valinor.image.provider.model.DtoImgType;

public interface ImgTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoImgType record);

    int insertSelective(DtoImgType record);

    DtoImgType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoImgType record);

    int updateByPrimaryKey(DtoImgType record);
    
    List<DtoImgType> queryImgTypeList(DtoImgType record);
    
    int deleteImgTypeByIds(List<Long> ids);
}