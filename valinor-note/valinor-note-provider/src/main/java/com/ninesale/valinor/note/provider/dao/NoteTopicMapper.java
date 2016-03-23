package com.ninesale.valinor.note.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.note.provider.model.DtoNoteTopic;

public interface NoteTopicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DtoNoteTopic record);

    int insertSelective(DtoNoteTopic record);

    DtoNoteTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoNoteTopic record);

    int updateByPrimaryKey(DtoNoteTopic record);

	List<DtoNoteTopic> queryTopicByPage(@Param("topic")DtoNoteTopic topic, @Param("beginId")Integer beginId, @Param("pageSize")Integer pageSize);

	int queryTotalNumOfTopic(DtoNoteTopic dtoNoteTopic); 

}