package com.ninesale.valinor.order.provider.dao;

import com.ninesale.valinor.order.provider.model.DtoOrderPay;

public interface OrderPayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoOrderPay record);

    int insertSelective(DtoOrderPay record);

    DtoOrderPay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoOrderPay record);

    int updateByPrimaryKey(DtoOrderPay record);
}