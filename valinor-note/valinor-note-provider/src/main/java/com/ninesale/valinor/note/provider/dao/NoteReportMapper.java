package com.ninesale.valinor.note.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.note.provider.model.DtoNoteReport;

public interface NoteReportMapper {
	
    int deleteByPrimaryKey(Long id);

    int insert(DtoNoteReport record);

    int insertSelective(DtoNoteReport record);

    DtoNoteReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DtoNoteReport record);

    int updateByPrimaryKey(DtoNoteReport record); 

	List<DtoNoteReport> queryReportByPage(@Param("report")DtoNoteReport report, @Param("beginId")Integer beginId, @Param("pageSize")Integer pageSize);

	int queryTotalNumOfReport(DtoNoteReport report); 
}