package com.ninesale.valinor.item.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.item.provider.model.DtoItem;

public interface ItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoItem record);

    int insertSelective(DtoItem record);

    DtoItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoItem record);

    int updateByPrimaryKeyWithBLOBs(DtoItem record);

    int updateByPrimaryKey(DtoItem record);

	List<DtoItem> queryItemByPage(@Param("item")DtoItem item, @Param("beginId")Integer beginId, @Param("pageSize")Integer pageSize);

	int queryTotalNumOfItem(DtoItem record);  
}