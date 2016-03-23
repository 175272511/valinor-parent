package com.ninesale.valinor.message.provider.dao;

import java.util.List;

import com.ninesale.valinor.message.provider.model.DtoMessageRecord;

/**
 * @des 记录发送短信持久层接口
 * @author Zhoup
 * @date 2015年10月31日10:50:48
 */
public interface MessageRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoMessageRecord record);

    int insertSelective(DtoMessageRecord record);

    DtoMessageRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoMessageRecord record);

    int updateByPrimaryKey(DtoMessageRecord record);
    
    List<DtoMessageRecord> queryImgStoreListByIds(List<Long> ids);
    
    int deleteImgStoreByIds(List<Long> ids);
}