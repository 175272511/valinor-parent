package com.ninesale.valinor.image.provider.dao;

import java.util.List;

import com.ninesale.valinor.image.provider.model.DtoImgTagLocation;

public interface ImgTagLocationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoImgTagLocation record);

    int insertSelective(DtoImgTagLocation record);

    DtoImgTagLocation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoImgTagLocation record);

    int updateByPrimaryKey(DtoImgTagLocation record);
    
    /***
     * 查询图片标签位置List
     * @param ids 标签List
     * @return
     */
	List<DtoImgTagLocation> queryImgTagInfoList(List<Long> ids);
	
	/***
	 * 删除图片标签位置信息
	 * @param imgId 图片ID
	 * @return
	 */
	int deleteImgTagLocationByImgid(Long imgId);  
}