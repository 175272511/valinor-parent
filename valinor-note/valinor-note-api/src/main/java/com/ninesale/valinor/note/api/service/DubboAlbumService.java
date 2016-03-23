package com.ninesale.valinor.note.api.service;

import com.ninesale.valinor.note.api.model.request.album.DubboAddAlbumRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboDelAlbumRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboGetAlbumContentRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboGetAlbumListRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboUpdateAlbumRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboAddNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboDelNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboGetMyNoteListNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboQueryNoteByNoteIdRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboQueryPublicNoteListNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboUpdateNoteRequest;
import com.ninesale.valinor.note.api.model.response.album.DubboAddAlbumResponse;
import com.ninesale.valinor.note.api.model.response.album.DubboGetAlbumContentResponse;
import com.ninesale.valinor.note.api.model.response.album.DubboGetAlbumListResponse;
import com.ninesale.valinor.note.api.model.response.album.DubboUpdateAlbumResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboAddNoteResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboGetMyNoteListNoteResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboQueryNoteByNoteIdResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboQueryPublicNoteListNoteResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboUpdateNoteResponse;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

public interface DubboAlbumService {

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboAddAlbumResponse addAlbum(DubboAddAlbumRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboUpdateAlbumResponse updateAlbum(DubboUpdateAlbumRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboGetAlbumListResponse getAlbumList(DubboGetAlbumListRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboBasicResponse delAblum(DubboDelAlbumRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboGetAlbumContentResponse getAlbumContent(DubboGetAlbumContentRequest dubboReq);}
