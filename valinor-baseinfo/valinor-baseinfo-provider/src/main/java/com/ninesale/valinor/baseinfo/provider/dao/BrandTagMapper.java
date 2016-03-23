package com.ninesale.valinor.baseinfo.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoBrandTag;

public interface BrandTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoBrandTag record);

    int insertSelective(DtoBrandTag record);

    DtoBrandTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoBrandTag record);

    int updateByPrimaryKey(DtoBrandTag record); 

	List<DtoBrandTag> queryBrandTagByPage(@Param("brandTag")DtoBrandTag brandTag, @Param("beginId")Integer beginId, @Param("pageSize")Integer pageSize);

	int queryTotalNumOfBrandTag(DtoBrandTag record);

	List<DtoBrandTag> queryBrandTagList(DtoBrandTag record);  
}