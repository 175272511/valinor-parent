package com.ninesale.valinor.image.provider.dao;

import java.util.List;

import com.ninesale.valinor.image.provider.model.DtoImgStore;
import com.ninesale.valinor.image.provider.model.DtoImgStoreType;
import com.ninesale.valinor.image.provider.model.DtoImgStoreTypeLocation;

public interface ImgStoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoImgStore record);

    int insertSelective(DtoImgStore record);

    DtoImgStore selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoImgStore record);

    int updateByPrimaryKey(DtoImgStore record);
    
    List<DtoImgStore> queryImgStoreList(DtoImgStore imgStore);
    
    int deleteImgStoreByIds(List<Long> ids);
    
    List<DtoImgStoreType> queryImgStoreTypeList(List<Long> ids); 
    /**
	 * 查询图片&图片类型&图片标签位置信息列表
	 * @param DtoImgStore imgStore
	 * @return List<DtoImgStoreTypeLocation>
	 */
	List<DtoImgStoreTypeLocation> queryImgLocationList(List<Long> ids);
}