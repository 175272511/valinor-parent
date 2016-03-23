package com.ninesale.valinor.order.provider.dao;

import com.ninesale.valinor.order.provider.model.DtoOrderDetl;

public interface OrderDetlMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoOrderDetl record);

    int insertSelective(DtoOrderDetl record);

    DtoOrderDetl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoOrderDetl record);

    int updateByPrimaryKey(DtoOrderDetl record);
}