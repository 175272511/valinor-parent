package com.ninesale.valinor.order.provider.dao;

import com.ninesale.valinor.order.provider.model.DtoOrderDelivery;

public interface OrderDeliveryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoOrderDelivery record);

    int insertSelective(DtoOrderDelivery record);

    DtoOrderDelivery selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoOrderDelivery record);

    int updateByPrimaryKey(DtoOrderDelivery record);
}