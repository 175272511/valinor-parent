package com.ninesale.valinor.item.provider.dao;

import java.util.List;

import com.ninesale.valinor.item.provider.model.DtoItemAttribute;

public interface ItemAttributeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoItemAttribute record);
    
    void batchInsert(List<DtoItemAttribute> list);

    int insertSelective(DtoItemAttribute record);

    List<DtoItemAttribute> queryItemAttrListByIds(List<Long> ids);

    int updateByPrimaryKeySelective(DtoItemAttribute record);

    int updateByPrimaryKey(DtoItemAttribute record);
    
    List<DtoItemAttribute> queryItemAttributeList(DtoItemAttribute record);
}