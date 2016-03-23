package com.ninesale.valinor.baseinfo.provider.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.baseinfo.provider.model.DtoBaseinfoBrand;

/**
 * @des 基础信息-品牌信息 服务接口类
 * @author Zhoup
 * @date 2015年11月3日10:26:04
 */
public interface BaseinfoBrandService{
	
	/**
	 * 增加品牌信息
	 * @param DubboAddAddrTagRequest dubboAddBaseinfoBrandRequest
	 * @return DubboAddAddrTagResponse
	 */
	public Map<String,Object> insert(DtoBaseinfoBrand record);

	/**
	 * 查询品牌信息
	 * @param DubboAddAddrTagRequest dubboAddBaseinfoBrandRequest
	 * @return DubboQueryBaseinfoBrandResponse
	 */
	public DtoBaseinfoBrand selectByPrimaryKey(Long id);

	/**
	 * 删除品牌信息
	 * @param DubboAddAddrTagRequest dubboAddBaseinfoBrandRequest
	 * @return DubboDelBaseinfoBrandResponse
	 */
	public int deleteByPrimaryKey(Long id);

	/**
	 * 修改品牌信息
	 * @param DubboUpdateBaseinfoBrandRequest dubboUpdateBaseinfoBrandRequest
	 * @return DubboUpdateBaseinfoBrandResponse
	 */
	public int updateByPrimaryKeySelective(DtoBaseinfoBrand record);
	/**
	 * 禁用品牌信息
	 * 
	 * @param DubboDownBaseinfoBrandRequest
	 *            dubboDownBaseinfoBrandRequest
	 * @return DubboDownBaseinfoBrandResponse
	 */
	public int downByPrimaryKey(DtoBaseinfoBrand dtoBaseinfoBrand);
	
	/**
	 * @param dtoNote
	 * @param beginId
	 * @param pageSize
	 */
	List<DtoBaseinfoBrand> queryBrandByPage(@Param("brand") DtoBaseinfoBrand dtoBaseinfoBrand, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param dtoNote
	 * @return
	 */
	int queryTotalNumOfBrand(DtoBaseinfoBrand brand);
	
	/**
	 * @param dtoNote
	 * @param beginId
	 * @param pageSize
	 */
	List<DtoBaseinfoBrand> queryBrandList(DtoBaseinfoBrand dtoBaseinfoBrand);
	
}
