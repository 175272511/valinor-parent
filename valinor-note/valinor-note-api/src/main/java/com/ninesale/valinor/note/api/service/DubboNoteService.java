package com.ninesale.valinor.note.api.service;

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
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

public interface DubboNoteService {
	/**
	 * 
	 * @param dubboReq
	 * @return
	 */
	DubboAddNoteResponse addNote(DubboAddNoteRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboUpdateNoteResponse updateNote(DubboUpdateNoteRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboGetMyNoteListNoteResponse getMyNoteList(DubboGetMyNoteListNoteRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboBasicResponse delNote(DubboDelNoteRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboQueryPublicNoteListNoteResponse queryPublicNote(DubboQueryPublicNoteListNoteRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboQueryNoteByNoteIdResponse queryNoteById(DubboQueryNoteByNoteIdRequest dubboReq);

	/**
	 * @param getNoteListReq
	 * @return
	 */
	DubboGetNoteByIdListResponse queryNoteByIdList(DubboGetNoteByIdListRequest getNoteListReq);
}
