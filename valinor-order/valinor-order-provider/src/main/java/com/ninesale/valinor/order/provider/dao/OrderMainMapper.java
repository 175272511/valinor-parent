package com.ninesale.valinor.order.provider.dao;

import com.ninesale.valinor.order.provider.model.DtoOrderMain;

public interface OrderMainMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoOrderMain record);

    int insertSelective(DtoOrderMain record);

    DtoOrderMain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoOrderMain record);

    int updateByPrimaryKey(DtoOrderMain record);
}