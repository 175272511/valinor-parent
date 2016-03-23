package com.ninesale.valinor.item.provider.dao;

import java.util.List;

import com.ninesale.valinor.item.provider.model.DtoItemSku;
import com.ninesale.valinor.item.provider.model.DtoItemSkuStock;

public interface ItemSkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoItemSku record);

    int insertSelective(DtoItemSku record);

    DtoItemSku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoItemSku record);

    int updateByPrimaryKey(DtoItemSku record);
    
    List<DtoItemSku> queryItemSkuList(DtoItemSku record);
    
    List<DtoItemSkuStock> queryItemSkuStockList(DtoItemSku record);
    
}