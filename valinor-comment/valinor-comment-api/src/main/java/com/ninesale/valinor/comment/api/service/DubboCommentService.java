package com.ninesale.valinor.comment.api.service;

import com.ninesale.valinor.comment.api.model.DubboAddCommentRequest;
import com.ninesale.valinor.comment.api.model.DubboAddCommentResponse;
import com.ninesale.valinor.comment.api.model.DubboCollectNoteRequest;
import com.ninesale.valinor.comment.api.model.DubboDelCollectNoteRequest;
import com.ninesale.valinor.comment.api.model.DubboDelCommentRequest;
import com.ninesale.valinor.comment.api.model.DubboGetAlbumContentRequest;
import com.ninesale.valinor.comment.api.model.DubboGetAlbumContentResponse;
import com.ninesale.valinor.comment.api.model.DubboGetCommentListRequest;
import com.ninesale.valinor.comment.api.model.DubboGetCommentListResponse;
import com.ninesale.valinor.comment.api.model.DubboGetCommentNumInfoRequest;
import com.ninesale.valinor.comment.api.model.DubboGetCommentNumInfoResponse;
import com.ninesale.valinor.comment.api.model.DubboGetPraiseAndCollectRequest;
import com.ninesale.valinor.comment.api.model.DubboGetPraiseAndCollectResponse;
import com.ninesale.valinor.comment.api.model.DubboPraiseRequest;
import com.ninesale.valinor.comment.api.model.DubboShareNoteRequest;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

public interface DubboCommentService {
	DubboAddCommentResponse addComment(DubboAddCommentRequest request);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboGetCommentListResponse getCommentList(DubboGetCommentListRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboBasicResponse delComment(DubboDelCommentRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboBasicResponse collectNote(DubboCollectNoteRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboBasicResponse delCollectNote(DubboDelCollectNoteRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboGetAlbumContentResponse getAlbumContent(DubboGetAlbumContentRequest dubboReq);

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboBasicResponse shareNote(DubboShareNoteRequest dubboReq);

	DubboGetCommentNumInfoResponse getCommentNumInfo(DubboGetCommentNumInfoRequest dubboReq);
	
	
	/**
	 * 用户点赞
	 * @param request
	 * @return
	 */
	DubboBasicResponse praise(DubboPraiseRequest request) throws Exception;

	/**
	 * 取消点赞
	 * @param request
	 * @return
	 */
	DubboBasicResponse cancelPraise(DubboPraiseRequest request) throws Exception;

	/**
	 * @param dubboReq
	 * @return
	 */
	DubboGetPraiseAndCollectResponse getPraiseAndCollectList(DubboGetPraiseAndCollectRequest dubboReq);
}
