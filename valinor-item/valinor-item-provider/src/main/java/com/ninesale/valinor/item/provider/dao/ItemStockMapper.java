package com.ninesale.valinor.item.provider.dao;

import java.util.List;

import com.ninesale.valinor.item.provider.model.DtoItemStock;

public interface ItemStockMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoItemStock record);

    int insertSelective(DtoItemStock record);

    DtoItemStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoItemStock record);

    int updateByPrimaryKey(DtoItemStock record);
    
    List<DtoItemStock> queryItemStockList(DtoItemStock record);
}