package com.ninesale.valinor.item.provider.dao;

import java.util.List;

import com.ninesale.valinor.item.provider.model.DtoItemSpu;
import com.ninesale.valinor.item.provider.model.DtoItemSpuSkuStock;

public interface ItemSpuMapper {
	
    int deleteByPrimaryKey(Long id);

    int insert(DtoItemSpu record);
    
    int updateByPrimaryKeySelective(DtoItemSpu record);
    
    List<DtoItemSpu> queryItemSpuList(DtoItemSpu record);
    
    List<DtoItemSpuSkuStock> queryItemSpuSkuStockList(DtoItemSpu record);

    int insertSelective(DtoItemSpu record);

    DtoItemSpu selectByPrimaryKey(Long id);

    int updateByPrimaryKey(DtoItemSpu record);
}