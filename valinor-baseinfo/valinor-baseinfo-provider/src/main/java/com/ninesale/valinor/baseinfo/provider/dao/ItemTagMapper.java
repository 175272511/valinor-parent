package com.ninesale.valinor.baseinfo.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoItem2Tag;
import com.ninesale.valinor.baseinfo.provider.model.DtoItemTag;

public interface ItemTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoItemTag record);

    int insertSelective(DtoItemTag record);

    DtoItemTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoItemTag record);

    int updateByPrimaryKey(DtoItemTag record); 

	List<DtoItem2Tag> queryItemTagByPage(@Param("itemTag")DtoItemTag itemTag, @Param("beginId")Integer beginId, @Param("pageSize")Integer pageSize);

	int queryTotalNumOfItemTag(DtoItemTag record);

	List<DtoItemTag> queryItemTagList(DtoItemTag record);  
}