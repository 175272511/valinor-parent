package com.ninesale.valinor.order.provider.dao;

import com.ninesale.valinor.order.provider.model.DtoOrderMainLog;

public interface OrderMainLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoOrderMainLog record);

    int insertSelective(DtoOrderMainLog record);

    DtoOrderMainLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoOrderMainLog record);

    int updateByPrimaryKey(DtoOrderMainLog record);
}