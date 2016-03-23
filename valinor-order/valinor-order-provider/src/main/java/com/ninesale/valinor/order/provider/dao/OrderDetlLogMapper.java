package com.ninesale.valinor.order.provider.dao;

import com.ninesale.valinor.order.provider.model.DtoOrderDetlLog;

public interface OrderDetlLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoOrderDetlLog record);

    int insertSelective(DtoOrderDetlLog record);

    DtoOrderDetlLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoOrderDetlLog record);

    int updateByPrimaryKey(DtoOrderDetlLog record);
}