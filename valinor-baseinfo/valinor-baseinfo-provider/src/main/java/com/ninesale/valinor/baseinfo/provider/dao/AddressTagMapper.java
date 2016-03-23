package com.ninesale.valinor.baseinfo.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoAddress2Tag;
import com.ninesale.valinor.baseinfo.provider.model.DtoAddressTag;

public interface AddressTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoAddressTag record);

    int insertSelective(DtoAddressTag record);

    DtoAddressTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoAddressTag record);

    int updateByPrimaryKey(DtoAddressTag record); 

	List<DtoAddress2Tag> queryAddrTagByPage(@Param("addrTag")DtoAddressTag addrTag, @Param("beginId")Integer beginId, @Param("pageSize")Integer pageSize);

	int queryTotalNumOfAddrTag(DtoAddressTag dtoAddressTag);

	List<DtoAddressTag> queryAddrTagList(DtoAddressTag dtoAddressTag);  
	
}