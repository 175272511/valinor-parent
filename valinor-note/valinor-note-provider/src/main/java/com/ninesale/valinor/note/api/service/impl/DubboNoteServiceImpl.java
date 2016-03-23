package com.ninesale.valinor.note.api.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.ninesale.valinor.note.api.model.dto.DubboNoteInfo;
import com.ninesale.valinor.note.api.model.dto.DubboNoteInfo;
import com.ninesale.valinor.note.api.model.request.note.DubboAddNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboDelNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboGetMyNoteListNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboGetNoteByIdListRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboQueryNoteByNoteIdRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboQueryPublicNoteListNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboUpdateNoteRequest;
import com.ninesale.valinor.note.api.model.response.note.DubboAddNoteResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboGetMyNoteListNoteResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboGetNoteByIdListResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboQueryNoteByNoteIdResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboQueryPublicNoteListNoteResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboUpdateNoteResponse;
import com.ninesale.valinor.note.api.service.DubboNoteService;
import com.ninesale.valinor.note.provider.dao.NoteMapper;
import com.ninesale.valinor.note.provider.model.DtoNote;
import com.ninesale.valinor.note.provider.service.NoteService;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

import net.sf.cglib.beans.BeanMap;

public class DubboNoteServiceImpl implements DubboNoteService {

	@Resource
	private NoteService noteService;

