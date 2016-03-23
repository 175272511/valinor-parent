package com.ninesale.valinor.order.provider.dao;

import com.ninesale.valinor.order.provider.model.DtoOrderDeliveryLog;

public interface OrderDeliveryLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoOrderDeliveryLog record);

    int insertSelective(DtoOrderDeliveryLog record);

    DtoOrderDeliveryLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoOrderDeliveryLog record);

    int updateByPrimaryKey(DtoOrderDeliveryLog record);
}