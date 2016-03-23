package com.ninesale.valinor.order.provider.dao;

import com.ninesale.valinor.order.provider.model.DtoOrderService;

public interface OrderServiceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoOrderService record);

    int insertSelective(DtoOrderService record);

    DtoOrderService selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoOrderService record);

    int updateByPrimaryKey(DtoOrderService record);
}