package com.ninesale.valinor.item.provider.dao;

import java.util.List;

import com.ninesale.valinor.item.provider.model.DtoItemAttrvalue;

public interface ItemAttrvalueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoItemAttrvalue record);
    
    void batchInsert(List<DtoItemAttrvalue> list);

    int insertSelective(DtoItemAttrvalue record);
    
    List<DtoItemAttrvalue> queryItemAttrvalueListByIds(List<Long> ids);

    int updateByPrimaryKeySelective(DtoItemAttrvalue record);

    int updateByPrimaryKey(DtoItemAttrvalue record);
    
    List<DtoItemAttrvalue> queryItemAttrvalueList(DtoItemAttrvalue record);
}