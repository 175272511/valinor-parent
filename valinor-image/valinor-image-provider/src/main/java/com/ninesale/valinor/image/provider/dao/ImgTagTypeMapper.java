package com.ninesale.valinor.image.provider.dao;

import java.util.List;

import com.ninesale.valinor.image.provider.model.DtoImgTagType;

public interface ImgTagTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoImgTagType record);

    int insertSelective(DtoImgTagType record);

    DtoImgTagType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoImgTagType record);

    int updateByPrimaryKey(DtoImgTagType record);
    
    /***
     * 查询图片标签List
     * @param imgTagType
     * @return
     */
	List<DtoImgTagType> queryImgTagTypeList(DtoImgTagType imgTagType); 
	
}