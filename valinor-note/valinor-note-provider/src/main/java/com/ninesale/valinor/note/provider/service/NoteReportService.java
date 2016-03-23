package com.ninesale.valinor.note.provider.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.note.provider.model.DtoNoteReport;

/**
 * @des 基础信息-检举信息 服务接口类
 * @author fxj
 * @date 2015年11月3日10:26:04
 */
public interface NoteReportService{
	
	/**
	 * 增加检举信息
	 * @param DubboNoteReport
	 * @return Map<String,Object>
	 */
	public Map<String,Object> insert(DtoNoteReport record);

	/**
	 * 修改检举信息
	 * @param DubboNoteReport
	 * @return int
	 */
	public int updateByPrimaryKeySelective(DtoNoteReport record);
	
	/**
	 * 查询检举信息
	 * @param DubboNoteReport
	 * @return List<DubboNoteReport>
	 */
	public List<DtoNoteReport> queryReportByPage(@Param("report") DtoNoteReport dtoBaseinfoBrand, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param DubboNoteReport
	 * @return int
	 */
	public int queryTotalNumOfReport(DtoNoteReport brand);
}
