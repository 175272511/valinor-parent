package com.ninesale.valinor.baseinfo.provider.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoAddress2Tag;
import com.ninesale.valinor.baseinfo.provider.model.DtoAddressTag;

/**
 * @des 基础信息-购物地点标签信息 服务接口类
 * @author Zhoup
 * @date 2015年11月3日10:26:04
 */
public interface AddressTagService{
	
	/**
	 * 增加购物地点标签信息
	 * @param DubboAddressTag
	 * @return Map<String,Object>
	 */
	public Map<String,Object> insert(DtoAddressTag dtoAddressTag);

	/**
	 * @param brandTag
	 * @param beginId
	 * @param pageSize
	 */
	List<DtoAddress2Tag> queryAddrTagByPage(@Param("addrTag") DtoAddressTag addrTag, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param DubboAddressTag
	 * @return
	 */
	int queryTotalNumOfAddrTag(DtoAddressTag dtoAddressTag);
	
	/**
	 * @param DubboAddressTag
	 * @return
	 */
	List<DtoAddressTag> queryAddrTagList(DtoAddressTag dtoAddressTag);
	
}
