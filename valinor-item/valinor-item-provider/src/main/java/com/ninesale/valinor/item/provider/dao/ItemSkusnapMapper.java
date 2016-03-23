package com.ninesale.valinor.item.provider.dao;

import java.util.List;

import com.ninesale.valinor.item.provider.model.DtoItemSkusnap;

public interface ItemSkusnapMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoItemSkusnap record);

    int insertSelective(DtoItemSkusnap record);

    DtoItemSkusnap selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoItemSkusnap record);

    int updateByPrimaryKey(DtoItemSkusnap record);
    
    List<DtoItemSkusnap> queryItemSkusnapList(DtoItemSkusnap record);
}