	@Resource
	private NoteMapper noteMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.note.api.service.DemoOrderService#addOrder(com.
	 * ninesale.valinor.order.api.model.AddOrderRequest)
	 */
	@Override
	public DubboAddNoteResponse addNote(DubboAddNoteRequest dubboReq) {
		DtoNote dtoNote = BeanMapper.map(dubboReq, DtoNote.class);
		/**
		 * 将imgIdList转成JSON字符串存入数据库
		 */
		dtoNote.setImgIdlistStr(JSON.toJSONString(dtoNote.getImgIdList()));
		dtoNote.setNoteTagListStr(JSON.toJSONString(dtoNote.getNoteTagList()));

		/**
		 * 插入数据
		 */
		noteMapper.insertSelective(dtoNote);

		DubboNoteInfo noteInfo = BeanMapper.map(dtoNote, DubboNoteInfo.class);
		DubboAddNoteResponse response = new DubboAddNoteResponse();
		response.setNoteInfo(noteInfo);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.note.api.service.DubboNoteService#updateNote(com.
	 * ninesale.valinor.note.api.model.DubboUpdateNoteRequest)
	 */
	@Override
	public DubboUpdateNoteResponse updateNote(DubboUpdateNoteRequest dubboReq) {
		DtoNote dtoNote = BeanMapper.map(dubboReq, DtoNote.class);
		/**
		 * 将imgIdList转成JSON字符串存入数据库
		 */
		dtoNote.setImgIdlistStr(JSON.toJSONString(dtoNote.getImgIdList()));
		dtoNote.setNoteTagListStr(JSON.toJSONString(dtoNote.getNoteTagList()));

		/**
		 * 插入数据
		 */
		noteMapper.updateByPrimaryKeySelective(dtoNote);

		DubboNoteInfo noteInfo = BeanMapper.map(dtoNote, DubboNoteInfo.class);
		DubboUpdateNoteResponse response = new DubboUpdateNoteResponse();
		response.setNoteInfo(noteInfo);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.note.api.service.DubboNoteService#getMyNoteList(com.
	 * ninesale.valinor.note.api.model.DubboGetMyNoteListNoteRequest)
	 */
	@Override
	public DubboGetMyNoteListNoteResponse getMyNoteList(DubboGetMyNoteListNoteRequest dubboReq) {
		DtoNote dtoNote = BeanMapper.map(dubboReq, DtoNote.class);

		List<DtoNote> noteList = noteMapper.selectNoteByPage(dtoNote, dubboReq.getBeginId(), dubboReq.getPageSize());

		for (DtoNote temp : noteList) {
			temp.setImgIdList(JSON.parseArray(temp.getImgIdlistStr(), Long.class));
			temp.setNoteTagList(JSON.parseArray(temp.getNoteTagListStr(), String.class));
		}

		Integer totalNum = noteMapper.setTotalNumOfNote(dtoNote);

		DubboGetMyNoteListNoteResponse response = new DubboGetMyNoteListNoteResponse();

		List<DubboNoteInfo> dubboBaseNoteInfoList = BeanMapper.map(noteList, DubboNoteInfo.class);

		response.setNoteList(dubboBaseNoteInfoList);
		response.setTotalNum(totalNum);
		response.setPageSize(dubboReq.getPageSize());
		response.setCurrentPage(dubboReq.getCurrentPage());

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.note.api.service.DubboNoteService#delNote(com.
	 * ninesale.valinor.note.api.model.DubboDelNoteRequest)
	 */
	@Override
	public DubboBasicResponse delNote(DubboDelNoteRequest dubboReq) {
		noteMapper.deleteByPrimaryKey(dubboReq.getNoteId());
		return new DubboBasicResponse();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.note.api.service.DubboNoteService#queryPublicNote(
	 * com.ninesale.valinor.note.api.model.DubboQueryPublicNoteListNoteRequest)
	 */
	@Override
	public DubboQueryPublicNoteListNoteResponse queryPublicNote(DubboQueryPublicNoteListNoteRequest dubboReq) {
		DtoNote dtoNote = new DtoNote();
		dtoNote.setNoteStatus(0);

		List<DtoNote> noteList = noteMapper.selectNoteByPage(dtoNote, dubboReq.getBeginId(), dubboReq.getPageSize());

		for (DtoNote temp : noteList) {
			temp.setImgIdList(JSON.parseArray(temp.getImgIdlistStr(), Long.class));
			temp.setNoteTagList(JSON.parseArray(temp.getNoteTagListStr(), String.class));
		}

		Integer totalNum = noteMapper.setTotalNumOfNote(dtoNote);

		DubboQueryPublicNoteListNoteResponse response = new DubboQueryPublicNoteListNoteResponse();

		List<DubboNoteInfo> dubboBaseNoteInfoList = BeanMapper.map(noteList, DubboNoteInfo.class);

		response.setNoteList(dubboBaseNoteInfoList);
		response.setTotalNum(totalNum);
		response.setPageSize(dubboReq.getPageSize());
		response.setCurrentPage(dubboReq.getCurrentPage());

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.note.api.service.DubboNoteService#queryNoteById(com.
	 * ninesale.valinor.note.api.model.DubboQueryNoteByNoteIdRequest)
	 */
	@Override
	public DubboQueryNoteByNoteIdResponse queryNoteById(DubboQueryNoteByNoteIdRequest dubboReq) {
		DtoNote noteInfo = noteMapper.selectByPrimaryKey(dubboReq.getNoteId());
		if (null != noteInfo) {
			noteInfo.setImgIdList(JSON.parseArray(noteInfo.getImgIdlistStr(), Long.class));
			noteInfo.setNoteTagList(JSON.parseArray(noteInfo.getNoteTagListStr(), String.class));
		}

		DubboNoteInfo publicNoteInfo = BeanMapper.map(noteInfo, DubboNoteInfo.class);

		DubboQueryNoteByNoteIdResponse response = new DubboQueryNoteByNoteIdResponse();
		response.setNoteInfo(publicNoteInfo);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.note.api.service.DubboNoteService#queryNoteByIdList(
	 * com.ninesale.valinor.note.api.model.request.note.
	 * DubboGetNoteByIdListRequest)
	 */
	@Override
	public DubboGetNoteByIdListResponse queryNoteByIdList(DubboGetNoteByIdListRequest getNoteListReq) {

		List<DtoNote> dtoNoteList = noteMapper.selectByIdList(getNoteListReq.getNoteIdList());
		for (DtoNote temp : dtoNoteList) {
			temp.setImgIdList(JSON.parseArray(temp.getImgIdlistStr(), Long.class));
		}

		Map<Long, DtoNote> tempMap = transferList2Map(dtoNoteList);
		List<DtoNote> newNoteList = new ArrayList<DtoNote>();

		for (Long temp : getNoteListReq.getNoteIdList()) {
			newNoteList.add(tempMap.get(temp));
		}

		DubboGetNoteByIdListResponse dubboResp = new DubboGetNoteByIdListResponse();
		dubboResp.setNoteList(BeanMapper.map(newNoteList, DubboNoteInfo.class));
		return dubboResp;
	}

	/**
	 * @param dtoNoteList
	 * @return
	 */
	private Map<Long, DtoNote> transferList2Map(List<DtoNote> dtoNoteList) {
		Map<Long, DtoNote> tempMap = new HashMap<Long, DtoNote>();
		for (DtoNote temp : dtoNoteList) {
			tempMap.put(temp.getId(), temp);
		}
		return tempMap;
	}
}
