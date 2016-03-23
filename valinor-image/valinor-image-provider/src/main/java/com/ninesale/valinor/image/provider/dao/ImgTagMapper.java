package com.ninesale.valinor.image.provider.dao;

import java.util.List;

import com.ninesale.valinor.image.provider.model.DtoImgTag;
import com.ninesale.valinor.image.provider.model.DtoImgTagAndType;

public interface ImgTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoImgTag record);

    int insertSelective(DtoImgTag record);

    DtoImgTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoImgTag record);

    int updateByPrimaryKey(DtoImgTag record);
    
    /**
     * 查询图片标签List
     * */
	List<DtoImgTag> queryImgTagList(DtoImgTag imgTag);
	
	/***
	 * 查询图片标签,根据标签类型ID和标签名称
	 */
	DtoImgTag queryImgTag(Long tagTypeId, String tagName);
	
	/**
     * 查询图片标签&标签类型List
     * */
	List<DtoImgTagAndType> queryImgTagAndTypeList(List<Long> ids); 
	
}