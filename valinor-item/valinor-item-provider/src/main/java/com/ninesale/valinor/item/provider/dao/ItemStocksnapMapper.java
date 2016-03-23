package com.ninesale.valinor.item.provider.dao;

import java.util.List;

import com.ninesale.valinor.item.provider.model.DtoItemStocksnap;

public interface ItemStocksnapMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoItemStocksnap record);

    int insertSelective(DtoItemStocksnap record);

    DtoItemStocksnap selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoItemStocksnap record);

    int updateByPrimaryKey(DtoItemStocksnap record);
    
    List<DtoItemStocksnap> queryItemStocksnapList(DtoItemStocksnap record);
}